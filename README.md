# Interview Prepration in Java
<h1> Utility Classes </h1>
<table>
    <tr>
        <th>Class</th>
        <th>Description</th>
        <th>Functions</th>
        <th>Big(o) </th>
        <th>Links</th>
    </tr>
    <tr>
        <td>HashSet</td>
        <td>- HashSet is an implementation of Set Interface which does not allow duplicate value. <br />- HashSet is not synchronized which means they are not suitable for thread-safe operations until unless synchronized explicitly. <br />- HashSet permits to have a single null value. </td>
      <td> <b>add(), remove(), contains(), clear(), isEmpty(), size()</b> </td>
       <td>0(1)</td>    
       <td>url</td>
    </tr>
    <tr>
        <td>HashMap</td>
        <td>- HashMap is an implementation of Map Interface, which maps a key to value. <br />- Duplicate keys are not allowed in a Map. <br />- HashMap does not allow duplicate keys however it allows having duplicate values. <br />- HashMap permits single null key and any number of null values. <br />- It maintains no order when we add new (key,value).</td>
        <td>  <b>get(), put(), remove(), keySet(), replace(),containsKey(), containsValue(), <br />values() Returns a Collection view of the values contained in this map. </td>
        <td>HashMap offers 0(1) lookup and insertion.</td>
        <td>https://www.geeksforgeeks.org/differences-treemap-hashmap-linkedhashmap-java/</td>
    </tr>
    <tr>
        <td>HashTree</td>
        <td>TreeMap is an example of a SortedMap, which means that the order of the keys can be sorted, and when iterating over the keys, you can expect that they will be in order.</td>
        <td><b>Insertion</b>:HashTree use <b>put()</b> method for storing data. </td>
        <td>O(log(N)) runtime complexity for inserting and searching, sorted. </td> 
        <td>url</td>
    </tr>
</table>

<h2>Example:</h2>

```
import java.util.*;
import java.lang.*;
import java.io.*;
    class Main
    {
        // This function prints ordering of all elements
        static void insertAndPrint(AbstractMap<Integer, String> map)
        {
            int[] array= {1, -1, 0, 2,-2};
            for (int x: array)
            {
                map.put(x, Integer.toString(x));
            }
            for (int k: map.keySet())
            {
                System.out.print(k + ", ");
            }
        }

        // Driver method to test above method
        public static void main (String[] args)
        {
            HashMap<Integer, String> map = new HashMap<Integer, String>();
            insertAndPrint(map);
            
            // Displaying the HashMap
            System.out.println("Initial Mappings are: " + map);
  
              // Using values() to get the set view of values
              System.out.println("The collection is: " + map.values());
        }
    }
```
