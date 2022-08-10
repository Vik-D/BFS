package main;

import java.util.List;
import java.util.Objects;

class Struct {

	private Node node;
	private List<String> edges;

	public Struct(Node node, List<String> edges) {
		this.node = node;
		this.edges = edges;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public List<String> getEdges() {
		return edges;
	}

	public void setEdges(List<String> edges) {
		this.edges = edges;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edges, node);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Struct other = (Struct) obj;
		return Objects.equals(edges, other.edges) && Objects.equals(node, other.node);
	}

	@Override
	public String toString() {
		return "Struct(node=" + node.getName() + ")";
	}

}

