
package katas.exercises;

import static katas.exercises.ArrayReducer.reduceArray;
import static katas.exercises.GraphCloner.cloneGraph;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GraphClonerTest {

    @Test
    public void testGraphCloner() {

        int[] sampleArray = {10, 15, 7, 20, 25};
        GraphCloner.Node node1 = new GraphCloner.Node(1);
        GraphCloner.Node node2 = new GraphCloner.Node(2);
        GraphCloner.Node node3 = new GraphCloner.Node(3);
        GraphCloner.Node node4 = new GraphCloner.Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node3);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);

        Map<Integer, GraphCloner.Node> visited1 = new HashMap<>();

        getTree( node1,  visited1);

        GraphCloner.Node clonedNode = cloneGraph(node1);

        Map<Integer, GraphCloner.Node> visited2 = new HashMap<>();

        getTree( clonedNode,  visited2);

        assertTrue(compare(visited1,visited2));

    }

    public boolean compare(Map<Integer, GraphCloner.Node> visited1,Map<Integer, GraphCloner.Node> visited2){

        for(Map.Entry<Integer, GraphCloner.Node> entry : visited1.entrySet()) {

            GraphCloner.Node check1 =  entry.getValue();
            GraphCloner.Node check2= visited2.get(entry.getKey());


            if(check1 == check2){
                return false ;
            }

            boolean myConatin = false;

            if(check1.neighbors.size()!=check2.neighbors.size()){
                return false;
            }

            for(GraphCloner.Node first : check1.neighbors){
                myConatin = false;
                for(GraphCloner.Node second : check2.neighbors){
                        if(first.val== second.val){
                            myConatin=true;
                        }
                }
                if(!myConatin){
                    return false;
                }
            }



        }

        return true ;

    }




    public static void getTree(GraphCloner.Node node, Map<Integer, GraphCloner.Node> visited) {
        if (node == null || visited.containsKey(node.val)) return;
        visited.put(node.val,node);
        for (GraphCloner.Node neighbor : node.neighbors) {
            getTree(neighbor, visited);
        }
    }

}


