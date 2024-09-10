--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetRegionWithChildrenResponse' definition.
--


--
-- SELECT template for table `GetRegionWithChildrenResponse`
--
SELECT `pager`, `regions` FROM `GetRegionWithChildrenResponse` WHERE 1;

--
-- INSERT template for table `GetRegionWithChildrenResponse`
--
INSERT INTO `GetRegionWithChildrenResponse`(`pager`, `regions`) VALUES (?, ?);

--
-- UPDATE template for table `GetRegionWithChildrenResponse`
--
UPDATE `GetRegionWithChildrenResponse` SET `pager` = ?, `regions` = ? WHERE 1;

--
-- DELETE template for table `GetRegionWithChildrenResponse`
--
DELETE FROM `GetRegionWithChildrenResponse` WHERE 0;

