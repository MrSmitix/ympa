--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferSellingProgramDTO' definition.
--


--
-- SELECT template for table `OfferSellingProgramDTO`
--
SELECT `sellingProgram`, `status` FROM `OfferSellingProgramDTO` WHERE 1;

--
-- INSERT template for table `OfferSellingProgramDTO`
--
INSERT INTO `OfferSellingProgramDTO`(`sellingProgram`, `status`) VALUES (?, ?);

--
-- UPDATE template for table `OfferSellingProgramDTO`
--
UPDATE `OfferSellingProgramDTO` SET `sellingProgram` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `OfferSellingProgramDTO`
--
DELETE FROM `OfferSellingProgramDTO` WHERE 0;

