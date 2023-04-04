class SinoTibetan extends Language {
  SinoTibetan(String name, int numSpeakers) {
    super(name, numSpeakers, "Asia", "SOV");
    if (this.name.contains("Chinese")) {
      this.wordOrder= "SVO";
    }
  }
}
