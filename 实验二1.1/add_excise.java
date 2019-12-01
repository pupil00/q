public class add_excise extends suanshi {
    String equation() {
        op = "+";
        left_num = (int) (Math.random() * 100);
        right_num = (int) (Math.random() * 100);
        return (left_num) + op + (right_num);
    }

    int out() {
        value = left_num + right_num;
        return value;
    }
}
