Dead Simple Clojure Sample
==========================

The newest swank-clojure jar greately simplifies running a Clojure REPL in emacs, provided that you have 
a Clojure project set up.

This is the simplest clojure project I could think of to try out the newest swank-clojure features.

Requires:

-	Leiningen

- A recent clojure-mode.el, with proper .emacs require statements.


__These notes are very incomplete.  I will fill in with links and detailed directions as I go.__

You have to run `lein deps` in the project directory to install all needed dependancies.

Once in Emacs `M-x clojure-jack-in` will get you a clojure REPL with classpath set to include all your project libs.

You do _not_ need slime installed in your emacs for this to work.

You can run the test suite(!!) by running `lein test` from the command line.

From the clojure REPL in emacs you can run tests this way:

    user> (use 'clojure.test)
    nil
    user> (use 'simple-test)
    nil
    user> (run-tests 'simple-test)
    
    Testing simple-test
    
    Ran 2 tests containing 5 assertions.
    0 failures, 0 errors.
    {:type :summary, :pass 5, :test 2, :error 0, :fail 0}
    user>
