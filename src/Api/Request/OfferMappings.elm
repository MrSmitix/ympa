{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.OfferMappings exposing
    ( getOfferMappingEntries
    , getSuggestedOfferMappingEntries
    , updateOfferMappingEntries
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
-}
getOfferMappingEntries : Int -> Maybe (List String) -> Maybe (List String) -> Maybe OfferMappingKindType -> Maybe (List OfferProcessingStatusType) -> Maybe (List OfferAvailabilityStatusType) -> Maybe (List Int) -> Maybe (List String) -> Maybe String -> Maybe Int -> Api.Request Api.Data.GetOfferMappingEntriesResponse
getOfferMappingEntries campaignId_path offerId_query shopSku_query mappingKind_query status_query availability_query categoryId_query vendor_query pageToken_query limit_query =
    Api.request
        "GET"
        "/campaigns/{campaignId}/offer-mapping-entries"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        [ ( "offer_id", Maybe.map (String.join "," << List.map identity) offerId_query ), ( "shop_sku", Maybe.map (String.join "," << List.map identity) shopSku_query ), ( "mapping_kind", Maybe.map Api.Data.stringFromOfferMappingKindType mappingKind_query ), ( "status", Maybe.map (String.join "," << List.map Api.Data.stringFromOfferProcessingStatusType) status_query ), ( "availability", Maybe.map (String.join "," << List.map Api.Data.stringFromOfferAvailabilityStatusType) availability_query ), ( "category_id", Maybe.map (String.join "," << List.map String.fromInt) categoryId_query ), ( "vendor", Maybe.map (String.join "," << List.map identity) vendor_query ), ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        Nothing
        Api.Data.getOfferMappingEntriesResponseDecoder


{-| {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
-}
getSuggestedOfferMappingEntries : Int -> Api.Data.GetSuggestedOfferMappingEntriesRequest -> Api.Request Api.Data.GetSuggestedOfferMappingEntriesResponse
getSuggestedOfferMappingEntries campaignId_path getSuggestedOfferMappingEntriesRequest_body =
    Api.request
        "POST"
        "/campaigns/{campaignId}/offer-mapping-entries/suggestions"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest_body)))
        Api.Data.getSuggestedOfferMappingEntriesResponseDecoder


{-| {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
-}
updateOfferMappingEntries : Int -> Api.Data.UpdateOfferMappingEntryRequest -> Api.Request Api.Data.EmptyApiResponse
updateOfferMappingEntries campaignId_path updateOfferMappingEntryRequest_body =
    Api.request
        "POST"
        "/campaigns/{campaignId}/offer-mapping-entries/updates"
        [ ( "campaignId", String.fromInt campaignId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest_body)))
        Api.Data.emptyApiResponseDecoder
