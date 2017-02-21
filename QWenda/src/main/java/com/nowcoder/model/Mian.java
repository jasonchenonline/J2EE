package com.nowcoder.model;

/**
 * Created by Administrator on 2016/7/12.
 */
public class Mian{
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        int spacenum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                spacenum++;


        }
        int indexold = str.length()-1;
        int newlength=str.length()+spacenum*2;
        int indexnew = newlength-1;
        str.setLength(newlength);
        for(int i=indexold;indexold<indexnew&&i>=0;i--){
            if(str.charAt(i)==' '){
                str.setCharAt(indexnew--, '0');
                str.setCharAt(indexnew--, '2');
                str.setCharAt(indexnew--, '%');
            }else{
                str.setCharAt(indexnew--, str.charAt(indexold));
            }

        }

    }
}
