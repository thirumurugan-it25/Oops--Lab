public class WrapperClassDemo
{
public static void main(String[]args)
{
int primitiveInt=100;
float primitiveFloat=25.75f;
char primitiveChar='A';
boolean primitiveBoolean=true;
Integer wrappedInt=primitiveInt;
Float wrappedFloat=primitiveFloat;
Character wrappedChar=primitiveChar;
Boolean wrappedBoolean=primitiveBoolean;
System.out.println("Autoboxed Integer:"+wrappedInt);
System.out.println("Autoboxer Float:"+wrappedFloat);
System.out.println("Autoboxer Character:"+wrappedChar);
System.out.println("Autoboxer Boolean:"+wrappedBoolean);
int unboxedInt=wrappedInt;
float unboxedFloat=wrappedFloat;
char unboxedChar=wrappedChar;
boolean unboxedBoolean=wrappedBoolean;
System.out.println("Unboxed int:"+unboxedInt);
System.out.println("Unboxed char:"+unboxedChar);
System.out.println("Unboxed boolean:"+unboxedBoolean);
String intString="300";
Integer parsedInt=Integer.parseInt(intString);
String floatString="75.25";
Float parsedFloat=Float.parseFloat(floatString);
String charString="C";
Character parsedChar=charString.charAt(0);
String booleanString="true";
Boolean parsedBoolean=Boolean.parseBoolean(booleanString);
System.out.println("Parsed and autoboxrd Integer:"+parsedInt);
System.out.println("Parsed and autoboxrd Float:"+parsedFloat);
System.out.println("Parsed and autoboxrd Character:"+parsedChar);
System.out.println("Parsed and autoboxrd Boolean:"+parsedBoolean);
}
}