--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetFeedIndexLogsResponse' definition.
--


--
-- SELECT template for table `GetFeedIndexLogsResponse`
--
SELECT `status`, `result` FROM `GetFeedIndexLogsResponse` WHERE 1;

--
-- INSERT template for table `GetFeedIndexLogsResponse`
--
INSERT INTO `GetFeedIndexLogsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetFeedIndexLogsResponse`
--
UPDATE `GetFeedIndexLogsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetFeedIndexLogsResponse`
--
DELETE FROM `GetFeedIndexLogsResponse` WHERE 0;

