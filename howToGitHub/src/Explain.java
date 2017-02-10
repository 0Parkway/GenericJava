/*
 * So, the issue I was having is that whenever I clone a repo
 * from GitHub, the only files that I could access from IntelliJ
 * were the README and "External Libraries". Well, after enough
 * trial and error (mostly error), I gave up. Posted it on
 * the IntelliJ User Forum and asked how to fix it, which
 * can be found here:
 *
 * https://intellij-support.jetbrains.com/hc/en-us/community/
 * posts/115000089044-Cloning-GitHub-Repo-leaves-mostly-empty-folder-
 *
 * Turns out, the solution is adding a Module via Project Structure.
 * To do this, go to File, Project Structure, Modules, Add New (+),
 * and Import Module from Existing Sources. New Module makes a
 * folder, which I don't want. So, Import a Module, locate the src/
 * folder and mark it as the folder that holds all the java files.
 */