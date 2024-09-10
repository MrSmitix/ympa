--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PriceQuarantineVerdictParameterDTO' definition.
--


--
-- SELECT template for table `PriceQuarantineVerdictParameterDTO`
--
SELECT `name`, `value` FROM `PriceQuarantineVerdictParameterDTO` WHERE 1;

--
-- INSERT template for table `PriceQuarantineVerdictParameterDTO`
--
INSERT INTO `PriceQuarantineVerdictParameterDTO`(`name`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `PriceQuarantineVerdictParameterDTO`
--
UPDATE `PriceQuarantineVerdictParameterDTO` SET `name` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `PriceQuarantineVerdictParameterDTO`
--
DELETE FROM `PriceQuarantineVerdictParameterDTO` WHERE 0;

