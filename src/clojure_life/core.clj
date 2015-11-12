(ns clojure-life.core)

(defn -main [& args]
      (println "foobar"))

(def blinker-board `((0 0 0 0 0)(0 0 0 0 0)(0 1 1 1 0)(0 0 0 0 0)(0 0 0 0 0)))

(defn print-board [board]
      (do
	(map println blinker-board)))

(defn sum-neighbors [x y board]
      
      ))

(defn cell-val [x y board]
      (let [x-size (count board)
      	    y-size (count (nth board 0))]
	    (if (or (x > x-size)
	    	    (y > y-size)
		    (x < 0)
		    (y < 0))
		    0)
		    (nth (nth board y) x)

(defn adjacency [x y board]
      	    (+ (cell-val [(- x 1) y board])
	       (cell-val [(+ x 1) y board])
	       (cell-val [x (- y 1) board])
	       (cell-val [x (+ y 1) board]))
	    

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
