class MovieTicketDetails {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // Getters
    public String getMovieName() {
        return movieName;
    }

    public double getTotalCost() {
        double total = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            total = total - (total * 5 / 100);
        }

        return total;
    }
}

public class MovieTicket {
    public static void main(String[] args) {
    	MovieTicketDetails mt = new MovieTicketDetails();

        mt.setMovieName("Pushpa 2");
        mt.setTicketPrice(250);
        mt.setNumberOfTickets(6);

        System.out.println("Movie Name: " + mt.getMovieName());
        System.out.println("Total Price: " + mt.getTotalCost());
    }
}