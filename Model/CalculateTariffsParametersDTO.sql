--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CalculateTariffsParametersDTO' definition.
--


--
-- SELECT template for table `CalculateTariffsParametersDTO`
--
SELECT `campaignId`, `sellingProgram`, `frequency` FROM `CalculateTariffsParametersDTO` WHERE 1;

--
-- INSERT template for table `CalculateTariffsParametersDTO`
--
INSERT INTO `CalculateTariffsParametersDTO`(`campaignId`, `sellingProgram`, `frequency`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CalculateTariffsParametersDTO`
--
UPDATE `CalculateTariffsParametersDTO` SET `campaignId` = ?, `sellingProgram` = ?, `frequency` = ? WHERE 1;

--
-- DELETE template for table `CalculateTariffsParametersDTO`
--
DELETE FROM `CalculateTariffsParametersDTO` WHERE 0;

