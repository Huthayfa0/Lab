import java.util.function.Function;

public class Testing {
    public static void main(String[] args) {

    }
}
class fu{
    Function<Integer,Integer> kk;
    int s;
    public fu(int k, Function<Integer,Integer> s){
     this.s=k;
     kk=s;
    }
    public int ssss(int a){
        return s*kk.apply(a);
    }
}