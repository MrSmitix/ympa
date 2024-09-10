--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ScrollingPagerDTO' definition.
--


--
-- SELECT template for table `ScrollingPagerDTO`
--
SELECT `nextPageToken`, `prevPageToken` FROM `ScrollingPagerDTO` WHERE 1;

--
-- INSERT template for table `ScrollingPagerDTO`
--
INSERT INTO `ScrollingPagerDTO`(`nextPageToken`, `prevPageToken`) VALUES (?, ?);

--
-- UPDATE template for table `ScrollingPagerDTO`
--
UPDATE `ScrollingPagerDTO` SET `nextPageToken` = ?, `prevPageToken` = ? WHERE 1;

--
-- DELETE template for table `ScrollingPagerDTO`
--
DELETE FROM `ScrollingPagerDTO` WHERE 0;

