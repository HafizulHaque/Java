import java.text.DecimalFormat;
import java.text.NumberFormat;

class PrimitiveTest {
  public static void main(String[] args) {
    byte b = 127;
    short s = 32767;
    int i = 2000000000;
    long l = 9000000000000000000L;

    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);

    int days;
    long distance, lightSpeedPerSecond;
    days = 1000;
    lightSpeedPerSecond = 300000000;
    distance = days * 24 * 60 * 60 * lightSpeedPerSecond;
    // expression evaluated as int so careful while working with long variables. if
    // one literal in expression is long then it's ok.
    System.out.print("In " + days);
    System.out.print(" days light will travel ");
    NumberFormat numFormat = new DecimalFormat("0.####E0");
    System.out.print(numFormat.format(distance));
    System.out.println(" kilometers.");

    float f = 455.03483789F; // single precision - not good
    double d = 455.03483789; // double precision - always use this
    System.out.println(f);
    System.out.println(d);
  }
}