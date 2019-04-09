import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Created by emmeline.tsen on 4/3/19.
 */
public abstract class Decorator extends Leaf {

    private String[] options;
    private Double price;

    public Decorator ( String d )
    {
        super(d);
    }

    public String[] setOptions(String[] o){
        return setOptions(o);
    }

    public Double getPrice(){
        return price;
    }

    abstract public void printDescription();



}
