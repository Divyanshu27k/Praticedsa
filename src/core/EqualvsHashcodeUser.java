package core;

public class EqualvsHashcodeUser {
    int id;
    EqualvsHashcodeUser(int id){
        this.id=id;

    }
    @Override
    public boolean equals(Object o){
    EqualvsHashcodeUser u=(EqualvsHashcodeUser) o;
    return this.id == u.id;

    }
    @Override
    public int hashCode(){
        return id;
    }
}
