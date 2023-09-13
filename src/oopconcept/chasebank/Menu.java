package oopconcept.chasebank;

public class Menu {

     /*
        menu id
        name
        slug
        is external
        external url
        is Active
        parent id
        is leaf
        language id
     */

    private int menuId;
   private String name;
    private String slug;
   private  boolean isExternal;
    private String externalURL;
   private  boolean isActive;
    private int languageId;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(String externalURL) {
        this.externalURL = externalURL;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
}

    /*
        menu id -1
        name - Personal
        slug - ""
        is external - No
        external url - null
        is Active - yes
        parent id - 0
        is leaf - NO
        language id - 1

        menu id - 4
        name - Checking
        slug - null
        is external - No
        external url - null
        is Active - yes
        parent id - 1  (checking ko immediate parent personal bhanne ho so )
        is leaf - No
        language id - 1


        menu id - 5
        name - Choose a checking account
        slug - null
        is external - Yes
        external url - https://personal.chase.com/personal/checking
        is Active - yes
        parent id - 4  (yesko immediate parent checking ho so)
        is leaf - yes
        language id - 1
     */

     /*
        menu id -2
        name - Business
        slug - business
        is external - No
        external url - null
         is Active - yes
         parent id - 0
         language id - 1

        menu id -6
        name - Banking Solutions
        slug - banking-solutions
        is external - No
        external url - null
        is Active - yes
        parent id - 2
        language id - 1
     */

     /*
        menu id - 3
        name - Commercial
        slug - commercial-banking
        is external - Yes
        external url - https://www.jpmorgan.com/commercial-banking
        is Active - yes
        parent id - 0
        language id - 1

        menu id -7
        name - Solutions
        slug - null
        is external - No
        external url - null
        is Active - yes
        parent id - 3
        language id - 1

     */


