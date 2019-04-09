import java.text.DecimalFormat;
import java.util.DoubleSummaryStatistics;


public class Leaf implements Component {

    private String description ;
    private Double price ;

    // creating default implementation
    public Leaf(String d) {
        description = d;
        price = 0.00;
    }


    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }

    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
    }

    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}

    public Double getPrice(){
        // no implementation
        return null;
    }
	 
}
