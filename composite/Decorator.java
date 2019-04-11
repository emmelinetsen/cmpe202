import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Created by emmeline.tsen on 4/3/19.
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
