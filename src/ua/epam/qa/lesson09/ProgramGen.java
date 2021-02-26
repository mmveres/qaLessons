package ua.epam.qa.lesson09;
class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }
}
class TwoTuple1 {

    public final String first;
    public final Integer second;

    public TwoTuple1(Integer second, String first) {
        this.first = first;
        this.second = second;
    }

    public TwoTuple1(String first, Integer second) {
        this.first = first;
        this.second = second;
    }
}

class Inspector {
    public <T> void inspect(T t) {
        System.out.println(t.getClass().getName());
    }
}


public class ProgramGen {
    public static void main(String[] args) {
        //   TwoTuple<String, String> tt = new TwoTuple<String, String>("a","2");
        //   TwoTuple1 tt1 = new TwoTuple1("b",3);
        Inspector i = new Inspector();
        String s = "Hello";
        i.inspect(s);
        i.<String>inspect(s);
        int l = 1;
        i.inspect(l);
        i.inspect(1);
        i.inspect(1.0);
        i.inspect(1.0F);
        i.inspect('c');
        i.inspect(i);
    }
}
