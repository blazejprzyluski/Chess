package com.blazejprzyluski.chess.Pieces;

import com.blazejprzyluski.chess.Board.GameBoard;

import java.util.ArrayList;

public class Bishop extends Piece
{
    public Bishop(int x, int y, Color color)
    {
        super(x, y, color);
    }

    @Override
    public ArrayList<Move> availableMoves(GameBoard gb)
    {
        ArrayList<Move> moves = new ArrayList<>();

        int x = this.getX();
        int y = this.getY();

        checkDiagonally(x,y,gb,moves);

        return moves;
    }

    @Override
    public String toString()
    {
        return this.getColor() + " BISHOP";
    }

}
