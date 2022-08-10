package main;
import java.util.Objects;

class Node {
	private int distanceToRoot;
	private String name;

	public Node(String name) {
		this.distanceToRoot = 0;
		this.name = name;
	}

	public int getDistanceToRoot() {
		return distanceToRoot;
	}

	public void setDistanceToRoot(int distanceToRoot) {
		this.distanceToRoot = distanceToRoot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return distanceToRoot == other.distanceToRoot && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(distanceToRoot, name);
	}

	@Override
	public String toString() {
		return name;
	}
}
