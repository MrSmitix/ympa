--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetWarehousesResponse' definition.
--


--
-- SELECT template for table `GetWarehousesResponse`
--
SELECT `status`, `result` FROM `GetWarehousesResponse` WHERE 1;

--
-- INSERT template for table `GetWarehousesResponse`
--
INSERT INTO `GetWarehousesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetWarehousesResponse`
--
UPDATE `GetWarehousesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetWarehousesResponse`
--
DELETE FROM `GetWarehousesResponse` WHERE 0;

