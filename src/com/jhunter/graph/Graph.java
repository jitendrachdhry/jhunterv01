package com.jhunter.graph;

import java.util.*;

public class Graph<T> {

    boolean isDirected;
    // We use Hashmap to store the edges in the graph
    private Map<T, List<T>> map;

    public Graph(boolean isDirected) {
        map = new HashMap<>();
        this.isDirected = isDirected;
    }

    public Graph() {
        map = new HashMap<>();
        this.isDirected = false;
    }

    public void addVertex(T v) {
        map.put(v, new ArrayList<>());
    }

    public void addEdge(T source, T destination) {
        map.putIfAbsent(source, new ArrayList<>());
        map.get(source).add(destination);
    }

    /* BFS: https://www.techiedelight.com/breadth-first-search/
            1. Iterative Implementation of BFS
    */
    public List<T> bfs(T vNode) {
        List<T> list = new ArrayList<>();
        if (!map.isEmpty() && map.containsKey(vNode)) {
            Map<T, Boolean> visited = new HashMap<>();

            Queue<T> q = new LinkedList<>();
            q.add(vNode);
            list.add(vNode);
            visited.put(vNode, true);

            while (!q.isEmpty()) {
                T vertex = q.poll();
                if (map.get(vertex) != null) {
                    for (T v : map.get(vertex)) {
                        if (!visited.containsKey(v)) {
                            q.add(v);
                            list.add(v);
                            visited.put(v, true);
                        }
                    }
                }
            }
        }
        return list;
    }

    /* BFS: https://www.techiedelight.com/breadth-first-search/
        2. Recursive Implementation of BFS
    */

    List<T> BFSRecursive(T vNode) {
        List<T> list = new ArrayList<>();
        if (!map.containsKey(vNode)) return list;
        Queue<T> queue = new LinkedList<>();
        queue.add(vNode);
        Map<T, Boolean> visited = new HashMap<>();
        visited.put(vNode, true);
        list.add(vNode);
        BFSRecursive(queue, visited, list);
        return list;
    }

    void BFSRecursive(Queue<T> queue, Map<T, Boolean> visited, List<T> list) {
        if (queue.isEmpty()) return;
        T currentNode = queue.poll();
        if (map.get(currentNode) == null) {
            BFSRecursive(queue, visited, list);
            return;
        }
        for (T v : map.get(currentNode)) {
            if (visited.containsKey(v) && visited.get(v) == true) continue;
            queue.add(v);
            list.add(v);
            visited.put(v, true);
        }
        BFSRecursive(queue, visited, list);
    }

    /*DFS: https://www.techiedelight.com/depth-first-search/ */
    public List<T> dfs(T vNode) {
        List<T> list = new ArrayList<>();
        if (vNode == null || !map.containsKey(vNode)) return list;
        Map<T, Boolean> visited = new HashMap<>();

        dfs(vNode, list, visited);
        return list;
    }

    public void dfs(T vNode, List<T> list, Map<T, Boolean> visited) {
        list.add(vNode);
        visited.put(vNode, true);
        if (map.get(vNode) != null) {
            for (T v : map.get(vNode)) {
                if (!visited.containsKey(v)) {
                    dfs(v, list, visited);
                }
            }
        }
    }

    public boolean isCyclicGraph() {
        if (isDirected) {
            HashMap<T, Boolean> visited = new HashMap<T, Boolean>();
            for (T v : map.keySet()) {
                visited.clear();
                if (isCyclicGraph(v, visited)) {
                    return true;
                }
            }
        } else {
            HashMap<T, Integer> visited = new HashMap<T, Integer>();
            for (T v : map.keySet()) {
                visited.clear();
                if (isCyclicGraphUnDirected(v, visited) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isCyclicGraph(T vNode, HashMap<T, Boolean> visited) {
        boolean isCycleExist = false;
        visited.put(vNode, true);
        if (map.get(vNode) != null) {
            for (T v : map.get(vNode)) {
                if (visited.containsKey(v) && visited.get(v) == true) {
                    isCycleExist = true;
                    break;
                }
                isCycleExist = isCyclicGraph(v, visited);
                if (isCycleExist) return isCycleExist;
            }
        }
        visited.put(vNode, false);
        return isCycleExist;
    }

    /* Using DFS : https://www.youtube.com/watch?v=eCG3T1m7rFY */

    /* Using BFS: https://www.youtube.com/watch?v=vXrv3kruvwE&t=327s
     * 0 - Not Visited
     * 1 - visited
     * 2 - traversed / processed
     * current node adjacent vertex should not be in visited(1) state.
     * */
    boolean isCyclicGraphUnDirected(T vNode, HashMap<T, Integer> visited) {
        Queue<T> q = new LinkedList<>();
        q.add(vNode);
        visited.put(vNode, 1);

        while (!q.isEmpty()) {
            T node = q.poll();
            visited.put(node, 2);

            for (T v : map.get(node)) {
                if (visited.getOrDefault(v, 0) == 1) {
                    return true;
                } else if (visited.getOrDefault(v, 0) == 2) {
                    continue;
                }
                q.add(v);
                visited.put(v, 1);
            }
        }
        return false;
    }

    public void executeTestCases() {
        Graph<Character> directedGraph = new Graph<>(true);
        directedGraph.addEdge('a', 'b');
        directedGraph.addEdge('a', 'c');
        directedGraph.addEdge('d', 'e');
        directedGraph.addEdge('b', 'd');
        directedGraph.addEdge('e', 'f');
        directedGraph.addEdge('e', 'b');
        directedGraph.addEdge('e', 'c');
        System.out.println("\n         Directed Graph BFS: " + directedGraph.bfs('a'));
        System.out.println("Directed Graph BFSRecursive: " + directedGraph.BFSRecursive('a'));
        System.out.println("         Directed Graph DFS: " + directedGraph.dfs('a'));
        System.out.println("     Directed isCyclicGraph: " + directedGraph.isCyclicGraph());

        Graph<Character> unDirectedGraph = new Graph<>(false);
        unDirectedGraph.addEdge('0', '1');
        unDirectedGraph.addEdge('1', '0');
        unDirectedGraph.addEdge('0', '2');
        unDirectedGraph.addEdge('2', '0');
        unDirectedGraph.addEdge('0', '3');
        unDirectedGraph.addEdge('3', '0');
        unDirectedGraph.addEdge('2', '3');
        unDirectedGraph.addEdge('3', '2');

        System.out.println("         Directed Graph BFS: " + unDirectedGraph.bfs('0'));
        System.out.println("Directed Graph BFSRecursive: " + unDirectedGraph.BFSRecursive('0'));
        System.out.println("         Directed Graph DFS: " + unDirectedGraph.dfs('2'));
        System.out.println("    UnDirected isCyclicGraph: " + unDirectedGraph.isCyclicGraph());

    }

    /*
    public List<T> bfs(T vNode) {
        List<T> list = new ArrayList<>();
        if (!map.isEmpty() && map.containsKey(vNode)) {
            Map<T, Boolean> visited = new HashMap<>();

            Queue<T> q = new LinkedList<>();
            q.add(vNode);
            list.add(vNode);
            visited.put(vNode, true);

            while (!q.isEmpty()) {
                T vertex = q.poll();
                    if (map.get(vertex) != null) {
                        for (T v : map.get(vertex)) {
                            if (!visited.containsKey(v)) {
                                q.add(v);
                                list.add(v);
                                visited.put(v, true);
                            }
                        }
                    }
            }
        }
        return list;
    }
     */
}
