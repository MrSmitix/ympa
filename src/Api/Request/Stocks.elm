{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Stocks exposing
    ( getStocks
    , updateStocks
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
-}
getStocks : Int -> Maybe String -> Maybe Int -> Maybe Api.Data.GetWarehouseStocksRequest -> Api.Request Api.Data.GetWarehouseStocksResponse
getStocks campaignId_path pageToken_query limit_query getWarehouseStocksRequest_body =
    Api.request
        "POST"
        "/campaigns/{campaignId}/offers/stocks"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        [ ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Maybe.map Api.Data.encodeGetWarehouseStocksRequest getWarehouseStocksRequest_body))
        Api.Data.getWarehouseStocksResponseDecoder


{-| Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
-}
updateStocks : Int -> Api.Data.UpdateStocksRequest -> Api.Request Api.Data.EmptyApiResponse
updateStocks campaignId_path updateStocksRequest_body =
    Api.request
        "PUT"
        "/campaigns/{campaignId}/offers/stocks"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdateStocksRequest updateStocksRequest_body)))
        Api.Data.emptyApiResponseDecoder

