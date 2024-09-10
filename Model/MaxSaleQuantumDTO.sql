--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'MaxSaleQuantumDTO' definition.
--


--
-- SELECT template for table `MaxSaleQuantumDTO`
--
SELECT `id`, `name`, `maxSaleQuantum` FROM `MaxSaleQuantumDTO` WHERE 1;

--
-- INSERT template for table `MaxSaleQuantumDTO`
--
INSERT INTO `MaxSaleQuantumDTO`(`id`, `name`, `maxSaleQuantum`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MaxSaleQuantumDTO`
--
UPDATE `MaxSaleQuantumDTO` SET `id` = ?, `name` = ?, `maxSaleQuantum` = ? WHERE 1;

--
-- DELETE template for table `MaxSaleQuantumDTO`
--
DELETE FROM `MaxSaleQuantumDTO` WHERE 0;

