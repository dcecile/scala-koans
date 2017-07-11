# Scala Koans
_Learn Scala with the koans_

# Prerequisites

You'll need to install a JDK (to run the Scala compiler) and [SBT](http://www.scala-sbt.org/) (to download the Scala compiler and library dependencies).

# Workflow (text-based)

Your meditation session will be assisted by SBT, an excellent tool for interactive Scala development.

1. Open a new terminal
2. Get this code with `git clone https://github.com/dcecile/scala-koans.git`
3. Go into the new directory (`cd scala-koans`)
4. Start SBT using `sbt namaste`
5. Read the meditation message
6. Open the indicated source file and try solve the koan
7. Go to step 5

You can exit SBT at any time, and your meditation will automatically resume from where you left off last.

# List of koans

Here are all the koans included in this repository:

<table border="1" cellspacing="0" cellpadding="10">
<tbody>
<tr>
<td><em>Use...</em></td>
<td><em>to meditate on...</em></td>
</tr>
<tr>
	<td>AboutAsserts</td>
	<td>How Scala koans work</td>
</tr>
<tr>
	<td>AboutValAndVar</td>
	<td>How val and var declarations differ</td>
</tr>
<tr>
	<td>AboutClasses</td>
	<td>How to specify class arguments and fields</td>
</tr>
<tr>
	<td>AboutRange</td>
	<td>How to use a convenient class for generating sequences</td>
</tr>
<tr>
	<td>AboutLiteralBooleans</td>
	<td>How to specify boolean values</td>
</tr>
<tr>
	<td>AboutLiteralNumbers</td>
	<td>How to specify values for the common numeric data types</td>
</tr>
<tr>
	<td>AboutLiteralStrings</td>
	<td>How to write literal values for character and string data</td>
</tr>
<tr>
	<td>About Tuples</td>
	<td>How to use a convenient class for unnamed structures</td>
</tr>
<tr>
	<td>AboutTuples</td>
	<td>How to write a literal tuple value</td>
</tr>
<tr>
	<td></td>
	<td>How to access the values in a tuple</td>
</tr>
<tr>
	<td></td>
	<td>Whether all values in a tuple must have the same type</td>
</tr>
<tr>
	<td>AboutLists</td>
	<td>How Nil lists compare</td>
</tr>
<tr>
	<td></td>
	<td>How to write a literal list</td>
</tr>
<tr>
	<td></td>
	<td>How to access the values in a list</td>
</tr>
<tr>
	<td></td>
	<td>How to alter the contents of a list</td>
</tr>
<tr>
	<td></td>
	<td>Discovering some common List methods</td>
</tr>
<tr>
	<td></td>
	<td>Transforming, filtering, and summarizing lists</td>
</tr>
<tr>
	<td></td>
	<td>Quickly creating a list of consecutive integers</td>
</tr>
<tr>
	<td></td>
	<td>Sharing content between lists</td>
</tr>
<tr>
	<td>AboutMaps</td>
	<td>How to write a literal map</td>
</tr>
<tr>
	<td></td>
	<td>What happens if a key appears more than once</td>
</tr>
<tr>
	<td></td>
	<td>Iterating through the contents of a map</td>
</tr>
<tr>
	<td></td>
	<td>Whether all keys or values in a map must have the same type</td>
</tr>
<tr>
	<td></td>
	<td>How to access the values in a map</td>
</tr>
<tr>
	<td></td>
	<td>How to remove entries from a map</td>
</tr>
<tr>
	<td>AboutSets</td>
	<td>How to write a literal set value</td>
</tr>
<tr>
	<td></td>
	<td>What happens if a value appears more than once</td>
</tr>
<tr>
	<td></td>
	<td>Whether all values in a set must have the same type</td>
</tr>
<tr>
	<td></td>
	<td>How to test for the presence of a value in a set</td>
</tr>
<tr>
	<td></td>
	<td>How to alter the content of a set</td>
</tr>
<tr>
	<td></td>
	<td>How to iterate through the values in a set</td>
</tr>
<tr>
	<td></td>
	<td>How to perform familiar operations on a set</td>
</tr>
<tr>
	<td>AboutMutableMaps</td>
	<td>How to create maps whose contents can be altered</td>
</tr>
<tr>
	<td></td>
	<td>How to add and remove map content</td>
</tr>
<tr>
	<td>AboutMutableSets</td>
	<td>How to create sets whose contents can be altered</td>
</tr>
<tr>
	<td></td>
	<td>How to add and remove set content</td>
</tr>
<tr>
	<td>AboutFormatting</td>
	<td>How to use character literals and escaped sequences</td>
</tr>
<tr>
	<td>AboutPatternMatching</td>
	<td>How to use pattern matching to replace complex conditional logic</td>
</tr>
<tr>
	<td></td>
	<td>How to ignore part of the data being pattern matched</td>
</tr>
<tr>
	<td></td>
	<td>How to "capture" matched data for later use</td>
</tr>
<tr>
	<td></td>
	<td>How to use pattern matching to simplify working with regular expressions</td>
