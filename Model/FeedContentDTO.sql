--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedContentDTO' definition.
--


--
-- SELECT template for table `FeedContentDTO`
--
SELECT `rejectedOffersCount`, `status`, `totalOffersCount`, `error` FROM `FeedContentDTO` WHERE 1;

--
-- INSERT template for table `FeedContentDTO`
--
INSERT INTO `FeedContentDTO`(`rejectedOffersCount`, `status`, `totalOffersCount`, `error`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `FeedContentDTO`
--
UPDATE `FeedContentDTO` SET `rejectedOffersCount` = ?, `status` = ?, `totalOffersCount` = ?, `error` = ? WHERE 1;

--
-- DELETE template for table `FeedContentDTO`
--
DELETE FROM `FeedContentDTO` WHERE 0;

