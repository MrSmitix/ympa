--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferCardsContentStatusDTO' definition.
--


--
-- SELECT template for table `OfferCardsContentStatusDTO`
--
SELECT `offerCards`, `paging` FROM `OfferCardsContentStatusDTO` WHERE 1;

--
-- INSERT template for table `OfferCardsContentStatusDTO`
--
INSERT INTO `OfferCardsContentStatusDTO`(`offerCards`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `OfferCardsContentStatusDTO`
--
UPDATE `OfferCardsContentStatusDTO` SET `offerCards` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `OfferCardsContentStatusDTO`
--
DELETE FROM `OfferCardsContentStatusDTO` WHERE 0;

