import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution1 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visitedRooms = new HashSet<>();
        Queue<Integer> roomsToVisit = new LinkedList<>();

        roomsToVisit.add(0);
        while (!roomsToVisit.isEmpty() && visitedRooms.size() != rooms.size()) {
            int room = roomsToVisit.remove();

            if (visitedRooms.add(room)) {
                for (int key : rooms.get(room)) {
                    if (!visitedRooms.contains(key)) {
                        roomsToVisit.add(key);
                    }
                }
            }
        }

        return visitedRooms.size() == rooms.size();
    }
}