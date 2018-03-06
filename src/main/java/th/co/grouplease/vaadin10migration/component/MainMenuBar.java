package th.co.grouplease.vaadin10migration.component;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

/**
 * Copyright (c) Group Lease Public Company Limited. All rights reserved. (http://www.grouplease.co.th/)
 * Author: Peeranut Ngaorungsri (peeranut.ng@grouplease.co.th) on 3/6/18 2:30 PM
 *
 */
@UIScope
@SpringComponent
public class MainMenuBar extends MainMenuBarDesign {

  public MainMenuBar(){
    MenuBar.MenuItem applicationMenuItem = applicationMenu.addItem("Application", null);
    applicationMenuItem.addItem("Flow", createNavigationCommand(""));
  }

  private MenuBar.Command createNavigationCommand(final String viewName) {
    return menuItem -> UI.getCurrent().getNavigator().navigateTo(viewName);
  }
}
