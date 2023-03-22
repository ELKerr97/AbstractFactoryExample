public class ChristmasFactory implements DecorationFactory{

  private ChristmasTableClothPatternProvider tableClothPatternProvider;
  private ChristmasWallHangingProvider wallHangingProvider;
  private ChristmasYardOrnamentProvider ornamentProvider;

  public ChristmasFactory(){
    this.tableClothPatternProvider = new ChristmasTableClothPatternProvider();
    this.ornamentProvider = new ChristmasYardOrnamentProvider();
    this.wallHangingProvider = new ChristmasWallHangingProvider();
  }

  public String getTablecloth(){
    return tableClothPatternProvider.getTablecloth();
  }

  public String getHanging(){
    return wallHangingProvider.getHanging();
  }

  public String getOrnament(){
    return ornamentProvider.getOrnament();
  }
}
