Welcome to my Human vs AI Tic Tac Toe Game!!!

This is a terminal-based Tic-Tac-Toe game built in Java where a human player competes against an AI opponent powered by Google's Gemini AI API. The AI makes decisions based on player input and provides a smart, engaging challenge.



Setup Instructions after you have cloned the project and opened it in your own IDE

Step 1: Get a Gemini API Key

1. Go to [Google AI Studio](https://makersuite.google.com/app/apikey).
2. Log in with your Google account.
3. Click **"Create API key"** and copy it.
4. Keep it safe — you'll need it for the setup below.


Step 2: Setup
 
FOR MAC OS Users (Windows is down below!)

1. Install Homebrew
    - Run this inside the terminal: /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

2. Install Maven and Java 
    - Run this inside the terminal: brew install openjdk
    - Then run this: brew install maven

3. After install, you may need to run: echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zprofile
and this afterwards: source ~/.zprofile

4. Run this inside the terminal: open ~/.zshrc


5. Add this line into the text file that just opened: export GOOGLE_API_KEY="your-api-key-here"
(Make sure to add your own API key that was created eariler)

6. Save and close the opened text file

7. Run this inside the terminal: source ~/.zshrc

8. Restart your IDE and BOOM! You should be good and ready to play vs AI in Tic Tac Toe



FOR WINDOWS USERS

1. Run Windows Powershell as an adminastator 

2. Visit https://chocolatey.org/install and follow the Instructions and install Chocolatey

3. Once you have installed it run this inside powershell: choco install openjdk
    - Run this aswell afterwards: choco install maven


4. Setting up the variable:
- Open Start Menu → Search “Environment Variables” → click Edit the system environment variables.

- In the window, click “Environment Variables…”

- Under User Variables, click New…

- Fill in: Variable name: GOOGLE_API_KEY and Variable value: your-api-key-here

- Click OK → OK → Close everything.

- Restart your IDE

5. Now open your IDE and go into the terminal and run echo $env:GOOGLE_API_KEY 
    - You should see your own API Key printed. 

6. Now you are ready to play vs the AI in Tic Tac Toe!
