package abstractclasses.fragment;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {

    protected static final String TIMEOUT_PATTERN = "Timeout waiting for %s to %s";
    private static final String COMPONENT = "component";

    private WebElement rootElement;

    public AbstractFragment() {
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return rootElement;
    }

    protected String getTimeoutMessage(String state) {
        return String.format(TIMEOUT_PATTERN, getClass().getSimpleName() + StringUtils.SPACE + COMPONENT, state);
    }
}
