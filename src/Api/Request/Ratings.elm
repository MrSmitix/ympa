{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Ratings exposing
    ( getQualityRatingDetails
    , getQualityRatings
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
-}
getQualityRatingDetails : Int -> Api.Request Api.Data.GetQualityRatingDetailsResponse
getQualityRatingDetails campaignId_path =
    Api.request
        "POST"
        "/campaigns/{campaignId}/ratings/quality/details"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        []
        []
        Nothing
        Api.Data.getQualityRatingDetailsResponseDecoder


{-| Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-}
getQualityRatings : Int -> Api.Data.GetQualityRatingRequest -> Api.Request Api.Data.GetQualityRatingResponse
getQualityRatings businessId_path getQualityRatingRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/ratings/quality"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGetQualityRatingRequest getQualityRatingRequest_body)))
        Api.Data.getQualityRatingResponseDecoder
