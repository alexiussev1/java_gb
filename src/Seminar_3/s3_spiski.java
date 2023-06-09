package Seminar_3;

import java.util.*;

public class s3_spiski {
    public static void main(String[] args) {

//        Object


        ArrayList list = new ArrayList();   // это будет Object

        list.add(1);
        list.add(.1);
        list.add(.1f);
        list.add("One");
        list.add(true);


        // Этот метод медленный, лучше не использовать ->
        if (list.get(0) instanceof Integer) {
            int a = ((Integer) list.get(0));
        }


        ArrayList<String> list_2 = new ArrayList<>();

        //list_2.add(1);        выдаст ошибку , не даст собрать
        //list_2.add(.1);       выдаст ошибку , не даст собрать
        //list_2.add(.1f);      выдаст ошибку , не даст собрать
        //list_2.add(true);     выдаст ошибку , не даст собрать
        list_2.add("One");      //Метод add удобен тем что он добавляет в конец, сам увеличивает размерность,
        list_2.add("Two");
        list_2.add(1, "Три"); //будет сдвижка массива вправо, вместо элмеента индекс встанет вставляемый
        // элемент, а ранее элемент с индексом 1 и после него сместятся вправо.
        list_2.remove(1);             //будет удален элмеент с индексом 1 а правая часть сместится влево.
        String a = list_2.get(0);           // вызываем методом get значение объекат под индексом 0

        list.ensureCapacity(126); //??? Не блыо пояснений

        ArrayList<Integer> listI1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) listI1.add(new Random().nextInt(25));

        for (int i = 0; i < listI1.size(); i++) { //+ то что моожно перзаписывать значение, удалять, у нас тут есть индекс для обращения
            System.out.println(listI1.get(i));
        }

        for (int n : listI1) {// неудобно ввиду отсутвия индекса, нельзя изменить данные списка, удалить данные в списке
            System.out.println(n);

        }

        listI1.forEach(n -> System.out.print(n + ", ")); //более упрощенный перебо элементов списка

        System.out.println();

        // *** ИТЕРАТОР ****

        Iterator<Integer> iterator_1 = listI1.iterator();
        while (iterator_1.hasNext()) { //iterator.hasNext() возращает true когда есть что перебрать
            int n = iterator_1.next();
            System.out.print(n + ", ");
            iterator_1.remove(); // в итоге элемент удаляется из исходного списка listI1 - методом итератора)))
        }

        System.out.println();
        System.out.println(listI1);


        //*** ЛИСТ ИТЕРАТОР ****

        ArrayList<Integer> listI2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) listI2.add(new Random().nextInt(25));

        ListIterator<Integer> iterator_2 = listI2.listIterator(listI2.size() - 1);
        while (iterator_2.hasPrevious()) { //iterator.hasNext() двигается в одну или другую сторону
            int n = iterator_2.previous();
            System.out.print(n + ", ");
            iterator_2.remove(); // в итоге элемент удаляется из исходного списка listI1 - методом итератора)))
        }
        System.out.println(listI2);

        System.out.println("-".repeat(40));


        // *** removeAll
        System.out.println("*** removAll ***");
        for (int i = 0; i < 10; i++) {
            listI1.add(new Random().nextInt(25));
            listI2.add(new Random().nextInt(25));
        }
        System.out.println(listI1);
        System.out.println(listI2);
        System.out.println("*".repeat(40));

        listI1.removeAll(listI2); // *** removAll удаляет из списка все элементы которые совпадают по значению со вторым списком
        System.out.println(listI1);


        //*** retainAll
        System.out.println("*** retainAll ***");
        for (int i = 0; i < 10; i++) {
            listI1.add(new Random().nextInt(25));
            listI2.add(new Random().nextInt(25));
        }
        System.out.println(listI1);
        System.out.println(listI2);
        System.out.println("*".repeat(40));

        listI1.retainAll(listI2); // оставит совпадающие значения в 1 списке которые есть во втором
        System.out.println(listI1);


        //*** contains
        System.out.println("*** contains ***");
        for (int i = 0; i < 10; i++) {
            listI1.add(new Random().nextInt(25));
            listI2.add(new Random().nextInt(25));
        }
        listI2.contains(45); // *** contains если есть совпадение по значению вернет истину иначе ложь
        System.out.println(listI2.contains(45));


        // *** subList - возвращает подсписок сначиная с заданного начального индекса до заданного конечного
        System.out.println("*** subList ***");
        for (int i = 0; i < 10; i++) {
            listI1.add(new Random().nextInt(25));
            listI2.add(new Random().nextInt(25));
        }
        System.out.println(listI2);
        System.out.println(listI2.subList(5, 9)); // *** subList - возвращает подсписок сначиная с заданного начального индекса до заданного конечного не включя последний индекс


        // *** clone - возвращает объект такой же которые его вызвал
        System.out.println("*** clone ***");
        Object listI3 = listI2.clone();
        System.out.println(listI2);
        System.out.println(listI3);


        // *** clear - очищает список удаляя значения но не ячейки
        System.out.println("*** clear ***");
        for (int i = 0; i < 10; i++) {
            listI1.add(new Random().nextInt(25));
        }
        System.out.println(listI1);
        listI1.clear();
        System.out.println(listI1);


        // *** sort - сортиировка списка (нужен класс - корпаратор)
        System.out.println("*** sort ***");
        for (int i = 0; i < 10; i++) {
            listI2.add(new Random().nextInt(25));
        }
        System.out.println(listI2);
        listI2.sort(Comparator.naturalOrder()); // сортировка по возрастанию
        System.out.println(listI2);
        listI2.sort(Comparator.reverseOrder()); // сортировка по убыванию
        System.out.println(listI2);

        listI2.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return 0; // o1-o2 - от меньшегок большему o2-o1 - от большего к меньшему
            }
        });
        System.out.println(listI2);

        listI2.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 != 0) return 1;         // варианты сортировки по условиям
                if (o2 % 2 != 0) return 0;
                return -1;
            }
        });
        System.out.println(listI2);

        // **** сортировка строк в списке

        System.out.println("*** что-то текстовое ***");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Два");
        list1.add(1, "Три");
        list1.add("Квас");
        list1.add("Ал");
        list1.add("Пирог");
        list1.add("Слон");
        list1.add("Кора");
        list1.remove(1);
        a = list1.get(0);
        System.out.println(list1);

        list1.forEach(System.out::print);

        list1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split("")[1].compareTo(o2.split("")[1]);
            }
        });

        // *** LinkedList - вид списка
        LinkedList<Integer> integers = new LinkedList<>(); // медленный и огромный
        integers.add(3);
//        int r = integers.get(3);    // в линкед листе находится ячейка нуптем перебора каждой, до искомой, а не сразу обращается  потому что нет индексов
        // плюсы что если удалить узел из середины не придется переписывать весь лист, изменятся только ссылки между соседними узлами
        integers.addFirst(4);
        listI1.addAll(integers);    // для работы с данными линкед листа удобнее его передать в эррай лист

        // Вывести массив через принт
        System.out.println();
        System.out.println("*** Вывести массив через принт ****");
        System.out.println(new int[]{1, 15, 12}); //покажет объект массива, до собачки I - integer, после сорбачки HASH
        System.out.println(Arrays.toString(new int[]{1, 15, 12})); // выведет занчиение массива


    }
}
