--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteOffersFromArchiveResponse' definition.
--


--
-- SELECT template for table `DeleteOffersFromArchiveResponse`
--
SELECT `status`, `result` FROM `DeleteOffersFromArchiveResponse` WHERE 1;

--
-- INSERT template for table `DeleteOffersFromArchiveResponse`
--
INSERT INTO `DeleteOffersFromArchiveResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteOffersFromArchiveResponse`
--
UPDATE `DeleteOffersFromArchiveResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `DeleteOffersFromArchiveResponse`
--
DELETE FROM `DeleteOffersFromArchiveResponse` WHERE 0;

