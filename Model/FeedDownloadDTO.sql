--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedDownloadDTO' definition.
--


--
-- SELECT template for table `FeedDownloadDTO`
--
SELECT `status`, `error` FROM `FeedDownloadDTO` WHERE 1;

--
-- INSERT template for table `FeedDownloadDTO`
--
INSERT INTO `FeedDownloadDTO`(`status`, `error`) VALUES (?, ?);

--
-- UPDATE template for table `FeedDownloadDTO`
--
UPDATE `FeedDownloadDTO` SET `status` = ?, `error` = ? WHERE 1;

--
-- DELETE template for table `FeedDownloadDTO`
--
DELETE FROM `FeedDownloadDTO` WHERE 0;

