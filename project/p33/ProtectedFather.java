package p33;

import p3.Protecteds;

public class ProtectedFather
{

    public static void main(String[] args) {

    }

    protected void say()
    {
        System.out.println("say");
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
