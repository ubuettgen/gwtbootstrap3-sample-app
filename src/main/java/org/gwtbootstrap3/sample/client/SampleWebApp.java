package org.gwtbootstrap3.sample.client;

import org.gwtbootstrap3.client.ui.Heading;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Joshua Godi
 */
public class SampleWebApp extends Composite implements EntryPoint {
	interface MyUiBinder extends UiBinder<Widget, SampleWebApp> {
	}

	private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Heading jumboHeader;

	public void onModuleLoad() {
		RootPanel.get().add(myUiBinder.createAndBindUi(this));
		jumboHeader.setText("Hello World!");
	}
}