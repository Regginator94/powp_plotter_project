package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {
	
public static ComplexCommand drawRectangle(int startX, int startY, int width, int height) {
		
		List<PlotterCommand> commandsList = new ArrayList<>();
		commandsList.add(new CommandSetPosition(startX, startY));
		commandsList.add(new CommandDrawLineToPosition(startX+width, startY));
		commandsList.add(new CommandDrawLineToPosition(startX+width, startY+height));
		commandsList.add(new CommandDrawLineToPosition(startX, startY+height));
		commandsList.add(new CommandDrawLineToPosition(startX, startY));
		
		return new ComplexCommand(commandsList);
	}


}
