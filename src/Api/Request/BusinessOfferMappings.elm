{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.BusinessOfferMappings exposing
    ( addOffersToArchive
    , deleteOffers
    , deleteOffersFromArchive
    , getOfferMappings
    , getSuggestedOfferMappings
    , updateOfferMappings
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-}
addOffersToArchive : Int -> Api.Data.AddOffersToArchiveRequest -> Api.Request Api.Data.AddOffersToArchiveResponse
addOffersToArchive businessId_path addOffersToArchiveRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/offer-mappings/archive"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeAddOffersToArchiveRequest addOffersToArchiveRequest_body)))
        Api.Data.addOffersToArchiveResponseDecoder


{-| Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-}
deleteOffers : Int -> Api.Data.DeleteOffersRequest -> Api.Request Api.Data.DeleteOffersResponse
deleteOffers businessId_path deleteOffersRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/offer-mappings/delete"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeDeleteOffersRequest deleteOffersRequest_body)))
        Api.Data.deleteOffersResponseDecoder


{-| Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-}
deleteOffersFromArchive : Int -> Api.Data.DeleteOffersFromArchiveRequest -> Api.Request Api.Data.DeleteOffersFromArchiveResponse
deleteOffersFromArchive businessId_path deleteOffersFromArchiveRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/offer-mappings/unarchive"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest_body)))
        Api.Data.deleteOffersFromArchiveResponseDecoder


{-| Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
-}
getOfferMappings : Int -> Maybe String -> Maybe Int -> Maybe Api.Data.GetOfferMappingsRequest -> Api.Request Api.Data.GetOfferMappingsResponse
getOfferMappings businessId_path pageToken_query limit_query getOfferMappingsRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/offer-mappings"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Maybe.map Api.Data.encodeGetOfferMappingsRequest getOfferMappingsRequest_body))
        Api.Data.getOfferMappingsResponseDecoder


{-| Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
-}
getSuggestedOfferMappings : Int -> Maybe Api.Data.GetSuggestedOfferMappingsRequest -> Api.Request Api.Data.GetSuggestedOfferMappingsResponse
getSuggestedOfferMappings businessId_path getSuggestedOfferMappingsRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/offer-mappings/suggestions"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Maybe.map Api.Data.encodeGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest_body))
        Api.Data.getSuggestedOfferMappingsResponseDecoder


{-| Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-}
updateOfferMappings : Int -> Api.Data.UpdateOfferMappingsRequest -> Api.Request Api.Data.UpdateOfferMappingsResponse
updateOfferMappings businessId_path updateOfferMappingsRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/offer-mappings/update"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdateOfferMappingsRequest updateOfferMappingsRequest_body)))
        Api.Data.updateOfferMappingsResponseDecoder

