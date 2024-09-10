--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferCardsContentStatusRequest' definition.
--


--
-- SELECT template for table `GetOfferCardsContentStatusRequest`
--
SELECT `offerIds`, `cardStatuses`, `categoryIds` FROM `GetOfferCardsContentStatusRequest` WHERE 1;

--
-- INSERT template for table `GetOfferCardsContentStatusRequest`
--
INSERT INTO `GetOfferCardsContentStatusRequest`(`offerIds`, `cardStatuses`, `categoryIds`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetOfferCardsContentStatusRequest`
--
UPDATE `GetOfferCardsContentStatusRequest` SET `offerIds` = ?, `cardStatuses` = ?, `categoryIds` = ? WHERE 1;

--
-- DELETE template for table `GetOfferCardsContentStatusRequest`
--
DELETE FROM `GetOfferCardsContentStatusRequest` WHERE 0;

