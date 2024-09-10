--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ChatMessagePayloadDTO' definition.
--


--
-- SELECT template for table `ChatMessagePayloadDTO`
--
SELECT `name`, `url`, `size` FROM `ChatMessagePayloadDTO` WHERE 1;

--
-- INSERT template for table `ChatMessagePayloadDTO`
--
INSERT INTO `ChatMessagePayloadDTO`(`name`, `url`, `size`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatMessagePayloadDTO`
--
UPDATE `ChatMessagePayloadDTO` SET `name` = ?, `url` = ?, `size` = ? WHERE 1;

--
-- DELETE template for table `ChatMessagePayloadDTO`
--
DELETE FROM `ChatMessagePayloadDTO` WHERE 0;

