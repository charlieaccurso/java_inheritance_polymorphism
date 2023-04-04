class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
    this.name= name;
    this.numSpeakers= numSpeakers;
    this.regionsSpoken= regionsSpoken;
    this.wordOrder= wordOrder;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + ".");
  }

  public static void main(String[] args) {
    Language cherokee= new Language("Cherokee", 2000, "Oklahoma", "SOV");
    cherokee.getInfo();

    Mayan kiche= new Mayan("Kiche", 1100000);
    kiche.getInfo();

    SinoTibetan chinese= new SinoTibetan("Chinese", 1118000000);
    SinoTibetan burmese= new SinoTibetan("Burmese", 38100000);

    chinese.getInfo();
    burmese.getInfo();
  }
}
