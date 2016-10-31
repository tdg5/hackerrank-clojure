(ns euler002.core)

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
          (println nth_test_case)
        )
        (recur (- test_case_index 1))
      )
    )
  )
)
