--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedIndexLogsResultDTO' definition.
--


--
-- SELECT template for table `FeedIndexLogsResultDTO`
--
SELECT `feed`, `indexLogRecords`, `total` FROM `FeedIndexLogsResultDTO` WHERE 1;

--
-- INSERT template for table `FeedIndexLogsResultDTO`
--
INSERT INTO `FeedIndexLogsResultDTO`(`feed`, `indexLogRecords`, `total`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FeedIndexLogsResultDTO`
--
UPDATE `FeedIndexLogsResultDTO` SET `feed` = ?, `indexLogRecords` = ?, `total` = ? WHERE 1;

--
-- DELETE template for table `FeedIndexLogsResultDTO`
--
DELETE FROM `FeedIndexLogsResultDTO` WHERE 0;

