--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPriceWithDiscountDTO' definition.
--


--
-- SELECT template for table `GetPriceWithDiscountDTO`
--
SELECT `value`, `currencyId`, `discountBase`, `updatedAt` FROM `GetPriceWithDiscountDTO` WHERE 1;

--
-- INSERT template for table `GetPriceWithDiscountDTO`
--
INSERT INTO `GetPriceWithDiscountDTO`(`value`, `currencyId`, `discountBase`, `updatedAt`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GetPriceWithDiscountDTO`
--
UPDATE `GetPriceWithDiscountDTO` SET `value` = ?, `currencyId` = ?, `discountBase` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `GetPriceWithDiscountDTO`
--
DELETE FROM `GetPriceWithDiscountDTO` WHERE 0;

