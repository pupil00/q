public class mix_excise extends suanshi{
    
    String shizi(){
        num();
        int a=(int) (Math.random() * 2);
        if(a==0) op="-";
        else op="+";
        return String.valueOf(lef_num) + op + String.valueOf(right_num);
    }
    int out(){
        if(op=="+")
        value=lef_num+right_num;
        else value=lef_num-right_num;
        return value;
    }
}
