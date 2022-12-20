package model.comportements;

import java.util.Comparator;

import model.agents.Agent;

public class CoordComparator implements Comparator<Agent> {
    //compares the x and y coordinates of all agents and sorts the agents in undescending order of theirs x and y coordinates
    //sort first on the x-coordinate and second on the y-coordinate
    // in case of equality of coordinates, we will choose that the second will come after the first in the list

    @Override
    public int compare(Agent a1, Agent a2) {
        if (a1.getCoord().x < a2.getCoord().x) {
            return -1;
        } else if (a1.getCoord().x > a2.getCoord().x) {
            return 1;
        } else {
            if (a1.getCoord().y < a2.getCoord().y) {
                return -1;
            } else if (a1.getCoord().y > a2.getCoord().y) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}

