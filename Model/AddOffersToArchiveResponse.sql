--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'AddOffersToArchiveResponse' definition.
--


--
-- SELECT template for table `AddOffersToArchiveResponse`
--
SELECT `status`, `result` FROM `AddOffersToArchiveResponse` WHERE 1;

--
-- INSERT template for table `AddOffersToArchiveResponse`
--
INSERT INTO `AddOffersToArchiveResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `AddOffersToArchiveResponse`
--
UPDATE `AddOffersToArchiveResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `AddOffersToArchiveResponse`
--
DELETE FROM `AddOffersToArchiveResponse` WHERE 0;

