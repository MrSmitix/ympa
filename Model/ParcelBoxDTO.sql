--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ParcelBoxDTO' definition.
--


--
-- SELECT template for table `ParcelBoxDTO`
--
SELECT `id`, `fulfilmentId` FROM `ParcelBoxDTO` WHERE 1;

--
-- INSERT template for table `ParcelBoxDTO`
--
INSERT INTO `ParcelBoxDTO`(`id`, `fulfilmentId`) VALUES (?, ?);

--
-- UPDATE template for table `ParcelBoxDTO`
--
UPDATE `ParcelBoxDTO` SET `id` = ?, `fulfilmentId` = ? WHERE 1;

--
-- DELETE template for table `ParcelBoxDTO`
--
DELETE FROM `ParcelBoxDTO` WHERE 0;

