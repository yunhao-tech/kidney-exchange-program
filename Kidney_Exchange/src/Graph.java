import java.util.HashMap;
import java.util.HashSet;


class Graph<V> {
	private HashMap<V, HashSet<V>> adj;

	Graph() {
		this.adj = new HashMap<V, HashSet<V>>();
	}

	void addVertex(V u) { // add a vertex
		this.adj.put(u, new HashSet<V>());
	}

	void removeVertex(V u) { // remove a vertex
		//firstly, remove all the connected edges 
		for (V v : this.adj.get(u)) {
			this.adj.get(u).remove(v);
			this.adj.get(v).remove(u);
		}
		//then remove the vertex from HashMap
		this.adj.remove(u);
	}

	void addEdge(V u, V v) { // add an edge u<->v
		this.adj.get(u).add(v);
		this.adj.get(v).add(u);
	}

	void removeEdge(V u, V v) { // remove the edge u<->v
		this.adj.get(u).remove(v);
		this.adj.get(v).remove(u);
	}
}

class DirectedGraph<V> {
	private HashMap<V, HashSet<V>> adjGo;
	private HashMap<V, HashSet<V>> adjCome;

	DirectedGraph() {
		this.adjGo = new HashMap<V, HashSet<V>>();
		this.adjCome = new HashMap<V, HashSet<V>>();
	}

	void addVertex(V u) { // add a vertex
		this.adjGo.put(u, new HashSet<V>());
		this.adjCome.put(u, new HashSet<V>());
	}

	void removeVertex(V u) { // remove a vertex
		this.adjGo.remove(u);
		this.adjCome.remove(u);
	}

	void addEdge(V u, V v) { // add an edge u->v
		this.adjGo.get(u).add(v);
	}

	void removeEdge(V u, V v) { // remove the edge u->v
		this.adjGo.get(u).remove(v);
	}

}