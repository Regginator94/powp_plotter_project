package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{
	private String figureName;
	
	public SelectTestFigureOptionListener(String figureName){
		this.figureName = figureName;
	}

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if(figureName.equals("Figure Joe 1")) {
            FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	} else if (figureName.equals("Figure Joe 2")) {
    		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}

    }
}
