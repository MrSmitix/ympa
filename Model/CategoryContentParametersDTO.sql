--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CategoryContentParametersDTO' definition.
--


--
-- SELECT template for table `CategoryContentParametersDTO`
--
SELECT `categoryId`, `parameters` FROM `CategoryContentParametersDTO` WHERE 1;

--
-- INSERT template for table `CategoryContentParametersDTO`
--
INSERT INTO `CategoryContentParametersDTO`(`categoryId`, `parameters`) VALUES (?, ?);

--
-- UPDATE template for table `CategoryContentParametersDTO`
--
UPDATE `CategoryContentParametersDTO` SET `categoryId` = ?, `parameters` = ? WHERE 1;

--
-- DELETE template for table `CategoryContentParametersDTO`
--
DELETE FROM `CategoryContentParametersDTO` WHERE 0;

