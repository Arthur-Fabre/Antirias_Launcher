/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antirias_launcher_v1;

import java.io.File;
import fr.theshark34.openlauncherlib.launcher.*;
/**
 *
 * @author TURPAL34000
 */
public class Launcher {
    
    public static final GameVersion AS_VERSION = new GameVersion("1.7.10", GameType.V1_7_10);
    public static final GameInfos AS_INFOS = new GameInfos("Antirias_Serveur",AS_VERSION,true,new GameTweak[]{GameTweak.FORGE});
    public static final File AS_DIR = AS_INFOS.getGameDir();
    
}
