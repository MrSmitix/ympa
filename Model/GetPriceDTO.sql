--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPriceDTO' definition.
--


--
-- SELECT template for table `GetPriceDTO`
--
SELECT `value`, `currencyId`, `updatedAt` FROM `GetPriceDTO` WHERE 1;

--
-- INSERT template for table `GetPriceDTO`
--
INSERT INTO `GetPriceDTO`(`value`, `currencyId`, `updatedAt`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetPriceDTO`
--
UPDATE `GetPriceDTO` SET `value` = ?, `currencyId` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `GetPriceDTO`
--
DELETE FROM `GetPriceDTO` WHERE 0;

