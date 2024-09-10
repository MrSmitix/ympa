--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetCategoriesResponse' definition.
--


--
-- SELECT template for table `GetCategoriesResponse`
--
SELECT `status`, `result` FROM `GetCategoriesResponse` WHERE 1;

--
-- INSERT template for table `GetCategoriesResponse`
--
INSERT INTO `GetCategoriesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetCategoriesResponse`
--
UPDATE `GetCategoriesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetCategoriesResponse`
--
DELETE FROM `GetCategoriesResponse` WHERE 0;

