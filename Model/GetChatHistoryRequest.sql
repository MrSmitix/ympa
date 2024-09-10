--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetChatHistoryRequest' definition.
--


--
-- SELECT template for table `GetChatHistoryRequest`
--
SELECT `messageIdFrom` FROM `GetChatHistoryRequest` WHERE 1;

--
-- INSERT template for table `GetChatHistoryRequest`
--
INSERT INTO `GetChatHistoryRequest`(`messageIdFrom`) VALUES (?);

--
-- UPDATE template for table `GetChatHistoryRequest`
--
UPDATE `GetChatHistoryRequest` SET `messageIdFrom` = ? WHERE 1;

--
-- DELETE template for table `GetChatHistoryRequest`
--
DELETE FROM `GetChatHistoryRequest` WHERE 0;

