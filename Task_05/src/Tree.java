import java.io.File;
public class Tree {
    public Tree() {
    }
    public static void print(File file, String indent, boolean isLast) {
        System.out.print(indent); // печатаем отступ
        if (isLast) { // если директория последняя, то печатаем
            System.out.print("└─");
            indent = indent + "  ";
        } else { // если директория не последняя, то печатаем
            System.out.print("├─");
            indent = indent + "│ ";
        }
        System.out.println(file.getName()); // и печатаем название директории

        File[] files = file.listFiles(); // берем список файлов в текущей папке и сохраняем его в массив файлов
        int subDirTotal = 0; // количество всех директорий в папке

        int subDirCounter;
        for(subDirCounter = 0; subDirCounter < files.length; ++subDirCounter) { // посчитали директории
            if (files[subDirCounter].isDirectory()) {
                ++subDirTotal;
            }
        }

        subDirCounter = 0; // ведем счет директорий, чтобы понять, какая последняя

        for(int i = 0; i < files.length; ++i) { // заново проходим по циклу
            if (files[i].isDirectory()) { // если это директория
                ++subDirCounter; // увеличиваем счетчик
                // и запускаем рекурсивно метод print
                print(files[i], indent, subDirCounter == subDirTotal);
            }
        }
    }
}
