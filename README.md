# Interview Preparation in Java

> <b><i> Paradigm | Principles </i> </b>

| Sr. No. | Technique           | URL                                                                                                                                                                            | In Detail                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Youtube | When to Approach ?|
|---------|---------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|-------------------|
| 1.      | Brute Force         |                                                                                                                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |         | |
| 2.      | Sliding Window      |                                                                                                                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |         | |
| 3.      | Dynamic Programming | [dynamic-programming-introduction](https://takeuforward.org/data-structure/dynamic-programming-introduction/)                                                                  | <br><b><i>Dynamic Programming</i></b> can be described as storing answers to various sub-problems to be used later whenever required to solve the main problem.<br><br>The two common dynamic programming approaches are:<br><b>Memoization:</b><br> Known as the “top-down” dynamic programming, usually the problem is solved in the direction of the main problem to the base cases.<br><b>Tabulation:</b> Known as the “bottom-up ” dynamic programming, usually the problem is solved in the direction of solving the base cases to the main problem. |         | <b>How to check if a program can use Dynamic Programming?</b> <br> Now, that we know how to solve problems using dp, let’s discuss briefly about when to use this technique. If we are reading the problem and come across the following questions , I believe there is a way to implement dp in there. <br>    1. Can the problem be divided into sub-problems? <br>     2. Is there a recursive solution to the problem?<br>    3. Are there repetitive sub-problems?<br>    If the answers to all of the above questions is a YES, you are good to go.|
| 4.      | Divide and Conquer  |                                                                                                                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |         | |
| 5.      | Back Tracking       | [recursive-backtracking](https://brilliant.org/wiki/recursive-backtracking/)  ![image](https://ds055uzetaobb.cloudfront.net/brioche/uploads/VbjMBxXMfP-diagram.png?width=4000) | <b><i>Backtracking</i></b> is a sort of refined <b><i>brute force</b><i/>. At each node, we eliminate choices that are obviously not possible and proceed to recursively check only those that have potential. This way, at each depth of the tree, we mitigate the number of choices to consider in the future.                                                                                                                                                                                                                                           |         | |
| 6.      | Greedy              |                                                                                                                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |         | |
| 7.      | Recursion           |                                                                                                                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |         | |





><h2> URL </h2>
| URL                                                                                                  | Description              |
|------------------------------------------------------------------------------------------------------|--------------------------|
| [Machine Coding](https://workat.tech/machine-coding/practice)                                        | machine coding in detail |
| [low level design ](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions.md) | low level design         |
| [interviewbit](https://www.interviewbit.com/)                                                        | interviewbit             |
| [pramp](https://www.pramp.com/#/)                                                                    | Mock Interview Websites  |
| [takeuforward](https://takeuforward.org/)                                                            | takeuforward             |

><h1> String based Questions </h1>
| Sr. No. | Question                                                                                                                                                                                                                            | Example                                                                                                                                   | Time Complexity              | Space Complexity         | Paradigm                                                                                       | Leetcode Link                                                                                                 | Solution Link                                                                                                                               | YouTube                                                                                          |
|---------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|------------------------------|--------------------------|------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| 1.      | Given a string s, find the length of the longest substring without repeating characters.                                                                                                                                            | Input: s = "abcabcbb" <br> Output: 3 <br> Explanation: <br>The answer is "abc", with the length of 3.                                     | O(n)                         | O(1)                     |                                                                                                | 	.../                                                                                                         | 	.../                                                                                                                                       | 	.../                                                                                            |
| 2.      | Given a string s, return the longest palindromic substring in s.                                                                                                                                                                    | Input: s = "babad" <br>Output: "bab" <br>Explanation: "aba" is also a valid answer. <br>                                                  | O(n^2)                       | O(1)                     |                                                                                                | [longest-palindromic-substring](https://leetcode.com/problems/longest-palindromic-substring/)                 | [JHunterString.java#L202](https://github.com/jitendrachdhry/jhunterv01/blob/master/src/com/jhunter/JHunterString/JHunterString.java#L202)   | [Longest Palindromic Substring](https://www.youtube.com/watch?v=y2BD4MJqV20)                     |
| 3.      | The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)                                                        | Input: s = "PAYPALISHIRING", numRows = 4 <br>Output: "PINALSIGYAHRPI" <br> Explanation:<br>P     I    N<br>A   L S  I G<br>Y A   H R<br>P | O(n)                         | O(n)                     |                                                                                                | [zigzag-conversion](https://leetcode.com/problems/zigzag-conversion/)                                         | [zigzag-conversion-problem](https://github.com/jitendrachdhry/jhunterv01/blob/master/src/com/jhunter/JHunterString/JHunterString.java#L258) | [the-zigzag-conversion-problem-3nne](https://dev.to/alisabaj/the-zigzag-conversion-problem-3nne) |
| 4.      | string-to-integer atoi()                                                                                                                                                                                                            |                                                                                                                                           |                              |                          |                                                                                                | [string-to-integer-atoi](https://leetcode.com/problems/string-to-integer-atoi/)                               |                                                                                                                                             |                                                                                                  |
| 5.      | Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:<br>'.' Matches any single character.<br>'*' Matches zero or more of the preceding element.                       | Input: s = "ab", p = ".*"<br>Output: true<br>Explanation: ".*" means "zero or more (*) of any character (.)".                             | O(n)                         | O(1)                     |                                                                                                | [regular-expression-matching](https://leetcode.com/problems/regular-expression-matching/)                     |                                                                                                                                             |                                                                                                  |
| 6.      | Roman to Integer                                                                                                                                                                                                                    |                                                                                                                                           |                              |                          |                                                                                                | [roman-to-integer](https://leetcode.com/problems/roman-to-integer/)                                           |                                                                                                                                             |                                                                                                  |
| 7.      | Integer to Roman                                                                                                                                                                                                                    |                                                                                                                                           |                              |                          |                                                                                                | [integer-to-roman](https://leetcode.com/problems/integer-to-roman/)                                           |                                                                                                                                             |                                                                                                  |
| 8.      | Longest Common Prefix                                                                                                                                                                                                               |                                                                                                                                           |                              |                          |                                                                                                | [longest-common-prefix](https://leetcode.com/problems/longest-common-prefix/)                                 |                                                                                                                                             |                                                                                                  |
| 9.      | Letter Combinations of a Phone Number                                                                                                                                                                                               |                                                                                                                                           |                              |                          |                                                                                                | [letter-combinations-of-a-phone-number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) |                                                                                                                                             |                                                                                                  |
| 10.     | Generate Parentheses                                                                                                                                                                                                                |                                                                                                                                           |                              |                          | [Backtracking](https://leetcode.com/explore/featured/card/recursion-ii/472/backtracking/2654/) | [letter-combinations-of-a-phone-number](https://leetcode.com/problems/generate-parentheses/)                  |                                                                                                                                             |                                                                                                  |
| 11.     | Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.                                                                                                |                                                                                                                                           |                              |                          |                                                                                                | [longest-valid-parentheses](https://leetcode.com/problems/longest-valid-parentheses/)                         |                                                                                                                                             | [YouTube: longest-valid-parentheses](https://www.youtube.com/watch?v=qC5DGX0CPFA)                |
| 12.     | Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:<br>'?' Matches any single character.<br>'*' Matches any sequence of characters (including the empty sequence). | Input: s = "abcdt" , p = "a?*tt"<br>Output: true <br>Explanation: '?' matches 'b', but the second letter is 'x', which match will all.    |                              |                          |                                                                                                | [wildcard-matching](https://leetcode.com/problems/wildcard-matching/)                                         |                                                                                                                                             | [YouTube: wildcard-matching](https://www.youtube.com/watch?v=7SHV_QfVROE)                        |
| 13.     | Group Anagrams                                                                                                                                                                                                                      |                                                                                                                                           |                              |                          |                                                                                                | [Group Anagrams](https://leetcode.com/problems/group-anagrams/)                                               |                                                                                                                                             | [YouTube: Group anagrams](https://www.youtube.com/watch?v=0I6IL3TnIZs)                           |
| 14.     | 71. Simplify Path                                                                                                                                                                                                                   |                                                                                                                                           |                              |                          |                                                                                                | [Simplify Path](https://leetcode.com/problems/simplify-path/)                                                 |                                                                                                                                             |                                                                                                  |
| 15.     | 76. Minimum Window Substring                                                                                                                                                                                                        |                                                                                                                                           |                              |                          | Sliding Window                                                                                 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)                           |                                                                                                                                             | [YouTube: Minimum Window Substring]( https://www.youtube.com/watch?v=e1HlptlipB0 )               | 
| 16.     | 72. Edit Distance                                                                                                                                                                                                                   |                                                                                                                                           | O(s1.length() x s2.length()) | O(s1.length x s2.length) | Dynamic Programming                                                                            | [Edit Distance](https://leetcode.com/problems/edit-distance/)                                                 |                                                                                                                                             | [YouTube: Edit Distance]( https://www.youtube.com/watch?v=e1HlptlipB0 )                          | 
| 17.     | 91. Decode Ways                                                                                                                                                                                                                     |                                                                                                                                           | O(s1.length() x s2.length()) | O(s1.length x s2.length) | Dynamic Programming                                                                            | [Decode Ways](https://leetcode.com/problems/decode-ways/)                                                     |                                                                                                                                             | [YouTube: Decode Ways]( ../ )                                                                    | 
| 18.     | 93. Restore IP Addresses                                                                                                                                                                                                            | <b>Input:</b> s = "25525511135" <b>Output:</b> ["255.255.11.135","255.255.111.35"]                                                        | O(3^n)                       |                          | Back Tracking                                                                                  | [restore-ip-addresses](https://leetcode.com/problems/restore-ip-addresses/)                                   |                                                                                                                                             | [YouTube: Restore IP Addresses ](https://www.youtube.com/watch?v=61tN4YEdiTM)                    |
| 19.     | 97. Interleaving String                                                                                                                                                                                                             | <b>Input:</b> s = "aab", "axy", "aaxaby" <b>Output:</b> true <br> <b>Input:</b> "aby", "xaa", "aaxaby"   <b>Output:</b> false             | O(nxm)                       |                          | Dynamic Programming                                                                            | [Interleaving String](https://leetcode.com/problems/interleaving-string/)                                     |                                                                                                                                             | [YouTube: Interleaving String ](https://www.youtube.com/watch?v=ih2OZ9-M3OM&t=365s)              |
| 20.     | 115. Distinct Subsequences                                                                                                                                                                                                          | <b>Input:</b> s = "rabbbit", t = "rabbit" <b>Output:</b> 3 <br> <b>Input:</b> s = "babgbag", t = "bag"  <b>Output:</b> 5                  | O(nxm)                       |                          | Dynamic Programming                                                                            | [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/)                                 |                                                                                                                                             | [YouTube: Distinct Subsequences ](https://www.youtube.com/watch?v=pPsuzQ_NIX0)                   |
| 21.     | 125. Valid Palindrome                                                                                                                                                                                                               | <b>Input:</b> s = "A man, a plan, a canal: Panama" <b>Output:</b> true - Explanation: "amanaplanacanalpanama" is a palindrome.            | O(nxm)                       |                          |                                                                                                | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                                           |                                                                                                                                             |                                                                                                  |

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

