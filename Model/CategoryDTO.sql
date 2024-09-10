--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CategoryDTO' definition.
--


--
-- SELECT template for table `CategoryDTO`
--
SELECT `id`, `name`, `children` FROM `CategoryDTO` WHERE 1;

--
-- INSERT template for table `CategoryDTO`
--
INSERT INTO `CategoryDTO`(`id`, `name`, `children`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CategoryDTO`
--
UPDATE `CategoryDTO` SET `id` = ?, `name` = ?, `children` = ? WHERE 1;

--
-- DELETE template for table `CategoryDTO`
--
DELETE FROM `CategoryDTO` WHERE 0;

