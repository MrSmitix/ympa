--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOrdersResponse' definition.
--


--
-- SELECT template for table `GetOrdersResponse`
--
SELECT `pager`, `orders`, `paging` FROM `GetOrdersResponse` WHERE 1;

--
-- INSERT template for table `GetOrdersResponse`
--
INSERT INTO `GetOrdersResponse`(`pager`, `orders`, `paging`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetOrdersResponse`
--
UPDATE `GetOrdersResponse` SET `pager` = ?, `orders` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `GetOrdersResponse`
--
DELETE FROM `GetOrdersResponse` WHERE 0;

