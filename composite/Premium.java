/**
 * Created by emmeline.tsen on 4/10/19.
 */
public class Premium extends Decorator {
    private String[] options;
    private Double price;

    public Premium( String d ){
        super(d);
        price = 0.00;
    }

    public Double getPrice(){
        return price;
    }

    public void setOptions(String[] o){
        options = o;
        int premiumOptions = o.length;
        price = 1.50 * premiumOptions;

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
