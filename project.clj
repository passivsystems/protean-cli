(defproject protean-cli "0.5.0-SNAPSHOT"
  :description "Command line interface for Protean"
  :url "http://github.com/passivsystems/protean-cli"
  :license {:name "Apache License v2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [ring/ring-codec "1.0.0"]
                 [clj-http "0.9.1"]
                 [com.taoensso/timbre "3.1.6"]
                 [io.aviso/pretty "0.1.12"]
                 [com.passivsystems/protean-core "0.3.0-SNAPSHOT"]]
  :aot :all
  :main protean.cli)
