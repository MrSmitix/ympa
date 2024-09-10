--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetHiddenOffersResponse' definition.
--


--
-- SELECT template for table `GetHiddenOffersResponse`
--
SELECT `status`, `result` FROM `GetHiddenOffersResponse` WHERE 1;

--
-- INSERT template for table `GetHiddenOffersResponse`
--
INSERT INTO `GetHiddenOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetHiddenOffersResponse`
--
UPDATE `GetHiddenOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetHiddenOffersResponse`
--
DELETE FROM `GetHiddenOffersResponse` WHERE 0;

