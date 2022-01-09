package Topological_Sorting;

public class Main {
    public static void main(String[] args) {


        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        Graph g1 = new Graph(6);
        g1.addEdge(5,0);
        g1.addEdge(4,0);
        g1.addEdge(5,2);
        g1.addEdge(2,3);
        g1.addEdge(3,1);
        g1.addEdge(4,1);


        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Topological Sort ::: ");
        g1.topologicalSort();
        System.out.println("\n-------------------------------------------------------------------------------");

    }
}
