--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackListDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackListDTO`
--
SELECT `feedbacks`, `paging` FROM `GoodsFeedbackListDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackListDTO`
--
INSERT INTO `GoodsFeedbackListDTO`(`feedbacks`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `GoodsFeedbackListDTO`
--
UPDATE `GoodsFeedbackListDTO` SET `feedbacks` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackListDTO`
--
DELETE FROM `GoodsFeedbackListDTO` WHERE 0;

