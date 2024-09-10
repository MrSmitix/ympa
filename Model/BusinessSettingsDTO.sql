--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BusinessSettingsDTO' definition.
--


--
-- SELECT template for table `BusinessSettingsDTO`
--
SELECT `onlyDefaultPrice`, `currency` FROM `BusinessSettingsDTO` WHERE 1;

--
-- INSERT template for table `BusinessSettingsDTO`
--
INSERT INTO `BusinessSettingsDTO`(`onlyDefaultPrice`, `currency`) VALUES (?, ?);

--
-- UPDATE template for table `BusinessSettingsDTO`
--
UPDATE `BusinessSettingsDTO` SET `onlyDefaultPrice` = ?, `currency` = ? WHERE 1;

--
-- DELETE template for table `BusinessSettingsDTO`
--
DELETE FROM `BusinessSettingsDTO` WHERE 0;

