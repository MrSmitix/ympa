--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ChatMessageDTO' definition.
--


--
-- SELECT template for table `ChatMessageDTO`
--
SELECT `messageId`, `createdAt`, `sender`, `message`, `payload` FROM `ChatMessageDTO` WHERE 1;

--
-- INSERT template for table `ChatMessageDTO`
--
INSERT INTO `ChatMessageDTO`(`messageId`, `createdAt`, `sender`, `message`, `payload`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ChatMessageDTO`
--
UPDATE `ChatMessageDTO` SET `messageId` = ?, `createdAt` = ?, `sender` = ?, `message` = ?, `payload` = ? WHERE 1;

--
-- DELETE template for table `ChatMessageDTO`
--
DELETE FROM `ChatMessageDTO` WHERE 0;

