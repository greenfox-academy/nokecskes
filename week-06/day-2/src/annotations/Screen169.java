package annotations;

/**
 * Created by Connor on 2017.04.28..
 */
@Monitor(aspectratio = "16:9", classification = "LCD")
public class Screen169 extends Screen {

  public Screen169(Size size) {
    super(size);
  }
}
