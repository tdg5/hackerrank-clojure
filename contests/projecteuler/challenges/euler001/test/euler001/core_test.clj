(ns euler001.core-test
  (:require [clojure.test :refer :all]
            [euler001.core :refer :all]))

(deftest test-fizzbuzzy-of-3
  (testing "fizzbuzzy returns true when given 3"
    (is (= (fizzbuzzy 3) true))))

(deftest test-fizzbuzzy-of-5
  (testing "fizzbuzzy returns true when given 5"
    (is (= (fizzbuzzy 5) true))))

(deftest test-fizzbuzzy-of-15
  (testing "fizzbuzzy returns true when given 15"
    (is (= (fizzbuzzy 15) true))))

(deftest test-fizzbuzzy-of-7
  (testing "fizzbuzzy returns false when given 7"
    (is (= (fizzbuzzy 7) false))))

(deftest test-fizzbuzzy_sum-with-10
  (testing "fizzbuzzy_sum returns the expected result when given 10"
    (is (= (fizzbuzzy_sum 10) 23))))

(deftest test-fizzbuzzy_sum-with-100
  (testing "fizzbuzzy_sum returns the expected result when given 100"
    (is (= (fizzbuzzy_sum 100) 2318))))
