--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoBestsellerInfoDTO' definition.
--


--
-- SELECT template for table `GetPromoBestsellerInfoDTO`
--
SELECT `bestseller`, `entryDeadline` FROM `GetPromoBestsellerInfoDTO` WHERE 1;

--
-- INSERT template for table `GetPromoBestsellerInfoDTO`
--
INSERT INTO `GetPromoBestsellerInfoDTO`(`bestseller`, `entryDeadline`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromoBestsellerInfoDTO`
--
UPDATE `GetPromoBestsellerInfoDTO` SET `bestseller` = ?, `entryDeadline` = ? WHERE 1;

--
-- DELETE template for table `GetPromoBestsellerInfoDTO`
--
DELETE FROM `GetPromoBestsellerInfoDTO` WHERE 0;

