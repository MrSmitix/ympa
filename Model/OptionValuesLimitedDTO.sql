--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OptionValuesLimitedDTO' definition.
--


--
-- SELECT template for table `OptionValuesLimitedDTO`
--
SELECT `limitingOptionValueId`, `optionValueIds` FROM `OptionValuesLimitedDTO` WHERE 1;

--
-- INSERT template for table `OptionValuesLimitedDTO`
--
INSERT INTO `OptionValuesLimitedDTO`(`limitingOptionValueId`, `optionValueIds`) VALUES (?, ?);

--
-- UPDATE template for table `OptionValuesLimitedDTO`
--
UPDATE `OptionValuesLimitedDTO` SET `limitingOptionValueId` = ?, `optionValueIds` = ? WHERE 1;

--
-- DELETE template for table `OptionValuesLimitedDTO`
--
DELETE FROM `OptionValuesLimitedDTO` WHERE 0;

