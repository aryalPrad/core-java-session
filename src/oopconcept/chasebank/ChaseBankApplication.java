package oopconcept.chasebank;

public class ChaseBankApplication {

    public static void main(String[] args){

        Language english = new Language();
//        english.languageId = 1;  Getters and setters banaunu bhanda agade
//        english.languageName = "English";
        english.setLanguageId(1);
        english.setLanguageName("English");

        Language nepali = new Language();
//        nepali.languageId= 2;
//        nepali.languageName = "Nepali";
        nepali.setLanguageName("Nepali");
        nepali.setLanguageId(2);

        Language french = new Language ();
//        french.languageId =3;
//        french.languageName = "French";
        french.setLanguageId(3);
        french.setLanguageName("French");


        Menu personalMenu = new Menu();
        /*

        without the implementation of getters and setters

        personalMenu.menuId = 1;
        personalMenu.name = "Personal";
        personalMenu.slug = "";
        personalMenu.isExternal = false;
        personalMenu.externalURL = null;
        personalMenu.isActive = true;
        personalMenu.languageId = english.languageId;

         */

        personalMenu.setMenuId(1);
        personalMenu.setName("Personal");
        personalMenu.setSlug(" ");
        personalMenu.setExternal(false);
        personalMenu.setExternalURL(" ");
        personalMenu.setActive(true);
        personalMenu.setLanguageId(english.getLanguageId());

/*
        Menu personalNepali = new Menu();
        personalNepali.menuId = 2;
        personalNepali.name = "Personal NP";
        personalNepali.slug = "";
        personalNepali.isExternal = false;
        personalNepali.externalURL = null;
        personalNepali.isActive = true;
        personalNepali.languageId = nepali.languageId;

 */

        Menu businessMenu = new Menu();

        /*
        businessMenu.menuId = 2;
        businessMenu.name = "Business";
        businessMenu.slug = "";
        businessMenu.isExternal = false;
        businessMenu.externalURL = null;
        businessMenu.isActive = true;
        businessMenu.languageId = english.languageId;

         */

        businessMenu.setMenuId(2);
        businessMenu.setName("Business");
        businessMenu.setSlug(" ");
        businessMenu.setExternal(false);
        businessMenu.setExternalURL(" ");
        businessMenu.setActive(true);
        businessMenu.setLanguageId(english.getLanguageId());


        Menu commercialMenu = new Menu();
        /*

        commercialMenu.menuId = 3;
        commercialMenu.name = "Commercial";
        commercialMenu.slug = "Commercial-banking";
        commercialMenu.isExternal = true;
        commercialMenu.externalURL = "https://www.jpmorgan.com/commercial-banking";
        commercialMenu.isActive = true;
        commercialMenu.languageId = english.languageId;
       */

        commercialMenu.setMenuId(3);
        commercialMenu.setName("Commercial");
        commercialMenu.setSlug("commercial-banking");
        commercialMenu.setExternal(true);
        commercialMenu.setExternalURL("https://www.jpmorgan.com/commercial-banking");
        commercialMenu.setActive(true);
        commercialMenu.setLanguageId(english.getLanguageId());

    }
}
