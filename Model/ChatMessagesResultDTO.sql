--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ChatMessagesResultDTO' definition.
--


--
-- SELECT template for table `ChatMessagesResultDTO`
--
SELECT `orderId`, `messages`, `paging` FROM `ChatMessagesResultDTO` WHERE 1;

--
-- INSERT template for table `ChatMessagesResultDTO`
--
INSERT INTO `ChatMessagesResultDTO`(`orderId`, `messages`, `paging`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatMessagesResultDTO`
--
UPDATE `ChatMessagesResultDTO` SET `orderId` = ?, `messages` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `ChatMessagesResultDTO`
--
DELETE FROM `ChatMessagesResultDTO` WHERE 0;

