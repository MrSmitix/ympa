--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetChatInfoDTO' definition.
--


--
-- SELECT template for table `GetChatInfoDTO`
--
SELECT `chatId`, `orderId`, `type`, `status`, `createdAt`, `updatedAt` FROM `GetChatInfoDTO` WHERE 1;

--
-- INSERT template for table `GetChatInfoDTO`
--
INSERT INTO `GetChatInfoDTO`(`chatId`, `orderId`, `type`, `status`, `createdAt`, `updatedAt`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetChatInfoDTO`
--
UPDATE `GetChatInfoDTO` SET `chatId` = ?, `orderId` = ?, `type` = ?, `status` = ?, `createdAt` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `GetChatInfoDTO`
--
DELETE FROM `GetChatInfoDTO` WHERE 0;

