# AdvancedDispensersMod2.0

##**How to clone this mod**
Create a temporary workspace for eclipse and open it (in eclipse), then use the EGit plugin (Under Window->Show View->Other...->Git->Git Repositories) and select "Clone Repository". Then create an empty folder where you want to work (that folder will be your new working directory). Then download the latest Forge src, and extract the conents of the zip file (you dont need the txt files) to that newly created folder (it should contain a .git folder). Then open a cmd (shift + rightclick -> open command promt here) and type **gradlew setupDecompWorkspace** (you need a jdk installed on your computer, you can get it from the official sun website). Once the process is finished type **gradlew eclipse**. Once the process is finished you can close the promt. Now you can open the eclipse folder as workspace in eclipse, you should see a Minecraft project. Now open the EGit plugin again and choose "add existing local Repository" and select the folde above your workspace (the one with the .git folder). 