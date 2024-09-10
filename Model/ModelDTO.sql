--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ModelDTO' definition.
--


--
-- SELECT template for table `ModelDTO`
--
SELECT `id`, `name`, `prices` FROM `ModelDTO` WHERE 1;

--
-- INSERT template for table `ModelDTO`
--
INSERT INTO `ModelDTO`(`id`, `name`, `prices`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ModelDTO`
--
UPDATE `ModelDTO` SET `id` = ?, `name` = ?, `prices` = ? WHERE 1;

--
-- DELETE template for table `ModelDTO`
--
DELETE FROM `ModelDTO` WHERE 0;

