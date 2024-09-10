--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OutletDTO' definition.
--


--
-- SELECT template for table `OutletDTO`
--
SELECT `name`, `type`, `coords`, `isMain`, `shopOutletCode`, `visibility`, `address`, `phones`, `workingSchedule`, `deliveryRules`, `storagePeriod` FROM `OutletDTO` WHERE 1;

--
-- INSERT template for table `OutletDTO`
--
INSERT INTO `OutletDTO`(`name`, `type`, `coords`, `isMain`, `shopOutletCode`, `visibility`, `address`, `phones`, `workingSchedule`, `deliveryRules`, `storagePeriod`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OutletDTO`
--
UPDATE `OutletDTO` SET `name` = ?, `type` = ?, `coords` = ?, `isMain` = ?, `shopOutletCode` = ?, `visibility` = ?, `address` = ?, `phones` = ?, `workingSchedule` = ?, `deliveryRules` = ?, `storagePeriod` = ? WHERE 1;

--
-- DELETE template for table `OutletDTO`
--
DELETE FROM `OutletDTO` WHERE 0;

