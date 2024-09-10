--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetChatsResponse' definition.
--


--
-- SELECT template for table `GetChatsResponse`
--
SELECT `status`, `result` FROM `GetChatsResponse` WHERE 1;

--
-- INSERT template for table `GetChatsResponse`
--
INSERT INTO `GetChatsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetChatsResponse`
--
UPDATE `GetChatsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetChatsResponse`
--
DELETE FROM `GetChatsResponse` WHERE 0;

