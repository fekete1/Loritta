package com.mrpowergamerbr.loritta.commands.vanilla.misc;

import com.mrpowergamerbr.loritta.Loritta;
import com.mrpowergamerbr.loritta.commands.CommandBase;
import com.mrpowergamerbr.loritta.commands.CommandContext;
import com.mrpowergamerbr.loritta.utils.LorittaUtils;
import net.dv8tion.jda.core.MessageBuilder;

import java.io.File;
import java.io.IOException;

public class AngelCommand extends CommandBase {
	@Override
	public String getLabel() {
		return "angel";
	}

	@Override
	public String getDescription() {
		return "Mostra um anjo muito puro para este mundo cruel :^)";
	}

	@Override
	public void run(CommandContext context) {
		if (!LorittaUtils.canUploadFiles(context)) { return; }
		try {
			context.sendFile(new File(Loritta.FOLDER + "angel.png"), "angel.png", new MessageBuilder().append(" ").build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
