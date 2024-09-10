--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BusinessDTO' definition.
--


--
-- SELECT template for table `BusinessDTO`
--
SELECT `id`, `name` FROM `BusinessDTO` WHERE 1;

--
-- INSERT template for table `BusinessDTO`
--
INSERT INTO `BusinessDTO`(`id`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `BusinessDTO`
--
UPDATE `BusinessDTO` SET `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `BusinessDTO`
--
DELETE FROM `BusinessDTO` WHERE 0;

