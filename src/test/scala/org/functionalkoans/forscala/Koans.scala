package org.functionalkoans.forscala

import org.scalatest._
import support.Master

class Koans extends Suite {
  override def nestedSuites = List(
    new AboutAsserts,
    new AboutValAndVar,
    new AboutClasses,
    new AboutObjects,

    new AboutTuples,
    new AboutLists,
    new AboutMaps,
    new AboutSets,
    new AboutOptions,
    new AboutMutableMaps,
    new AboutMutableSets,
    new AboutFormatting,
    new AboutPatternMatching,
    new AboutCaseClasses,

    new AboutRange,
    new AboutHigherOrderFunctions,
    new AboutPartiallyAppliedFunctions,
    new AboutPartialFunctions,

    //Afternoon
    new AboutImplicits,
    new AboutTraits,
    new AboutForExpressions,
    new AboutInfixPrefixAndPostfixOperators,
    new AboutInfixTypes,

    new AboutSequencesAndArrays,
    new AboutIterables,
    new AboutTraversables,
    new AboutNamedAndDefaultArguments,
    new AboutManifests,
    new AboutPreconditions,

    //move this later type variance and signatures on slides and REPL

    new AboutParentClasses,

    new AboutEmptyValues,

    new AboutTypeSignatures,
    new AboutUniformAccessPrinciple,
    new AboutLiteralBooleans,
    new AboutLiteralNumbers,
    new AboutLiteralStrings,
    new AboutTypeVariance,
    new AboutEnumerations,
    new AboutConstructors
  )

  override def run(testName: Option[String], reporter: Reporter, stopper: Stopper, filter: Filter,
                   configMap: Map[String, Any], distributor: Option[Distributor], tracker: Tracker) {
    super.run(testName, reporter, Master, filter, configMap, distributor, tracker)
  }

}
