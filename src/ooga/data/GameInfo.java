package ooga.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfo {
    private List<Integer> NPC_ID;
    private List<Integer> Player_ID;
    private int levelNum;
    private Map<Integer, Map<Integer, String>> subMapInfo;
    private int gameType;

    GameInfo() {
        NPC_ID = new ArrayList<>();
        Player_ID = new ArrayList<>();
        subMapInfo = new HashMap<>();
    }
    GameInfo(List<Integer> NPC_ID, List<Integer> Player_ID, int levelNum, Map<Integer, Map<Integer, String>> subMapInfo, int gameType) {
        this();
        setGameType(gameType);
        setLevelNum(levelNum);
        setNPC_ID(NPC_ID);
        setPlayer_ID(Player_ID);
        setSubMapInfo(subMapInfo);
    }
    public List<Integer> getPlayer_ID() {
        return Player_ID;
    }

    public void setPlayer_ID(List<Integer> player_ID) {
        Player_ID = player_ID;
    }

    public List<Integer> getNPC_ID() {
        return NPC_ID;
    }

    public void setNPC_ID(List<Integer> NPC_ID) {
        this.NPC_ID = NPC_ID;
    }

    public int getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    public Map<Integer, Map<Integer, String>> getSubMapInfo() {
        return subMapInfo;
    }

    public void setSubMapInfo(Map<Integer, Map<Integer, String>> subMapInfo) {
        this.subMapInfo = subMapInfo;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }
}
