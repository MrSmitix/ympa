--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CategoryParameterDTO' definition.
--


--
-- SELECT template for table `CategoryParameterDTO`
--
SELECT `id`, `name`, `type`, `unit`, `description`, `recommendationTypes`, `required`, `filtering`, `distinctive`, `multivalue`, `allowCustomValues`, `values`, `constraints`, `valueRestrictions` FROM `CategoryParameterDTO` WHERE 1;

--
-- INSERT template for table `CategoryParameterDTO`
--
INSERT INTO `CategoryParameterDTO`(`id`, `name`, `type`, `unit`, `description`, `recommendationTypes`, `required`, `filtering`, `distinctive`, `multivalue`, `allowCustomValues`, `values`, `constraints`, `valueRestrictions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CategoryParameterDTO`
--
UPDATE `CategoryParameterDTO` SET `id` = ?, `name` = ?, `type` = ?, `unit` = ?, `description` = ?, `recommendationTypes` = ?, `required` = ?, `filtering` = ?, `distinctive` = ?, `multivalue` = ?, `allowCustomValues` = ?, `values` = ?, `constraints` = ?, `valueRestrictions` = ? WHERE 1;

--
-- DELETE template for table `CategoryParameterDTO`
--
DELETE FROM `CategoryParameterDTO` WHERE 0;

