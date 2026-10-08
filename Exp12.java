import java.io.*;
public class reservation {
static BufferedReader br =
new BufferedReader(new InputStreamReader(System.in));
static int pno[] = new int[275];
static String name[] = new String[275];
static String phno[] = new String[275];
static int age[] = new int[275];
static int cl[] = new int[275];
static int pcount = 0;
static int pnum = 1;
static int max1 = 75;   // AC
static int max2 = 125;  // First Class
static int max3 = 175;  // Sleeper
public static void main(String args[]) throws Exception {
doMenu();
}
public static void doMenu() throws Exception {
int cho = 0;
do {
System.out.println("\nRailway Reservation System");
System.out.println("1. Book Ticket");
System.out.println("2. Cancel Ticket");
System.out.println("3. Search Passenger");
System.out.println("4. Reservation Chart");
System.out.println("5. Display Unbooked Tickets");
System.out.println("6. Exit");
System.out.print("Enter Choice: ");
cho = Integer.parseInt(br.readLine());
switch (cho) {
case 1:
doBook();
break;
case 2:
doCancel();
break;
case 3:
doSearch();
break;
case 4:
doDispList();
break;
case 5:
doDispUnbooked();
break;
case 6:
System.out.println("Thank You");
break;
default:
System.out.println("Invalid Choice");
}
} while (cho != 6);
}
private static void doBook() throws Exception {
System.out.println("1.AC  2.First Class  3.Sleeper");
System.out.print("Enter Class: ");
int c = Integer.parseInt(br.readLine());
System.out.print("Enter No. of Tickets: ");
int t = Integer.parseInt(br.readLine());
int ticketAvailable = 0;
if (c == 1 && max1 >= t) ticketAvailable = 1;
if (c == 2 && max2 >= t) ticketAvailable = 1;
if (c == 3 && max3 >= t) ticketAvailable = 1;
if (ticketAvailable == 1) {
for (int i = 0; i < t; i++) {
pno[pcount] = pnum;
System.out.print("Enter Name: ");
name[pcount] = br.readLine();
System.out.print("Enter Age: ");
age[pcount] = Integer.parseInt(br.readLine());
System.out.print("Enter Phone No: ");
phno[pcount] = br.readLine();
cl[pcount] = c;
pcount++;
pnum++;
System.out.println("Ticket Booked Successfully");
}
if (c == 1) {
max1 -= t;
System.out.println("Amount = Rs." + (t * 1500));
}
if (c == 2) {
max2 -= t;
System.out.println("Amount = Rs." + (t * 1200));
}
if (c == 3) {
max3 -= t;
System.out.println("Amount = Rs." + (t * 1000));
}
} else {
System.out.println("Tickets Not Available");
}
}
private static void doCancel() throws Exception {
System.out.print("Enter Passenger No: ");
int p = Integer.parseInt(br.readLine());
for (int i = 0; i < pcount; i++) {
if (pno[i] == p) {
if (cl[i] == 1) max1++;
if (cl[i] == 2) max2++;
if (cl[i] == 3) max3++;
System.out.println("Ticket Cancelled Successfully");
return;
}
}
System.out.println("Passenger Not Found");
}

private static void doSearch() throws Exception {
System.out.print("Enter Passenger No: ");
int p = Integer.parseInt(br.readLine());
for (int i = 0; i < pcount; i++) {
if (pno[i] == p) {
System.out.println("Passenger No : " + pno[i]);
System.out.println("Name         : " + name[i]);
System.out.println("Age          : " + age[i]);
System.out.println("Phone No     : " + phno[i]);
return;
}
}
System.out.println("Passenger Not Found");
}
private static void doDispList() {
System.out.println("\nPassenger List");
for (int i = 0; i < pcount; i++) {
System.out.println(
pno[i] + "\t" +
name[i] + "\t" +
age[i] + "\t" +
phno[i]
);
}
}
private static void doDispUnbooked() {
System.out.println("Available Tickets");
System.out.println("AC Class      : " + max1);
System.out.println("First Class   : " + max2);
System.out.println("Sleeper Class : " + max3);
}
}