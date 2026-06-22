package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgressReport {

    private static final String TODO_MARKER = "TODO: implement";

    public static void main(String[] args) throws IOException {
        Path projectRoot = Paths.get("").toAbsolutePath();
        Path practiceRoot = projectRoot.resolve("practice/src/main/java");
        Path originalRoot = projectRoot.resolve("original/src/main/java");

        List<Path> practiceFiles = javaFiles(practiceRoot, practiceRoot.resolve("review"));
        List<Path> originalFiles = javaFiles(originalRoot, null);
        List<Path> todoFiles = filesWithTodo(practiceFiles);

        int total = practiceFiles.size();
        int done = total - todoFiles.size();

        System.out.println("Algorithm practice progress");
        System.out.println("Project: " + projectRoot);
        System.out.println("Practice java files: " + total);
        System.out.println("Original java files: " + originalFiles.size());
        System.out.println("Done files: " + done);
        System.out.println("Files with TODO: " + todoFiles.size());
        System.out.printf("Done percent: %.2f%%%n", total == 0 ? 0.0 : done * 100.0 / total);

        printByClassPackage(practiceRoot, practiceFiles, todoFiles);
        printRecentDoneFiles(practiceRoot, practiceFiles, todoFiles);
    }

    private static List<Path> javaFiles(Path root, Path excludedRoot) throws IOException {
        if (!Files.exists(root)) {
            return List.of();
        }
        try (Stream<Path> paths = Files.walk(root)) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".java"))
                    .filter(path -> excludedRoot == null || !path.startsWith(excludedRoot))
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    private static List<Path> filesWithTodo(List<Path> files) throws IOException {
        List<Path> ans = new ArrayList<>();
        for (Path file : files) {
            if (Files.readString(file).contains(TODO_MARKER)) {
                ans.add(file);
            }
        }
        return ans;
    }

    private static void printByClassPackage(Path root, List<Path> files, List<Path> todoFiles) {
        Map<String, int[]> byPackage = new TreeMap<>();
        for (Path file : files) {
            String firstDir = root.relativize(file).getName(0).toString();
            byPackage.computeIfAbsent(firstDir, ignored -> new int[2])[0]++;
        }
        for (Path file : todoFiles) {
            String firstDir = root.relativize(file).getName(0).toString();
            byPackage.computeIfAbsent(firstDir, ignored -> new int[2])[1]++;
        }

        System.out.println();
        System.out.println("By package:");
        for (Map.Entry<String, int[]> entry : byPackage.entrySet()) {
            int total = entry.getValue()[0];
            int todo = entry.getValue()[1];
            int done = total - todo;
            System.out.printf("  %s: %d/%d done%n", entry.getKey(), done, total);
        }
    }

    private static void printRecentDoneFiles(Path root, List<Path> files, List<Path> todoFiles) throws IOException {
        Instant since = Instant.now().minus(Duration.ofDays(2));
        Set<Path> todoSet = new HashSet<>(todoFiles);
        List<Path> recent = new ArrayList<>();
        for (Path file : files) {
            FileTime modifiedTime = Files.getLastModifiedTime(file);
            if (!todoSet.contains(file) && modifiedTime.toInstant().isAfter(since)) {
                recent.add(file);
            }
        }
        recent.sort(Comparator.comparing(path -> root.relativize(path).toString()));

        System.out.println();
        System.out.println("Recently done in practice:");
        if (recent.isEmpty()) {
            System.out.println("  none");
            return;
        }
        for (Path file : recent) {
            System.out.println("  " + root.relativize(file));
        }
    }
}
