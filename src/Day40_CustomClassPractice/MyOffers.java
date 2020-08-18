package Day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(100000,"VA",true,true, true,"SDET",true);
        offer1.setOfferInfo(90000,"PA",true,false, true,"SDET",true);
        offer1.setOfferInfo(125000,"NE",true,true, true,"QA",false);
        offer1.setOfferInfo(105000,"CA",true,true, false,"SDET",true);
        offer1.setOfferInfo(101000,"GA",false,true, true,"QA",true);
        offer1.setOfferInfo(111000,"LA",true,false, true,"SDET",false);
        offer1.setOfferInfo(100000,"MS",true,true, true,"QA",true);
        ArrayList<Offer>jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

        for(Offer eachOffer : jobOffers){
            eachOffer.getOfferInfo();
        }
        System.out.println("============================================");
        //less than 120k:
        //jobOffers.removeIf(p->p.salary<120000);
        //System.out.println("Number of offers: "+jobOffers.size());

        // less than or not from VA area
        //jobOffers.removeIf(p->p.salary<120000 || !p.state.equals("VA"));
        //System.out.println("Number of Offers: "+jobOffers.size());

        //  does not have PTO or does not have benefit or is not full time, or less than 120k
        jobOffers.removeIf( p -> p.hasPTO == false || p.hasBenefit == false || p.isFullTime == false || p.salary < 120000);
        System.out.println("Number of Offers: "+jobOffers.size());
    }
}
