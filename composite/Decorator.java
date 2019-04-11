/**
 * Author: Emmeline Tsen 007825649
 */

abstract public class Decorator extends Leaf {

    private String[] options;
    private Double price;

    public Decorator ( String d )
    {
        super(d);
    }

    abstract public Double getPrice();
    abstract public void setOptions(String[] o);
    abstract public void setDescription();

    public void printDescription(){
        setDescription();
    };

}
