# cite_lib_demo

Ammonite script to demo use of `io.github.cite_architecture.cite`.

Requires sbt and ammonite shell.

To use it, start up ammonite with sbt configuration: `sbt test:console`

In the ammonite shell:

    import $file.CtsUrnDemo


You can run through a whole series of examples with `CtsUrnDemo.cycleExamples`. Alternatively, you can sumbit your own CtsUrn to test with `CtsUrnDemo.showOff(URNSTRING)`, e.g.,

    CtsUrnDemo.showOff("urn:cts:greekLit.tlg0012.tlg001.msA:1.1")
