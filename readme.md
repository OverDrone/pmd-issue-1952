Steps to reproduce:
1. gradle wrapper
2. gradle clean pmdMain (using pmd 6.0.0) - "unused variable" error reported
3. change build.gradle, switch to 6.17.0 config and pmd version (comment 2 lines, uncomment next 2 lines)
4. gradle clean pmdMain (using latest 6.17.0)
Expected result: step 4 has same error reported as in step 2
Actual result: no pmd errors reported during step 4