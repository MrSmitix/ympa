--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteOffersResponse' definition.
--


--
-- SELECT template for table `DeleteOffersResponse`
--
SELECT `status`, `result` FROM `DeleteOffersResponse` WHERE 1;

--
-- INSERT template for table `DeleteOffersResponse`
--
INSERT INTO `DeleteOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteOffersResponse`
--
UPDATE `DeleteOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `DeleteOffersResponse`
--
DELETE FROM `DeleteOffersResponse` WHERE 0;

