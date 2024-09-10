--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOrderLabelsDataResponse' definition.
--


--
-- SELECT template for table `GetOrderLabelsDataResponse`
--
SELECT `status`, `result` FROM `GetOrderLabelsDataResponse` WHERE 1;

--
-- INSERT template for table `GetOrderLabelsDataResponse`
--
INSERT INTO `GetOrderLabelsDataResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOrderLabelsDataResponse`
--
UPDATE `GetOrderLabelsDataResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOrderLabelsDataResponse`
--
DELETE FROM `GetOrderLabelsDataResponse` WHERE 0;

