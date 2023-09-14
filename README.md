# conwayGameOfLife_tdd
Using Test-driven development (TDD) to write a program for Conway's Game of Life in java.

Use TDD to write a program for Conway's Game of Life.

John Conway's Game of Life is a 0-player game devised by British mathematician John Conway in 1970. In this game an initial configuration is provided and then rules are automatically followed as the game unfolds until equilibrium is reached or the game is otherwise terminated (such as by a set number of iterations). The game state is a 2D grid of square cells. At each state in the game, each cell is either alive (represented by a value of 1 or True) or dead (represented by a value of 0 or False). Each cell must interact with 8 neighbors (vertical, horizontal, diagonal). Note that the true Game of Life features an infinite board, but for this programming problem the board is finite and any cells off the board are permanently dead.

Our first goal is to write a function that takes as input a board state and outputs the next board state. To do this, we will input a 2D Boolean array and output a 2D Boolean array. The transformation occurring in the function has these 4 rules (TDD them 1 at a time!)

1. Any living cell with fewer than 2 living neighbors dies.
2. Any living cell with 2 or 3 living neighbors lives on.
3. Any living cell with more than 3 living neighbors dies.
4. Any dead cell with exactly 3 living neighbors becomes alive.
Once you have this function, you will now need to develop (using TDD!) another function which does formatted I/O. Input and output should be in the form

Generation 1
3 4
----
-**-
----

where the number after generation is the current generation (note that the output generation should be 1 higher than the input generation), the numbers on the next line are the number of rows and the number of columns, and then we represent the board with - for dead cells and * for living cells.

Note that to make a complete game we would then need another function which loops the output back as input until either no change occurs or a certain number of iterations have passed. I will not require you to write this, since to TDD it you would need to know the desired final state and number of iterations for a variety of boards. We will stop here. Once you have the function which transforms one board to the next and the function which does formatted I/O, you can submit your code and tests for a grade.

Note that some configurations obtain equilibrium, while others oscillate in stable fashion or travel across the board. Wikipedia has good information on these phenomena.
