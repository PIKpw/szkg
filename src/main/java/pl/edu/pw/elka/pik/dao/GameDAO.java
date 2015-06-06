package pl.edu.pw.elka.pik.dao;

import pl.edu.pw.elka.pik.model.CategorySimpleItem;
import pl.edu.pw.elka.pik.model.db.Game;
import pl.edu.pw.elka.pik.model.GameDetailItem;
import pl.edu.pw.elka.pik.model.GameSimpleItem;

import java.util.List;

/**
 * Created by Mikolaj on 2015-04-07.
 */
public interface GameDAO {
    List<Game> list();

    List<GameSimpleItem> getGameSimpleItem(String username, boolean wishList, int from, int to);

    int getGameSimpleItemCount();

    byte[] getGameImage(int gameID);

    boolean deleteGame(int gameId);

    boolean addGameToCollection(int gameId);

    GameDetailItem getGameDetail(int gameId);

    int createGame(String gameTitle, String username, boolean wishList, List<Integer> gameCategory, String gameDescription, byte[] image);

    void updateGame(int gameId, String gameTitle, String username, boolean wishList, List<Integer> gameCategory, String gameDescription, byte[] image);
}
