import java.util.ArrayList;

public class TheStreetArtGallery {
    
    private String name;
    private String address;
    private ArrayList<Artwork> artworks;
    
    public TheStreetArtGallery(String name, String address) {
        this.name = name;
        this.address = address;
        artworks = new ArrayList<Artwork>();
    }
    
    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }
    
    public void removeArtwork(Artwork artwork) {
        artworks.remove(artwork);
    }
    
    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void displayArtworks() {
        System.out.println("Welcome to The Street Art Gallery!");
        System.out.println("Located at " + this.getAddress());
        System.out.println("Featuring:");
        for (Artwork artwork : artworks) {
            System.out.println(" - " + artwork.getName() + " by " + artwork.getArtist());
        }
    }
    
    public void searchByArtist(String artist) {
        for (Artwork artwork : artworks) {
            if (artwork.getArtist().equalsIgnoreCase(artist)) {
                System.out.println(artwork.getName() + " by " + artwork.getArtist());
            }
        }
    }
    
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Artwork artwork : artworks) {
            totalPrice += artwork.getPrice();
        }
        return totalPrice;
    }
    
    public void checkOut() {
        System.out.println("Thanks for visiting The Street Art Gallery. Your total price is:");
        System.out.println(this.calculateTotalPrice());
    }
    
}