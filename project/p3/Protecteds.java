package p3;

import p33.ProtectedFather;

public class Protecteds extends ProtectedFather {

    public static void main(String[] args) {

//        ProtectedFather obj = new ProtectedFather();
//        obj.say(); // Compile Error         ----（1）

        Protecteds tobj = new Protecteds();
        tobj.say(); // Complie OK         ----（2）
    }

//    protected Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }



}
