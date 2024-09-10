--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ParameterValueConstraintsDTO' definition.
--


--
-- SELECT template for table `ParameterValueConstraintsDTO`
--
SELECT `minValue`, `maxValue`, `maxLength` FROM `ParameterValueConstraintsDTO` WHERE 1;

--
-- INSERT template for table `ParameterValueConstraintsDTO`
--
INSERT INTO `ParameterValueConstraintsDTO`(`minValue`, `maxValue`, `maxLength`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ParameterValueConstraintsDTO`
--
UPDATE `ParameterValueConstraintsDTO` SET `minValue` = ?, `maxValue` = ?, `maxLength` = ? WHERE 1;

--
-- DELETE template for table `ParameterValueConstraintsDTO`
--
DELETE FROM `ParameterValueConstraintsDTO` WHERE 0;

