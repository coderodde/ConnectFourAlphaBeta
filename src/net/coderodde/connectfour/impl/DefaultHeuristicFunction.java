package net.coderodde.connectfour.impl;

import net.coderodde.connectfour.ConnectFourState;
import net.coderodde.connectfour.PlayerColor;
import net.coderodde.connectfour.HeuristicFunction;

/**
 * This class implements the default Connect Four state evaluator. The white 
 * player wants to maximize, the red player wants to minimize.
 * 
 * @author Rodion "rodde" Efremov
 * @version 1.6 (May 24, 2019)
 */
public final class DefaultHeuristicFunction implements HeuristicFunction {

    @Override
    public double evaluate(ConnectFourState state) {
//        if (whiteWins(state)) {
//            return Double.POSITIVE_INFINITY;
//        }
//        
//        if (redWins(state)) {
//            return Double.NEGATIVE_INFINITY;
//        }
        
        return evaluateImpl(state);
    }
    
    private static final double evaluateImpl(ConnectFourState state) {
        int[] redPatternCounts = new int[state.getWinningLength()];
        int[] whitePatternCounts = new int[redPatternCounts.length];
        
        // Once here, there is no yet a winning line.
        for (int targetLength = 2; 
                targetLength <= state.getWinningLength(); 
                targetLength++) {
            int count = evaluateRedPatterns(state, targetLength);
            
            if (count == 0) {
                break;
            }
            
            redPatternCounts[targetLength] = count;
        }
        
        for (int targetLength = 2;
                targetLength <= state.getWinningLength();
                targetLength++) {
            int count = evaluateWhitePatterns(state, targetLength);
            
            if (count == 0) {
                break;
            }
            
            whitePatternCounts[targetLength] = count;
        }
        
        return computeQualityEstimate(redPatternCounts, whitePatternCounts);
    }
    
    
    
    private static final double computeQualityEstimate(
            int[] redPatternCounts,
            int[] whitePatternCounts) {
        double value = 0.0;
        
        
        
        return value;
    }
    
    private static final int evaluateImpl(ConnectFourState state, 
                                          int targetLength) {
        int count = 0;
        return count;
    }
    
    private static final boolean whiteWins(ConnectFourState state) {
        return state.checkVictory() == PlayerColor.WHITE_PLAYER;
    }
    
    private static final boolean redWins(ConnectFourState state) {
        return state.checkVictory() == PlayerColor.RED_PLAYER;
    }
    
    private static final double[][] getWeightMatrix(ConnectFourState state) {
        
    }
}
