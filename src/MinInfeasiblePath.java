import java.util.HashSet;
import java.util.LinkedList;

public class MinInfeasiblePath {

	// create a directed graph
	DirectedGraph<DonorPatientPair> createGraph(Exchange_Program ep) {
		DirectedGraph<DonorPatientPair> graph = new DirectedGraph<>();
		for (DonorPatientPair u : ep.set_of_DonorPatientPairs) {
			graph.addVertex(u); // add all the DonorPatientPairs as vertices
		}

		// now we're going to add the edges
		for (DonorPatientPair u : ep.set_of_DonorPatientPairs) {
			for (DonorPatientPair v : ep.set_of_DonorPatientPairs) {
				if (u.patient.number != v.patient.number
						&& v.patient.compatible_kidneys.contains(u.patient.paired_kidney)) {
					graph.addEdge(u, v); 
					//if the kidney of u is compatible with the patient of v, add an edge u->v 
				}
			}
		}
		return graph;
	}

	HashSet<LinkedList<DonorPatientPair>> minInfeasiblesPaths(Exchange_Program ep) {
		DirectedGraph<DonorPatientPair> graph = createGraph(ep);
		HashSet<LinkedList<DonorPatientPair>> paths = new HashSet<>();

		
		return paths;
	}
}
