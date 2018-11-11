package es.meekchopp.pipedown;

import java.util.HashSet;

public class BadApples extends HashSet<String> {
    private static final BadApples ourInstance = new BadApples();

    public static BadApples getInstance() {
        return ourInstance;
    }

    private BadApples() {
        super();
        add("https://www.youtube.com/channel/UClFfjHzeoweiXzjcT7NVqUQ");
        add("https://www.youtube.com/user/MinecraftBlow");
        add("https://www.youtube.com/channel/UC4uocvXN4aPFQG6paBaMb1A");
        add("https://www.youtube.com/channel/UC2C4KLIkTxXZlA8P2AEckJg");
        add("https://www.youtube.com/channel/UCMBGXf4gw91Z-lmIE7f2G8A");
        add("https://www.youtube.com/channel/UCT1DOD6aHZsi8b2ubD-OhNQ");
        add("https://www.youtube.com/user/TeledyskiDisco");
        add("https://www.youtube.com/channel/UCrtZVvEXEYWO1J_nOzL3fiw");
        add("https://www.youtube.com/user/RembolHD");
        add("https://www.youtube.com/channel/UC-7MTGVxLFmt0paOkdPucnw");
        add("https://www.youtube.com/channel/UC2etEuPIfohP4P53wM0KImA");
        add("https://www.youtube.com/user/cietyvlog");
        add("https://www.youtube.com/channel/UCMBCbf6KXqNnJ8vYTc8udIQ");
        add("https://www.youtube.com/channel/UCygICIFaB6npPKJd4WHQ5zA");
        add("https://www.youtube.com/user/AjgorIgnacy");
        add("https://www.youtube.com/user/WideoPlotekPl");
        add("https://www.youtube.com/channel/UCS94J1s6-qc8v7btCdS2pNg");
        add("https://www.youtube.com/user/TheUnboxall");
        add("https://www.youtube.com/user/tvnpl");
        add("https://www.youtube.com/channel/UCXg0OGaXXsXGW77nbN-y1Hw");
        add("https://www.youtube.com/channel/UC7O9FJE9W6uUjLMHbBSfu5A");
        add("https://www.youtube.com/user/Sitr0x");
        add("https://www.youtube.com/channel/UClRAUVVCU6GUGAlDgfpw15w");
        add("https://www.youtube.com/user/pilkanoznacalezycie");
        add("https://www.youtube.com/channel/UCabS1gYG4BOhdFm4HnybdHw");
        add("https://www.youtube.com/channel/UCGcoim6d_uCndwGm_Rq7Nuw");
        add("https://www.youtube.com/channel/UC295-Dw_tDNtZXFeAPAW6Aw");
        add("https://www.youtube.com/channel/UCeEX9TXYYWBDfzhE_xOX0ng");
        add("https://www.youtube.com/user/JETPtv");
        add("https://www.youtube.com/channel/UCLrWqmHbsTfcup0ZH5BU4NA");
        add("https://www.youtube.com/user/AbstrachujeTV");
        add("https://www.youtube.com/channel/UCn5p8gbfAoG9HoGFnBQQ2Pw");
        add("https://www.youtube.com/channel/UCJKb-PN2kywTNX2zbw7iUUw");
        add("https://www.youtube.com/channel/UCxJ2XwaXPTpDC0Zty4UR_Lw");
        add("https://www.youtube.com/channel/UCpcA8YdNdsPE2tPnezqL56w");
    }
}
