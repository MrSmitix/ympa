--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SetOrderDeliveryTrackCodeRequest' definition.
--


--
-- SELECT template for table `SetOrderDeliveryTrackCodeRequest`
--
SELECT `trackCode`, `deliveryServiceId` FROM `SetOrderDeliveryTrackCodeRequest` WHERE 1;

--
-- INSERT template for table `SetOrderDeliveryTrackCodeRequest`
--
INSERT INTO `SetOrderDeliveryTrackCodeRequest`(`trackCode`, `deliveryServiceId`) VALUES (?, ?);

--
-- UPDATE template for table `SetOrderDeliveryTrackCodeRequest`
--
UPDATE `SetOrderDeliveryTrackCodeRequest` SET `trackCode` = ?, `deliveryServiceId` = ? WHERE 1;

--
-- DELETE template for table `SetOrderDeliveryTrackCodeRequest`
--
DELETE FROM `SetOrderDeliveryTrackCodeRequest` WHERE 0;

