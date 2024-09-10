--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoMechanicsInfoDTO' definition.
--


--
-- SELECT template for table `GetPromoMechanicsInfoDTO`
--
SELECT `type`, `promocodeInfo` FROM `GetPromoMechanicsInfoDTO` WHERE 1;

--
-- INSERT template for table `GetPromoMechanicsInfoDTO`
--
INSERT INTO `GetPromoMechanicsInfoDTO`(`type`, `promocodeInfo`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromoMechanicsInfoDTO`
--
UPDATE `GetPromoMechanicsInfoDTO` SET `type` = ?, `promocodeInfo` = ? WHERE 1;

--
-- DELETE template for table `GetPromoMechanicsInfoDTO`
--
DELETE FROM `GetPromoMechanicsInfoDTO` WHERE 0;

