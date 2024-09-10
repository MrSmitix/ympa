--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CategoryParameterUnitDTO' definition.
--


--
-- SELECT template for table `CategoryParameterUnitDTO`
--
SELECT `defaultUnitId`, `units` FROM `CategoryParameterUnitDTO` WHERE 1;

--
-- INSERT template for table `CategoryParameterUnitDTO`
--
INSERT INTO `CategoryParameterUnitDTO`(`defaultUnitId`, `units`) VALUES (?, ?);

--
-- UPDATE template for table `CategoryParameterUnitDTO`
--
UPDATE `CategoryParameterUnitDTO` SET `defaultUnitId` = ?, `units` = ? WHERE 1;

--
-- DELETE template for table `CategoryParameterUnitDTO`
--
DELETE FROM `CategoryParameterUnitDTO` WHERE 0;

