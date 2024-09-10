--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ChangeOutletRequest' definition.
--


--
-- SELECT template for table `ChangeOutletRequest`
--
SELECT `name`, `type`, `coords`, `isMain`, `shopOutletCode`, `visibility`, `address`, `phones`, `workingSchedule`, `deliveryRules`, `storagePeriod` FROM `ChangeOutletRequest` WHERE 1;

--
-- INSERT template for table `ChangeOutletRequest`
--
INSERT INTO `ChangeOutletRequest`(`name`, `type`, `coords`, `isMain`, `shopOutletCode`, `visibility`, `address`, `phones`, `workingSchedule`, `deliveryRules`, `storagePeriod`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ChangeOutletRequest`
--
UPDATE `ChangeOutletRequest` SET `name` = ?, `type` = ?, `coords` = ?, `isMain` = ?, `shopOutletCode` = ?, `visibility` = ?, `address` = ?, `phones` = ?, `workingSchedule` = ?, `deliveryRules` = ?, `storagePeriod` = ? WHERE 1;

--
-- DELETE template for table `ChangeOutletRequest`
--
DELETE FROM `ChangeOutletRequest` WHERE 0;

