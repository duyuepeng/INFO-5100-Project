package m1.team14.controller;
import java.util.List;
import dataproto.Dealer;
import dataproto.RichText;
import m1.team14.model.HomePageModel;
import m1.team2.DealerAllContent;
import m1.team3.Dealers;
import m1.team3.login.VMSLoginFrame;
import m1.DAO.DealerContentDAOImpl;
// For demo///////////////////
import javax.swing.JOptionPane;
//////////////////////////////
public class HomePageController extends AbstractController {
  private HomePageModel homepageModel;
  public Dealer getInitDealer() {
    return Dealers.getInstance().getAllDealers().get(0);
  }
  public void addModel(HomePageModel model) {
    super.addModel(model);
    this.homepageModel = model;
  }
  public List<Dealer> getDealers() {
    List<Dealer> ret = Dealers.getInstance().getAllDealers();
    return ret;
  }
  public DealerAllContent getRichTextsByDealer(Dealer dealer) {
    return DealerContentDAOImpl.INSTANCE.getContents(dealer);
  }
  public void changeDealer(Dealer val) {
    try {
      this.setModelProperty("CurrentDealer", val);
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  public void gotoLogin() {
    new VMSLoginFrame();
  }
  public void gotoHistory() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Go to customers' contact history enterance page");
    //////////////////////////////

  }
  public void gotoSearch() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Go to search page");
    //////////////////////////////
  }
  public void gotoDetail() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Go to detail page");
    //////////////////////////////
  }
  public void contactMe() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Contact me");
    //////////////////////////////
  }
}
