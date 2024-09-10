--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CalculateTariffsRequest' definition.
--


--
-- SELECT template for table `CalculateTariffsRequest`
--
SELECT `parameters`, `offers` FROM `CalculateTariffsRequest` WHERE 1;

--
-- INSERT template for table `CalculateTariffsRequest`
--
INSERT INTO `CalculateTariffsRequest`(`parameters`, `offers`) VALUES (?, ?);

--
-- UPDATE template for table `CalculateTariffsRequest`
--
UPDATE `CalculateTariffsRequest` SET `parameters` = ?, `offers` = ? WHERE 1;

--
-- DELETE template for table `CalculateTariffsRequest`
--
DELETE FROM `CalculateTariffsRequest` WHERE 0;

