--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOffersResponse' definition.
--


--
-- SELECT template for table `GetOffersResponse`
--
SELECT `offers`, `pager` FROM `GetOffersResponse` WHERE 1;

--
-- INSERT template for table `GetOffersResponse`
--
INSERT INTO `GetOffersResponse`(`offers`, `pager`) VALUES (?, ?);

--
-- UPDATE template for table `GetOffersResponse`
--
UPDATE `GetOffersResponse` SET `offers` = ?, `pager` = ? WHERE 1;

--
-- DELETE template for table `GetOffersResponse`
--
DELETE FROM `GetOffersResponse` WHERE 0;

