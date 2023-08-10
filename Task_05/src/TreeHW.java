import java.io.File;
public class TreeHW {
    public TreeHW() {
    }
    public static void print(File file, String indent, boolean isLast) {
        System.out.print(indent); // печатаем отступ
        if (isLast) { // если директория последняя, то печатаем
            System.out.print(" └─");
            indent = indent + "  ";
        } else { // если директория не последняя, то печатаем
            System.out.print(" ├─");
            indent = indent + " │ ";
        }
        System.out.println(file.getName()); // и печатаем название директории

        File[] files = file.listFiles(); // берем список файлов в текущей папке и сохраняем его в массив файлов
        int subDirTotal = 0; // количество всех директорий в папке
        int fileInDir = 0; // количество всех файлов в папке
        int subDirCounter;
        int fileCounter = 0;
        /**
         * Считаем количество файлов и директорий
         */
        for(subDirCounter = 0; subDirCounter < files.length; ++subDirCounter) {
            if (files[subDirCounter].isDirectory()) {
                ++subDirTotal; // посчитали директории
            } else {
                ++fileInDir; // посчитали файлы

            }
        }
        subDirCounter = 0; // ведем счет директорий, чтобы понять, какая последняя
        /**
         * Распечатываем названия директорий
         */
        for(int i = 0; i < files.length; i++) { // заново проходим по циклу
            if (files[i].isDirectory()) { // если это директория
                subDirCounter++; // увеличиваем счетчик
                // и запускаем рекурсивно метод print
                if (subDirCounter != files.length) { // если кроме директорий есть файлы
                    print(files[i], indent, false);
                } else { // если директория последняя, и нет файлов
                    print(files[i], indent, subDirCounter == subDirTotal);
                }
            }
        }
        /**
         * Распечатываем имена файлов
         */
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()){
                fileCounter++;
                if (fileInDir != fileCounter) { // если файл не последний
                    System.out.println(indent + " ├─" + files[i].getName());
                } else { // если файл последний
                    System.out.println(indent + " └─" + files[i].getName());
                }
            }
        }
    }
}
