--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackStatisticsDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackStatisticsDTO`
--
SELECT `rating`, `commentsCount`, `recommended`, `paidAmount` FROM `GoodsFeedbackStatisticsDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackStatisticsDTO`
--
INSERT INTO `GoodsFeedbackStatisticsDTO`(`rating`, `commentsCount`, `recommended`, `paidAmount`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GoodsFeedbackStatisticsDTO`
--
UPDATE `GoodsFeedbackStatisticsDTO` SET `rating` = ?, `commentsCount` = ?, `recommended` = ?, `paidAmount` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackStatisticsDTO`
--
DELETE FROM `GoodsFeedbackStatisticsDTO` WHERE 0;

