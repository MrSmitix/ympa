--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SearchShipmentsResponse' definition.
--


--
-- SELECT template for table `SearchShipmentsResponse`
--
SELECT `status`, `result` FROM `SearchShipmentsResponse` WHERE 1;

--
-- INSERT template for table `SearchShipmentsResponse`
--
INSERT INTO `SearchShipmentsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `SearchShipmentsResponse`
--
UPDATE `SearchShipmentsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `SearchShipmentsResponse`
--
DELETE FROM `SearchShipmentsResponse` WHERE 0;

