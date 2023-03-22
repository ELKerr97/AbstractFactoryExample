public class HalloweenFactory implements DecorationFactory{

  private TableclothProvider tableclothProvider;
  private YardOrnamentProvider yardOrnamentProvider;
  private HangingProvider hangingProvider;

  public HalloweenFactory() {
    this.tableclothProvider = new HalloweenTableclothPatternProvider();
    this.yardOrnamentProvider = new HalloweenYardOrnamentProvider();
    this.hangingProvider = new HalloweenWallHangingProvider();
  }


  public String getTablecloth(){
    return tableclothProvider.getTablecloth();
  }

  public String getHanging(){
    return hangingProvider.getHanging();
  }

  public String getOrnament(){
    return yardOrnamentProvider.getOrnament();
  }
}
