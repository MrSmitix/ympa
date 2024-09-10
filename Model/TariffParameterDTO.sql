--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'TariffParameterDTO' definition.
--


--
-- SELECT template for table `TariffParameterDTO`
--
SELECT `name`, `value` FROM `TariffParameterDTO` WHERE 1;

--
-- INSERT template for table `TariffParameterDTO`
--
INSERT INTO `TariffParameterDTO`(`name`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `TariffParameterDTO`
--
UPDATE `TariffParameterDTO` SET `name` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `TariffParameterDTO`
--
DELETE FROM `TariffParameterDTO` WHERE 0;

