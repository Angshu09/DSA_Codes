package revise_DSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RepresentationOfGraph {
    public static void main(String[] args) {
        int nodes = 5;

        //Using matrix
        int[][] graph =  createGraphUsingMatrix(nodes);
        //inputs of the graph
        fillGraph(graph, 1, 2);
        fillGraph(graph, 1, 3);
        fillGraph(graph, 2, 4);
        fillGraph(graph, 3, 4);
        fillGraph(graph, 2, 5);
        fillGraph(graph, 4, 5);

        //For weighted graph store the weights instead of 1 in the matrix method

        for(int i=0; i< graph.length; i++){
            for(int j=0; j< graph.length; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        } //Printing the matrix graph


        //using list
        ArrayList<ArrayList<Integer>> list = createGraphUsingList(nodes);
        fillGraphForList(list, 1, 2);
        fillGraphForList(list , 1, 3);
        fillGraphForList(list, 2, 4);
        fillGraphForList(list, 3, 4);
        fillGraphForList(list, 2, 5);
        fillGraphForList(list, 4, 5);

        //for weighted graph store in pairs {2, 4} first one is the vertex and second one is the weight of that edge

        printArrayListOfArrayList(list); // printing the list graph

        System.out.println(bfsOfGraph(nodes, list, 4));

        System.out.println(dfsOfGraph(nodes, list, 1));
    }

    static void printArrayListOfArrayList(ArrayList<ArrayList<Integer>> list){
        for (int i = 1; i < list.size(); i++) {
            System.out.print(i + ": ");
            for (int j : list.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static int[][] createGraphUsingMatrix(int nodes){
        int[][] graph = new int[nodes+1][nodes+1];
        return graph;
    }

    static void fillGraph(int[][] graph, int n, int m){ //Method for matrix
        graph[n][m] = 1;
        graph[m][n] = 1;
    }

    static ArrayList<ArrayList<Integer>> createGraphUsingList(int nodes){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<=nodes; i++){
            list.add(new ArrayList<>());
        }
        return list;
    }

    static void fillGraphForList(ArrayList<ArrayList<Integer>> list, int u, int v){ //Method for list
        list.get(u).add(v);
        list.get(v).add(u);
    }

    //Method to return BFS traversal of a graph
    static ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj, int startingNode){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(startingNode);
        visited[startingNode] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);

            for(int it: adj.get(node)){
                if(visited[it] == false){
                    visited[it] = true;
                    q.add(it);
                }
            }
        }

        return bfs;
    }

    static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj, int startingNode){
        boolean[] vis = new boolean[v+1];
        ArrayList<Integer> list = new ArrayList<>();
        dfs(startingNode, adj, vis, list);
        return list;
    }

    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> list) { //This method is used to go to the depth of the graph using recursion
        vis[node] = true;
        list.add(node);

        for(int it: adj.get(node)){
            if(!vis[it]){
                dfs(it, adj, vis, list);
            }
        }
    }


}
