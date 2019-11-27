public class sub_excise extends suanshi {
    String op="-";
    String shizi(){
        num();
        return String.valueOf(lef_num) + op + String.valueOf(right_num);
    }
    int out(){
        value=lef_num-right_num;
        return value;
    }
}
