public class suanshi {
    static String s[][]= new String[51][3];
    static int out[] = new int[51];
    public  void printHeader()
    {
        System.out.println("以下是五十道加减法计算题");
    }
    public  void generateEquations()//生成算式
    {
        int a;
        int b;
        int j;
        for(int i = 0;i < 50;i ++) {
            a = (int)(Math.random()*101);
            b = (int)(Math.random()*101);
            s[i][0] = String.valueOf(a);
            s[i][2] = String.valueOf(b);
            if(i<25) {
                s[i][1] = "+";
                out[i] = a+b;
            }
            else
            {
                s[i][1] = "-";
                out[i] = a-b;
            }
            for(j=0;j<i;j++)
            {
                String t1 = s[i][0]+ s[i][1] + s[i][2];
                String t2 = s[i][2] + s[i][1] + s[i][0];
                String t3 = s[j][0]+s[j][1]+s[j][2];
                if(t1==t3||t2==t3) {
                    break;
                }
            }
            if(j!=i) {
                i--;
            }
        }
    }
    public void printjieguo() {	//输出结果
        for(int i=0;i<50;i++) {
            System.out.print("第"+(i+1)+"道题的答案为："+out[i]+"\t");
            if((i+1)%5==0) {
                System.out.println();
            }
        }
    }

    public void printsuanshi() {	//输出算式
        for(int i=0;i<50;i++) {
            System.out.print("第"+(i+1)+"道题:"+s[i][0]+s[i][1]+s[i][2]+"\t");
            if((i+1)%5==0) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        suanshi s = new suanshi();
        s.printHeader();
        s.generateEquations();
        s.printsuanshi();
        s.printjieguo();
    }
}