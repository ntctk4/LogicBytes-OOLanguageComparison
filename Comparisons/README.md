# Comparisons of References and Values
* How are values compared? (i.e. comparing two strings)
	# Java
		For Java, there are two ways to do comparisons: the == operator and the Equals() method. First, the == operator checks to see if the two things being compared are referencing the same object (it is not checking to see if the vale is the same). The Equals() method on the other hand checks to see if the values being compared are equal (does not matter if the two things being compared are the same instance or not).

	# C#
		For C# there are three ways to do comparisons: ReferenceEquals(), Equals(), and ==. First, == checks to see if the two things being compared are referencing the same object (not value). ReferenceEquals() is the same as ==, it checks to see if the two things being compared are the same instance. The Equals() method in C# compares if the values are the same, it does not matter if the two things being compared are the same instance or not. 

[Home](../README.md)
