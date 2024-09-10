--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PromoOfferUpdateWarningDTO' definition.
--


--
-- SELECT template for table `PromoOfferUpdateWarningDTO`
--
SELECT `code`, `campaignIds` FROM `PromoOfferUpdateWarningDTO` WHERE 1;

--
-- INSERT template for table `PromoOfferUpdateWarningDTO`
--
INSERT INTO `PromoOfferUpdateWarningDTO`(`code`, `campaignIds`) VALUES (?, ?);

--
-- UPDATE template for table `PromoOfferUpdateWarningDTO`
--
UPDATE `PromoOfferUpdateWarningDTO` SET `code` = ?, `campaignIds` = ? WHERE 1;

--
-- DELETE template for table `PromoOfferUpdateWarningDTO`
--
DELETE FROM `PromoOfferUpdateWarningDTO` WHERE 0;

