package utilties;

import models.entities.Player;

public class FormatUtil {
	/**
	 * Normally used to display Player's info when the user is choosing a Player to
	 * load from.
	 */
	public static String format(Player p) {
		return p.getName() + "\n" + String.format("LVL %-10s\t", p.getStats().getLevel().getLvl())
				+ String.format("STR: %-12sDEX: %-12sCON: %-12sINT: %-12sWIS: %-12sCHA: %-12s",
						p.getStats().getAbils().getStrength().getScore(),
						p.getStats().getAbils().getDexterity().getScore(),
						p.getStats().getAbils().getConstitution().getScore(),
						p.getStats().getAbils().getIntelligence().getScore(),
						p.getStats().getAbils().getWisdom().getScore(),
						p.getStats().getAbils().getCharisma().getScore());
	}
}
