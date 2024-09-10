--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CalculateTariffsOfferDTO' definition.
--


--
-- SELECT template for table `CalculateTariffsOfferDTO`
--
SELECT `categoryId`, `price`, `length`, `width`, `height`, `weight`, `quantity` FROM `CalculateTariffsOfferDTO` WHERE 1;

--
-- INSERT template for table `CalculateTariffsOfferDTO`
--
INSERT INTO `CalculateTariffsOfferDTO`(`categoryId`, `price`, `length`, `width`, `height`, `weight`, `quantity`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CalculateTariffsOfferDTO`
--
UPDATE `CalculateTariffsOfferDTO` SET `categoryId` = ?, `price` = ?, `length` = ?, `width` = ?, `height` = ?, `weight` = ?, `quantity` = ? WHERE 1;

--
-- DELETE template for table `CalculateTariffsOfferDTO`
--
DELETE FROM `CalculateTariffsOfferDTO` WHERE 0;

