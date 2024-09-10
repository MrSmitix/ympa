--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackGradesDTO' definition.
--


--
-- SELECT template for table `FeedbackGradesDTO`
--
SELECT `average`, `agreeCount`, `rejectCount`, `factors` FROM `FeedbackGradesDTO` WHERE 1;

--
-- INSERT template for table `FeedbackGradesDTO`
--
INSERT INTO `FeedbackGradesDTO`(`average`, `agreeCount`, `rejectCount`, `factors`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `FeedbackGradesDTO`
--
UPDATE `FeedbackGradesDTO` SET `average` = ?, `agreeCount` = ?, `rejectCount` = ?, `factors` = ? WHERE 1;

--
-- DELETE template for table `FeedbackGradesDTO`
--
DELETE FROM `FeedbackGradesDTO` WHERE 0;

