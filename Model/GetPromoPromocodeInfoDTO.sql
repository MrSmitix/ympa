--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoPromocodeInfoDTO' definition.
--


--
-- SELECT template for table `GetPromoPromocodeInfoDTO`
--
SELECT `promocode`, `discount` FROM `GetPromoPromocodeInfoDTO` WHERE 1;

--
-- INSERT template for table `GetPromoPromocodeInfoDTO`
--
INSERT INTO `GetPromoPromocodeInfoDTO`(`promocode`, `discount`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromoPromocodeInfoDTO`
--
UPDATE `GetPromoPromocodeInfoDTO` SET `promocode` = ?, `discount` = ? WHERE 1;

--
-- DELETE template for table `GetPromoPromocodeInfoDTO`
--
DELETE FROM `GetPromoPromocodeInfoDTO` WHERE 0;

