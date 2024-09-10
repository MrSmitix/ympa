--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CalculateTariffsOfferInfoDTO' definition.
--


--
-- SELECT template for table `CalculateTariffsOfferInfoDTO`
--
SELECT `offer`, `tariffs` FROM `CalculateTariffsOfferInfoDTO` WHERE 1;

--
-- INSERT template for table `CalculateTariffsOfferInfoDTO`
--
INSERT INTO `CalculateTariffsOfferInfoDTO`(`offer`, `tariffs`) VALUES (?, ?);

--
-- UPDATE template for table `CalculateTariffsOfferInfoDTO`
--
UPDATE `CalculateTariffsOfferInfoDTO` SET `offer` = ?, `tariffs` = ? WHERE 1;

--
-- DELETE template for table `CalculateTariffsOfferInfoDTO`
--
DELETE FROM `CalculateTariffsOfferInfoDTO` WHERE 0;

