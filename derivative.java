/*
 AUTHOR: HARSHIT ARORA
 SCHOOL: FRANK ANTHONY PUBLIC SCHOOL, NEW DELHI, INDIA
 */
import java.util.*;
class derivative
{
    double a,b;
    char ch;
    static Scanner S=new Scanner(System.in);
     void linear_pow()
    {        
        double r=0.0,n=0.0,z=0.0,p=0.0;
        System.out.println("Enter coefficient of x & an integer");
        a=S.nextDouble();
        b=S.nextDouble();
        System.out.println("Enter the power raised to equation");
        n=S.nextDouble();
        System.out.println("Enter sign between the equation :- positive or negative");
        ch=S.next().charAt(0);
        p=Math.abs(b);
        r=n*a;
        z=n-1;
            if(ch=='+'||ch=='-')
            {
                if(ch=='+')
                {
                    if(n==0&&b>0)
                    {
                        System.out.println(" the equation is ("+a+"x "+ch+" "+b+")^ 0");
                        System.out.println(" d/dx of equation is "+0);
                    }
                    else if(n==0&&b<0)
                    {
                        //res="the equation is ("+a+"x -"+p+")^ 0";
                        //res1="d/dx of equation is "+0;
                        System.out.println("the equation is ("+a+"x "+b+")^ 0");
                        System.out.println("d/dx of equation is "+0);
                    }
                    else if(a>0&&n>0&&b>0)
                    {
                        System.out.println("The equation is ("+a+"x "+ch+" "+b+")^"+n);
                        System.out.println("d/dx of equation is "+r+"("+a+"x "+" "+ch+" "+b+")"+"^"+z);
                    }
                    else if(a<0&&n<0&&b<0)
                    {
                        System.out.println("The equation is ("+a+"x - "+p+")^"+n);
                        System.out.println("d/dx of equation is "+r+"("+a+"x"+" - "+p+")"+"^"+z);
                    }             
                    else if(b<0)
                    {
                        System.out.println("The equation is ("+a+"x "+" "+b+")^"+n);                        
                        System.out.println("d/dx of equation is "+r+"("+a+"x "+" "+b+")"+"^"+z);
                    }        
                    else if(b>0)
                    {
                        System.out.println("The equation is ("+a+"x"+" + "+b+")^"+n);                      
                         System.out.println("d/dx of equation is "+r+"("+a+"x"+" + "+b+")"+"^"+z);
                    }
                    else
                    {
                        System.out.println("The equation is ("+a+"x "+ch+" "+b+")^"+n);                     
                        System.out.println("d/dx of equation is "+r+"("+a+"x "+ch+" "+b+")"+"^"+z);
                    }
            }
            if(ch=='-')
            {
                if(n==0&&b>0)
                {
                    System.out.println("the equation is ("+a+"x "+ch+" "+b+")^ 0");
                    System.out.println("d/dx of equation is "+0);
                }
                else if(n==0&&b<0)
                {
                    System.out.println("the equation is ("+a+"x "+b+")^ 0");
                    System.out.println("d/dx of equation is "+0);
                }
                else if(a>0&&n>0&&b>0)
                {
                    System.out.println("The equation is ("+a+"x "+ch+" "+b+")^"+n);                   
                    System.out.println("d/dx of equation is "+r+"("+a+"x "+ " "+ch+" "+b+")"+"^"+z);
                }
                else if(a<0&&n<0&&b<0)
                {
                    System.out.println("The equation is ("+a+"x "+b+")^"+n);                   
                    System.out.println("d/dx of equation is "+r+"("+a+"x "+" "+b+")"+"^"+z);
                }          
                else if(b<0)
                {
                    System.out.println("The equation is ("+a+"x "+"+ "+p+")^"+n);
                    System.out.println("d/dx of equation is "+r+"("+a+"x "+"+ "+p+")"+"^"+z);
                }       
                else if(b>0)
                    {
                        System.out.println("The equation is ("+a+"x "+" -"+b+")^"+n);                        
                        System.out.println("d/dx of equation is "+r+"("+a+"x "+" -"+b+")"+"^"+z);
                    }
                else
                {
                     System.out.println("The equation is ("+a+"x "+ch+" "+b+")^"+n);                 
                     System.out.println("d/dx of equation is "+r+"("+a+"x "+ch+" "+b+")"+"^"+z);
                }
            }
         }
        else
        System.out.println("Wrong input");
    }
    void diff_gen3()
    {    int a[]=new int[10];
        char arr[]=new char[10];
        int v=0,z=0,m=0;
        int n=0,i=0;
        System.out.println("Enter highest power");
        n=S.nextInt();
        System.out.println("Enter a constant");
        m=S.nextInt();
        for(i=n;i>=1;i--)
        {  
            System.out.println("enter coefficient of term  x^"+i);//(n-i+1));
            a[i]=S.nextInt();
            System.out.println(a[i]+"x^"+i);
        }
        for(i=n;i>1;i--)
        {
             System.out.println("Enter operator between term "+(n-i)+" and term "+(n-i+1));
             arr[i]=S.next().charAt(0);
        }
        System.out.println();
        System.out.println("d/dx of equation is " );
        for(i=n;i>=1;i--)
        {
            v=a[i]*i;
            z=i-1;
            int v1=a[z]*z;
            if(v1<0&&arr[i]=='-')
            {
                arr[i]='+';
            }
            else if(v1<0&&arr[i]=='+')
            {
                arr[i]='-';
            }
            else if(v1>0&&arr[i]=='-')
            {
                arr[i]='-';
            }
            if(i<n)
                v=Math.abs(v);     
            System.out.print(v+"x^"+z+" "+arr[i]+" ");
        }
        System.out.print("+ 0");
    } 
    public static void main()
    {
        derivative x=new derivative();
        //x.linear_pow();
        x.diff_gen3();
    }
}
