--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetAllOffersResponse' definition.
--


--
-- SELECT template for table `GetAllOffersResponse`
--
SELECT `offers` FROM `GetAllOffersResponse` WHERE 1;

--
-- INSERT template for table `GetAllOffersResponse`
--
INSERT INTO `GetAllOffersResponse`(`offers`) VALUES (?);

--
-- UPDATE template for table `GetAllOffersResponse`
--
UPDATE `GetAllOffersResponse` SET `offers` = ? WHERE 1;

--
-- DELETE template for table `GetAllOffersResponse`
--
DELETE FROM `GetAllOffersResponse` WHERE 0;

