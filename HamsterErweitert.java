import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class HamsterErweitert implements de.hamster.model.HamsterProgram {class HamsterV2 extends Hamster{

void kehrt(){
linksUm();
linksUm();
}
void rechtsUm(){
kehrt();
linksUm();
}
void laufeBisZurWand(){
while(vornFrei()){
vor();
} 
}
}
public void main() {    
}
}