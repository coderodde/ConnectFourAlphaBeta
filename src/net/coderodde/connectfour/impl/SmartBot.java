package net.coderodde.connectfour.impl;

import java.util.Objects;
import net.coderodde.connectfour.Bot;
import net.coderodde.connectfour.ConnectFourState;
import net.coderodde.connectfour.PlayerColor;
import net.coderodde.connectfour.HeuristicFunction;

/**
 * This class implements the smart bot relying on Alpha-beta pruning.
 * 
 * @author Rodion "rodde" Efremov
 * @version 1.6 (May 24, 2019)
 */
public final class SmartBot implements Bot {
    
    private final PlayerColor myPlayerColor;
    private final HeuristicFunction evaluator;
    
    public SmartBot(PlayerColor me, HeuristicFunction evaluator) {
        this.myPlayerColor =
                Objects.requireNonNull(me, "The input player is null.");
        
        this.evaluator = Objects.requireNonNull(evaluator,
                                                "The input evaluator is null.");
    }

    @Override
    public ConnectFourState computeNextState(ConnectFourState state) {
        return null;
    }

    @Override
    public PlayerColor getPlayerColor() {
        return myPlayerColor;
    }
}
