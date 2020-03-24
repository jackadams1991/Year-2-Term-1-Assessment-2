/*
* Class Name: WholeRental
* Class Purpose: This is class creates specific objects in relation to whole rentals that are entered into the system. It extends the Rental class and calls the constructor from the class.
* It passes shared attributes to the Rental class constructor using the super key word. 
* Student ID: S0201412
* Student Name: Jack Adams
*/

public class WholeRental extends Rental {
    
    private int numRooms;
    private int numBathrooms;        
    private boolean garageSpace;
    private boolean petsAllowed;
    
    
    //Constructor for Whole Rental objects
    public WholeRental(String idOfRental, double pricePerWeek, String detailsOfAddress, String descOfRental, boolean isFurnished, int roomCount, int bathroomCount, boolean garage, boolean pets)
    {
        super(idOfRental,pricePerWeek,detailsOfAddress,descOfRental,isFurnished);
        
        numRooms = roomCount;
        numBathrooms = bathroomCount;
        garageSpace = garage;
        petsAllowed = pets;
    }
    
    //Set methods for Whole Rental specific objects
    public void setNumberOfRooms(int noRooms)
    {
        numRooms = noRooms;
    }
    
    public void setNumberOfBathrooms(int noBathroom)
    {
        numBathrooms = noBathroom;
    }
    
    public void setGarageSpace(boolean garage)
    {
        garageSpace = garage;
    }
    
    public void setPetsAllowed(boolean pets)
    {
        petsAllowed = pets;
    }
    
    //Get methods for Whole Rental specific objects
    public int getNumberOfRooms()
    {
        return numRooms;
    }
    
    public int getNumberOfBathrooms()
    {
        return numBathrooms;
    }
    
    public boolean getGarageSpace()
    {
        return garageSpace;
    }
    
    public boolean getPetsAllowed()
    {
        return petsAllowed;
    }        
}
