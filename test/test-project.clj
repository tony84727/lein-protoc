(defproject proto-test "0.1.0"
  :description "Test for lein-protoc Plugin"
  :proto-source-paths ["proto"]
  :plugins [[lein-protoc "0.1.0"]]
  :dependencies [[com.google.protobuf/protobuf-java "3.3.1"]
                 [org.clojure/clojure "1.9.0-alpha15"]])
