--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CreateChatResponse' definition.
--


--
-- SELECT template for table `CreateChatResponse`
--
SELECT `status`, `result` FROM `CreateChatResponse` WHERE 1;

--
-- INSERT template for table `CreateChatResponse`
--
INSERT INTO `CreateChatResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `CreateChatResponse`
--
UPDATE `CreateChatResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `CreateChatResponse`
--
DELETE FROM `CreateChatResponse` WHERE 0;

