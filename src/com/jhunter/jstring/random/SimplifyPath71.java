package com.jhunter.jstring.random;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath71 {
    /*
    Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
    In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

    The canonical path should have the following format:

    The path starts with a single slash '/'.
    Any two directories are separated by a single slash '/'.
    The path does not end with a trailing '/'.
    The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
    Return the simplified canonical path.
    Example 1:
        Input: path = "/../"
        Output: "/"
        Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
    Example 2:
        Input: path = "/home//foo/"
        Output: "/home/foo"
        Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 */
    public static String simplifyPath(String path) {
        if (path == null || path.length() <= 0 || (path.length() == 1 && path.charAt(0) != '/'))
            return "";

        int backwordDirCount = 0;
        List<String> resutPathList = new ArrayList<String>();
        String currentDir = "";
        // Input: "/../a/../../"
        for (int i = path.length() - 1; i >= 0; i--) {
            if (path.charAt(i) == '/') {
                if (((path.length() - 1) == i) || (i <= (path.length() - 2) && path.charAt(i + 1) == '/')) continue;
                if (currentDir.equals("..")) {
                    backwordDirCount++;
                    currentDir = "";
                    continue;
                } else if (currentDir.equals(".")) {
                    currentDir = "";
                    continue;
                }
                if (backwordDirCount > 0) {
                    backwordDirCount--;
                    currentDir = "";
                    continue;
                }
                resutPathList.add(0, currentDir);
                currentDir = "";

            } else {
                currentDir = path.charAt(i) + currentDir;
            }
        }

        if (resutPathList.size() == 0) {
            return "/";
        }
        String resStr = "";
        for (String dir : resutPathList) {
            resStr += ("/" + dir);
        }
        return resStr;
    }
}
