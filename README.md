# cite_lib_demo

Ammonite script to demo use of `io.github.cite_architecture.cite`.

Requires sbt and ammonite shell.

To use it, start up ammonite with sbt configuration: `sbt test:console`

In the shell:

    import io.github.cite_architecture.cite._
    import $file.CtsUrnDemo

Then, to test a CtsUrn: `CtsUrnDemo.showOff(URNSTRING)`, e.g.,


    CtsUrnDemo.showOff("urn:cts:greekLit.tlg0012.tlg001.msA:1.1")
