import java.util.HashMap;

public class ItineraryFromTTickets {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        findItinerary(tickets);
    }

    public static void findItinerary(HashMap<String, String> ticket) {
        HashMap<String, String> reverseMap = new HashMap<>();

        // step 1 reverse map
        for (String from : ticket.keySet()) {
            String to = ticket.get(from);
            reverseMap.put(to, from);
        }

        // find the starting city
        String start = "";
        for (String from : ticket.keySet()) {
            if (!reverseMap.containsKey(from)) {
                start = from;
                break;
            }
        }

        System.out.print("Itinerary: ");
        while (ticket.containsKey(start)) {
            System.out.print(start + " → ");
            start = ticket.get(start);
        }
        System.out.println(start);
    }

}
