--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ForwardScrollingPagerDTO' definition.
--


--
-- SELECT template for table `ForwardScrollingPagerDTO`
--
SELECT `nextPageToken` FROM `ForwardScrollingPagerDTO` WHERE 1;

--
-- INSERT template for table `ForwardScrollingPagerDTO`
--
INSERT INTO `ForwardScrollingPagerDTO`(`nextPageToken`) VALUES (?);

--
-- UPDATE template for table `ForwardScrollingPagerDTO`
--
UPDATE `ForwardScrollingPagerDTO` SET `nextPageToken` = ? WHERE 1;

--
-- DELETE template for table `ForwardScrollingPagerDTO`
--
DELETE FROM `ForwardScrollingPagerDTO` WHERE 0;

