
import java.util.*;

class Graphs {

        static class Edge{
            int src;
            int dest;

            public Edge(int s, int d){
                this.src=s;
                this.dest=d;
            }
        }
        public static void createGraph(ArrayList<Edge> graph[]){
            //by default arraylist ke elements ka value null hota hai iska matlab ye hua ki sure nahi hai kaun si datatype hai waha pe so sgar waha hum directly value dalaenge to exception will be thrown
            //that is why we first make every element empty
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0,2));

            graph[1].add(new Edge(1,2));
            graph[1].add(new Edge(1,3));

            graph[2].add(new Edge(2,0));
            graph[2].add(new Edge(2,1));
            graph[2].add(new Edge(2,3));

            graph[3].add(new Edge(3,1));
            graph[3].add(new Edge(3,2));

        }
        public static void bfs(ArrayList<Edge> graph[],int V){
            Queue<Integer> q=new LinkedList<>();
            boolean visited[]=new boolean[V];
            q.add(0);

            while (!q.isEmpty()){
                int curr=q.remove();
                if(visited[curr] == false)
                    System.out.println(curr+" ");
                    visited[curr]=true;
                    for(int i=0; i<graph[curr].size();i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
            }

        }



        public static void main(String[] args){
            int V=4;
            ArrayList<Edge> graph[]= new ArrayList[V];
            createGraph(graph);
            bfs(graph,V);
            System.out.println();

            //PRINTING 2'S NEIGHBOURS
//            for(int i=0; i<graph[2].size() ;i++){
//                Edge e= graph[2].get(i);
//                System.out.println(e.dest+" ");
//            }





        }



    }


