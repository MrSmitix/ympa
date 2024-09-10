--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'QuantumDTO' definition.
--


--
-- SELECT template for table `QuantumDTO`
--
SELECT `minQuantity`, `stepQuantity` FROM `QuantumDTO` WHERE 1;

--
-- INSERT template for table `QuantumDTO`
--
INSERT INTO `QuantumDTO`(`minQuantity`, `stepQuantity`) VALUES (?, ?);

--
-- UPDATE template for table `QuantumDTO`
--
UPDATE `QuantumDTO` SET `minQuantity` = ?, `stepQuantity` = ? WHERE 1;

--
-- DELETE template for table `QuantumDTO`
--
DELETE FROM `QuantumDTO` WHERE 0;

