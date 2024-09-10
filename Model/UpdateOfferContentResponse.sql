--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferContentResponse' definition.
--


--
-- SELECT template for table `UpdateOfferContentResponse`
--
SELECT `status`, `results` FROM `UpdateOfferContentResponse` WHERE 1;

--
-- INSERT template for table `UpdateOfferContentResponse`
--
INSERT INTO `UpdateOfferContentResponse`(`status`, `results`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateOfferContentResponse`
--
UPDATE `UpdateOfferContentResponse` SET `status` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferContentResponse`
--
DELETE FROM `UpdateOfferContentResponse` WHERE 0;

