--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetRegionsResponse' definition.
--


--
-- SELECT template for table `GetRegionsResponse`
--
SELECT `regions`, `paging` FROM `GetRegionsResponse` WHERE 1;

--
-- INSERT template for table `GetRegionsResponse`
--
INSERT INTO `GetRegionsResponse`(`regions`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `GetRegionsResponse`
--
UPDATE `GetRegionsResponse` SET `regions` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `GetRegionsResponse`
--
DELETE FROM `GetRegionsResponse` WHERE 0;

