/*
* Class Name: RoomRental
* Class Purpose: This is class creates specific objects in relation to room rentals that are entered into the system. It extends the Rental class and calls the constructor from the class.
* It passes shared attributes to the Rental class constructor using the super key word.
* Student ID: S0201412
* Student Name: Jack Adams
*/

public class RoomRental extends Rental {
    
    private boolean couplesAllowed;
    private boolean attachedBathroom;
    
    
    //Constructor for Room Rentals objects    
    public RoomRental(String idOfRental, double pricePerWeek, String detailsOfAddress, String descOfRental, boolean isFurnished, boolean allowCouples, boolean bathroomAttached)
    {
        super(idOfRental, pricePerWeek,detailsOfAddress,descOfRental,isFurnished);
        couplesAllowed = allowCouples;
        attachedBathroom = bathroomAttached;
    }    
    
    //Set methods for Room Rental specific objects
    public void setCouplesAllowed(boolean couples)
    {
        couplesAllowed = couples;
    }
    
    public void setAttachedBathroom(boolean bathroom)
    {
        attachedBathroom = bathroom;
    }
    
    //Get methods for Room Rental specific objects
    public boolean getCouplesAllowed()
    {
        return couplesAllowed;
    }
    
    public boolean getAttachedBathroom()
    {
        return attachedBathroom;
    }        
}
