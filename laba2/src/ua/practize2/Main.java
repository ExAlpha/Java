package ua.practize2;

import java.util.*;

                          // Made by Коноверская Анна и Новицкая София //

public class Main {

    private static void transposition(ArrayList<String> list){
        String lastString = list.get(list.size() - 1);
        list.remove(list.get(list.size() - 1));
        list.add(0,lastString);
    }

    private static void Part1(){
        ArrayList<String> list = new ArrayList<String>();
        String inputString, newInputString;
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println("Enter string № " + i + " :");
            inputString = scanner.nextLine();
            list.add(inputString);
        }
        System.out.println("Initial ArrayList:");
        list.forEach(string -> System.out.println(string));
        for (int i = 0; i < 15; i++){
            transposition(list);
        }
        System.out.println("ArrayList after 15 times swap:");
        list.forEach(string -> System.out.println(string));
        System.out.println("Enter 5 new strings for change");
        for (int i = 5; i < 10; i++){
            System.out.println("Enter new string for adding:");
            newInputString = scanner.nextLine();
            list.set(i,newInputString);
        }
        System.out.println("ArrayList after changing 5 last strings:");
        list.forEach(string -> System.out.println(string));
        scanner.close();
    }

    private static void Part2(){
        ArrayList<String> array = new ArrayList();
        LinkedList<String> list = new LinkedList();
        Date startOper1 = new Date();
        for (int i = 0; i < 100000; i++){
            array.add(0, "object to add");
        }
        Date finishOper1 = new Date();
        long timeOper1 = finishOper1.getTime() - startOper1.getTime();

        Date startOper2 = new Date();
        for (int i = 0; i < 100000; i++){
            list.add(0, "object to add");
        }
        Date finishOper2 = new Date();
        long timeOper2 = finishOper2.getTime() - startOper2.getTime();
        System.out.println("Time for adding to start for ArrayList: " + timeOper1 + " ms");
        System.out.println("Time for adding to start for LinkedList: " + timeOper2 + " ms");
        if (timeOper1 < timeOper2)
            System.out.println("In adding to start ArrayList is faster");
        else
            System.out.println("In adding to start LinkedList is faster");
        System.out.println();

        Date startOper3 = new Date();
        String result;
        for (int i = 0; i < 100000; i++){
            result = array.get(i);
        }
        Date finishOper3 = new Date();
        long timeOper3 = finishOper3.getTime() - startOper3.getTime();

        Date startOper4 = new Date();
        for (int i = 0; i < 100000; i++){
            result = list.get(i);
        }
        Date finishOper4 = new Date();
        long timeOper4 = finishOper4.getTime() - startOper4.getTime();
        System.out.println("Time for reading for ArrayList: " + timeOper3 + " ms");
        System.out.println("Time for reading for LinkedList: " + timeOper4 + " ms");
        if (timeOper3 < timeOper4)
            System.out.println("In reading ArrayList is faster");
        else
            System.out.println("In reading LinkedList is faster");
        System.out.println();

        Date startOper5 = new Date();
        for (int i = 0; i < 100000; i++){
            array.set(i, "new item");
        }
        Date finishOper5 = new Date();
        long timeOper5 = finishOper5.getTime() - startOper5.getTime();

        Date startOper6 = new Date();
        for (int i = 0; i < 100000; i++){
            list.set(i, "new item");
        }
        Date finishOper6 = new Date();
        long timeOper6 = finishOper6.getTime() - startOper6.getTime();
        System.out.println("Time for rewriting for ArrayList: " + timeOper5 + " ms");
        System.out.println("Time for rewriting for LinkedList: " + timeOper6 + " ms");
        if (timeOper5 < timeOper6)
            System.out.println("In rewriting ArrayList is faster");
        else
            System.out.println("In rewriting LinkedList is faster");
        System.out.println();

        Date startOper7 = new Date();
        for (int i = 0; i < 100000; i ++){
            array.remove(0);
        }
        Date finishOper7 = new Date();
        long timeOper7 = finishOper7.getTime() - startOper7.getTime();

        Date startOper8 = new Date();
        for (int i = 0; i < 100000; i ++){
            list.removeFirst();
        }
        Date finishOper8 = new Date();
        long timeOper8 = finishOper8.getTime() - startOper8.getTime();
        System.out.println("Time for removing first item for ArrayList: " + timeOper7 + " ms");
        System.out.println("Time for removing first item for LinkedList: " + timeOper8 + " ms");
        if (timeOper7 < timeOper8)
            System.out.println("In removing first item ArrayList is faster");
        else
            System.out.println("In removing first item LinkedList is faster");
        System.out.println();
    }

    private static void Part3(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++){
            array.add(i);
            array1.add(i);
        }
        System.out.println("Two ArrayList are equal, it is " + array.equals(array1));
        ArrayList<User> arrayUsers = new ArrayList<User>();
        for (int i = 0; i < 10; i++){
            String name = "name" + i;
            String surname = "surname" + i;
            User user = new User(name, surname,66);
            arrayUsers.add(user);
        }
    }

    private static class User{
        String name;
        String surname;
        int age;

        User(String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
    }

    private static void Part4(){
        String[] array = new String[]{"Рогинский","Ничик","Овчаренко","Гораль","Топчий","Именинник","Королович",
                "Балановская","Трегубов","Коноверская","Новицкая","Довбенко",
                "Гончаренко","Гаевой","Евсюкова","Часовская","Огиенко","Овсюченко","Мисирханов","Баришенский","Калина",
                "Санжаров","Логвиненко","Семенов","Вдовицка", "Ильге"};
        Set <String> hashSet = new HashSet<String>();
        TreeSet <String> treeSet = new TreeSet<String>();
        for (int j = 0; j < array.length; j++){
            hashSet.add(array[j]);
            treeSet.add(array[j]);
        }
        System.out.println("Surnames in HashSet:");
        hashSet.forEach(el -> System.out.print(el + ", "));
        ArrayList arrayList = new ArrayList();
        for (String i : hashSet){
            if (i.contains("А") || i.contains("О") || i.contains("У") || i.contains("И") || i.contains("Я") ||
                    i.contains("Ю") || i.contains("Е") || i.contains("Ё") || i.contains("Э")){
                arrayList.add(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++){
            hashSet.remove(arrayList.get(i));
        }
        System.out.println();
        System.out.println("Surnames in HashSet after deleting:");
        hashSet.forEach(el -> System.out.print(el + ", "));
        System.out.println();
        System.out.println("Surnames in TreeSet:");
        treeSet.forEach(el -> System.out.print(el + ", "));
        for (int i = 0; i < 5; i++){
            treeSet.remove(treeSet.first());
        }
        System.out.println();
        System.out.println("Surnames in TreeSet after deleting:");
        treeSet.forEach(el -> System.out.print(el + ", "));
    }

    private static void Part5(){
        Set<Student> hash = new HashSet<Student>();
        Comparator<Student> comp0 = new StudentAlphabetComparator();
        TreeSet<Student> firstTreeSet = new TreeSet(comp0);
        Comparator<Student> comp = new StudentSurameComparator().thenComparing(new StudentNameComparator());
        TreeSet<Student> treeSet = new TreeSet(comp);
        Student first = new Student("София", "Новицкая",666, "ЕСТМ-18-1");
        Student second = new Student("Анна", "Коноверская", 666, "ЕСТМ-18-1");
        hash.add(first);
        treeSet.add(first);
        hash.add(second);
        treeSet.add(second);
        for (Student el : hash){
            firstTreeSet.add(el);
        }
        System.out.println("First TreeSet:");
        firstTreeSet.forEach(el -> System.out.println(el.print() + "."));
        System.out.println("Second TreeSet:");
        treeSet.forEach(el -> System.out.println(el.print() + "."));
    }

    private static class Student{
        String name;
        String surname;
        int numberGroup;
        String Grouppa;

        private String getName(){
            return name;
        }

        private String getSurname(){
            return surname;
        }

        private  String print(){
            String result = "";
            result += "Name: " + this.name + ", surname: " + this.surname + ", grouppa: " + this.Grouppa;
            return result;
        }

        Student(String a, String b, int c, String e){
            this.name = a;
            this.surname = b;
            this.numberGroup = c;
            this.Grouppa = e;
        }
    }

    public static class StudentAlphabetComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            return a.getSurname().compareTo(b.getSurname());
        }
    }

    public static class StudentSurameComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            if (a.getSurname().length() > b.getSurname().length())
                return 1;
            else if (b.getSurname().length() > a.getSurname().length())
                return -1;
            else
                return 0;
        }
    }

    public static class StudentNameComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            return a.getName().compareTo(b.getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("Работу подготовили студенты группы ЕСТМ-18-1 Новицкая София и Коноверская Анна");
        System.out.println("First task:");
        Part1();
        System.out.println("Second task:");
        Part2();
        System.out.println("Third task:");
        Part3();
        System.out.println("Fourth task:");
        Part4();
        System.out.println();
        System.out.println("Fifth task:");
        Part5();
    }
}
