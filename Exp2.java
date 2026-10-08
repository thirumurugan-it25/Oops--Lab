package currency;
public class CurrencyConvertor{
public void convertInrToDollar(double rupee){
System.out.println("Dollar="+(rupee/66));
}
public void convertDollarToInr(double dollar){
System.out.println("Rupees="+(dollar*66));
}
public void convertInrToEuro(double rupee){
System.out.println("Euro="+(rupee/80));
}
public void convertEuroToInr(double euro){
System.out.println("Rupees="+(euro*80));
}
public void convertInrToYen(double rupee){
System.out.println("Yen="+(rupee/0.61));
}
public void convertYenToInr(double yen){
System.out.println("Rupees="+(yen*0.61));
}
}
package distance;
public class DistanceConvertor{
public void MeterToKm(double meter){
System.out.println("kilometer="+(meter*0.001));
}
public void KmToMeter(double km){
System.out.println("Meter="+(km*1000));
}
public void MilesToKm(double miles){
System.out.println("kilometer="+(miles*1.6093));
}
public void KmToMiles(double km){
System.out.println("miles="+(km/1.6093));
}
}
package time;
public class TimeConvertor{
public void HourToMinute(double hour){
System.out.println("Minutes="+(hour*60));
}
public void MinuteToHour(double minute){
System.out.println("hours="+(minute/60));
}
public void HourTosecond(double hour){
System.out.println("seconds="+(hour*3600));
}
public void SecondToHour(double second){
System.out.println("hours="+(second/3600));
}
}
import java.util.Scanner;
import currency.CurrencyConvertor;
import distance.DistanceConvertor;
import time.TimeConvertor;
public class Convertor{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Currency c=new Currency();
Distanceconvertor d=new Distanceconvertor();
Timeconvertor t=new Timeconvertor();
System.out.println("1.currency");
System.out.println("2.distance");
System.out.println("3.time");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("1.INR to Dollar");
System.out.println("dollar to INR");
int ch=sc.nextInt();
if(ch==1){
System.out.println("enter rupees:");
double r=sc.nextDouble();
c.convertInrToDollar(r);
}
else{
System.out.println("enter dollar:");
double d1=sc.nextDouble();
c.convertDollarToInr(d1);
}
break;
case 2:
System.out.println("1.meter to km");
System.out.println("2.km to meter");
int ch2=sc.nextInt();
if(ch2==1){
System.out.println("enter meter:");
double m=sc.nextDouble();
d.MeterToKm(m);
}
else{
System.out.println("enter km:");
double km=sc.nextDouble();
d.KmToMeter(km);
}
break;
case 3:
System.out.println("1.hour to minute");
System.out.println("2.minute to hour");
int ch3=sc.nextInt();
if(ch3==1){
System.out.println("enter hour:");
double h=sc.nextDouble();
t.HourToMinute(h);
}
else{
System.out.println("enter minute:");
double min=sc.nextDouble();
t.MinuteToHour(min);
}
break;
default:
System.out.println("Invalid choice:");
}
sc.close();
}
}