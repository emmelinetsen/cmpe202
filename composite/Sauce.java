/**
 * Author: Emmeline Tsen 007825649
 */
public class Sauce extends Decorator {


    private String[] options;
    private Double price;

    public Sauce( String d ){
        super(d);
        price = 0.00;
    }

    public Double getPrice(){
        return price;
    }

    public void setOptions(String[] o){
        options = o;
        if (o.length > 1){ // if the list of sauce options is greater than 1, charge $0.75 for each after
            int sauceOptions = o.length;
            price = 0.75 * (sauceOptions-1);
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
