{-
   Партнерский API Маркета

   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   OpenAPI Version: 3.0.3
   Партнерский API Маркета API version: LATEST
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ПартнерскийAPIМаркета.API.Returns
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ПартнерскийAPIМаркета.API.Returns where

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


-- ** Returns

-- *** getReturn

-- | @GET \/campaigns\/{campaignId}\/orders\/{orderId}\/returns\/{returnId}@
-- 
-- Информация о невыкупе или возврате
-- 
-- Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getReturn
  :: CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> OrderId -- ^ "orderId" -  Идентификатор заказа.
  -> ReturnId -- ^ "returnId" -  Идентификатор возврата.
  -> ПартнерскийAPIМаркетаRequest GetReturn MimeNoContent GetReturnResponse MimeJSON
getReturn (CampaignId campaignId) (OrderId orderId) (ReturnId returnId) =
  _mkRequest "GET" ["/campaigns/",toPath campaignId,"/orders/",toPath orderId,"/returns/",toPath returnId]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetReturn  
-- | @application/json@
instance Produces GetReturn MimeJSON


-- *** getReturnApplication

-- | @GET \/campaigns\/{campaignId}\/orders\/{orderId}\/returns\/{returnId}\/application@
-- 
-- Получение заявления на возврат
-- 
-- Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getReturnApplication
  :: Accept accept -- ^ request accept ('MimeType')
  -> CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> OrderId -- ^ "orderId" -  Идентификатор заказа.
  -> ReturnId -- ^ "returnId" -  Идентификатор возврата.
  -> ПартнерскийAPIМаркетаRequest GetReturnApplication MimeNoContent FilePath accept
getReturnApplication  _ (CampaignId campaignId) (OrderId orderId) (ReturnId returnId) =
  _mkRequest "GET" ["/campaigns/",toPath campaignId,"/orders/",toPath orderId,"/returns/",toPath returnId,"/application"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetReturnApplication  
-- | @application/octet-stream@
instance Produces GetReturnApplication MimeOctetStream
-- | @application/json@
instance Produces GetReturnApplication MimeJSON


-- *** getReturnPhoto

-- | @GET \/campaigns\/{campaignId}\/orders\/{orderId}\/returns\/{returnId}\/decision\/{itemId}\/image\/{imageHash}@
-- 
-- Получение фотографии возврата
-- 
-- Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getReturnPhoto
  :: Accept accept -- ^ request accept ('MimeType')
  -> CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> OrderId -- ^ "orderId" -  Идентификатор заказа.
  -> ReturnId -- ^ "returnId" -  Идентификатор возврата.
  -> ItemId -- ^ "itemId" -  Идентификатор товара в возврате.
  -> ImageHash -- ^ "imageHash" -  Хеш ссылки изображения для загрузки.
  -> ПартнерскийAPIМаркетаRequest GetReturnPhoto MimeNoContent FilePath accept
getReturnPhoto  _ (CampaignId campaignId) (OrderId orderId) (ReturnId returnId) (ItemId itemId) (ImageHash imageHash) =
  _mkRequest "GET" ["/campaigns/",toPath campaignId,"/orders/",toPath orderId,"/returns/",toPath returnId,"/decision/",toPath itemId,"/image/",toPath imageHash]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetReturnPhoto  
-- | @application/octet-stream@
instance Produces GetReturnPhoto MimeOctetStream
-- | @application/json@
instance Produces GetReturnPhoto MimeJSON


-- *** getReturns

-- | @GET \/campaigns\/{campaignId}\/returns@
-- 
-- Список невыкупов и возвратов
-- 
-- Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getReturns
  :: CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest GetReturns MimeNoContent GetReturnsResponse MimeJSON
getReturns (CampaignId campaignId) =
  _mkRequest "GET" ["/campaigns/",toPath campaignId,"/returns"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetReturns  

-- | /Optional Param/ "page_token" - Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
instance HasOptionalParam GetReturns PageToken where
  applyOptionalParam req (PageToken xs) =
    req `addQuery` toQuery ("page_token", Just xs)

-- | /Optional Param/ "limit" - Количество значений на одной странице. 
instance HasOptionalParam GetReturns Limit where
  applyOptionalParam req (Limit xs) =
    req `addQuery` toQuery ("limit", Just xs)

-- | /Optional Param/ "orderIds" - Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
instance HasOptionalParam GetReturns OrderIds where
  applyOptionalParam req (OrderIds xs) =
    req `addQuery` toQueryColl CommaSeparated ("orderIds", Just xs)

-- | /Optional Param/ "statuses" - Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
instance HasOptionalParam GetReturns Statuses where
  applyOptionalParam req (Statuses xs) =
    req `addQuery` toQueryColl CommaSeparated ("statuses", Just xs)

-- | /Optional Param/ "type" - Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
instance HasOptionalParam GetReturns ParamType where
  applyOptionalParam req (ParamType xs) =
    req `addQuery` toQuery ("type", Just xs)

-- | /Optional Param/ "fromDate" - Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
instance HasOptionalParam GetReturns FromDate where
  applyOptionalParam req (FromDate xs) =
    req `addQuery` toQuery ("fromDate", Just xs)

-- | /Optional Param/ "toDate" - Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
instance HasOptionalParam GetReturns ToDate where
  applyOptionalParam req (ToDate xs) =
    req `addQuery` toQuery ("toDate", Just xs)

-- | /Optional Param/ "from_date" - {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
instance HasOptionalParam GetReturns FromDate2 where
  applyOptionalParam req (FromDate2 xs) =
    req `addQuery` toQuery ("from_date", Just xs)

-- | /Optional Param/ "to_date" - {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
instance HasOptionalParam GetReturns ToDate2 where
  applyOptionalParam req (ToDate2 xs) =
    req `addQuery` toQuery ("to_date", Just xs)
-- | @application/json@
instance Produces GetReturns MimeJSON


-- *** setReturnDecision

-- | @POST \/campaigns\/{campaignId}\/orders\/{orderId}\/returns\/{returnId}\/decision@
-- 
-- Принятие или изменение решения по возврату
-- 
-- Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
setReturnDecision
  :: (Consumes SetReturnDecision MimeJSON, MimeRender MimeJSON SetReturnDecisionRequest)
  => SetReturnDecisionRequest -- ^ "setReturnDecisionRequest"
  -> CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> OrderId -- ^ "orderId" -  Идентификатор заказа.
  -> ReturnId -- ^ "returnId" -  Идентификатор возврата.
  -> ПартнерскийAPIМаркетаRequest SetReturnDecision MimeJSON EmptyApiResponse MimeJSON
setReturnDecision setReturnDecisionRequest (CampaignId campaignId) (OrderId orderId) (ReturnId returnId) =
  _mkRequest "POST" ["/campaigns/",toPath campaignId,"/orders/",toPath orderId,"/returns/",toPath returnId,"/decision"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)
    `setBodyParam` setReturnDecisionRequest

data SetReturnDecision 
instance HasBodyParam SetReturnDecision SetReturnDecisionRequest 

-- | @application/json@
instance Consumes SetReturnDecision MimeJSON

-- | @application/json@
instance Produces SetReturnDecision MimeJSON


-- *** submitReturnDecision

-- | @POST \/campaigns\/{campaignId}\/orders\/{orderId}\/returns\/{returnId}\/decision\/submit@
-- 
-- Подтверждение решения по возврату
-- 
-- Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
submitReturnDecision
  :: CampaignId -- ^ "campaignId" -  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> OrderId -- ^ "orderId" -  Идентификатор заказа.
  -> ReturnId -- ^ "returnId" -  Идентификатор возврата.
  -> ПартнерскийAPIМаркетаRequest SubmitReturnDecision MimeNoContent EmptyApiResponse MimeJSON
submitReturnDecision (CampaignId campaignId) (OrderId orderId) (ReturnId returnId) =
  _mkRequest "POST" ["/campaigns/",toPath campaignId,"/orders/",toPath orderId,"/returns/",toPath returnId,"/decision/submit"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data SubmitReturnDecision  
-- | @application/json@
instance Produces SubmitReturnDecision MimeJSON

