import android.util.Log;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class reversible {
    Deque<Character> stack = new ArrayDeque<Character>();

    /*public int Voltear_numero(String numero){
        int result=0;
        String num=null;
        Character temp=null;

        for (int i=0;i<=numero.length()-1;i++){
            stack.push(numero.charAt(i));
        }

        for (int i=0;i<=numero.length()-1;i++){
            temp=stack.pop();
            temp.
        }
        return result;
    }*/

    public int girar_numero(int num){
        String a;
        String b="";
        String c="";

        a=Integer.toString(num);




        /*for (int i=0;i<=a.length()-1;i++){
            b.indexOf(i)=a.charAt(i);
        }*/

        return
    }

    public boolean impar (int num , int num2){
        boolean b=false;
        int res = num+num2;
        res=res%2;

        if (res==0){
            b=false;
        }else{
            b=true;
        }

        return b;
    }

    public boolean reversible(int num2){
        boolean b=false;
        if (num2>=10){
            b=true;
        }else{
            b=false;
        }

        return b;
    }
}


