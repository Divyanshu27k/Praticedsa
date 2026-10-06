package collectionwithlove;

import java.util.Objects;

public class Empolyee {
   public String Empname;
   public int id;

    @Override
    public String toString() {
        return "Empolyee{" +
                "id=" + id +
                ", Empname='" + Empname + '\'' +
                '}';
    }

    public Empolyee(String Empname, int id){
        this.Empname=Empname;

        this.id=id;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empolyee empolyee = (Empolyee) o;
        return id == empolyee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
