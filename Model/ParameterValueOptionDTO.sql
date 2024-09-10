--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ParameterValueOptionDTO' definition.
--


--
-- SELECT template for table `ParameterValueOptionDTO`
--
SELECT `id`, `value`, `description` FROM `ParameterValueOptionDTO` WHERE 1;

--
-- INSERT template for table `ParameterValueOptionDTO`
--
INSERT INTO `ParameterValueOptionDTO`(`id`, `value`, `description`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ParameterValueOptionDTO`
--
UPDATE `ParameterValueOptionDTO` SET `id` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `ParameterValueOptionDTO`
--
DELETE FROM `ParameterValueOptionDTO` WHERE 0;

