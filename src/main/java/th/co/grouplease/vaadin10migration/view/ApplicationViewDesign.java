package th.co.grouplease.vaadin10migration.view;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Upload;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * Copyright (c) Group Lease Public Company Limited. All rights reserved. (http://www.grouplease.co.th/)
 * Author: Peeranut Ngaorungsri (peeranut.ng@grouplease.co.th) on 3/6/18 2:36 PM
 *
 */

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class ApplicationViewDesign extends VerticalLayout {
  protected DateField applyFromDate;
  protected DateField applyToDate;
  protected Grid applyInsuranceGrid;
  protected Upload uploadCertificateButton;
  protected TextField pendingContractFilter;
  protected Grid pendingInsuranceGrid;
  protected TextField rejectedContractFilter;
  protected Grid rejectedInsuranceGrid;

  public ApplicationViewDesign() {
    Design.read(this);
  }
}
