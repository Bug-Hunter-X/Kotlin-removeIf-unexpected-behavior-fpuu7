# Kotlin removeIf() unexpected behavior

This example demonstrates the in-place modification of collections using `removeIf()`.  While functional in nature, the behavior of modifying the original collection might not be intuitive for all developers.  This is particularly true when transitioning from other languages with different collection handling paradigms.

The `removeIf()` function iterates through the elements and removes any element for which the predicate returns `true`. This happens directly in the original collection.