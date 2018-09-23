public class Board {
    private Block[][] blocks;

    /**
     * Copies an existing board
     * @param other
     */
    public Board(Board other) {
        this.blocks = other.blocks.clone();
    }

    /**
     * Creates a board where all blocks are empty
     * @param height Sets height of the board, aka the number of rows
     * @param width Sets the width of the board, aka the number of columns
     */
    public Board(int height, int width) {
        blocks = new Block[height][width];
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                blocks[i][j] = Block.UNKNOWN;
            }
        }
    }
}
