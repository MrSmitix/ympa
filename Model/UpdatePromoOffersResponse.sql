--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdatePromoOffersResponse' definition.
--


--
-- SELECT template for table `UpdatePromoOffersResponse`
--
SELECT `status`, `result` FROM `UpdatePromoOffersResponse` WHERE 1;

--
-- INSERT template for table `UpdatePromoOffersResponse`
--
INSERT INTO `UpdatePromoOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `UpdatePromoOffersResponse`
--
UPDATE `UpdatePromoOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `UpdatePromoOffersResponse`
--
DELETE FROM `UpdatePromoOffersResponse` WHERE 0;

