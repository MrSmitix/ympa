--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PriceDTO' definition.
--


--
-- SELECT template for table `PriceDTO`
--
SELECT `value`, `discountBase`, `currencyId`, `vat` FROM `PriceDTO` WHERE 1;

--
-- INSERT template for table `PriceDTO`
--
INSERT INTO `PriceDTO`(`value`, `discountBase`, `currencyId`, `vat`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PriceDTO`
--
UPDATE `PriceDTO` SET `value` = ?, `discountBase` = ?, `currencyId` = ?, `vat` = ? WHERE 1;

--
-- DELETE template for table `PriceDTO`
--
DELETE FROM `PriceDTO` WHERE 0;

