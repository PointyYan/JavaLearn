package bookcore.ch9.treeSet;

import java.util.*;

public class Item implements Comparable<Item> {

    private String description;
    private  int partNumber;

    Item(String aDescription, int aPartNumber) {
        this.description = aDescription;
        this.partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return "[description=" + description + ",partNumber=" + partNumber + "]";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Item other = (Item) object;
        return Objects.equals(description, other.description) && (partNumber == other.partNumber);
    }

    public int hashCode(){
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber,other.partNumber);
        return diff !=0?diff:description.compareTo(other.description);
    }
}
