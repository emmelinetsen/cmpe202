public interface Component {

     void printDescription() ;
     void addChild(Component c);
     void removeChild(Component c);
     Double getPrice();
     Component getChild(int i);

}
 