</tr>
<tr>
	<td></td>
	<td>How to refer to the contents of existing variables when pattern matching</td>
</tr>
<tr>
	<td>AboutCaseClasses</td>
	<td>How to use case classes to write less boilerplate</td>
</tr>
<tr>
	<td></td>
	<td>Discovering which methods are automatically provided with case classes</td>
</tr>
<tr>
	<td></td>
	<td>How to create a mutable case class</td>
</tr>
<tr>
	<td></td>
	<td>How to avoid using a mutable case class</td>
</tr>
<tr>
	<td></td>
	<td>How to use named parameters to simplify working with case classes even further</td>
</tr>
<tr>
	<td></td>
	<td>How to "deconstruct"" an instance of a case class</td>
</tr>
<tr>
	<td>AboutOptions</td>
	<td>How to avoid using raw nulls</td>
</tr>
<tr>
	<td></td>
	<td>How to safely deal with "missing" or optional data</td>
</tr>
<tr>
	<td></td>
	<td>How to operate on an optional value</td>
</tr>
<tr>
	<td></td>
	<td>How to work with a list of optional values</td>
</tr>
<tr>
	<td>AboutSequencesAndArrays</td>
	<td>How to write a literal array value</td>
</tr>
<tr>
	<td></td>
	<td>How to convert between various kinds of sequences</td>
</tr>
<tr>
	<td></td>
	<td>How to transform and filter lists</td>
</tr>
<tr>
	<td>AboutNamedAndDefaultArguments</td>
	<td>How to specify defaults for parameters and how to specify arguments in any order by using names</td>
</tr>
<tr>
	<td>AboutForExpressions</td>
	<td>How to iterate sequences, create Ranges, use guards, and nest</td>
</tr>

<tr>
	<td>AboutEmptyValues</td>
	<td>How to use None, Some, and Option</td>
</tr>
<tr>
	<td>AboutParentClasses</td>
	<td>How to use classes for inheritances and how to use abstract classes</td>
</tr>

<tr>
	<td>AboutTypeSignatures</td>
	<td>How to specify generics</td>
</tr>
<tr>
	<td>AboutTraits</td>
	<td>How to create self-contained definitions that can be combined with inheritance</td>
</tr>

<tr>
	<td>AboutPreconditions</td>
	<td>How to ensure that conditions are met</td>
</tr>
<tr>
	<td>AboutUniformAccessPrinciple</td>
	<td>How to interchangeably use fields and methods to hide implementation details</td>
</tr>
<tr>
	<td>AboutHigherOrderFunctions</td>
	<td>How to write and use anonymous functions</td>
</tr>
<tr>
	<td></td>
	<td>How a closure differs from a "pure" function</td>
</tr>
<tr>
	<td></td>
	<td>How to return a function as a result</td>
</tr>
<tr>
	<td></td>
	<td>How to compose new functions from existing ones</td>
</tr>
<tr>
	<td></td>
	<td>How to use currying to "specialize" functions</td>
</tr>
<tr>
	<td></td>
	<td>How to create a function from a class method</td>
</tr>
<tr>
	<td>AboutPartialFunctions</td>
	<td>How to safely create functions that are only defined for subsets of their arguments</td>
</tr>
<tr>
	<td></td>
	<td>How to easily combine these partial functions to create new functions</td>
</tr>
<tr>
	<td>AboutPartiallyAppliedFunctions</td>
	<td>How to create a function by specifying only some of the arguments to another function</td>
</tr>
<tr>
	<td>About Iterables</td>
	<td>How to do fun stuff with basic Scala collections while affecting state</td>
</tr>
<tr>
	<td>About Traversables</td>
	<td>How to do fun stuff with basic Scala collections without affecting state</td>
</tr>
<tr>
	<td>AboutInfixPrefixAndPostfixOperators</td>
	<td>How to know what the compiler is doing with your expressions</td>
</tr>
<tr>
	<td>AboutInfixTypes</td>
	<td>How to make expressions read nicely</td>
</tr>
<tr>
	<td>AboutImplicits</td>
	<td>How to add to the language to improve readability</td>
</tr>
<tr>
	<td>AboutInteroperability</td>
	<td>How to work with Java classes</td>
</tr>
<tr>
	<td>AboutManifests</td>
	<td>How to provide meta information about classes</td>
</tr>
<tr>
	<td>AboutEnumerations</td>
	<td>How to create and generated values, access index and name, and how to create your own</td>
</tr>
<tr>
	<td>AboutConstructors</td>
	<td>How to create auxiliary constructors</td>
</tr>
<tr>
	<td>AboutImportsAndPackages</td>
	<td>How to declare packages of your own and how to import other packages</td>
</tr>
</tbody>
</table>

# Origins

If you're curious about where these koans came from, you can take a look at these links:

- http://www.scalakoans.org/
- https://bitbucket.org/dickwall/scala-koans
- https://github.com/rubbish/scala-koans
- https://github.com/dickwall/functional-koans/tree/scala
