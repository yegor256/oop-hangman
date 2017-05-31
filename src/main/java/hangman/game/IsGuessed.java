package game;

import event.IsMatched;
import event.Matched;
import event.Event;

/**
 * Predicate for checking if the message is "won".
 *
 * @author Ix Manuel (ixmanuel@yahoo.com)
 */
public final class IsGuessed implements Matched {
	private final Matched meta;

	public IsGuessed(final Event event) {
		this.meta = new IsMatched("GUESSED", event);
	}	

	public boolean matched() {
		return meta.matched();
	}
}