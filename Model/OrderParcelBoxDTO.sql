--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderParcelBoxDTO' definition.
--


--
-- SELECT template for table `OrderParcelBoxDTO`
--
SELECT `id`, `fulfilmentId` FROM `OrderParcelBoxDTO` WHERE 1;

--
-- INSERT template for table `OrderParcelBoxDTO`
--
INSERT INTO `OrderParcelBoxDTO`(`id`, `fulfilmentId`) VALUES (?, ?);

--
-- UPDATE template for table `OrderParcelBoxDTO`
--
UPDATE `OrderParcelBoxDTO` SET `id` = ?, `fulfilmentId` = ? WHERE 1;

--
-- DELETE template for table `OrderParcelBoxDTO`
--
DELETE FROM `OrderParcelBoxDTO` WHERE 0;

