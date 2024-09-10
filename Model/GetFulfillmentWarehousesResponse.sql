--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetFulfillmentWarehousesResponse' definition.
--


--
-- SELECT template for table `GetFulfillmentWarehousesResponse`
--
SELECT `status`, `result` FROM `GetFulfillmentWarehousesResponse` WHERE 1;

--
-- INSERT template for table `GetFulfillmentWarehousesResponse`
--
INSERT INTO `GetFulfillmentWarehousesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetFulfillmentWarehousesResponse`
--
UPDATE `GetFulfillmentWarehousesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetFulfillmentWarehousesResponse`
--
DELETE FROM `GetFulfillmentWarehousesResponse` WHERE 0;

