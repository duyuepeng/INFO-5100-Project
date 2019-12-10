package m3;

import m3.view.IncentiveListUI;
import m3.view.MenuPage;
import dataproto.Dealer;
import m3.view.IncentiveDetailUI;

public class Main {
  public static void main(String args[]){
	  Dealer d = new Dealer();
	  d.setId("se224");
	  MenuPage m = new MenuPage(d);
	  
  }
}
