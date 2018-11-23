package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;
import java.awt.event.*;
import edu.iis.powp.app.*;

public class SelectTestFigureOptionListener2 implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener2(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FiguresJoe.figureScript2(driverManager.getCurrentPlotter());
	}
}
