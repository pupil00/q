abstract class suanshi {
    int left_num, right_num, value;
    String op;

    //生成一个算式
    String equation() {

        return "";
    }

    //检查是否相同,k=0时，不相同
    int check(suanshi a, suanshi b) {
        int k = 0;
        String t1 = String.valueOf(a.left_num) + op + String.valueOf(a.right_num);
        String t2 = String.valueOf(a.right_num) + op + String.valueOf(a.left_num);
        String t3 = String.valueOf(b.left_num) + op + String.valueOf(b.right_num);
        if (t1 == t3 || t2 == t3) k = 1;
        return k;
    }

    //计算结-果
    int out() {

        return value;
    }

}


