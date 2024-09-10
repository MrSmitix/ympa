--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPriceWithVatDTO' definition.
--


--
-- SELECT template for table `GetPriceWithVatDTO`
--
SELECT `value`, `discountBase`, `currencyId`, `vat`, `updatedAt` FROM `GetPriceWithVatDTO` WHERE 1;

--
-- INSERT template for table `GetPriceWithVatDTO`
--
INSERT INTO `GetPriceWithVatDTO`(`value`, `discountBase`, `currencyId`, `vat`, `updatedAt`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetPriceWithVatDTO`
--
UPDATE `GetPriceWithVatDTO` SET `value` = ?, `discountBase` = ?, `currencyId` = ?, `vat` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `GetPriceWithVatDTO`
--
DELETE FROM `GetPriceWithVatDTO` WHERE 0;

