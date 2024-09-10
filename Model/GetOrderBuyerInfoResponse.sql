--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOrderBuyerInfoResponse' definition.
--


--
-- SELECT template for table `GetOrderBuyerInfoResponse`
--
SELECT `status`, `result` FROM `GetOrderBuyerInfoResponse` WHERE 1;

--
-- INSERT template for table `GetOrderBuyerInfoResponse`
--
INSERT INTO `GetOrderBuyerInfoResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOrderBuyerInfoResponse`
--
UPDATE `GetOrderBuyerInfoResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOrderBuyerInfoResponse`
--
DELETE FROM `GetOrderBuyerInfoResponse` WHERE 0;

