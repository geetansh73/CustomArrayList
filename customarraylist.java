import java.util.*;
class custom
{
int n=4;
class Data
{
int roll;
String name;
int marks;
long phone;
Data(int roll,String name,int marks,long phone)
{
this.roll=roll;
this.name=name;
this.marks=marks;
this.phone=phone;
}
}
public static void main(String g[])
{
    int roll[]={1,2,3,4};
    String name[]={"raj","harish","hari","amar"};
    int marks[]={100,99,93,86};
    long phone[]={8965867894L,8976439393L,7897896787L,9807878908L};
custom obj=new custom();
obj.addvalues(roll,name,marks,phone);
}
void addvalues(int roll[],String name[],int marks[],long phone[])
{
ArrayList <Data>li=new ArrayList<>();
for(int i=0;i<n;i++)
{
li.add(new Data(roll[i],name[i],marks[i],phone[i]));
}
printvalues(li);
}
void printvalues(ArrayList<Data> li)
{
    for(int i=0;i<n;i++)
    {
    Data data=li.get(i);
    System.out.println(data.roll+" "+data.name+" "+data.marks+" "+data.phone);
    }
}
}
