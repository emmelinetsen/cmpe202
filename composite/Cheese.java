/**
 * Author: Emmeline Tsen 007825649
 */

public class Cheese extends Decorator{


    private String[] options;
    private Double price;

    public Cheese( String d ){
        super(d);
        price = 0.00;
    }

    public Double getPrice(){
        return price;
    }


    public void setOptions(String[] o){
        options = o;
        if (o.length > 1){ // if the list of cheese options is greater than 1, charge $1 for each after
            int cheeseOptions = o.length;
            price = 1.00 * (cheeseOptions-1);
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
