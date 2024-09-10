--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderTrackDTO' definition.
--


--
-- SELECT template for table `OrderTrackDTO`
--
SELECT `trackCode`, `deliveryServiceId` FROM `OrderTrackDTO` WHERE 1;

--
-- INSERT template for table `OrderTrackDTO`
--
INSERT INTO `OrderTrackDTO`(`trackCode`, `deliveryServiceId`) VALUES (?, ?);

--
-- UPDATE template for table `OrderTrackDTO`
--
UPDATE `OrderTrackDTO` SET `trackCode` = ?, `deliveryServiceId` = ? WHERE 1;

--
-- DELETE template for table `OrderTrackDTO`
--
DELETE FROM `OrderTrackDTO` WHERE 0;

