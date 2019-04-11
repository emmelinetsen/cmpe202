/**
 * Created by emmeline.tsen on 4/10/19.
 */
public class Toppings extends Decorator {


    private String[] options;
    private Double price;

    public Toppings( String d ){
        super(d);
        price = 0.00;
    }

    public Double getPrice(){
        return price;
    }

    public void setOptions(String[] o){
        options = o;
        if (o.length > 4){ // if the list of toppings options is greater than 4, charge $0.75 for each after
            int toppingOptions = o.length;
            price = 0.75 * (toppingOptions-4);
        }

    }


    public void setDescription(){
        int i = 0;
        while (i < options.length-1){
            System.out.print(options[i].toString() + " + ");
            i++;
        }

        System.out.println(options[i].toString());

    }

}
