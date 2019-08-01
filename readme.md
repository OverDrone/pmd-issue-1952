Steps to reproduce:
1. gradle wrapper
2. gradle clean pmdMain (using pmd 6.0.0) - "unused field" error reported
3. change build.gradle, switch to 6.17.0 config and pmd version (comment 2 lines, uncomment next 2 lines)
4. gradle clean pmdMain (using latest 6.17.0)

Expected result: step 4 has same error reported as in step 2
Actual result: no pmd errors reported during step 4

Also:
1. edit MainComponent.java: remove/comment @Value and import org.springframework.beans.factory.annotation.Value
2. gradle clean pmdMain (using latest 6.17.0) - "unused field" error reported.

this proves that 6.17 pmd config is correct and rule is actually checked