This is an example Maven project implementing an ImageJ2 command.

For an example Maven project implementing an **original ImageJ plugin**, see:
    https://github.com/imagej/example-legacy-plugin

It is intended as an ideal starting point to develop new ImageJ2 commands
in an IDE of your choice. You can even collaborate with developers using a
different IDE than you.

* In [Eclipse](http://eclipse.org), for example, it is as simple as
  _File &#8250; Import... &#8250; Existing Maven Project_.

* In [NetBeans](http://netbeans.org), it is even simpler:
  _File &#8250; Open Project_.

* The same works in [IntelliJ](http://jetbrains.net).

* If [jEdit](http://jedit.org) is your preferred IDE, you will need the
  [Maven Plugin](http://plugins.jedit.org/plugins/?MavenPlugin).

Die-hard command-line developers can use Maven directly by calling `mvn`
in the project root.

However you build the project, in the end you will have the `.jar` file
(called *artifact* in Maven speak) in the `target/` subdirectory.

To copy the artifact into the correct place, you can call
`mvn -Dscijava.app.directory="/path/to/ImageJ2.app/"`.
This will not only copy your artifact, but also all the dependencies.

Developing code in an IDE is convenient, especially for debugging.
To that end, this project contains a `main` method which launches ImageJ2,
loads an image and runs the command.

Since this project is intended as a starting point for your own
developments, it is in the public domain.

How to use this project as a starting point
===========================================

1. Visit [this link](https://github.com/imagej/example-imagej2-command/generate)
   to create a new repository in your space using this one as a template.

2. [Clone your new repository](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository).

3. Edit the `pom.xml` file, fixing all the lines labeled `FIXME`.

4. Remove the `GaussFiltering.java` file and add your own `.java` files
   to `src/main/java/<package>/` (if you need supporting files such as icons
   in the resulting `.jar` file, put them into `src/main/resources/`)

5. Replace the contents of `README.md` with information about your project.

6. Make your initial
   [commit](https://docs.github.com/en/desktop/contributing-and-collaborating-using-github-desktop/making-changes-in-a-branch/committing-and-reviewing-changes-to-your-project) and
   [push the results](https://docs.github.com/en/get-started/using-git/pushing-commits-to-a-remote-repository)!

### Eclipse: To ensure that Maven copies the command to your ImageJ2 folder

1. Go to _Run Configurations..._
2. Choose _Maven Build_
3. Add the following parameter:
    - name: `scijava.app.directory`
    - value: `/path/to/ImageJ2.app/`

This ensures that the final `.jar` file will also be copied
into your ImageJ2 folder everytime you run the Maven build.
