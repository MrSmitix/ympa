--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferCardsContentStatusResponse' definition.
--


--
-- SELECT template for table `GetOfferCardsContentStatusResponse`
--
SELECT `status`, `result` FROM `GetOfferCardsContentStatusResponse` WHERE 1;

--
-- INSERT template for table `GetOfferCardsContentStatusResponse`
--
INSERT INTO `GetOfferCardsContentStatusResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOfferCardsContentStatusResponse`
--
UPDATE `GetOfferCardsContentStatusResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOfferCardsContentStatusResponse`
--
DELETE FROM `GetOfferCardsContentStatusResponse` WHERE 0;

