{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.OutletLicenses exposing
    ( deleteOutletLicenses
    , getOutletLicenses
    , updateOutletLicenses
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-}
deleteOutletLicenses : Int -> Maybe (List Int) -> Api.Request Api.Data.EmptyApiResponse
deleteOutletLicenses campaignId_path ids_query =
    Api.request
        "DELETE"
        "/campaigns/{campaignId}/outlets/licenses"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        [ ( "ids", Maybe.map (String.join "," << List.map String.fromInt) ids_query ) ]
        []
        Nothing
        Api.Data.emptyApiResponseDecoder


{-| Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-}
getOutletLicenses : Int -> Maybe (List Int) -> Maybe (List Int) -> Api.Request Api.Data.GetOutletLicensesResponse
getOutletLicenses campaignId_path outletIds_query ids_query =
    Api.request
        "GET"
        "/campaigns/{campaignId}/outlets/licenses"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        [ ( "outletIds", Maybe.map (String.join "," << List.map String.fromInt) outletIds_query ), ( "ids", Maybe.map (String.join "," << List.map String.fromInt) ids_query ) ]
        []
        Nothing
        Api.Data.getOutletLicensesResponseDecoder


{-| Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-}
updateOutletLicenses : Int -> Api.Data.UpdateOutletLicenseRequest -> Api.Request Api.Data.EmptyApiResponse
updateOutletLicenses campaignId_path updateOutletLicenseRequest_body =
    Api.request
        "POST"
        "/campaigns/{campaignId}/outlets/licenses"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdateOutletLicenseRequest updateOutletLicenseRequest_body)))
        Api.Data.emptyApiResponseDecoder

