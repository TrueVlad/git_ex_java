import org.w3c.dom.stylesheets.LinkStyle;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static ArrayList<String> toDoList = new ArrayList<>() {{       //создаем список(лист)
        add("первое дело");
        add("второе дело");
        add("третье дело");
        add("четвертое дело");
        add("пятое дело");
        add("шестое дело");
    }};

//////////////////////////////////////////////////////////////////////////////////////////////// Вариант 1
//    public static void main(String[] args) {
//        System.out.println("__________________");
//
//        Scanner Scaner = new Scanner(System.in);                                      //вводим команду
//        System.out.println("Введите команду (LIST / Add / Edit / Delete): ");
//        String command = Scaner.nextLine();
//
//        System.out.println(command);                     // возвращаем введенную команду
//
//
//
//        if (command.equalsIgnoreCase("List"))                                                 // команда 1 list
//            list(toDoList);
//        else if (command.equalsIgnoreCase("Add"))                                            // команда 2 add
//            add(toDoList);
//        else if (command.equalsIgnoreCase("Edit"))                                            // команда 2 add
//            edit(toDoList);
//        else if (command.equalsIgnoreCase("Delete"))                                            // команда 2 add
//            delete(toDoList);
//        else
//            System.out.println("Неверная команда");
//    }
//
//
//    public static void list(ArrayList <String> list){                                                     // lIST - должен выводить дела с их порядковыми номерами
//        for (int i = 0; i < toDoList.size(); i++)
//        System.out.println("Дело № " + (i+1) + ": " + toDoList.get(i));
//    }
//
//    public static void add (ArrayList <String> list){                                                     // ADD - добавлять дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер
//
//        Scanner ScanerAddNewToDo = new Scanner(System.in);      //вводим название нового дела
//        System.out.println("Введите название нового дела:");
//        String newToDo = ScanerAddNewToDo.nextLine();
//
//        Scanner check = new Scanner(System.in);             // проверяем куда вставляем новое дело
//        System.out.println("Хотите внести новое дело в конец списка? (да/нет):");
//        String answer = check.nextLine();
//
//        if (answer.equalsIgnoreCase("да")) {                                      // если нужно конкретное место - задаем куда
//            Scanner ScanerAddNewToDoNumber = new Scanner(System.in);
//            System.out.println("Введите номер в списке нового дела (от 1 до " + toDoList.size() + ")");
//            int newToDoNumber = ScanerAddNewToDoNumber.nextInt();
//
//            toDoList.add((newToDoNumber - 1), newToDo);   // смотрим список
//            for (String item : toDoList)
//                System.out.println(item);
//        }
//        else if (answer.equalsIgnoreCase("нет")){                                 // если можно добавить дело в конец
//            toDoList.add(newToDo);
//            for (String item : toDoList)                     // смотрим список
//                System.out.println(item);
//        }
//        else System.out.println("Неверная команда");
//    }
//
//    public static void edit(ArrayList <String> list){                                                     // EDIT - заменять дело с указанным номером
//        Scanner ScanerAddNewToDo = new Scanner(System.in);      //вводим название нового дела
//        System.out.println("Введите название нового дела:");
//        String newToDo = ScanerAddNewToDo.nextLine();
//
//        Scanner ScanerAddNewToDoNumber = new Scanner(System.in);
//        System.out.println("Введите номер дела, которое нужно заменить на новое (от 1 до " + toDoList.size() + ")");
//        int newToDoNumber = ScanerAddNewToDoNumber.nextInt();
//
//        toDoList.set((newToDoNumber - 1), newToDo);   // смотрим список
//        for (String item : toDoList)
//            System.out.println(item);
//    }
//
//    public static void delete(ArrayList <String> list){                                                     // DELETE - удалять
//        Scanner ScanerAddNewToDoNumber = new Scanner(System.in);
//        System.out.println("Введите номер дела, которое нужно удалить (от 1 до " + toDoList.size() + ")");
//        int newToDoNumber = ScanerAddNewToDoNumber.nextInt();
//
//        toDoList.remove((newToDoNumber - 1));   // смотрим список
//        for (String item : toDoList)
//            System.out.println(item);
//    }
//}

    /////////////////////////////////////////////////////////////////////////////////////////////// Вариант 2
    public static void main(String[] args) {
        System.out.println("__________________");

        Scanner Scaner = new Scanner(System.in);                                      //вводим команду
        System.out.println("Введите команду (List / Add + Дело/Номер места, куда поставить + Дело / Edit + Порядковый номер в списке / Delete + Порядковый номер в списке): ");
        String command = Scaner.nextLine();

        System.out.println("Вы ввели: " + command);                     // возвращаем введенную команду


        Pattern patList = Pattern.compile("^[L|l][i|I][s|S][t|T]$");                       // Задаем шаблоны под команды на проверку
        Matcher matList = patList.matcher(command);

        Pattern patAdd = Pattern.compile("^[A|a][d|D][d|D] \\D.+");
        Matcher matAdd = patAdd.matcher(command);

        Pattern patAddPlace = Pattern.compile("^[A|a][d|D][d|D] \\d .+");
        Matcher matAddPlace = patAddPlace.matcher(command);

        Pattern patEdit = Pattern.compile("^[E|e][d|D][i|I][t|T] \\d .+");
        Matcher matEdit = patEdit.matcher(command);

        Pattern patDelete = Pattern.compile("^[D|d][e|E][l|L][e|E][t|T][e|E] \\d");
        Matcher matDelete = patDelete.matcher(command);


        if (matList.find())                                                 // выполняем команды
            list(toDoList);
        else if (matAddPlace.find()) {
            addPlace(command);
        }
        else if (matAdd.find()) {
            add(command);
        }
        else if (matEdit.find())
            edit(command);
        else if (matDelete.find())
            delete(command);
        else
            System.out.println("Неверная команда");
    }

    public static void list(ArrayList<String> list) {                                                     // List - должен выводить дела с их порядковыми номерами
        System.out.println("_________________Результат_________________");
        for (int i = 0; i < toDoList.size(); i++)
            System.out.println("Дело № " + (i + 1) + ": " + toDoList.get(i));
    }

    public static void add(String commandNewToDo) {                                                     // Add - добавлять дело в конец списка, сдвигая остальные дела вперёд, если указать номер
        String[] newToDo = commandNewToDo.split(" ");
        String newToDoElement = Arrays.toString(newToDo).replaceAll("\\[[A|a][d|D][d|D], ", "");    // массив в строку и удаляем все лишние символы, оставляем наименование задачи в этапа6)
        String newToDoElement1 = newToDoElement.replaceAll("]$", " ");
        String newToDoElement2 = newToDoElement1.replaceAll(","," ");
        toDoList.add(newToDoElement2);

        System.out.println("_________________Результат_________________");
        for (String colorWord : toDoList)
            System.out.println(colorWord);
    }

    public static void addPlace(String commandNewToDo) {                                                     // Add # - добавлять дело на определённое место, сдвигая остальные дела вперёд, если указать номер
        String[] newToDo = commandNewToDo.split(" ");
        String number = newToDo[1];
        int numberInt = Integer.valueOf(number);
        String newToDoElement = Arrays.toString(newToDo).replaceAll("\\[[A|a][d|D][d|D], \\d, ", "");    // массив в строку и удаляем все лишние символы, оставляем наименование задачи
        String newToDoElement1 = newToDoElement.replaceAll("]$", " ");
        String newToDoElement2 = newToDoElement1.replaceAll(",", " ");
        toDoList.add((numberInt-1), newToDoElement2);
        System.out.println("_________________Результат_________________");
        for (String colorWord : toDoList)
            System.out.println(colorWord);
    }

    public static void edit(String commandNewToDo) {                                                     // Edit - заменять дело с указанным номером
        String[] newToDo = commandNewToDo.split(" ");
        String numbertoEdit = newToDo[1];
        int numberInt = Integer.valueOf(numbertoEdit);
        String newToDoElement = Arrays.toString(newToDo).replaceAll("\\[[E|e][d|D][i|I][t|T], \\d, ", "");    // массив в строку и удаляем все лишние символы, оставляем наименование задачи
        String newToDoElement1 = newToDoElement.replaceAll("]$", " ");
        String newToDoElement2 = newToDoElement1.replaceAll(",", " ");
        toDoList.set((numberInt-1), newToDoElement2);
        System.out.println("________________Результат_________________");
        for (String colorWord : toDoList)
            System.out.println(colorWord);
    }

    public static void delete(String commandNewToDo) {                                                     // DELETE - удалять
        String[] newToDo = commandNewToDo.split(" ");
        String numbertoEditToDelete = newToDo[1];
        int numberInt = Integer.valueOf(numbertoEditToDelete);
        toDoList.remove((numberInt - 1));
        System.out.println("________________Результат_________________");
        for (String colorWord : toDoList)
            System.out.println(colorWord);
    }
}



