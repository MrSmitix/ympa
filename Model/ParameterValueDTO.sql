--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ParameterValueDTO' definition.
--


--
-- SELECT template for table `ParameterValueDTO`
--
SELECT `parameterId`, `unitId`, `valueId`, `value` FROM `ParameterValueDTO` WHERE 1;

--
-- INSERT template for table `ParameterValueDTO`
--
INSERT INTO `ParameterValueDTO`(`parameterId`, `unitId`, `valueId`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ParameterValueDTO`
--
UPDATE `ParameterValueDTO` SET `parameterId` = ?, `unitId` = ?, `valueId` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `ParameterValueDTO`
--
DELETE FROM `ParameterValueDTO` WHERE 0;

