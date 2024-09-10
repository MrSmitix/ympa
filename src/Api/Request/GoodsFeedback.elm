{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.GoodsFeedback exposing
    ( deleteGoodsFeedbackComment
    , getGoodsFeedbackComments
    , getGoodsFeedbacks
    , skipGoodsFeedbacksReaction
    , updateGoodsFeedbackComment
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-}
deleteGoodsFeedbackComment : Int -> Api.Data.DeleteGoodsFeedbackCommentRequest -> Api.Request Api.Data.EmptyApiResponse
deleteGoodsFeedbackComment businessId_path deleteGoodsFeedbackCommentRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/goods-feedback/comments/delete"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest_body)))
        Api.Data.emptyApiResponseDecoder


{-| Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-}
getGoodsFeedbackComments : Int -> Maybe String -> Maybe Int -> Api.Data.GetGoodsFeedbackCommentsRequest -> Api.Request Api.Data.GetGoodsFeedbackCommentsResponse
getGoodsFeedbackComments businessId_path pageToken_query limit_query getGoodsFeedbackCommentsRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/goods-feedback/comments"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest_body)))
        Api.Data.getGoodsFeedbackCommentsResponseDecoder


{-| Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-}
getGoodsFeedbacks : Int -> Maybe String -> Maybe Int -> Maybe Api.Data.GetGoodsFeedbackRequest -> Api.Request Api.Data.GetGoodsFeedbackResponse
getGoodsFeedbacks businessId_path pageToken_query limit_query getGoodsFeedbackRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/goods-feedback"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Maybe.map Api.Data.encodeGetGoodsFeedbackRequest getGoodsFeedbackRequest_body))
        Api.Data.getGoodsFeedbackResponseDecoder


{-| Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-}
skipGoodsFeedbacksReaction : Int -> Api.Data.SkipGoodsFeedbackReactionRequest -> Api.Request Api.Data.EmptyApiResponse
skipGoodsFeedbacksReaction businessId_path skipGoodsFeedbackReactionRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/goods-feedback/skip-reaction"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest_body)))
        Api.Data.emptyApiResponseDecoder


{-| Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-}
updateGoodsFeedbackComment : Int -> Api.Data.UpdateGoodsFeedbackCommentRequest -> Api.Request Api.Data.UpdateGoodsFeedbackCommentResponse
updateGoodsFeedbackComment businessId_path updateGoodsFeedbackCommentRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/goods-feedback/comments/update"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest_body)))
        Api.Data.updateGoodsFeedbackCommentResponseDecoder
