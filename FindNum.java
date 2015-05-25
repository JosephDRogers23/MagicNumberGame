/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class FindNum {
    
    String magic_num;
    int length;
    int mag_num;
    String old_ans;
public FindNum(String m)
{
    magic_num = m;
    length = m.length();
}
public FindNum(int n, String o)
{
    mag_num = n;
    old_ans = o;
}
String[] table_of_singles = {
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen"
};
String[] table_of_decades = {
    "",
    "ten",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety"
};
String[] table_of_centuries = {
  "",
    "one hundred",
    "two hundred",
    "three hundred",
    "four hundred",
    "five hundred",
    "six hundred",
    "seven hundred",
    "eight hundred",
    "nine hundred"
};
public String strip_dig()
{
    String answer = "";
    int t = mag_num;
    int temp = 0;
    String str1 = "";
    String str2 = "";
    String str3 = "";
    if(t%100>10&&t%100<20)
    {
        return strip_dig_teen_exception();
    }
    else{
    if(t>0)
    {
        temp = t%10;
        t /=10;
        str3 =  table_of_singles[temp];
    }
    if(t>0)
    {
        temp = t%10;
        t/=10;
        str2 = table_of_decades[temp];
    }
    if(t>0)
    {
        temp = t%10;
        t/=10;
        str1 = table_of_centuries[temp];
    }
    answer = str1+str2+str3;
    return answer;
    }
}
public String strip_dig_teen_exception()
{
    String answer = "";
    int t = mag_num;
    int temp = 0;
    String str1 = "";
    String str2 = "";
    temp = t%100;
    t/=100;
    str1 = table_of_singles[temp];
    if(t>0)
    {
        temp = t%10;
        temp/=10;
        str2 = table_of_centuries[temp];
    }
    answer = str2 + str1;
    
    return answer;
}
public String findTheNumber()
{
    String temp = strip_dig();
    if(temp.equals(old_ans))
    {
        //System.out.println("Number of tries: " + n.get_counter());
        return temp;
    }
    int char_length = 0;
    int temp_length = temp.length();
    for( int i =0; i<temp_length; i++)
    {
        if(temp.charAt(i)!=' ')
        {
            char_length++;
        }
    }
    
    FindNum f = new FindNum(char_length, temp);
    return f.findTheNumber();
 
    
    
}
    
    
    

}
