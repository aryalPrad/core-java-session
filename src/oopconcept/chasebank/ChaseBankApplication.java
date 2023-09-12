package oopconcept.chasebank;

public class ChaseBankApplication {

    public static void main(String[] args){

        Language english = new Language();
        english.languageId = 1;
        english.languageName = "English";

        Language nepali = new Language();
        nepali.languageId= 2;
        nepali.languageName = "Nepali";

        Language french = new Language ();
        french.languageId =3;
        french.languageName = "French";

        Menu personalMenu = new Menu();
        personalMenu.menuId = 1;
        personalMenu.name = "Personal";
        personalMenu.slug = "";
        personalMenu.isExternal = false;
        personalMenu.externalURL = null;
        personalMenu.isActive = true;
        personalMenu.languageId = english.languageId;

        Menu personalNepali = new Menu();
        personalNepali.menuId = 2;
        personalNepali.name = "Personal NP";
        personalNepali.slug = "";
        personalNepali.isExternal = false;
        personalNepali.externalURL = null;
        personalNepali.isActive = true;
        personalNepali.languageId = nepali.languageId;

        Menu businessMenu = new Menu();

        businessMenu.menuId = 2;
        businessMenu.name = "Business";
        businessMenu.slug = "";
        businessMenu.isExternal = false;
        businessMenu.externalURL = null;
        businessMenu.isActive = true;
        businessMenu.languageId = english.languageId;

        Menu commercialMenu = new Menu();

        commercialMenu.menuId = 3;
        commercialMenu.name = "Commercial";
        commercialMenu.slug = "Commercial-banking";
        commercialMenu.isExternal = true;
        commercialMenu.externalURL = "https://www.jpmorgan.com/commercial-banking";
        commercialMenu.isActive = true;
        commercialMenu.languageId = english.languageId;



    }
}
