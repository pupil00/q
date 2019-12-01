public class excise {

    String excises[] = new String[100];
    int[] values = new int[100];

    //生成习题集,包含a道
    void shengcheng(int a, suanshi s) {
        for (int i = 0; i < a; i++) {
            excises[i] = s.equation();
            values[i] = s.out();
            if (s.op == "+") {
                if (s.right_num + s.left_num > 100) i--;
            }
            if (s.op == "-") {
                if (s.left_num < s.right_num) i--;
            }
        }
    }


    //输出习题
    void print() {
        for (int i = 0; i < 50; i++) System.out.println("第" + (i + 1) + "题为" + excises[i]);
    }

    //输出结果
    void printout() {

        for (int i = 0; i < 50; i++) {
            System.out.println("第" + (i + 1) + "答案为" + values[i]);
        }
    }
}
class test {
    public static void main(String[] args) {
        int N=50;
        excise ex=new excise();
        add_excise ad=new add_excise();
        ex.shengcheng(N,ad);
        System.out.println("以下是生成的习题");
        ex.print();
        System.out.println("以下是习题的答案");
        ex.printout();
    }
}

