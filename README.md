# AncientNumbers

Leetcode link: https://leetcode.com/problems/roman-to-integer/

A program for converting Roman numbers to Integer values.

Class AncientNumbers (package AncientNumbers) is used to convert the numbers to integers. The class's romanToInt function can be called to perform the conversion.

The function CharsToNum converts the Roman numeral string into an array of integers, returning the array.

The function AnswerFinder will iterate trough the array of integers, adding them to a rolling sum. It will check if the next proceeding element is larger than the current one, and if so, will resolve the issue by subtracting the two values, adding the result to the rolling sum, and setting the next value to zero.

Example:

sum = 0   sum = 4   sum = 4   sum = 4
[1, 5] -> [1, 5] -> [1, 0] -> [1, 0] -> return sum
 ^         ^         ^            ^

The function will return the sum after parsing through the array
