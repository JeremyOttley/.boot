(require 'boot.repl)

(swap! boot.repl/*default-dependencies*
       concat '[[cider/cider-nrepl "0.21.1"]])

(swap! boot.repl/*default-middleware*
       conj 'cider.nrepl/cider-middleware)
