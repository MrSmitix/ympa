--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedPlacementDTO' definition.
--


--
-- SELECT template for table `FeedPlacementDTO`
--
SELECT `status`, `totalOffersCount` FROM `FeedPlacementDTO` WHERE 1;

--
-- INSERT template for table `FeedPlacementDTO`
--
INSERT INTO `FeedPlacementDTO`(`status`, `totalOffersCount`) VALUES (?, ?);

--
-- UPDATE template for table `FeedPlacementDTO`
--
UPDATE `FeedPlacementDTO` SET `status` = ?, `totalOffersCount` = ? WHERE 1;

--
-- DELETE template for table `FeedPlacementDTO`
--
DELETE FROM `FeedPlacementDTO` WHERE 0;

