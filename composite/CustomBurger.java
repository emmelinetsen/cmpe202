import java.util.ArrayList;

/**
 * Created by emmeline.tsen on 4/3/19.
 */
public class CustomBurger extends Composite{

    private ArrayList<Component> components = new ArrayList<Component>();
    private Double price;

    public CustomBurger(String d){
        super(d);
        price = 0.00;
    }

    public void printDescription(){
       System.out.println(description + " " + price);
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }

    public void addChild(Component c) {
        components.add( c ) ;

        if (this.price != null) {
            this.price += c.getPrice();
        }
    }



}
