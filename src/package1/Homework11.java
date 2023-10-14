package package1;

public class Homework11 {

    private static void test(FileNavigator navigator, String path, FileData file) {
        try {
            navigator.add(path, file);
        } catch (IllegalPathException e) {
            System.out.println("---------------------------------------------------------------------\n" + e);
        }
    }

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();

        FileData fileData1 = new FileData("notepad.exe", 100, "C:/Windows");
        FileData fileData2 = new FileData("paint.exe", 5000, "C:/Windows");
        FileData fileData3 = new FileData("calc.exe", 200, "C:/Windows");
        FileData fileData4 = new FileData("word.exe", 80000, "C:/Program Files");
        FileData fileData5 = new FileData("excel.exe", 120000, "C:/Program Files");
        FileData fileData6 = new FileData("minesweeper.exe", 1000000, "C:/XboxGames");

        System.out.println("---------------------------------------Task №2---------------------------------------");
        test(fileNavigator, "C:/Windows", fileData1);
        test(fileNavigator, "C:/Windows", fileData2);
        test(fileNavigator, "C:/Users", fileData3);
        test(fileNavigator, "C:/Windows", fileData4);
        test(fileNavigator, "C:/Program Files", fileData5);
        test(fileNavigator, "C:/XboxGames", fileData6);
        test(fileNavigator, "C:/Windows", fileData3);
        test(fileNavigator, "C:/Program Files", fileData4);

        System.out.println("---------------------------------------Task №3---------------------------------------");
        System.out.println("All files in directory \"C:/Program Files\"");
        for (FileData f: fileNavigator.find("C:/Program Files")) {
            System.out.println(f.toString());
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("All files in directory \"C:/Conf\"");
        for (FileData f: fileNavigator.find("C:/Conf")) {
            System.out.println(f.toString());
        }

        System.out.println("---------------------------------------Task №4---------------------------------------");
        System.out.println("All files in smaller than 160000 byte");
        for (FileData f: fileNavigator.filterBySize(160000)) {
            System.out.println(f.toString());
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("All files in smaller than 8000 byte");
        for (FileData f: fileNavigator.filterBySize(8000)) {
            System.out.println(f.toString());
        }

        System.out.println("---------------------------------------Task №5---------------------------------------");
        System.out.println("Remove all files in directory \"C:/Program Files\"");
        fileNavigator.remove("C:/Program Files");

        System.out.println("---------------------------------------Task №6---------------------------------------");
        System.out.println("All files is sorted by size in ascend");
        for (FileData f: fileNavigator.sortBySize()) {
            System.out.println(f.toString());
        }
    }
}
