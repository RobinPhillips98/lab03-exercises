# Find All Duplicates
Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.

# Describe Different Approaches to Solving This Problem

Describe the two different ways to figure out all of the duplicate values of a list of integers in english. The first solution is the nested loop solution. The second solution is to use a dictionary or a map (similar to the containsPair method we wrote in class. Describe both in as much detail as you can (with no code) and describe the trade-offs between the two solutions.

The first method uses a nested for loop to iterate through each element in the list and check if it matches a later element in the list and if it does to add it to our list of duplicates (preferably with a check to make sure the list doesn't already contain that number). The second element uses a set and my method of doing so was to have two sets and to iterate through the list adding each element to the first set, and when it failed to add an element I would add it to the second set instead as that would mean it was a duplicate. Then I returned a List copying that set. The first solution is easier to understand but much slower as it runs in quadratic time, while the second solution is much faster, running in O(n) time but it can be harder to understand
