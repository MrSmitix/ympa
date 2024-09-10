--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetChatsRequest' definition.
--


--
-- SELECT template for table `GetChatsRequest`
--
SELECT `orderIds`, `types`, `statuses` FROM `GetChatsRequest` WHERE 1;

--
-- INSERT template for table `GetChatsRequest`
--
INSERT INTO `GetChatsRequest`(`orderIds`, `types`, `statuses`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetChatsRequest`
--
UPDATE `GetChatsRequest` SET `orderIds` = ?, `types` = ?, `statuses` = ? WHERE 1;

--
-- DELETE template for table `GetChatsRequest`
--
DELETE FROM `GetChatsRequest` WHERE 0;

