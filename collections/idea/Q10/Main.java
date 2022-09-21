package collections.idea.Q10;

import static collections.idea.Q10.LinkedList.printList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.insert(list,1);
        LinkedList.insert(list,90);
        LinkedList.insert(list,89);


        printList(list);
    }

}
