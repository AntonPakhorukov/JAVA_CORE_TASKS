/**
 * 1. Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
 * во вновь созданную папку ./backup
 * 2. Доработайте класс Tree и метод print который мы разработали на семинаре.
 * Ваш метод должен распечатать полноценное дерево директорий и файлов относительно корневой директории.
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {

    public static void createBackup(File directoryToBackup) throws IOException {
        Path createBackup = Files.createDirectories(Paths.get("./backup")); // Создаем папку
//        Path test = Files.createFile(Paths.get("./file.txt"));
//        Path copy = Files.copy(test, Paths.get("./backup/file.txt"), REPLACE_EXISTING);
//        Path pathBackup = Paths.get("./backup");
//        System.out.println(pathBackup.toAbsolutePath());
        System.out.println("Папка backup создана: " + Files.exists(Paths.get("./backup"))); // проверяем
        File[] files = directoryToBackup.listFiles();
        for (File f : files) {
            if (f.getName().equals("backup")) {
                continue;
            } else {
                Path newFile = Paths.get(f.getPath());
                Path copy2 = Files.copy(newFile, Paths.get("./backup/" + f.getName()), REPLACE_EXISTING);
            }
            System.out.println("Файл \"" + f.getName() + "\" скопирован в " +"\""+ createBackup.getFileName() +"\": " + Files.exists(Paths.get("./backup/" + f.getName())));
        }
    }
    public static void main(String[] args) throws IOException {

        /**
         * Задание 1: Написать функцию, создающую резервную копию всех файлов в директории
         * (без поддиректорий) во вновь созданную папку ./backup
         */
        System.out.println("Задание 1:");
        System.out.println();
        createBackup(new File("."));

        System.out.println();

        /**
         * Здание 2: Доработайте класс Tree и метод print который мы разработали на семинаре.
         * Ваш метод должен распечатать полноценное дерево директорий и файлов относительно корневой директории.
         */
        System.out.println("Задание 2:");
//        Tree.print(new File("."), "", true);
        System.out.println();
        TreeHW.print(new File("."), "", true);


    }
}
