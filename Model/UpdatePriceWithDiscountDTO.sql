--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdatePriceWithDiscountDTO' definition.
--


--
-- SELECT template for table `UpdatePriceWithDiscountDTO`
--
SELECT `value`, `currencyId`, `discountBase` FROM `UpdatePriceWithDiscountDTO` WHERE 1;

--
-- INSERT template for table `UpdatePriceWithDiscountDTO`
--
INSERT INTO `UpdatePriceWithDiscountDTO`(`value`, `currencyId`, `discountBase`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdatePriceWithDiscountDTO`
--
UPDATE `UpdatePriceWithDiscountDTO` SET `value` = ?, `currencyId` = ?, `discountBase` = ? WHERE 1;

--
-- DELETE template for table `UpdatePriceWithDiscountDTO`
--
DELETE FROM `UpdatePriceWithDiscountDTO` WHERE 0;

