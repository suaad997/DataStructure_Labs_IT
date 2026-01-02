package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> clist=new CircularLinkedList<String>();
        clist.addFirst("Raneem");
        clist.addFirst("Sara");
        clist.addFirst("Raghad");
        clist.addLast("Duaa");
        clist.addLast("Aya");
        clist.addLast("Rahaf");
        clist.addLast("Batool");
      //  clist.removeFirst();
       // clist.removeLast();
        clist.display();
        System.out.println(" total Attendance are "+clist.size());



    }
}
