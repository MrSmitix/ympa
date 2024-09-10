--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ValueRestrictionDTO' definition.
--


--
-- SELECT template for table `ValueRestrictionDTO`
--
SELECT `limitingParameterId`, `limitedValues` FROM `ValueRestrictionDTO` WHERE 1;

--
-- INSERT template for table `ValueRestrictionDTO`
--
INSERT INTO `ValueRestrictionDTO`(`limitingParameterId`, `limitedValues`) VALUES (?, ?);

--
-- UPDATE template for table `ValueRestrictionDTO`
--
UPDATE `ValueRestrictionDTO` SET `limitingParameterId` = ?, `limitedValues` = ? WHERE 1;

--
-- DELETE template for table `ValueRestrictionDTO`
--
DELETE FROM `ValueRestrictionDTO` WHERE 0;

