# Basic Tic Tac Toe Example

This is an example application satisfying the requirements for [basic Tic Tac Toe][basic_ttt] along with the approach taken and decisions made along the way.

## How to Use this Document

In addition to this document, I recommend taking a look at:

 * The tagged commits
 * The Git history
 * Past pull requests

## General Approach

The overall approach was to take baby steps, keep commits atomic, and merge changes into master via pull requests whenever possible.

## Requirements

In addition to the requirements described in the project, I wanted to use a statically typed language that was relatively easy to dive into.

## Step 1 - Setting up the Walking Skeleton

[SNAPSHOT](https://github.com/ericmeyer/TicTacToeJava/tree/01-create-walking-skeleton)

The first thing I like to do is set up the walking skeleton for the application, which includes choosing the tech stack.

My checklist for the walking skeleton was:

 * Set up unit tests
 * Continuous Integration
 * Tasks to run the application and tests
 * README with instructions for both other developers and consumers of the application

### Decisions

This forced me to make a number of decisions:

 * I decided to go with Gradle for the build tool for a couple of reasons.
    1. I am familiar with the tool
    2. I believe it is fairly lightweight and well suited to a simple project
 * JUnit and Hamcrest matchers were chosen for the following reasons
    1. Ubiquity
    2. Familiarity
 * Travis CI was also chosen for familiarity

### Other Notes

I merged in the change to add Travis via a pull request in order to make sure the build was passing before merging in the changes.

## Step 2 - Welcome Message and Empty Board

[SNAPSHOT](https://github.com/ericmeyer/TicTacToeJava/tree/02-welcome-message)

At this point, we are ready to start developing the application. There are a number of different directions we could go, however I am going to take a user focused approach. The next feature that the user would care about is being able to take the first move, so to that end the next feature I am going to add is showing a welcome message, an empty board, and instructions to take a move.

### Goals for Implementation

 * Defer making decisions.
 * Set myself up for future refactorings

### Sample Output

I first started by figuring out what I wanted to display, then just hardcoding that output. I did this since there's nothing dynamic, and my plan is to refactor into some abstractions.

```
$ ./gradlew run -i
Welcome to Tic Tac Toe! Please enter a number to make a move:

| 1 | 2 | 3 |
| 4 | 5 | 6 |
| 7 | 8 | 9 |

X's Move: _
```

[basic_ttt]: https://github.com/8thlight/apprenticeship_syllabus/blob/master/crafter/projects/tic_tac_toe/tic_tac_toe_basic.md
