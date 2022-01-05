# Interview Prepration in Java

><h2> Time Table </h2>
<table>
    <tr>
        <th>Hours</th>
        <th>Task</th>
    </tr>
    <tr>
       <td> 5AM - 7AM </td> 
       <td> Revision </td> 
    </tr>
    <tr>
       <td> 8:30AM - 3:30PM </td> 
       <td> LeetCode Practice </td> 
    </tr>
    <tr>
       <td> 5PM - 6PM </td> 
       <td> LeetCode Practice </td> 
    </tr>
    <tr>
       <td> 7PM - 11PM </td> 
       <td> LeetCode Practice </td> 
    </tr>
</table>

><h2> URL </h2>
| URL                                                                                                  | Description              |
|------------------------------------------------------------------------------------------------------|--------------------------|
| [Machine Coding](https://workat.tech/machine-coding/practice)                                        | machine coding in detail |
| [low level design ](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions.md) | low level design         |
| [interviewbit](https://www.interviewbit.com/)                                                        | interviewbit             |
| [pramp](https://www.pramp.com/#/)                                                                    | Mock Interview Websites  |

><h1> String based Questions </h1>
| Question                                                                                                                                                                     | Example | Time Complexity | Space Complexity | Leetcode Link | Solution Link | YouTube                                                                      |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|---------------|------------------|---------------|---------------|------------------------------------------------------------------------------|
| Given a string s, find the length of the longest substring without repeating characters.                                                                                     |  Input: s = "abcabcbb" <br> Output: 3 <br> Explanation: <br>The answer is "abc", with the length of 3. | O(n) | O(1) | 	.../| 	.../| 	.../                                                                        |
| Given a string s, return the longest palindromic substring in s.                                                                                                             |Input: s = "babad" <br>Output: "bab" <br>Explanation: "aba" is also a valid answer. <br>|O(n^2) | O(1) |[longest-palindromic-substring](https://leetcode.com/problems/longest-palindromic-substring/)| [JHunterString.java#L202](https://github.com/jitendrachdhry/jhunterv01/blob/master/src/com/jhunter/JHunterString/JHunterString.java#L202)| [Longest Palindromic Substring](https://www.youtube.com/watch?v=y2BD4MJqV20) |
| The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility) |Input: s = "PAYPALISHIRING", numRows = 4 <br>Output: "PINALSIGYAHRPI" <br> Explanation:<br>P     I    N<br>A   L S  I G<br>Y A   H R<br>P  | O(n) | O(n) | [zigzag-conversion](https://leetcode.com/problems/zigzag-conversion/)| [zigzag-conversion-problem](https://github.com/jitendrachdhry/jhunterv01/blob/master/src/com/jhunter/JHunterString/JHunterString.java#L258)| [the-zigzag-conversion-problem-3nne](https://dev.to/alisabaj/the-zigzag-conversion-problem-3nne)            |
| string-to-integer atoi()                                                                                                                                                     | | | |[string-to-integer-atoi](https://leetcode.com/problems/string-to-integer-atoi/) | | |
| Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:<br>'.' Matches any single character.<br>'*' Matches zero or more of the preceding element.|Input: s = "ab", p = ".*"<br>Output: true<br>Explanation: ".*" means "zero or more (*) of any character (.)".|O(n) | O(1) | [regular-expression-matching](https://leetcode.com/problems/regular-expression-matching/) | | |

><h1> Dynamic Programming based Questions </h1>
| Question                                                                                                                                                                                                | Example                                                                       | Time Complexity | Space Complexity | Leetcode Link | Solution Link | YouTube |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|-----------------|------------------|---------------|---------------|---------|
| Maximum Value Contiguous Subsequence. Given a sequence of n real numbers A(1) ... A(n), determine a contiguous subsequence A(i) ... A(j) for which the sum of elements in the subsequence is maximized. | Input: { 1, -2, 4, 3, -2, 0} <br> Result: 7 (2,3)                             | O(n)            | O(1)             | ../           | ../           | ../     |
| Given array of integers as input and a target, return true if a contiguous subsequence sums to the target.                                                                                              | If A={2,5,6,−1} and k=5 then the answer is 2, since both 5 and 6,−1 sum to 5. | O(n^2)          | O(1)             | ../           | ../           | ../     |
| Find The Longest (strict) Increasing Subsequence.                                                                                                                                                       | Input:{ -1, 3, 4, 5, 2, 2, 2, 2 } <br>Output:{ -1, 3, 4, 5 }                  | O(n^2)          | O(1)             | ../           | ../           | ../     |
| Find The Longest NonDecreasing Subsequence.                                                                                                                                                             | Input: { -1, 3, 4, 5, 2, 2, 2, 2 } <br>Output: { -1, 2, 2, 2, 2 }             | O(n^2)          | O(1)             | ../           | ../           | ../     |
| Find The Longest Decreasing Subsequence.                                                                                                                                                                | Input: { -1, 3, 4, 5, 2, 2, 2, 2 } <br> Output: { 5, 2 }                      | O(n^2)          | O(1)             | ../           | ../           | ../     |


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
        <td>  <b>get(), put(), remove(), keySet(), replace(),containsKey(), containsValue(), <br />values() </b>b> Returns a Collection view of the values contained in this map. </td>
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
URL: https://people.cs.clemson.edu/~bcdean/dp_practice/ 
![image](https://user-images.githubusercontent.com/28762727/144358436-83fa698c-40d0-410f-a851-1279db7cdbab.png)

![image](https://user-images.githubusercontent.com/28762727/144462085-e0c63c1c-7ce6-482c-9a7c-0c7ccdc4b35b.png)

