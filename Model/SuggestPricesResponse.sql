--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SuggestPricesResponse' definition.
--


--
-- SELECT template for table `SuggestPricesResponse`
--
SELECT `status`, `result` FROM `SuggestPricesResponse` WHERE 1;

--
-- INSERT template for table `SuggestPricesResponse`
--
INSERT INTO `SuggestPricesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `SuggestPricesResponse`
--
UPDATE `SuggestPricesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `SuggestPricesResponse`
--
DELETE FROM `SuggestPricesResponse` WHERE 0;

