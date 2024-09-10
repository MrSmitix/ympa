--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetFeedbackListResponse' definition.
--


--
-- SELECT template for table `GetFeedbackListResponse`
--
SELECT `status`, `result` FROM `GetFeedbackListResponse` WHERE 1;

--
-- INSERT template for table `GetFeedbackListResponse`
--
INSERT INTO `GetFeedbackListResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetFeedbackListResponse`
--
UPDATE `GetFeedbackListResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetFeedbackListResponse`
--
DELETE FROM `GetFeedbackListResponse` WHERE 0;

