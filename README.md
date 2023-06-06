
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">

 
    
  <h1>Chess Game in Java (Under construction)</h1>
  <p>This is a repository for a Chess System implemented in Java. It allows you to play chess matches and includes features such as piece movement, capturing, special moves like castling, en passant, and promotion.</p>
  <h2>Getting Started</h2>
  <h3>Prerequisites</h3>
  <ul>
    <li>Java Development Kit (JDK)</li>
    <li>Git</li>
  </ul>
  <h3>Installation</h3>
  <ol>
    <li>Clone the repository to your local machine:
      <pre><code>git clone [https://github.com/Rcambui/project_chess-game-java.git]</code></pre>
    </li>
    <li>Open a terminal and navigate to the project folder:
      <pre><code>cd chess-system-java</code></pre>
    </li>
    <li>Compile the source files:
      <pre><code>javac application/Program.java</code></pre>
    </li>
    <li>Run the program:
      <pre><code>java application.Program</code></pre>
    </li>
  </ol>
  <h2>Gameplay</h2>
  <ol>
    <li>The chessboard is displayed as a grid of squares. Each square is represented by a letter (a-h) and a number (1-8). For example, "a1" represents the bottom-left square, and "h8" represents the top-right square.</li>
    <li>To make a move, enter the source and target positions in the format "<code>source target</code>". For example, to move a piece from square "e2" to "e4", enter "<code>e2 e4</code>".</li>
    <li>Follow the prompts and continue making moves until the game is over.</li>
  </ol>
  <h2>Project Structure</h2>
  <p>The project follows an object-oriented design and is organized into the following classes:</p>
  <ul>
    <li><code>Piece</code>: Represents a chess piece.</li>
    <li><code>Board</code>: Represents the chessboard and manages the placement of pieces.</li>
    <li><code>Position</code>: Represents a position on the chessboard.</li>
    <li><code>ChessPiece</code>: Extends the <code>Piece</code> class and adds functionality specific to chess pieces.</li>
    <li><code>ChessMatch</code>: Manages the chess match, including turns, valid moves, and game state.</li>
    <li><code>UI</code>: Handles the user interface and input/output operations.</li>
    <li><code>ChessException</code>: Represents exceptions specific to the chess system.</li>
  </ul>
  <h2>OOP Concepts and Data Structures</h2>
  <p>The project covers several object-oriented programming (OOP) concepts and data structures, including:</p>
  <ul>
    <li>Encapsulation: Classes and their members are encapsulated to control access and ensure data integrity.</li>
    <li>Constructors: Classes have constructors to initialize their state.</li>
    <li>Inheritance: Classes extend other classes to inherit properties and behaviors.</li>
    <li>Polymorphism: Classes can be treated as their base class or interface, allowing for flexibility and extensibility.</li>
    <li>Exceptions: Custom exception classes handle exceptional situations and error conditions.</li>
    <li>Enumerations: Enumerated types are used to represent piece colors.</li>
    <li>Static members: Static members are used to represent shared properties or behaviors.</li>
    <li>Layers pattern: The project follows a layered architecture, separating responsibilities into different classes.</li>
    <li>Matrix: A two-dimensional array is used to represent the chessboard.</li>
  </ul>
  <h2>Acknowledgments</h2>
  <p>This Chess System project is based on the teachings of Professor Nélio Alves in his Java course on Udemy.</p>
  <h2>License</h2>
  <p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for details.</p>
</body>
</html>
