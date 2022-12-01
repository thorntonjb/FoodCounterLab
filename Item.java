// Part E
public class Item
{
    private String name;
    private String id;
    private double price;

    public Item(String _name, String _id, double _price)
    {
        name = _name;
        id = _id;
        price = _price;
    }

    // accessors
    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return id;
    }

    public double getPrice()
    {
        return price;
    }

    // mutators
    public void setName(String _name)
    {
        name = _name;
    }

    public void setID(String _id)
    {
        id = _id;
    }

    public void setPrice(double _price)
    {
        price = _price;
    }

    public String toString()
    {
        return id + ") " + name + " >> $" + price;
    }
    // all that is needed is the getters, setters, and toString

}