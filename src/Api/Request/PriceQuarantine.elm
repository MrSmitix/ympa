{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.PriceQuarantine exposing
    ( confirmBusinessPrices
    , confirmCampaignPrices
    , getBusinessQuarantineOffers
    , getCampaignQuarantineOffers
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-}
confirmBusinessPrices : Int -> Api.Data.ConfirmPricesRequest -> Api.Request Api.Data.EmptyApiResponse
confirmBusinessPrices businessId_path confirmPricesRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/price-quarantine/confirm"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeConfirmPricesRequest confirmPricesRequest_body)))
        Api.Data.emptyApiResponseDecoder


{-| Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-}
confirmCampaignPrices : Int -> Api.Data.ConfirmPricesRequest -> Api.Request Api.Data.EmptyApiResponse
confirmCampaignPrices campaignId_path confirmPricesRequest_body =
    Api.request
        "POST"
        "/campaigns/{campaignId}/price-quarantine/confirm"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeConfirmPricesRequest confirmPricesRequest_body)))
        Api.Data.emptyApiResponseDecoder


{-| Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-}
getBusinessQuarantineOffers : Int -> Maybe String -> Maybe Int -> Api.Data.GetQuarantineOffersRequest -> Api.Request Api.Data.GetQuarantineOffersResponse
getBusinessQuarantineOffers businessId_path pageToken_query limit_query getQuarantineOffersRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/price-quarantine"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGetQuarantineOffersRequest getQuarantineOffersRequest_body)))
        Api.Data.getQuarantineOffersResponseDecoder


{-| Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-}
getCampaignQuarantineOffers : Int -> Maybe String -> Maybe Int -> Api.Data.GetQuarantineOffersRequest -> Api.Request Api.Data.GetQuarantineOffersResponse
getCampaignQuarantineOffers campaignId_path pageToken_query limit_query getQuarantineOffersRequest_body =
    Api.request
        "POST"
        "/campaigns/{campaignId}/price-quarantine"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        [ ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGetQuarantineOffersRequest getQuarantineOffersRequest_body)))
        Api.Data.getQuarantineOffersResponseDecoder
