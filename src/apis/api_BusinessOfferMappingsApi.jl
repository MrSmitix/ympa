# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.

struct BusinessOfferMappingsApi <: OpenAPI.APIClientImpl
    client::OpenAPI.Clients.Client
end

"""
The default API base path for APIs in `BusinessOfferMappingsApi`.
This can be used to construct the `OpenAPI.Clients.Client` instance.
"""
basepath(::Type{ BusinessOfferMappingsApi }) = "https://api.partner.market.yandex.ru"

const _returntypes_add_offers_to_archive_BusinessOfferMappingsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => AddOffersToArchiveResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("423", "x"=>".") * "\$") => ApiLockedErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_add_offers_to_archive(_api::BusinessOfferMappingsApi, business_id::Int64, add_offers_to_archive_request::AddOffersToArchiveRequest; _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_add_offers_to_archive_BusinessOfferMappingsApi, "/businesses/{businessId}/offer-mappings/archive", ["OAuth", ], add_offers_to_archive_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

Params:
- business_id::Int64 (required)
- add_offers_to_archive_request::AddOffersToArchiveRequest (required)

Return: AddOffersToArchiveResponse, OpenAPI.Clients.ApiResponse
"""
function add_offers_to_archive(_api::BusinessOfferMappingsApi, business_id::Int64, add_offers_to_archive_request::AddOffersToArchiveRequest; _mediaType=nothing)
    _ctx = _oacinternal_add_offers_to_archive(_api, business_id, add_offers_to_archive_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function add_offers_to_archive(_api::BusinessOfferMappingsApi, response_stream::Channel, business_id::Int64, add_offers_to_archive_request::AddOffersToArchiveRequest; _mediaType=nothing)
    _ctx = _oacinternal_add_offers_to_archive(_api, business_id, add_offers_to_archive_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_delete_offers_BusinessOfferMappingsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => DeleteOffersResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("423", "x"=>".") * "\$") => ApiLockedErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_delete_offers(_api::BusinessOfferMappingsApi, business_id::Int64, delete_offers_request::DeleteOffersRequest; _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_delete_offers_BusinessOfferMappingsApi, "/businesses/{businessId}/offer-mappings/delete", ["OAuth", ], delete_offers_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Удаление товаров из каталога

Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

Params:
- business_id::Int64 (required)
- delete_offers_request::DeleteOffersRequest (required)

Return: DeleteOffersResponse, OpenAPI.Clients.ApiResponse
"""
function delete_offers(_api::BusinessOfferMappingsApi, business_id::Int64, delete_offers_request::DeleteOffersRequest; _mediaType=nothing)
    _ctx = _oacinternal_delete_offers(_api, business_id, delete_offers_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function delete_offers(_api::BusinessOfferMappingsApi, response_stream::Channel, business_id::Int64, delete_offers_request::DeleteOffersRequest; _mediaType=nothing)
    _ctx = _oacinternal_delete_offers(_api, business_id, delete_offers_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_delete_offers_from_archive_BusinessOfferMappingsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => DeleteOffersFromArchiveResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("423", "x"=>".") * "\$") => ApiLockedErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_delete_offers_from_archive(_api::BusinessOfferMappingsApi, business_id::Int64, delete_offers_from_archive_request::DeleteOffersFromArchiveRequest; _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_delete_offers_from_archive_BusinessOfferMappingsApi, "/businesses/{businessId}/offer-mappings/unarchive", ["OAuth", ], delete_offers_from_archive_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Удаление товаров из архива

Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

Params:
- business_id::Int64 (required)
- delete_offers_from_archive_request::DeleteOffersFromArchiveRequest (required)

Return: DeleteOffersFromArchiveResponse, OpenAPI.Clients.ApiResponse
"""
function delete_offers_from_archive(_api::BusinessOfferMappingsApi, business_id::Int64, delete_offers_from_archive_request::DeleteOffersFromArchiveRequest; _mediaType=nothing)
    _ctx = _oacinternal_delete_offers_from_archive(_api, business_id, delete_offers_from_archive_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function delete_offers_from_archive(_api::BusinessOfferMappingsApi, response_stream::Channel, business_id::Int64, delete_offers_from_archive_request::DeleteOffersFromArchiveRequest; _mediaType=nothing)
    _ctx = _oacinternal_delete_offers_from_archive(_api, business_id, delete_offers_from_archive_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_get_offer_mappings_BusinessOfferMappingsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetOfferMappingsResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_offer_mappings(_api::BusinessOfferMappingsApi, business_id::Int64; page_token=nothing, limit=nothing, get_offer_mappings_request=nothing, _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_get_offer_mappings_BusinessOfferMappingsApi, "/businesses/{businessId}/offer-mappings", ["OAuth", ], get_offer_mappings_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "page_token", page_token; style="", is_explode=false)  # type String
    OpenAPI.Clients.set_param(_ctx.query, "limit", limit; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 

Params:
- business_id::Int64 (required)
- page_token::String
- limit::Int64
- get_offer_mappings_request::GetOfferMappingsRequest

Return: GetOfferMappingsResponse, OpenAPI.Clients.ApiResponse
"""
function get_offer_mappings(_api::BusinessOfferMappingsApi, business_id::Int64; page_token=nothing, limit=nothing, get_offer_mappings_request=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_offer_mappings(_api, business_id; page_token=page_token, limit=limit, get_offer_mappings_request=get_offer_mappings_request, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_offer_mappings(_api::BusinessOfferMappingsApi, response_stream::Channel, business_id::Int64; page_token=nothing, limit=nothing, get_offer_mappings_request=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_offer_mappings(_api, business_id; page_token=page_token, limit=limit, get_offer_mappings_request=get_offer_mappings_request, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_get_suggested_offer_mappings_BusinessOfferMappingsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetSuggestedOfferMappingsResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_suggested_offer_mappings(_api::BusinessOfferMappingsApi, business_id::Int64; get_suggested_offer_mappings_request=nothing, _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_get_suggested_offer_mappings_BusinessOfferMappingsApi, "/businesses/{businessId}/offer-mappings/suggestions", ["OAuth", ], get_suggested_offer_mappings_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

Params:
- business_id::Int64 (required)
- get_suggested_offer_mappings_request::GetSuggestedOfferMappingsRequest

Return: GetSuggestedOfferMappingsResponse, OpenAPI.Clients.ApiResponse
"""
function get_suggested_offer_mappings(_api::BusinessOfferMappingsApi, business_id::Int64; get_suggested_offer_mappings_request=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_suggested_offer_mappings(_api, business_id; get_suggested_offer_mappings_request=get_suggested_offer_mappings_request, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_suggested_offer_mappings(_api::BusinessOfferMappingsApi, response_stream::Channel, business_id::Int64; get_suggested_offer_mappings_request=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_suggested_offer_mappings(_api, business_id; get_suggested_offer_mappings_request=get_suggested_offer_mappings_request, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_update_offer_mappings_BusinessOfferMappingsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => UpdateOfferMappingsResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("423", "x"=>".") * "\$") => ApiLockedErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_update_offer_mappings(_api::BusinessOfferMappingsApi, business_id::Int64, update_offer_mappings_request::UpdateOfferMappingsRequest; _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_update_offer_mappings_BusinessOfferMappingsApi, "/businesses/{businessId}/offer-mappings/update", ["OAuth", ], update_offer_mappings_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

Params:
- business_id::Int64 (required)
- update_offer_mappings_request::UpdateOfferMappingsRequest (required)

Return: UpdateOfferMappingsResponse, OpenAPI.Clients.ApiResponse
"""
function update_offer_mappings(_api::BusinessOfferMappingsApi, business_id::Int64, update_offer_mappings_request::UpdateOfferMappingsRequest; _mediaType=nothing)
    _ctx = _oacinternal_update_offer_mappings(_api, business_id, update_offer_mappings_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function update_offer_mappings(_api::BusinessOfferMappingsApi, response_stream::Channel, business_id::Int64, update_offer_mappings_request::UpdateOfferMappingsRequest; _mediaType=nothing)
    _ctx = _oacinternal_update_offer_mappings(_api, business_id, update_offer_mappings_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

export add_offers_to_archive
export delete_offers
export delete_offers_from_archive
export get_offer_mappings
export get_suggested_offer_mappings
export update_offer_mappings
