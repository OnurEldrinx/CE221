package Topological_Sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Graph {

    int V; // number of vertices

    ArrayList<Integer>[] adjacencyLists; // an array for lists include the adjacency lists of all vertices

    public Graph(int v){

        this.V = v;
        this.adjacencyLists = new ArrayList[v];

        for (int i=0;i<V;i++){

            adjacencyLists[i] = new ArrayList<>();

        }


    }

    public void addEdge(int v1,int v2){

        adjacencyLists[v1].add(v2);

    }

    public void topologicalSort(){

        int[] indegrees = new int[this.V];

        for (int i=0;i<V;i++){

            ArrayList<Integer> temp = this.adjacencyLists[i];

            for (int n:temp){

                indegrees[n]++;

            }

        }

        Queue<Integer> q = new LinkedList<>();
        int counter = 0;

        for (int i=0;i<this.V;i++){

            if (indegrees[i] == 0){

                q.add(i);

            }

        }

        ArrayList<Integer> topologicalOrder = new ArrayList<>();

        while (!q.isEmpty()){

            int u = q.poll();
            topologicalOrder.add(u);

            for (int n : adjacencyLists[u]){


                if (--indegrees[n] == 0){

                    q.add(n);

                }

            }

            counter++;

        }

        // Cycle Check
        if (counter != V){

            System.out.println("XXX Cycle Detected XXX");

        }

        for (int i:topologicalOrder){

            System.out.print(i + " ");

        }

    }

}
