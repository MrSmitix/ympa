--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FullOutletDTO' definition.
--


--
-- SELECT template for table `FullOutletDTO`
--
SELECT `name`, `type`, `coords`, `isMain`, `shopOutletCode`, `visibility`, `address`, `phones`, `workingSchedule`, `deliveryRules`, `storagePeriod`, `id`, `status`, `region`, `shopOutletId`, `workingTime`, `moderationReason` FROM `FullOutletDTO` WHERE 1;

--
-- INSERT template for table `FullOutletDTO`
--
INSERT INTO `FullOutletDTO`(`name`, `type`, `coords`, `isMain`, `shopOutletCode`, `visibility`, `address`, `phones`, `workingSchedule`, `deliveryRules`, `storagePeriod`, `id`, `status`, `region`, `shopOutletId`, `workingTime`, `moderationReason`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FullOutletDTO`
--
UPDATE `FullOutletDTO` SET `name` = ?, `type` = ?, `coords` = ?, `isMain` = ?, `shopOutletCode` = ?, `visibility` = ?, `address` = ?, `phones` = ?, `workingSchedule` = ?, `deliveryRules` = ?, `storagePeriod` = ?, `id` = ?, `status` = ?, `region` = ?, `shopOutletId` = ?, `workingTime` = ?, `moderationReason` = ? WHERE 1;

--
-- DELETE template for table `FullOutletDTO`
--
DELETE FROM `FullOutletDTO` WHERE 0;

