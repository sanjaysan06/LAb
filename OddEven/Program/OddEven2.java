/*@Author: SANJAY S
Date: 11/08/2022
Title : Odd and Even
Question : Executing Odd and Even in ifelse
*/

import java.util.*;
class OddEven2
{
public static void main(String[]args)
{
int number=100;
System.out.println("even number from 1 to"+number+":");

for(int i=1;i<=number;i++)
{
if(i%2==0)
{
System.out.print(i + " ");
}
}
System.out.println("odd number from 1 to"+number+":");
for(int i=1;i<=number;i++)
{
if(i%2!=0)
{
System.out.print(i + " ");
}
}
}
}
