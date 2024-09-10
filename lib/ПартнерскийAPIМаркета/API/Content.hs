{-
   Партнерский API Маркета

   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   OpenAPI Version: 3.0.3
   Партнерский API Маркета API version: LATEST
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ПартнерскийAPIМаркета.API.Content
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ПартнерскийAPIМаркета.API.Content where

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


-- ** Content

-- *** getCategoryContentParameters

-- | @POST \/category\/{categoryId}\/parameters@
-- 
-- Списки характеристик товаров по категориям
-- 
-- Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getCategoryContentParameters
  :: CategoryId3 -- ^ "categoryId" -  Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  -> ПартнерскийAPIМаркетаRequest GetCategoryContentParameters MimeNoContent GetCategoryContentParametersResponse MimeJSON
getCategoryContentParameters (CategoryId3 categoryId) =
  _mkRequest "POST" ["/category/",toPath categoryId,"/parameters"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetCategoryContentParameters  
-- | @application/json@
instance Produces GetCategoryContentParameters MimeJSON


-- *** getOfferCardsContentStatus

-- | @POST \/businesses\/{businessId}\/offer-cards@
-- 
-- Получение информации о заполненности карточек магазина
-- 
-- Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getOfferCardsContentStatus
  :: (Consumes GetOfferCardsContentStatus MimeJSON)
  => BusinessId -- ^ "businessId" -  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest GetOfferCardsContentStatus MimeJSON GetOfferCardsContentStatusResponse MimeJSON
getOfferCardsContentStatus (BusinessId businessId) =
  _mkRequest "POST" ["/businesses/",toPath businessId,"/offer-cards"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetOfferCardsContentStatus 
instance HasBodyParam GetOfferCardsContentStatus GetOfferCardsContentStatusRequest 

-- | /Optional Param/ "page_token" - Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
instance HasOptionalParam GetOfferCardsContentStatus PageToken where
  applyOptionalParam req (PageToken xs) =
    req `addQuery` toQuery ("page_token", Just xs)

-- | /Optional Param/ "limit" - Количество значений на одной странице. 
instance HasOptionalParam GetOfferCardsContentStatus Limit where
  applyOptionalParam req (Limit xs) =
    req `addQuery` toQuery ("limit", Just xs)

-- | @application/json@
instance Consumes GetOfferCardsContentStatus MimeJSON

-- | @application/json@
instance Produces GetOfferCardsContentStatus MimeJSON


-- *** updateOfferContent

-- | @POST \/businesses\/{businessId}\/offer-cards\/update@
-- 
-- Редактирование категорийных характеристик товара
-- 
-- Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
updateOfferContent
  :: (Consumes UpdateOfferContent MimeJSON, MimeRender MimeJSON UpdateOfferContentRequest)
  => UpdateOfferContentRequest -- ^ "updateOfferContentRequest"
  -> BusinessId -- ^ "businessId" -  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest UpdateOfferContent MimeJSON UpdateOfferContentResponse MimeJSON
updateOfferContent updateOfferContentRequest (BusinessId businessId) =
  _mkRequest "POST" ["/businesses/",toPath businessId,"/offer-cards/update"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)
    `setBodyParam` updateOfferContentRequest

data UpdateOfferContent 
instance HasBodyParam UpdateOfferContent UpdateOfferContentRequest 

-- | @application/json@
instance Consumes UpdateOfferContent MimeJSON

-- | @application/json@
instance Produces UpdateOfferContent MimeJSON

