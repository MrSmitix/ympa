--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OutletDeliveryRuleDTO' definition.
--


--
-- SELECT template for table `OutletDeliveryRuleDTO`
--
SELECT `minDeliveryDays`, `maxDeliveryDays`, `deliveryServiceId`, `orderBefore`, `priceFreePickup`, `unspecifiedDeliveryInterval` FROM `OutletDeliveryRuleDTO` WHERE 1;

--
-- INSERT template for table `OutletDeliveryRuleDTO`
--
INSERT INTO `OutletDeliveryRuleDTO`(`minDeliveryDays`, `maxDeliveryDays`, `deliveryServiceId`, `orderBefore`, `priceFreePickup`, `unspecifiedDeliveryInterval`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OutletDeliveryRuleDTO`
--
UPDATE `OutletDeliveryRuleDTO` SET `minDeliveryDays` = ?, `maxDeliveryDays` = ?, `deliveryServiceId` = ?, `orderBefore` = ?, `priceFreePickup` = ?, `unspecifiedDeliveryInterval` = ? WHERE 1;

--
-- DELETE template for table `OutletDeliveryRuleDTO`
--
DELETE FROM `OutletDeliveryRuleDTO` WHERE 0;

