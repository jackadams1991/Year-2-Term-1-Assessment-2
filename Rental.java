/*
* Class Name: Rental
* Class Purpose: This is an abstract super class with a constructor that is called in other classes for creating specific objects
* Student ID: S0201412
* Student Name: Jack Adams
*/
public abstract class Rental {
    
    protected String rentalId; //Variable to take on Rental ID Num.
    private double weeklyPrice; //Double variable to hold the entered price for the rental - applicable for all rentals
    private String addressDetails; //String variable to hold the entered address details for the rental - applicable for all rentals
    private String rentalDescription; //String variable to hold a description of the entered rental - applicable for all rentals
    private boolean rentalFurnished; //Boolean variable to indicate whether the rental is furnished or not - applicable for all rentals
    static int rentalIdNum = 1000;
        
    //Super class constructor for shared attributes of Whole and Room Rental objects
    public Rental(String idOfRental,double pricePerWeek, String detailsOfAddress, String descOfRental, boolean isFurnished)
    {
        rentalId = idOfRental;
        weeklyPrice = pricePerWeek;
        addressDetails = detailsOfAddress;
        rentalDescription = descOfRental;
        rentalFurnished = isFurnished;
    }
    
    //Mutator methods for the Weekly Price, Address Details, Rental Description and Rental Furnished
    public void setWeeklyPrice(double price)
    {
        weeklyPrice = price;
    }
    
    public void setAddressDetails(String address)
    {
        addressDetails = address;
    }
    
    public void setRentalDescription(String description)
    {
        rentalDescription = description;
    }
    
    public void setRentalFurnished(boolean furnished)
    {
        rentalFurnished = furnished;
    }
    
    //Accessor methods for the Weekly Price, Address Details, Rental Description and Rental Furnished
    public String getRentalId()
    {
        return rentalId;
    }
    
    public double getWeeklyPrice()
    {
        return weeklyPrice;
    }
    
    public String getAddressDetails()
    {
        return addressDetails;
    }
    
    public String getRentalDescription()
    {
        return rentalDescription;
    }
    
    public boolean getRentalFurnished()
    {
        return rentalFurnished;
    }            
}
