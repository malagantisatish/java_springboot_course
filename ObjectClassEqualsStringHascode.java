
import java.util.Objects;

class Laptop {

    String model;
    int price;

    public String toString() {
        return model + " " + price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.model);
        hash = 59 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

}

public class ObjectClassEqualsStringHascode {

    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "hp 5010tq";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "hp 5010tq";
        obj2.price = 1000;

        // whenever we call obj it by default calls as obj.toString();
        //obj ====>obj.toString()
        // in object class we are having toString(), equals() methods
        boolean result = obj1.equals(obj2);
        System.out.println(obj1.toString());

    }

}
