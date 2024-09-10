--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBidsInfoResponseDTO' definition.
--


--
-- SELECT template for table `GetBidsInfoResponseDTO`
--
SELECT `bids`, `paging` FROM `GetBidsInfoResponseDTO` WHERE 1;

--
-- INSERT template for table `GetBidsInfoResponseDTO`
--
INSERT INTO `GetBidsInfoResponseDTO`(`bids`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `GetBidsInfoResponseDTO`
--
UPDATE `GetBidsInfoResponseDTO` SET `bids` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `GetBidsInfoResponseDTO`
--
DELETE FROM `GetBidsInfoResponseDTO` WHERE 0;

