--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CalculateTariffsResponse' definition.
--


--
-- SELECT template for table `CalculateTariffsResponse`
--
SELECT `status`, `result` FROM `CalculateTariffsResponse` WHERE 1;

--
-- INSERT template for table `CalculateTariffsResponse`
--
INSERT INTO `CalculateTariffsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `CalculateTariffsResponse`
--
UPDATE `CalculateTariffsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `CalculateTariffsResponse`
--
DELETE FROM `CalculateTariffsResponse` WHERE 0;

