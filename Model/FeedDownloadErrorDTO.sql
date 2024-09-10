--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedDownloadErrorDTO' definition.
--


--
-- SELECT template for table `FeedDownloadErrorDTO`
--
SELECT `httpStatusCode`, `type`, `description` FROM `FeedDownloadErrorDTO` WHERE 1;

--
-- INSERT template for table `FeedDownloadErrorDTO`
--
INSERT INTO `FeedDownloadErrorDTO`(`httpStatusCode`, `type`, `description`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FeedDownloadErrorDTO`
--
UPDATE `FeedDownloadErrorDTO` SET `httpStatusCode` = ?, `type` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `FeedDownloadErrorDTO`
--
DELETE FROM `FeedDownloadErrorDTO` WHERE 0;

