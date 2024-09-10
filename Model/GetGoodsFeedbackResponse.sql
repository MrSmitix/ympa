--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetGoodsFeedbackResponse' definition.
--


--
-- SELECT template for table `GetGoodsFeedbackResponse`
--
SELECT `status`, `result` FROM `GetGoodsFeedbackResponse` WHERE 1;

--
-- INSERT template for table `GetGoodsFeedbackResponse`
--
INSERT INTO `GetGoodsFeedbackResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetGoodsFeedbackResponse`
--
UPDATE `GetGoodsFeedbackResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetGoodsFeedbackResponse`
--
DELETE FROM `GetGoodsFeedbackResponse` WHERE 0;

