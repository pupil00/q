abstract class suanshi {
    int lef_num;
    int right_num;
    int value;
    String op;

    //生成两个数
    void num() {
        lef_num = (int) (Math.random() * 100);
        right_num = (int) (Math.random() * 100);
    }

    //连接数字和操作符
    String shizi() {
        return "";
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
    int out(){
        return 0;
    }
}


