--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOutletsResponse' definition.
--


--
-- SELECT template for table `GetOutletsResponse`
--
SELECT `outlets`, `paging`, `pager` FROM `GetOutletsResponse` WHERE 1;

--
-- INSERT template for table `GetOutletsResponse`
--
INSERT INTO `GetOutletsResponse`(`outlets`, `paging`, `pager`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetOutletsResponse`
--
UPDATE `GetOutletsResponse` SET `outlets` = ?, `paging` = ?, `pager` = ? WHERE 1;

--
-- DELETE template for table `GetOutletsResponse`
--
DELETE FROM `GetOutletsResponse` WHERE 0;

