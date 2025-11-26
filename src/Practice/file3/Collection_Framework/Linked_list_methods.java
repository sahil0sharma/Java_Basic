package Practice.file3.Collection_Framework;
//add(E e)                  // add at end
//add(int index, E e)       // add at specific index
//get(int index)            // get element
//set(int index, E e)       // replace element
//remove(int index)         // remove by index
//remove(Object o)          // remove by value
//size()                    // number of elements
//isEmpty()                 // check if empty
//contains(Object o)        // check presence
//indexOf(Object o)         // first index of element
//lastIndexOf(Object o)     // last index of element
//clear()                   // remove all elements

import java.util.ArrayList;
import java.util.List;

///From Deque interface (Queue + Stack methods)
//addFirst(E e)             // insert at beginning
//addLast(E e)              // insert at end
//getFirst()                // get first element
//getLast()                 // get last element
//removeFirst()             // remove first element
//removeLast()              // remove last element
//peekFirst()               // look at first, null if empty
//peekLast()                // look at last, null if empty
//offer(E e)                // add at end (queue style)
//offerFirst(E e)           // add at beginning
//offerLast(E e)            // add at end
//poll()                    // remove first element, null if empty
//pollFirst()               // remove first element
//pollLast()                // remove last element
//push(E e)                 // push like stack
//pop()                     // pop like stack
public class Linked_list_methods {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        /// converting to array ---> list to array

        Object[] array = list.toArray();
        Integer[] Array1 = list.toArray(new Integer[4]);

        for (Object obj : array) {
            System.out.println(obj);
        }

    }
}
