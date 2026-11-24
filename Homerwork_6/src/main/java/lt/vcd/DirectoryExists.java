package lt.vcd;

import java.io.File;
import java.util.Scanner;

public class DirectoryExists {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();
        File rootDir = new File(path);

        // tikrina, ar direktorijos takas egzistuoja ir yra dikertorija
        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("Error: The specified directory does not exist.");
        } else {
            System.out.println("\n--- Directory Breakdown ---");
            long totalBytes = calculateDirectorySize(rootDir);

            System.out.println("\n--- Total Size ---");
            printFormattedSize("Total", totalBytes);
        }

        scanner.close();
    }

    // Rekursijos metodas, skirtas suskaičiuoti ir atvaizduoti bendrą direktorijos dydį
    private static long calculateDirectorySize(File directory) {
        long size = 0;
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else if (file.isDirectory()) {
                    size += calculateDirectorySize(file);
                }
            }
        }

        // Nurodo dydį, kurį užima direktorija
        printFormattedSize(directory.getPath(), size);
        return size;
    }

    // Helperis, metdas, spausdinantis dydžius MB, KB, ir baitais
    private static void printFormattedSize(String label, long bytes) {
        double kb = bytes / 1024.0;
        double mb = kb / 1024.0;
        System.out.printf("%s: %.2f MB | %.2f KB | %d bytes%n", label, mb, kb, bytes);
    }
}
