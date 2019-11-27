public class suanshi {
    int left_num, right_num,value;
    String op;

    //生成一个算式
    String equation() {
        int a;
        op = "+";
        lef_num = (int) (Math.random() * 100);
        right_num = (int) (Math.random() * 100);
        a = (int)(Math.random()*2);
        if (a == 1) {
            op = "-";
        }
        return String.valueOf(lef_num) + op + String.valueOf(right_num);
    }

    //检查是否相同,k=0时，不相同
    int check(suanshi a, suanshi b) {
        int k = 0;
        String t1 = String.valueOf(a.lef_num) + op + String.valueOf(a.right_num);
        String t2 = String.valueOf(a.right_num) + op + String.valueOf(a.lef_num);
        String t3 = String.valueOf(b.lef_num) + op + String.valueOf(b.right_num);
        if (t1 == t3 || t2 == t3) k = 1;
        return k;
    }

    //计算结果
    int out(suanshi a){
        if(a.op=="+") value=a.lef_num+a.right_num;
        else value=a.lef_num-a.lef_num;
        return value;
    }

}


