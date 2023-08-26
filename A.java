public class A {
    int a;
    int b;
    String name;

    public A(int a,int b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
    }

    public void addition(){
        int a = 78;
        int b = 76;
        int c = a+b;
        System.out.println(c);
    }
    static public  void main(String[] args) {
        A a1 = new A(10,20,"Moorthi");
        System.out.println(a1.name);
        System.out.println(a1.a);
        System.out.println(a1.b);
        a1.addition();
    }
}
