package lv.rvt;
import java.util.ArrayList;
public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maximumCapacity;
    public Box(double maximumCapacity){
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }
    public double weight(){
        double sum = 0;
        for(Packable item : items){
            sum += item.weight();
        }
        return sum;

    }
    public void add(Packable packable){
        if(packable.weight() + this.weight() <= this.maximumCapacity){
            items.add(packable);
        }
    }
    @Override
    public String toString(){
        return "Box: " + this.items.size() + "items. Total weight " + this.weight() + "kg";
    }
}