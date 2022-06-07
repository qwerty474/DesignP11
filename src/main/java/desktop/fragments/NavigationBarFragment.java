package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "non-desktop-header show-non-desktop")
public class NavigationBarFragment extends AbstractFragment {

    @FindBy(className = "icon-menu")
    WebElement menu;

    public void openMenu() {
        menu.click();
    }
}
