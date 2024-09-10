--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PagedReturnsDTO' definition.
--


--
-- SELECT template for table `PagedReturnsDTO`
--
SELECT `paging`, `returns` FROM `PagedReturnsDTO` WHERE 1;

--
-- INSERT template for table `PagedReturnsDTO`
--
INSERT INTO `PagedReturnsDTO`(`paging`, `returns`) VALUES (?, ?);

--
-- UPDATE template for table `PagedReturnsDTO`
--
UPDATE `PagedReturnsDTO` SET `paging` = ?, `returns` = ? WHERE 1;

--
-- DELETE template for table `PagedReturnsDTO`
--
DELETE FROM `PagedReturnsDTO` WHERE 0;

