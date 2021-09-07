class LiteralTest {
  public static void main(String[] args) {
    int a, b, c;
    a = 07355635; // octal literal - leading 0
    b = 0xa2f208; // hexadecimal literal - leading 0x
    c = 0b100011; // binary literal - leading 0b

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    // casting to byte short or long
    byte x;
    short y;
    long z;
    x = 0b1010101; // casting to byte - within short type range - automatic
    y = 03446; // casting to short - within short type range - automatic
    z = 0xFFF0FL; // casting to long - ending L

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    int dollar = 783_76_98;
    int cent = 0b0101_1100;
    // _ can be added between numbers to add readibility - compiler just ignores _.
    System.out.println(dollar);
    System.out.println(cent);

    // floating point literals

    float f1, f2;
    double d1, d2;

    d1 = 6353.837663; // recomended type for floating point number
    d2 = 63.53837663E+2; // scientific notation

    f1 = 6353.837663f; // float number - ending f [not recommended - use double]
    f2 = -3.68387E-27f; // scientific notation;

    System.out.println(d1);
    System.out.println(d2);
    System.out.println(f1);
    System.out.println(f2);

  }
}