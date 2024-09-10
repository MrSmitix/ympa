--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackListDTO' definition.
--


--
-- SELECT template for table `FeedbackListDTO`
--
SELECT `paging`, `feedbackList` FROM `FeedbackListDTO` WHERE 1;

--
-- INSERT template for table `FeedbackListDTO`
--
INSERT INTO `FeedbackListDTO`(`paging`, `feedbackList`) VALUES (?, ?);

--
-- UPDATE template for table `FeedbackListDTO`
--
UPDATE `FeedbackListDTO` SET `paging` = ?, `feedbackList` = ? WHERE 1;

--
-- DELETE template for table `FeedbackListDTO`
--
DELETE FROM `FeedbackListDTO` WHERE 0;

