import java.util.Arrays;


/**
 * Created by emmeline.tsen on 4/3/19.
 */
public class Burger extends Decorator {

    String[] options;
    private Double price;

    public Burger( String d ){
        super(d);
        price = 0.00;
    }
    
    public Double getPrice(){
        return price;
    }

    public String[] setOptions(String[] o){
        options = o;
        for(int i = 0; i < o.length; i++){
            if (o[i].toString().contains("Beef")) price += 8.00;
            if (o[i].toString().contains("Veggie")) price += 7.00;
            if (o[i].toString().contains("1/4 lb")) price += 1.25;
            if (o[i].toString().contains("1/3 lb")) price += 1.50;
            if (o[i].toString().contains("1/2 lb")) price += 2.00;
        }
        return options;
    }


    public void printDescription(){
        int i = 0;
        while (i < options.length-1){

        }
      System.out.println( Arrays.toString(options));

    }


}
