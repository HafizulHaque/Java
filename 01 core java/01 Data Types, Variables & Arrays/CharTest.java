class CharTest {
  public static void main(String[] args) {
    char ch1, ch2;
    ch1 = 'A';
    ch2 = 65;
    ch1 += 3;
    ch2 += ('D' - 'A');
    System.out.print("Values of ch1 & ch2: ");
    System.out.println(ch1 + " " + ch2);
  }
}