<img src="https://webassets.telerikacademy.com/images/default-source/logos/telerik-academy.svg" alt="logo" width="300px" style="margin-top: 20px;"/>

# Telerik Academy Java - {Buddy Group Name} Learning Guide

The **learning guide** is a collection of learning objectives and sample theoretical questions for each of the topics, that collectively answer the question "what to learn?". This guide is an outline of the overall expectations we have for each student at the end of the specific module. You can find those questions and objectives in the beginning of each topic.

**Learning objectives**

A learning objective is a statement of what students will be able to do when they have researched and completed all activities in a topic. Learning objectives are a clear and measurable way of determining if you know, understand, can apply, can analyze and can evaluate a specific content. They follow[ _Bloom's Taxonomy_](https://en.wikipedia.org/wiki/Bloom%27s_taxonomy).

**Theoretical questions**

These are questions that will most likely be asked during the progress meetings and during the technical part of your job interviews. The idea of these questions is to provide the student an accurate way of determining if they know the key concepts behind each topic.

## Java Core

### Loops / Arrays / Git

- **Learning Objectives**

  1. Explain how loops work and what is the role of the `break` and `continue` .
  1. Solve basic judge tasks that require the usage of loops.
  1. Explain what an ArrayList is and how is it different than an ordinary array.
  1. Solve basic judge tasks that require the usage of arrays.
  1. Explain what git is and, in simple terms, how it works.
  1. Create and manage GitLab repositories and their collaborators.

- **Theoretical Questions**

  - What is a loop? What types of loops do you know?

    - A _loop_ in programming is a way to repeat an action number of times. The different loop mechanisms offer different ways to determine the start and end points of the loop. In Java there are several types of loops like for, while, do-while.

    1. **for** statement

       - A **for loop** repeats until a specified condition evaluates to false.

         _Example:_

         ```java
         for (int step = 0; step < 5; step++) {
           System.out.println('Walking one step');
         }
         ```

    1. **while** statement

       - A **while** loop executes its statements as long as a specified condition evaluates to **true**.

         _Example:_

         ```java
         int n = 0;
         while (n < 3) {
           n++;
         }
         ```

    1. **do-while** statement

       - A **do-while** loop repeats as long as a specified condition evaluates to **true**. The difference with the **while** loop is that this loop will always execute at least one time.

         _Example:_

         ```java
         int n = 0;
         do {
           n++;
         } while (n < 3);
         ```

    1. **for-each** statement

       - A **for-each** loop iterates over only iterable objects (like an `ArrayList`). As a drawback, we cannot modify the array or jump ahead, but we get a much clearner and readable code.

         _Example:_

         ```java
         int[] numbers = {3, 5, 7, 9};
         for (int number : numbers) {
           System.out.print(number); // 3, 5, 7, 9
         }
         ```

    - In loops there are 2 special statements that can be used - `break` and `continue`. The `break` statement will immediately terminate the loop's execution, while `continue` will only skip the current iteration.

      `break` _example:_

       ```java
         int[] numbers = {3, 5, 6, 9};
         for (int number : numbers) {
           if (number % 2 == 0) {
             brake;
           }
           System.out.print(number); // 3, 5
         }
         ```

      `continue` _example:_

      ```java
         int[] numbers = {3, 5, 6, 9};
         for (int number : numbers) {
           if (number % 2 == 0) {
             continue;
           }
           System.out.print(number); // 3, 5, 9
         }
         ```

    - Additional resources:
      - [GeeksForGeeks Loops](https://www.geeksforgeeks.org/loops-in-java/)
      - [W3Schools Loops](https://www.w3schools.com/java/java_for_loop.asp)

  - What is an array? What are the benefits of using arrays over using several variables?

    - An _array_ is...