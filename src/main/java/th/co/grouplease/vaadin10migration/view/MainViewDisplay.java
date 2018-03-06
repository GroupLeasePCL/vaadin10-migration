package th.co.grouplease.vaadin10migration.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;
import th.co.grouplease.vaadin10migration.component.MainMenuBar;

import javax.inject.Inject;

/**
 * Copyright (c) Group Lease Public Company Limited. All rights reserved. (http://www.grouplease.co.th/)
 * Author: Peeranut Ngaorungsri (peeranut.ng@grouplease.co.th) on 3/6/18 2:34 PM
 *
 */
@SpringViewDisplay
public class MainViewDisplay extends CustomComponent implements ViewDisplay {

    private final VerticalLayout content = new VerticalLayout();

    @Inject
    public MainViewDisplay(MainMenuBar mainMenuBar){
        final VerticalLayout root = new VerticalLayout();
        root.setSpacing(false);
        root.setMargin(false);
        root.setSizeFull();

        root.addComponent(mainMenuBar);
        root.addComponent(content);

        root.setExpandRatio(mainMenuBar, 0.05f);
        root.setExpandRatio(content, 0.95f);
        setCompositionRoot(root);

        setSizeFull();
    }

    @Override
    public void showView(View view) {
        content.removeAllComponents();
        content.setSpacing(false);
        content.setSizeFull();
        content.setMargin(false);
        content.addComponent((Component) view);
    }
}