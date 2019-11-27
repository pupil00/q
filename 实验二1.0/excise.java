import java.util.HashSet;
public class excise {
    HashSet<suanshi> excises = new HashSet<>();
    int[] values=new int[50];

    //生成习题集,包含a道
    void shengcheng(int a) {
        suanshi s = new suanshi();
        for (int i = 0; i < a; i++) {
            s.equation();
            excises.add(s);
            values[i] = s.out(s);
        }
    }

    //输出习题
    void print() {
        for (suanshi su:excises)
        System.out.println(su);
    }

    //输出结果
    void printout() {

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
class test{
    public static void main(String[] args) {
        excise ex=new excise();
        ex.shengcheng(50);
        System.out.println("以下是生成的习题");
        ex.print();
        System.out.println("以下是习题的答案");
        ex.printout();
    }
}

