package abstractclasses.page;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public abstract class AbstractPage {

    private String pageUrl;
    private String pageUrlPattern;
    private String pageTitle;

    public void setTitle(String title) {
        this.pageTitle = title;
    }

    public String getTitle() {
        if (pageTitle.isEmpty()) {
            return EMPTY;
        }
        return pageTitle;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public String setPageUrlPattern(String pageUrlPattern) {
        return this.pageUrlPattern = pageUrlPattern;
    }

    public String getPageUrlPattern() {
        return pageUrlPattern;
    }

    public abstract  <T extends AbstractPage> T navigate();
}
