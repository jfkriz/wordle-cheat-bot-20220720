# Wordle Cheat Bot

## What is Wordle?

Wordle is a game where you try to guess a 5-letter word. You can play it [here.](https://www.nytimes.com/games/wordle/index.html)

After each guess, the color of the tiles (letters) will change to show how close your guess was to the word.

- Green (G) letter: This letter is in the correct position
- Yellow (Y) letter: This letter is present in the word, but in the wrong position
- Grey (-) letter: This letter is not in the word

## Your assignment...

For this kata, instead of playing the game like an honest person, you are to write a cheat-bot that filters down the set of words (wordlist) using a list of guesses and their respective feedbacks. For example, if you were provided this wordlist and feedbacks:

["SHEEP", "KINKY", "SWEET", "MAUVE", "FLUNG", "SKEET", ... ]  # wordlist

[["SPOIL", "G----"], ["STEAD", "GYG--"], ["SEETH", "GYGY-"]]  # guesses

Your output should be the set of remaining words, each satisfying all the hints in guesses:

{'SWEET', 'SKEET'}   # <- your output

## If you have time

If you have extra time, make it so that your bot will not be restricted to 5-letter words. The word length for each test case, however, must be consistent with the guesses. If the test case asks for a 9-letter word, all guesses in the hints would be of length 9.


