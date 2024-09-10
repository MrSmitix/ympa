{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.DeliveryServices where

import           Import


-- | Справочник служб доставки
--
-- Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
-- operationId: getDeliveryServices
getDeliveryServicesR :: Handler Value
getDeliveryServicesR = notImplemented
