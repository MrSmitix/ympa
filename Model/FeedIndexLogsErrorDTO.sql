--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedIndexLogsErrorDTO' definition.
--


--
-- SELECT template for table `FeedIndexLogsErrorDTO`
--
SELECT `httpStatusCode`, `type`, `description` FROM `FeedIndexLogsErrorDTO` WHERE 1;

--
-- INSERT template for table `FeedIndexLogsErrorDTO`
--
INSERT INTO `FeedIndexLogsErrorDTO`(`httpStatusCode`, `type`, `description`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FeedIndexLogsErrorDTO`
--
UPDATE `FeedIndexLogsErrorDTO` SET `httpStatusCode` = ?, `type` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `FeedIndexLogsErrorDTO`
--
DELETE FROM `FeedIndexLogsErrorDTO` WHERE 0;

