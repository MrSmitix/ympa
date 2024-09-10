--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoOffersResponse' definition.
--


--
-- SELECT template for table `GetPromoOffersResponse`
--
SELECT `status`, `result` FROM `GetPromoOffersResponse` WHERE 1;

--
-- INSERT template for table `GetPromoOffersResponse`
--
INSERT INTO `GetPromoOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromoOffersResponse`
--
UPDATE `GetPromoOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetPromoOffersResponse`
--
DELETE FROM `GetPromoOffersResponse` WHERE 0;

