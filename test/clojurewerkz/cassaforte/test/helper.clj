(ns clojurewerkz.cassaforte.test.helper)

(defmacro with-thrift-exception-handling
  [& forms]
  `(try
     (do ~@forms)
     (catch org.apache.cassandra.thrift.InvalidRequestException ire#
       (println (.getWhy ire#)))))
