import java.util.HashSet;
import java.util.List;

class Solution {
    private List<List<Integer>> rooms;
    private HashSet<Integer> visitedRooms;

    public void canVisitAllRooms(int room) {
        if (visitedRooms.add(room)) {
            for (int key : rooms.get(room)) {
                canVisitAllRooms(key);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        this.rooms = rooms;
        visitedRooms = new HashSet<>();

        canVisitAllRooms(0);

        return visitedRooms.size() == rooms.size();
    }
}