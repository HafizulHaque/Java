class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.print("Your supplied args are: ");
    for (int i = 0; i < args.length; ++i) {
      System.out.print(args[i] + " ");
    }
    return;
  }
}