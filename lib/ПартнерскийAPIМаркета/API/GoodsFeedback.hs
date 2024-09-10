{-
   Партнерский API Маркета

   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   OpenAPI Version: 3.0.3
   Партнерский API Маркета API version: LATEST
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ПартнерскийAPIМаркета.API.GoodsFeedback
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ПартнерскийAPIМаркета.API.GoodsFeedback where

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


-- ** GoodsFeedback

-- *** deleteGoodsFeedbackComment

-- | @POST \/businesses\/{businessId}\/goods-feedback\/comments\/delete@
-- 
-- Удаление комментария к отзыву
-- 
-- Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
deleteGoodsFeedbackComment
  :: (Consumes DeleteGoodsFeedbackComment MimeJSON, MimeRender MimeJSON DeleteGoodsFeedbackCommentRequest)
  => DeleteGoodsFeedbackCommentRequest -- ^ "deleteGoodsFeedbackCommentRequest"
  -> BusinessId -- ^ "businessId" -  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest DeleteGoodsFeedbackComment MimeJSON EmptyApiResponse MimeJSON
deleteGoodsFeedbackComment deleteGoodsFeedbackCommentRequest (BusinessId businessId) =
  _mkRequest "POST" ["/businesses/",toPath businessId,"/goods-feedback/comments/delete"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)
    `setBodyParam` deleteGoodsFeedbackCommentRequest

data DeleteGoodsFeedbackComment 
instance HasBodyParam DeleteGoodsFeedbackComment DeleteGoodsFeedbackCommentRequest 

-- | @application/json@
instance Consumes DeleteGoodsFeedbackComment MimeJSON

-- | @application/json@
instance Produces DeleteGoodsFeedbackComment MimeJSON


-- *** getGoodsFeedbackComments

-- | @POST \/businesses\/{businessId}\/goods-feedback\/comments@
-- 
-- Получение комментариев к отзыву
-- 
-- Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getGoodsFeedbackComments
  :: (Consumes GetGoodsFeedbackComments MimeJSON, MimeRender MimeJSON GetGoodsFeedbackCommentsRequest)
  => GetGoodsFeedbackCommentsRequest -- ^ "getGoodsFeedbackCommentsRequest"
  -> BusinessId -- ^ "businessId" -  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest GetGoodsFeedbackComments MimeJSON GetGoodsFeedbackCommentsResponse MimeJSON
getGoodsFeedbackComments getGoodsFeedbackCommentsRequest (BusinessId businessId) =
  _mkRequest "POST" ["/businesses/",toPath businessId,"/goods-feedback/comments"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)
    `setBodyParam` getGoodsFeedbackCommentsRequest

data GetGoodsFeedbackComments 
instance HasBodyParam GetGoodsFeedbackComments GetGoodsFeedbackCommentsRequest 

-- | /Optional Param/ "page_token" - Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
instance HasOptionalParam GetGoodsFeedbackComments PageToken where
  applyOptionalParam req (PageToken xs) =
    req `addQuery` toQuery ("page_token", Just xs)

-- | /Optional Param/ "limit" - Количество значений на одной странице. 
instance HasOptionalParam GetGoodsFeedbackComments Limit where
  applyOptionalParam req (Limit xs) =
    req `addQuery` toQuery ("limit", Just xs)

-- | @application/json@
instance Consumes GetGoodsFeedbackComments MimeJSON

-- | @application/json@
instance Produces GetGoodsFeedbackComments MimeJSON


-- *** getGoodsFeedbacks

-- | @POST \/businesses\/{businessId}\/goods-feedback@
-- 
-- Получение отзывов о товарах продавца
-- 
-- Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
getGoodsFeedbacks
  :: (Consumes GetGoodsFeedbacks MimeJSON)
  => BusinessId -- ^ "businessId" -  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest GetGoodsFeedbacks MimeJSON GetGoodsFeedbackResponse MimeJSON
getGoodsFeedbacks (BusinessId businessId) =
  _mkRequest "POST" ["/businesses/",toPath businessId,"/goods-feedback"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)

data GetGoodsFeedbacks 
instance HasBodyParam GetGoodsFeedbacks GetGoodsFeedbackRequest 

-- | /Optional Param/ "page_token" - Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
instance HasOptionalParam GetGoodsFeedbacks PageToken where
  applyOptionalParam req (PageToken xs) =
    req `addQuery` toQuery ("page_token", Just xs)

-- | /Optional Param/ "limit" - Количество значений на одной странице. 
instance HasOptionalParam GetGoodsFeedbacks Limit where
  applyOptionalParam req (Limit xs) =
    req `addQuery` toQuery ("limit", Just xs)

-- | @application/json@
instance Consumes GetGoodsFeedbacks MimeJSON

-- | @application/json@
instance Produces GetGoodsFeedbacks MimeJSON


-- *** skipGoodsFeedbacksReaction

-- | @POST \/businesses\/{businessId}\/goods-feedback\/skip-reaction@
-- 
-- Отказ от ответа на отзывы
-- 
-- Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
skipGoodsFeedbacksReaction
  :: (Consumes SkipGoodsFeedbacksReaction MimeJSON, MimeRender MimeJSON SkipGoodsFeedbackReactionRequest)
  => SkipGoodsFeedbackReactionRequest -- ^ "skipGoodsFeedbackReactionRequest"
  -> BusinessId -- ^ "businessId" -  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest SkipGoodsFeedbacksReaction MimeJSON EmptyApiResponse MimeJSON
skipGoodsFeedbacksReaction skipGoodsFeedbackReactionRequest (BusinessId businessId) =
  _mkRequest "POST" ["/businesses/",toPath businessId,"/goods-feedback/skip-reaction"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)
    `setBodyParam` skipGoodsFeedbackReactionRequest

data SkipGoodsFeedbacksReaction 
instance HasBodyParam SkipGoodsFeedbacksReaction SkipGoodsFeedbackReactionRequest 

-- | @application/json@
instance Consumes SkipGoodsFeedbacksReaction MimeJSON

-- | @application/json@
instance Produces SkipGoodsFeedbacksReaction MimeJSON


-- *** updateGoodsFeedbackComment

-- | @POST \/businesses\/{businessId}\/goods-feedback\/comments\/update@
-- 
-- Добавление нового или изменение созданного комментария
-- 
-- Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-- 
-- AuthMethod: 'AuthOAuthOAuth'
-- 
updateGoodsFeedbackComment
  :: (Consumes UpdateGoodsFeedbackComment MimeJSON, MimeRender MimeJSON UpdateGoodsFeedbackCommentRequest)
  => UpdateGoodsFeedbackCommentRequest -- ^ "updateGoodsFeedbackCommentRequest"
  -> BusinessId -- ^ "businessId" -  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  -> ПартнерскийAPIМаркетаRequest UpdateGoodsFeedbackComment MimeJSON UpdateGoodsFeedbackCommentResponse MimeJSON
updateGoodsFeedbackComment updateGoodsFeedbackCommentRequest (BusinessId businessId) =
  _mkRequest "POST" ["/businesses/",toPath businessId,"/goods-feedback/comments/update"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthOAuthOAuth)
    `setBodyParam` updateGoodsFeedbackCommentRequest

data UpdateGoodsFeedbackComment 
instance HasBodyParam UpdateGoodsFeedbackComment UpdateGoodsFeedbackCommentRequest 

-- | @application/json@
instance Consumes UpdateGoodsFeedbackComment MimeJSON

-- | @application/json@
instance Produces UpdateGoodsFeedbackComment MimeJSON

