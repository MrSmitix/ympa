--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetGoodsFeedbackCommentsResponse' definition.
--


--
-- SELECT template for table `GetGoodsFeedbackCommentsResponse`
--
SELECT `status`, `result` FROM `GetGoodsFeedbackCommentsResponse` WHERE 1;

--
-- INSERT template for table `GetGoodsFeedbackCommentsResponse`
--
INSERT INTO `GetGoodsFeedbackCommentsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetGoodsFeedbackCommentsResponse`
--
UPDATE `GetGoodsFeedbackCommentsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetGoodsFeedbackCommentsResponse`
--
DELETE FROM `GetGoodsFeedbackCommentsResponse` WHERE 0;

