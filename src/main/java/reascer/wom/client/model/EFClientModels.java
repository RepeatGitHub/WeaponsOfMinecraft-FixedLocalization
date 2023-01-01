package reascer.wom.client.model;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import reascer.wom.main.WeaponOfMinecraft;
import yesman.epicfight.api.client.model.Mesh.RawMesh;
import yesman.epicfight.api.forgeevent.ModelBuildEvent;
import yesman.epicfight.main.EpicFightMod;
 
@Mod.EventBusSubscriber(modid = WeaponOfMinecraft.MODID , bus = EventBusSubscriber.Bus.MOD)
public class EFClientModels{
	public static RawMesh RUINE_PLUNDER_SWORD;
	
	@SubscribeEvent
	public static void registerMeshes(ModelBuildEvent.MeshBuild event) {
		RUINE_PLUNDER_SWORD = event.getRaw(EpicFightMod.MODID, "particle/ruine_plunder_sword", RawMesh::new);
	}
}
	