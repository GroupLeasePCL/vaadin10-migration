package th.co.grouplease.vaadin10migration;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import th.co.grouplease.vaadin10migration.view.MainViewDisplay;

import javax.inject.Inject;

@SpringUI
@Push
@Theme("finwiz")
@StyleSheet("https://fonts.googleapis.com/css?family=Roboto")
@Title("Finwiz")
public class VaadinUI extends UI {

  private final MainViewDisplay mainViewDisplay;

  @Inject
  public VaadinUI(MainViewDisplay mainViewDisplay) {
    this.mainViewDisplay = mainViewDisplay;
  }

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    setErrorHandler(errorEvent -> {
      Notification.show("An error occurred : please contact your support", Notification.Type.ERROR_MESSAGE);
    });

    setContent(mainViewDisplay);
  }
}
