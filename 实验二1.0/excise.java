public class excise {
    String excises[]=new String[50];
    int[] values=new int[50];

    //生成习题集,包含a道
    void shengcheng() {
        suanshi s = new suanshi();
        for (int i = 0; i < 50; i++) {
            excises[i]=s.equation();
            values[i] = s.out();
            if (s.op=="+"){
                if (s.right_num+s.left_num>100) i--;
            }
            if (s.op=="-"){
                if (s.left_num<s.right_num) i--;
            }
        }
    }

    //输出习题
    void print() {
        for (int i=0;i<50;i++) System.out.println("第"+(i+1)+"题为"+excises[i]);
    }

    //输出结果
    void printout() {

        for (int i = 0; i < values.length; i++) {
            System.out.println("第"+(i+1)+"答案为"+values[i]);
        }
    }
}
class test{
    public static void main(String[] args) {
        excise ex=new excise();
        ex.shengcheng();
        System.out.println("以下是生成的习题");
        ex.print();
        System.out.println("以下是习题的答案");
        ex.printout();

    }
}

