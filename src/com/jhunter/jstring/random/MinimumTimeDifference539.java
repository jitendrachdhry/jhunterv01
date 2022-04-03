package com.jhunter.jstring.random;

import java.util.Arrays;
import java.util.Set;

public class MinimumTimeDifference539 {

/*
    Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes difference between any two time-points in the list.

    Example 1:
    Input: timePoints = ["23:59","00:00"]
    Output: 1

    Example 2:
    Input: timePoints = ["00:00","23:59","00:00"]
    Output: 0

    Constraints:
        2 <= timePoints.length <= 2 * 104
        timePoints[i] is in the format "HH:MM".
 */

    public static int getMinimumTimeDifference(Set<String> inputSet) {
        Object obj[] = inputSet.toArray();
        Arrays.sort(obj);

        for(Object o : obj) {
            System.out.println(o);
        }
        return 0;
    }
}
