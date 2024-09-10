--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FlippingPagerDTO' definition.
--


--
-- SELECT template for table `FlippingPagerDTO`
--
SELECT `total`, `from`, `to`, `currentPage`, `pagesCount`, `pageSize` FROM `FlippingPagerDTO` WHERE 1;

--
-- INSERT template for table `FlippingPagerDTO`
--
INSERT INTO `FlippingPagerDTO`(`total`, `from`, `to`, `currentPage`, `pagesCount`, `pageSize`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FlippingPagerDTO`
--
UPDATE `FlippingPagerDTO` SET `total` = ?, `from` = ?, `to` = ?, `currentPage` = ?, `pagesCount` = ?, `pageSize` = ? WHERE 1;

--
-- DELETE template for table `FlippingPagerDTO`
--
DELETE FROM `FlippingPagerDTO` WHERE 0;

