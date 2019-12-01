public class mix_excise extends suanshi {
    String equation() {
        int a;
        op = "+";
        left_num = (int) (Math.random() * 100);
        right_num = (int) (Math.random() * 100);
        a = (int) (Math.random() * 2);
        if (a == 1) {
            op = "-";
        }
        return (left_num) + op + (right_num);
    }

    int out() {
        if (op == "-") value = left_num - right_num;
        if (op == "+") value = left_num + right_num;
        return value;
    }
}
