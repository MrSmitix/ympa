--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedIndexLogsOffersDTO' definition.
--


--
-- SELECT template for table `FeedIndexLogsOffersDTO`
--
SELECT `rejectedCount`, `totalCount` FROM `FeedIndexLogsOffersDTO` WHERE 1;

--
-- INSERT template for table `FeedIndexLogsOffersDTO`
--
INSERT INTO `FeedIndexLogsOffersDTO`(`rejectedCount`, `totalCount`) VALUES (?, ?);

--
-- UPDATE template for table `FeedIndexLogsOffersDTO`
--
UPDATE `FeedIndexLogsOffersDTO` SET `rejectedCount` = ?, `totalCount` = ? WHERE 1;

--
-- DELETE template for table `FeedIndexLogsOffersDTO`
--
DELETE FROM `FeedIndexLogsOffersDTO` WHERE 0;

