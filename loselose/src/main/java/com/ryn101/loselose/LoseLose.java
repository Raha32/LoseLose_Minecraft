package com.ryn101.loselose;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("loselose")
public class LoseLose {
	public LoseLose() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
