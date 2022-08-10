package main;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BFS {

	public static void main(String[] args) {

		Graph graph = new Graph();

		graph.addNodeAndEdges("cab", new ArrayList<>(Arrays.asList("cat", "car")));
		graph.addNodeAndEdges("car", new ArrayList<>(Arrays.asList("bar", "cat")));
		graph.addNodeAndEdges("cat", new ArrayList<>(Arrays.asList("mat", "bat")));
		graph.addNodeAndEdges("mat", new ArrayList<>(Arrays.asList("bat")));
		graph.addNodeAndEdges("bar", new ArrayList<>(Arrays.asList("bat")));
		graph.addNodeAndEdges("bat", new ArrayList<>(Arrays.asList("")));

		Queue<String> strQueue = new ArrayDeque<>();
		Set<String> visited = new HashSet<>();
		String root = "cab";
		String destination = "bat";
		strQueue.add(root);

		outerloop: while (!strQueue.isEmpty()) {

			String current = strQueue.poll();

			if (!visited.contains(current)) {
				List<String> nodes = graph.getEdgesList(current);
				for (String nd : nodes) {
					graph.updateDistance(nd, current);
					if (nd.equals(destination)) {
						System.out.println(" Number of steps from *" + root + "* to *" + destination + "* is "
								+ graph.getNode(nd).getDistanceToRoot());
						break outerloop;
					} else {
						strQueue.add(nd);
					}
				}
				visited.add(current);
			}
		}
	}
}
