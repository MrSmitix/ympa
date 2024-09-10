--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeletePromoOffersResponse' definition.
--


--
-- SELECT template for table `DeletePromoOffersResponse`
--
SELECT `status`, `result` FROM `DeletePromoOffersResponse` WHERE 1;

--
-- INSERT template for table `DeletePromoOffersResponse`
--
INSERT INTO `DeletePromoOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `DeletePromoOffersResponse`
--
UPDATE `DeletePromoOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `DeletePromoOffersResponse`
--
DELETE FROM `DeletePromoOffersResponse` WHERE 0;

