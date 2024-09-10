--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetCategoriesMaxSaleQuantumResponse' definition.
--


--
-- SELECT template for table `GetCategoriesMaxSaleQuantumResponse`
--
SELECT `status`, `results`, `errors` FROM `GetCategoriesMaxSaleQuantumResponse` WHERE 1;

--
-- INSERT template for table `GetCategoriesMaxSaleQuantumResponse`
--
INSERT INTO `GetCategoriesMaxSaleQuantumResponse`(`status`, `results`, `errors`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetCategoriesMaxSaleQuantumResponse`
--
UPDATE `GetCategoriesMaxSaleQuantumResponse` SET `status` = ?, `results` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `GetCategoriesMaxSaleQuantumResponse`
--
DELETE FROM `GetCategoriesMaxSaleQuantumResponse` WHERE 0;

