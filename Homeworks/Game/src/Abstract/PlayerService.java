package Abstract;

import Entities.Player;

public interface PlayerService {

	void register(Player player);
	void delete(Player player);
	void update(Player player);
	
}
