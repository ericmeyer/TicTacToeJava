# Basic Tic Tac Toe Example

This is an example application satisfying the requirements for [basic Tic Tac Toe][basic_ttt] along with the approach taken and decisions made along the way.

## Requirements

In addition to the requirements described in the project, I wanted to use a statically typed language that was relatively easy to dive into.

## Step 1 - Setting up the Walking Skeleton

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

[basic_ttt]: https://github.com/8thlight/apprenticeship_syllabus/blob/master/crafter/projects/tic_tac_toe/tic_tac_toe_basic.md
