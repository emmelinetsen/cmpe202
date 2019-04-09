import java.util.Arrays;

/**
 * Created by emmeline.tsen on 4/5/19.
 */
public class Cheese extends Decorator{


    String[] options;
    private Double price;

    public Cheese( String d ){
        super(d);
        price = 0.00;
    }

    public Double getPrice(){
        return price;
    }

    public String[] setOptions(String[] o){
        options = o;
        for(int i = 0; i < o.length; i++){
            if (o[i].toString().contains("Cheese")) price += 0.50;
        }
        return options;
    }


    public void printDescription(){
        System.out.println( Arrays.toString(options));

    }

}
