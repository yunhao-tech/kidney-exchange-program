
public class Greedy_algo {

	Graph<DonorPatientPair> createGraph(Exchange_Program ep) {
		Graph<DonorPatientPair> graph = new Graph<>();
		for (DonorPatientPair u : ep.set_of_DonorPatientPairs) {
			graph.addVertex(u); // add all the DonorPatientPairs as vertices
		}

		// now we're going to add the edges
		for (DonorPatientPair u : ep.set_of_DonorPatientPairs) {
			for (DonorPatientPair v : ep.set_of_DonorPatientPairs) {
				if (u.patient.number != v.patient.number
						&& u.patient.compatible_kidneys.contains(v.patient.paired_kidney)
						&& v.patient.compatible_kidneys.contains(u.patient.paired_kidney)) {
					graph.addEdge(u, v);
				}
			}
		}
		return graph;
	}

	void greedy(Exchange_Program ep) {
		Graph<DonorPatientPair> graph = createGraph(ep);
		int index = 0;// indicates the order of patient in priority list

		while (index != ep.N - 1) { // while there is(are) still patient(s) not matched
			Patient p = ep.priority_list[index];
			DonorPatientPair dpp1 = new DonorPatientPair(p);
			Option[] opt = (Option[]) p.preference_list.toArray(); // not to modify the origin preference_list
			while (!p.isMatched()) {
				int inx = 0; // indicates the index of kidney in the preference list
				// we always take the most preferred option at first.
				Kidney k = (Kidney) opt[inx];
				for (DonorPatientPair dpp : graph.getNeighbors(dpp1)) {
					if (dpp.donor.number == k.number) { // success of matching
						p.opt = k;
						graph.removeVertex(dpp);
						graph.removeVertex(dpp1);
					}
				}
				inx++;// consider the next preferred option
			}
			index++;// consider the next patient in priority list
		}
	}
}
