--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ModelPriceDTO' definition.
--


--
-- SELECT template for table `ModelPriceDTO`
--
SELECT `avg`, `max`, `min` FROM `ModelPriceDTO` WHERE 1;

--
-- INSERT template for table `ModelPriceDTO`
--
INSERT INTO `ModelPriceDTO`(`avg`, `max`, `min`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ModelPriceDTO`
--
UPDATE `ModelPriceDTO` SET `avg` = ?, `max` = ?, `min` = ? WHERE 1;

--
-- DELETE template for table `ModelPriceDTO`
--
DELETE FROM `ModelPriceDTO` WHERE 0;

