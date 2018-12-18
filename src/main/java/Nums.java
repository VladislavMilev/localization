public enum Nums {
   DEF("LabelsBundle"),
   DE("LabelsBundle_de"),
   FR("LabelsBundle_fr");

   String localization;

   Nums(String localization) {
      this.localization = localization;
   }

   public String getLocalization() {
      return localization;
   }
}
