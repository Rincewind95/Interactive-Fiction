# Interactive-Fiction

> Interactive Fiction is a genre of computer games with an imaginary world, which engages the player's wits while they solve puzzles, as they make their way towards the conclusion of the story. 

This project aims to improve the way Interactive Fiction is developed and perceived, by introducing Knowledge Representation and Reasoning at the core of a historical engine's contemporary implementation.

![A creative player's interpretation of the rich imaginary world existing within an Interactive Fiction game, as seen through the window of a terminal.](https://raw.githubusercontent.com/Rincewind95/Interactive-Fiction/master/res/the-room.png)

This project was developed for the purporses of my Part II dissertation, which comprised one quarter of the marks in the final year of the Computer Science Tripos BA degree at the University of Cambridge. The original goals of the project, as outlined in the project proposal, were:
 - Improving on the standard Interactive Fiction engine, which allows only for pre-defined responses to user input. This would be done by enhancing it with Knowledge Representation and Reasoning, which would allow for the addition of more informative, automated responses.
 - The development of a Story Editor which would support the creation of game files, runnable by the engines (standard and enhanced).
 - Designing an appropriate story file which would then be used in a comparative user study, to test the success of the improvement made to the standard engine.

The project has been highly successful. All the work outlined in the proposal was carried out and all extensions implemented, in addition to some new ones. I built a standard Interactive Fiction engine and extended it with Knowledge Representation and Reasoning to support four physical parameters (volume, temperature, state and mass). I implemented a custom story language in [ANTLR][antlr] and an appropriate story compiler for it. Finally, I created a custom Interactive Fiction story in the language and used it in a user study on 22 participants, which gave convincing results in favour of the improved engine.

For the complete specification of the project, please consult the dissertation available at [res/Milos-Stanojevic-dissertation.pdf][diss] 

[antlr]: <http://www.antlr.org/>
[diss]: <https://github.com/Rincewind95/Interactive-Fiction/tree/master/res/Milos-Stanojevic-dissertation.pdf>