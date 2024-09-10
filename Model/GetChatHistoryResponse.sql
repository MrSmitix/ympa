--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetChatHistoryResponse' definition.
--


--
-- SELECT template for table `GetChatHistoryResponse`
--
SELECT `status`, `result` FROM `GetChatHistoryResponse` WHERE 1;

--
-- INSERT template for table `GetChatHistoryResponse`
--
INSERT INTO `GetChatHistoryResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetChatHistoryResponse`
--
UPDATE `GetChatHistoryResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetChatHistoryResponse`
--
DELETE FROM `GetChatHistoryResponse` WHERE 0;

