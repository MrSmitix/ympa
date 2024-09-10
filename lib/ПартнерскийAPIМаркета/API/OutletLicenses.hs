{-
   Партнерский API Маркета

   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   OpenAPI Version: 3.0.3
   Партнерский API Маркета API version: LATEST
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ПартнерскийAPIМаркета.API.OutletLicenses
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ПартнерскийAPIМаркета.API.OutletLicenses where

import ПартнерскийAPIМаркета.Core
import ПартнерскийAPIМаркета.MimeTypes
import ПартнерскийAPIМаркета.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** OutletLicenses

-- *** deleteOutletLicenses

-- | @DELETE \/campaigns\/{campaignId}\/outlets\/licenses@
-- 
-- Удаление лицензий для точек продаж
-- 
-- Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
deleteOutletLicenses
  :: CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest DeleteOutletLicenses MimeNoContent EmptyApiResponse MimeJSON
deleteOutletLicenses (CampaignId campaignId) =
  _mkRequest "DELETE" ["/campaigns/",toPath campaignId,"/outlets/licenses"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data DeleteOutletLicenses  

-- | /Optional Param/ "ids" - Список идентификаторов лицензий.
instance HasOptionalParam DeleteOutletLicenses Ids where
  applyOptionalParam req (Ids xs) =
    req `addQuery` toQueryColl CommaSeparated ("ids", Just xs)
-- | @application/json@
instance Produces DeleteOutletLicenses MimeJSON


-- *** getOutletLicenses

-- | @GET \/campaigns\/{campaignId}\/outlets\/licenses@
-- 
-- Информация о лицензиях для точек продаж
-- 
-- Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getOutletLicenses
  :: CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest GetOutletLicenses MimeNoContent GetOutletLicensesResponse MimeJSON
getOutletLicenses (CampaignId campaignId) =
  _mkRequest "GET" ["/campaigns/",toPath campaignId,"/outlets/licenses"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetOutletLicenses  

-- | /Optional Param/ "outletIds" - Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр `outletIds`, либо параметр `ids`. Запрос с обоими параметрами или без них приведет к ошибке. 
instance HasOptionalParam GetOutletLicenses OutletIds where
  applyOptionalParam req (OutletIds xs) =
    req `addQuery` toQueryColl CommaSeparated ("outletIds", Just xs)

-- | /Optional Param/ "ids" - Список идентификаторов лицензий.
instance HasOptionalParam GetOutletLicenses Ids where
  applyOptionalParam req (Ids xs) =
    req `addQuery` toQueryColl CommaSeparated ("ids", Just xs)
-- | @application/json@
instance Produces GetOutletLicenses MimeJSON


-- *** updateOutletLicenses

-- | @POST \/campaigns\/{campaignId}\/outlets\/licenses@
-- 
-- Создание и изменение лицензий для точек продаж
-- 
-- Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
updateOutletLicenses
  :: (Consumes UpdateOutletLicenses MimeJSON, MimeRender MimeJSON UpdateOutletLicenseRequest)
  => UpdateOutletLicenseRequest -- ^ "updateOutletLicenseRequest"
  -> CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest UpdateOutletLicenses MimeJSON EmptyApiResponse MimeJSON
updateOutletLicenses updateOutletLicenseRequest (CampaignId campaignId) =
  _mkRequest "POST" ["/campaigns/",toPath campaignId,"/outlets/licenses"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)
    `setBodyParam` updateOutletLicenseRequest

data UpdateOutletLicenses 
instance HasBodyParam UpdateOutletLicenses UpdateOutletLicenseRequest 

-- | @application/json@
instance Consumes UpdateOutletLicenses MimeJSON

-- | @application/json@
instance Produces UpdateOutletLicenses MimeJSON

