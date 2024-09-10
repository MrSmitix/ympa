--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoDTO' definition.
--


--
-- SELECT template for table `GetPromoDTO`
--
SELECT `id`, `name`, `period`, `participating`, `assortmentInfo`, `mechanicsInfo`, `bestsellerInfo`, `channels`, `constraints` FROM `GetPromoDTO` WHERE 1;

--
-- INSERT template for table `GetPromoDTO`
--
INSERT INTO `GetPromoDTO`(`id`, `name`, `period`, `participating`, `assortmentInfo`, `mechanicsInfo`, `bestsellerInfo`, `channels`, `constraints`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetPromoDTO`
--
UPDATE `GetPromoDTO` SET `id` = ?, `name` = ?, `period` = ?, `participating` = ?, `assortmentInfo` = ?, `mechanicsInfo` = ?, `bestsellerInfo` = ?, `channels` = ?, `constraints` = ? WHERE 1;

--
-- DELETE template for table `GetPromoDTO`
--
DELETE FROM `GetPromoDTO` WHERE 0;

