(ns euler001.core)

(defn fizzbuzzy
  "Returns a boolean indicating whether a given integer is divisible by 3 or 5"
  [int_under_test]
  (or (== (rem int_under_test 5) 0) (== (rem int_under_test 3) 0))
)

(defn fizzbuzzy_sum
  "Returns the sum of numbers less than n that are divisible by 3 or 5"
  [n]
  (
    loop [index (- n 1), sum 0]
    (
      if (> index 0)
      (recur (- index 1) (+ sum (if (fizzbuzzy index) index 0)))
      sum
    )
  )
)

(defn -main
  "Do the damn thing"
  [& args]
  (
    let [
      total_test_case_count_raw (read-line)
      total_test_case_count (Integer/parseInt total_test_case_count_raw)
    ]
    (
      loop [
        test_case_index total_test_case_count
      ]
      (
        when (> test_case_index 0)
        (
          let [
            nth_test_case_raw (read-line)
            nth_test_case (Integer/parseInt nth_test_case_raw)
          ]
          (println (fizzbuzzy_sum nth_test_case))
        )
        (recur (- test_case_index 1))
      )
    )
  )
)
