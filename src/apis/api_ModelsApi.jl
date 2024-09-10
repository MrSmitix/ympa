# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.

struct ModelsApi <: OpenAPI.APIClientImpl
    client::OpenAPI.Clients.Client
end

"""
The default API base path for APIs in `ModelsApi`.
This can be used to construct the `OpenAPI.Clients.Client` instance.
"""
basepath(::Type{ ModelsApi }) = "https://api.partner.market.yandex.ru"

const _returntypes_get_model_ModelsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetModelsResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_model(_api::ModelsApi, model_id::Int64, region_id::Int64; currency=nothing, _mediaType=nothing)
    OpenAPI.validate_param("model_id", "get_model", :minimum, model_id, 0, true)

    _ctx = OpenAPI.Clients.Ctx(_api.client, "GET", _returntypes_get_model_ModelsApi, "/models/{modelId}", ["OAuth", ])
    OpenAPI.Clients.set_param(_ctx.path, "modelId", model_id)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "regionId", region_id; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "currency", currency; style="", is_explode=false)  # type CurrencyType
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? [] : [_mediaType])
    return _ctx
end

@doc raw"""Информация об одной модели

Возвращает информацию о модели товара.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

Params:
- model_id::Int64 (required)
- region_id::Int64 (required)
- currency::CurrencyType

Return: GetModelsResponse, OpenAPI.Clients.ApiResponse
"""
function get_model(_api::ModelsApi, model_id::Int64, region_id::Int64; currency=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_model(_api, model_id, region_id; currency=currency, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_model(_api::ModelsApi, response_stream::Channel, model_id::Int64, region_id::Int64; currency=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_model(_api, model_id, region_id; currency=currency, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_get_model_offers_ModelsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetModelsOffersResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_model_offers(_api::ModelsApi, model_id::Int64, region_id::Int64; currency=nothing, order_by_price=nothing, count=nothing, page=nothing, _mediaType=nothing)
    OpenAPI.validate_param("model_id", "get_model_offers", :minimum, model_id, 0, true)

    OpenAPI.validate_param("page", "get_model_offers", :maximum, page, 10000, false)

    _ctx = OpenAPI.Clients.Ctx(_api.client, "GET", _returntypes_get_model_offers_ModelsApi, "/models/{modelId}/offers", ["OAuth", ])
    OpenAPI.Clients.set_param(_ctx.path, "modelId", model_id)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "regionId", region_id; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "currency", currency; style="", is_explode=false)  # type CurrencyType
    OpenAPI.Clients.set_param(_ctx.query, "orderByPrice", order_by_price; style="", is_explode=false)  # type SortOrderType
    OpenAPI.Clients.set_param(_ctx.query, "count", count; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "page", page; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? [] : [_mediaType])
    return _ctx
end

@doc raw"""Список предложений для одной модели

Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

Params:
- model_id::Int64 (required)
- region_id::Int64 (required)
- currency::CurrencyType
- order_by_price::SortOrderType
- count::Int64
- page::Int64

Return: GetModelsOffersResponse, OpenAPI.Clients.ApiResponse
"""
function get_model_offers(_api::ModelsApi, model_id::Int64, region_id::Int64; currency=nothing, order_by_price=nothing, count=nothing, page=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_model_offers(_api, model_id, region_id; currency=currency, order_by_price=order_by_price, count=count, page=page, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_model_offers(_api::ModelsApi, response_stream::Channel, model_id::Int64, region_id::Int64; currency=nothing, order_by_price=nothing, count=nothing, page=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_model_offers(_api, model_id, region_id; currency=currency, order_by_price=order_by_price, count=count, page=page, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_get_models_ModelsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetModelsResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_models(_api::ModelsApi, region_id::Int64, get_models_request::GetModelsRequest; currency=nothing, _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_get_models_ModelsApi, "/models", ["OAuth", ], get_models_request)
    OpenAPI.Clients.set_param(_ctx.query, "regionId", region_id; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "currency", currency; style="", is_explode=false)  # type CurrencyType
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Информация о нескольких моделях

Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

Params:
- region_id::Int64 (required)
- get_models_request::GetModelsRequest (required)
- currency::CurrencyType

Return: GetModelsResponse, OpenAPI.Clients.ApiResponse
"""
function get_models(_api::ModelsApi, region_id::Int64, get_models_request::GetModelsRequest; currency=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_models(_api, region_id, get_models_request; currency=currency, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_models(_api::ModelsApi, response_stream::Channel, region_id::Int64, get_models_request::GetModelsRequest; currency=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_models(_api, region_id, get_models_request; currency=currency, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_get_models_offers_ModelsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetModelsOffersResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_models_offers(_api::ModelsApi, region_id::Int64, get_models_request::GetModelsRequest; currency=nothing, order_by_price=nothing, _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_get_models_offers_ModelsApi, "/models/offers", ["OAuth", ], get_models_request)
    OpenAPI.Clients.set_param(_ctx.query, "regionId", region_id; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "currency", currency; style="", is_explode=false)  # type CurrencyType
    OpenAPI.Clients.set_param(_ctx.query, "orderByPrice", order_by_price; style="", is_explode=false)  # type SortOrderType
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Список предложений для нескольких моделей

Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

Params:
- region_id::Int64 (required)
- get_models_request::GetModelsRequest (required)
- currency::CurrencyType
- order_by_price::SortOrderType

Return: GetModelsOffersResponse, OpenAPI.Clients.ApiResponse
"""
function get_models_offers(_api::ModelsApi, region_id::Int64, get_models_request::GetModelsRequest; currency=nothing, order_by_price=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_models_offers(_api, region_id, get_models_request; currency=currency, order_by_price=order_by_price, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_models_offers(_api::ModelsApi, response_stream::Channel, region_id::Int64, get_models_request::GetModelsRequest; currency=nothing, order_by_price=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_models_offers(_api, region_id, get_models_request; currency=currency, order_by_price=order_by_price, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_search_models_ModelsApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => SearchModelsResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_search_models(_api::ModelsApi, query::String, region_id::Int64; currency=nothing, page=nothing, page_size=nothing, _mediaType=nothing)
    OpenAPI.validate_param("page", "search_models", :maximum, page, 10000, false)

    _ctx = OpenAPI.Clients.Ctx(_api.client, "GET", _returntypes_search_models_ModelsApi, "/models", ["OAuth", ])
    OpenAPI.Clients.set_param(_ctx.query, "query", query; style="", is_explode=false)  # type String
    OpenAPI.Clients.set_param(_ctx.query, "regionId", region_id; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "currency", currency; style="", is_explode=false)  # type CurrencyType
    OpenAPI.Clients.set_param(_ctx.query, "page", page; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "pageSize", page_size; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? [] : [_mediaType])
    return _ctx
end

@doc raw"""Поиск модели товара

Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

Params:
- query::String (required)
- region_id::Int64 (required)
- currency::CurrencyType
- page::Int64
- page_size::Int64

Return: SearchModelsResponse, OpenAPI.Clients.ApiResponse
"""
function search_models(_api::ModelsApi, query::String, region_id::Int64; currency=nothing, page=nothing, page_size=nothing, _mediaType=nothing)
    _ctx = _oacinternal_search_models(_api, query, region_id; currency=currency, page=page, page_size=page_size, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function search_models(_api::ModelsApi, response_stream::Channel, query::String, region_id::Int64; currency=nothing, page=nothing, page_size=nothing, _mediaType=nothing)
    _ctx = _oacinternal_search_models(_api, query, region_id; currency=currency, page=page, page_size=page_size, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

export get_model
export get_model_offers
export get_models
export get_models_offers
export search_models
