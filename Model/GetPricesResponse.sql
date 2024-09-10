--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPricesResponse' definition.
--


--
-- SELECT template for table `GetPricesResponse`
--
SELECT `status`, `result` FROM `GetPricesResponse` WHERE 1;

--
-- INSERT template for table `GetPricesResponse`
--
INSERT INTO `GetPricesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetPricesResponse`
--
UPDATE `GetPricesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetPricesResponse`
--
DELETE FROM `GetPricesResponse` WHERE 0;

