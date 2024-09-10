--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedIndexLogsRecordDTO' definition.
--


--
-- SELECT template for table `FeedIndexLogsRecordDTO`
--
SELECT `downloadTime`, `fileTime`, `generationId`, `indexType`, `publishedTime`, `status`, `error`, `offers` FROM `FeedIndexLogsRecordDTO` WHERE 1;

--
-- INSERT template for table `FeedIndexLogsRecordDTO`
--
INSERT INTO `FeedIndexLogsRecordDTO`(`downloadTime`, `fileTime`, `generationId`, `indexType`, `publishedTime`, `status`, `error`, `offers`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FeedIndexLogsRecordDTO`
--
UPDATE `FeedIndexLogsRecordDTO` SET `downloadTime` = ?, `fileTime` = ?, `generationId` = ?, `indexType` = ?, `publishedTime` = ?, `status` = ?, `error` = ?, `offers` = ? WHERE 1;

--
-- DELETE template for table `FeedIndexLogsRecordDTO`
--
DELETE FROM `FeedIndexLogsRecordDTO` WHERE 0;

