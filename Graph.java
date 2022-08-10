package main;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Graph {

	private Map<String, Struct> graph;

	public Graph() {
		this.graph = new HashMap<>();
	}

	public Map<String, Struct> getGraph() {
		return graph;
	}

	public void setGraph(Map<String, Struct> graph) {
		this.graph = graph;
	}

	public List<String> getEdgesList(String node) {
		return getGraph().get(node).getEdges();
	}

	public void addNodeAndEdges(String nodeName, List<String> edges) {
		Node node = new Node(nodeName);
		getGraph().put(nodeName, new Struct(node, edges));
	}

	public Node getNode(String name) {
		return getGraph().get(name).getNode();
	}

	public void updateDistance(String nodeName, String edgeName) {
		int prevDistance = getNode(edgeName).getDistanceToRoot();
		getNode(nodeName).setDistanceToRoot(prevDistance + 1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(graph);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Graph other = (Graph) obj;
		return Objects.equals(graph, other.graph);
	}

	@Override
	public String toString() {
		return "Graph " + graph + "";
	}

}
