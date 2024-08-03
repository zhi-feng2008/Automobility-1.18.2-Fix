# Automobility-Fix	
## 用于 Atomobility-1.18.x 的 FabricLoader-0.15.x 修复分支	
这个分支只是用于飞车其匠在 1.18.x FabricLoader-0.15.x 的服务端无法运行的情况	

### 参考报错	

```	
java.lang.RuntimeException: Could not execute entrypoint stage 'main' due to errors, provided by 'automobility'!	
	at net.fabricmc.loader.impl.FabricLoaderImpl.lambda$invokeEntrypoints$2(FabricLoaderImpl.java:388) ~[fabric-loader-0.15.11.jar:?]	
	at net.fabricmc.loader.impl.util.ExceptionUtil.gatherExceptions(ExceptionUtil.java:33) ~[fabric-loader-0.15.11.jar:?]	
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:386) ~[fabric-loader-0.15.11.jar:?]	
	at net.fabricmc.loader.impl.game.minecraft.Hooks.startServer(Hooks.java:63) ~[fabric-loader-0.15.11.jar:?]	
	at net.minecraft.server.Main.main(Main.java:101) [server-intermediary.jar:?]	
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:470) [fabric-loader-0.15.11.jar:?]	
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) [fabric-loader-0.15.11.jar:?]	
	at net.fabricmc.loader.impl.launch.knot.KnotServer.main(KnotServer.java:23) [fabric-loader-0.15.11.jar:?]	
	at net.fabricmc.loader.impl.launch.server.FabricServerLauncher.main(FabricServerLauncher.java:69) [fabric-loader-0.15.11.jar:?]	
	at net.fabricmc.installer.ServerLauncher.main(ServerLauncher.java:69) [fabric-server-mc.1.18.2-loader.0.15.11-launcher.1.0.1.jar:1.0.1]	
Caused by: java.lang.NoSuchFieldError: wheelModelPool	
	at io.github.foundationgames.automobility.item.AutomobilityItems.<clinit>(AutomobilityItems.java:73) ~[automobility-0.3+1.18.2.jar:?]	
	at io.github.foundationgames.automobility.Automobility.onInitialize(Automobility.java:45) ~[automobility-0.3+1.18.2.jar:?]	
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:384) ~[fabric-loader-0.15.11.jar:?]	
	... 7 more	
```	

### 测试环境	
- Minecraft 1.18.2
- Jdk 17(17.0.10.0)	
- Fabric Api 0.77.0	
- Fabric-loader 0.15.11	

## 下发为原仓库 README	

![Automobility](./md/banner.png)

### A Minecraft mod adding customizable vehicles.

## Available for Fabric/Quilt
- Requires **[Fabric API](https://modrinth.com/mod/fabric-api)** (Fabric) or **[QSL](https://modrinth.com/mod/qsl)** (Quilt)

**Support for Forge or old versions is NOT PLANNED.**

## Getting Started
- **Recipes:** Crafting recipes can be viewed using [**EMI**](https://www.curseforge.com/minecraft/mc-mods/emi).
- **Automobile Parts:** Craft an Auto Mechanic Table. Use the GUI to craft the frame, engine, and wheels for your automobile. You can optionally craft an attachment.
- **Building your Automobile:** Craft an Automobile Assembler, as well as a Crowbar. Place parts on the assembler until the vehicle is complete. Use a crowbar to destroy the vehicle. After building, add your attachments.

![Automobile Construction](./md/construction.png)
![Automobile Types](./md/parking.png)

## Driving
- W - Accelerate
- S - Brake/Reverse/Burnout
- A/D - Steer left/right
- Space - Drift

**Controller Support:** when using [MidnightControls](https://www.curseforge.com/minecraft/mc-mods/midnightcontrols), you will be able to control automobiles with the following default controls:
- A - Accelerate
- B - Brake/Reverse
- LStick - Steer left/right
- RTrigger - Drift

![Driving](./md/driving.png)

### Credit: Audio
All sound effects used (originals licensed under CC0) from [freesound.org](https://freesound.org/): <br/>
- [ENGINE~1.WAV](https://freesound.org/people/MarlonHJ/sounds/242739/) *by MarlonHJ* <br/>
- [Marine diesel engine](https://freesound.org/people/AugustSandberg/sounds/264864/) *by AugustSandberg* <br/>
- [metal_ring_01.wav](https://freesound.org/people/Department64/sounds/95272/) *by Department64* <br/>
- [metalbang0.wav](https://freesound.org/people/SamsterBirdies/sounds/435699/) *by SamsterBirdies* <br/>
- [Hollow Bang](https://freesound.org/people/qubodup/sounds/157609/) *by qubodup* <br/>
- [car park skiding corner.wav](https://freesound.org/people/martian/sounds/178889/) *by martian* <br/>
