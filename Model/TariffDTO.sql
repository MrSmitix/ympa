--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'TariffDTO' definition.
--


--
-- SELECT template for table `TariffDTO`
--
SELECT `type`, `percent`, `amount`, `parameters` FROM `TariffDTO` WHERE 1;

--
-- INSERT template for table `TariffDTO`
--
INSERT INTO `TariffDTO`(`type`, `percent`, `amount`, `parameters`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `TariffDTO`
--
UPDATE `TariffDTO` SET `type` = ?, `percent` = ?, `amount` = ?, `parameters` = ? WHERE 1;

--
-- DELETE template for table `TariffDTO`
--
DELETE FROM `TariffDTO` WHERE 0;

