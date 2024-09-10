--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetChatsInfoDTO' definition.
--


--
-- SELECT template for table `GetChatsInfoDTO`
--
SELECT `chats`, `paging` FROM `GetChatsInfoDTO` WHERE 1;

--
-- INSERT template for table `GetChatsInfoDTO`
--
INSERT INTO `GetChatsInfoDTO`(`chats`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `GetChatsInfoDTO`
--
UPDATE `GetChatsInfoDTO` SET `chats` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `GetChatsInfoDTO`
--
DELETE FROM `GetChatsInfoDTO` WHERE 0;

