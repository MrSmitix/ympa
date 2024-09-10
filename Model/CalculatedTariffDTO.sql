--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CalculatedTariffDTO' definition.
--


--
-- SELECT template for table `CalculatedTariffDTO`
--
SELECT `type`, `amount`, `parameters` FROM `CalculatedTariffDTO` WHERE 1;

--
-- INSERT template for table `CalculatedTariffDTO`
--
INSERT INTO `CalculatedTariffDTO`(`type`, `amount`, `parameters`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CalculatedTariffDTO`
--
UPDATE `CalculatedTariffDTO` SET `type` = ?, `amount` = ?, `parameters` = ? WHERE 1;

--
-- DELETE template for table `CalculatedTariffDTO`
--
DELETE FROM `CalculatedTariffDTO` WHERE 0;

