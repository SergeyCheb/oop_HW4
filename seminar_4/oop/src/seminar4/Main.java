package seminar4;


import seminar4.gb.array.GBList;
import seminar4.gb.array.HWList;
import seminar4.gb.array.list.GBArrayList;
import seminar4.gb.array.list.HWLinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        GBList<String> strings = new GBArrayList<>();
        strings.add("один");
        strings.add("два");
        strings.add("три");
        System.out.println("-------GET-------");
        System.out.println(strings.get(1));
        System.out.println("-------SIZE-------");
        System.out.println(strings.size());
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);
        System.out.println("-------UPDATE-------");
        strings.update(1, "update");
        System.out.println(strings.get(1));
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);
        System.out.println("-------REMOVE-------");
        strings.remove(1);
        System.out.println(strings.size());
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);
        */
        HWLinkedList<Integer> mylist = new HWLinkedList<>();
        mylist.addToEnd(1);
        mylist.addToEnd(2);
        mylist.addToEnd(3);
        mylist.addToEnd(4);
        mylist.addToEnd(12);
        mylist.addToEnd(33);
        mylist.addToEnd(86);
        mylist.showList();
        int index = 0;
        System.out.println("вывод элемента с индексом " + index + ": " + mylist.getAt(index));

        for (Integer i: mylist) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        mylist.addToBegin(555);

        for (Integer i: mylist) {
            System.out.println(i);
        }

        HWLinkedList<Integer> anotherList = new HWLinkedList<>();
        for (Integer i: anotherList) {
            System.out.println(i);
        }

        anotherList.getAt(0);
    }
}
