package CaseStudy.FuramaResort.Views;

import CaseStudy.FuramaResort.Commons.Services;
import CaseStudy.FuramaResort.Commons.Villa;
public class Main {
    public static void main(String[] args) {
        Services villa = new Villa();
        villa.setChiPhiThue(50);
        villa.setSoNguoi(5);
        System.out.println(villa.showInfor());
    }
}
