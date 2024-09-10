# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.

struct GoodsFeedbackApi <: OpenAPI.APIClientImpl
    client::OpenAPI.Clients.Client
end

"""
The default API base path for APIs in `GoodsFeedbackApi`.
This can be used to construct the `OpenAPI.Clients.Client` instance.
"""
basepath(::Type{ GoodsFeedbackApi }) = "https://api.partner.market.yandex.ru"

const _returntypes_delete_goods_feedback_comment_GoodsFeedbackApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => EmptyApiResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_delete_goods_feedback_comment(_api::GoodsFeedbackApi, business_id::Int64, delete_goods_feedback_comment_request::DeleteGoodsFeedbackCommentRequest; _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_delete_goods_feedback_comment_GoodsFeedbackApi, "/businesses/{businessId}/goods-feedback/comments/delete", ["OAuth", ], delete_goods_feedback_comment_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

Params:
- business_id::Int64 (required)
- delete_goods_feedback_comment_request::DeleteGoodsFeedbackCommentRequest (required)

Return: EmptyApiResponse, OpenAPI.Clients.ApiResponse
"""
function delete_goods_feedback_comment(_api::GoodsFeedbackApi, business_id::Int64, delete_goods_feedback_comment_request::DeleteGoodsFeedbackCommentRequest; _mediaType=nothing)
    _ctx = _oacinternal_delete_goods_feedback_comment(_api, business_id, delete_goods_feedback_comment_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function delete_goods_feedback_comment(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, delete_goods_feedback_comment_request::DeleteGoodsFeedbackCommentRequest; _mediaType=nothing)
    _ctx = _oacinternal_delete_goods_feedback_comment(_api, business_id, delete_goods_feedback_comment_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_get_goods_feedback_comments_GoodsFeedbackApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetGoodsFeedbackCommentsResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_goods_feedback_comments(_api::GoodsFeedbackApi, business_id::Int64, get_goods_feedback_comments_request::GetGoodsFeedbackCommentsRequest; page_token=nothing, limit=nothing, _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_get_goods_feedback_comments_GoodsFeedbackApi, "/businesses/{businessId}/goods-feedback/comments", ["OAuth", ], get_goods_feedback_comments_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "page_token", page_token; style="", is_explode=false)  # type String
    OpenAPI.Clients.set_param(_ctx.query, "limit", limit; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

Params:
- business_id::Int64 (required)
- get_goods_feedback_comments_request::GetGoodsFeedbackCommentsRequest (required)
- page_token::String
- limit::Int64

Return: GetGoodsFeedbackCommentsResponse, OpenAPI.Clients.ApiResponse
"""
function get_goods_feedback_comments(_api::GoodsFeedbackApi, business_id::Int64, get_goods_feedback_comments_request::GetGoodsFeedbackCommentsRequest; page_token=nothing, limit=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_goods_feedback_comments(_api, business_id, get_goods_feedback_comments_request; page_token=page_token, limit=limit, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_goods_feedback_comments(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, get_goods_feedback_comments_request::GetGoodsFeedbackCommentsRequest; page_token=nothing, limit=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_goods_feedback_comments(_api, business_id, get_goods_feedback_comments_request; page_token=page_token, limit=limit, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_get_goods_feedbacks_GoodsFeedbackApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => GetGoodsFeedbackResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_get_goods_feedbacks(_api::GoodsFeedbackApi, business_id::Int64; page_token=nothing, limit=nothing, get_goods_feedback_request=nothing, _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_get_goods_feedbacks_GoodsFeedbackApi, "/businesses/{businessId}/goods-feedback", ["OAuth", ], get_goods_feedback_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_param(_ctx.query, "page_token", page_token; style="", is_explode=false)  # type String
    OpenAPI.Clients.set_param(_ctx.query, "limit", limit; style="", is_explode=false)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

Params:
- business_id::Int64 (required)
- page_token::String
- limit::Int64
- get_goods_feedback_request::GetGoodsFeedbackRequest

Return: GetGoodsFeedbackResponse, OpenAPI.Clients.ApiResponse
"""
function get_goods_feedbacks(_api::GoodsFeedbackApi, business_id::Int64; page_token=nothing, limit=nothing, get_goods_feedback_request=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_goods_feedbacks(_api, business_id; page_token=page_token, limit=limit, get_goods_feedback_request=get_goods_feedback_request, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function get_goods_feedbacks(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64; page_token=nothing, limit=nothing, get_goods_feedback_request=nothing, _mediaType=nothing)
    _ctx = _oacinternal_get_goods_feedbacks(_api, business_id; page_token=page_token, limit=limit, get_goods_feedback_request=get_goods_feedback_request, _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_skip_goods_feedbacks_reaction_GoodsFeedbackApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => EmptyApiResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_skip_goods_feedbacks_reaction(_api::GoodsFeedbackApi, business_id::Int64, skip_goods_feedback_reaction_request::SkipGoodsFeedbackReactionRequest; _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_skip_goods_feedbacks_reaction_GoodsFeedbackApi, "/businesses/{businessId}/goods-feedback/skip-reaction", ["OAuth", ], skip_goods_feedback_reaction_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

Params:
- business_id::Int64 (required)
- skip_goods_feedback_reaction_request::SkipGoodsFeedbackReactionRequest (required)

Return: EmptyApiResponse, OpenAPI.Clients.ApiResponse
"""
function skip_goods_feedbacks_reaction(_api::GoodsFeedbackApi, business_id::Int64, skip_goods_feedback_reaction_request::SkipGoodsFeedbackReactionRequest; _mediaType=nothing)
    _ctx = _oacinternal_skip_goods_feedbacks_reaction(_api, business_id, skip_goods_feedback_reaction_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function skip_goods_feedbacks_reaction(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, skip_goods_feedback_reaction_request::SkipGoodsFeedbackReactionRequest; _mediaType=nothing)
    _ctx = _oacinternal_skip_goods_feedbacks_reaction(_api, business_id, skip_goods_feedback_reaction_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

const _returntypes_update_goods_feedback_comment_GoodsFeedbackApi = Dict{Regex,Type}(
    Regex("^" * replace("200", "x"=>".") * "\$") => UpdateGoodsFeedbackCommentResponse,
    Regex("^" * replace("400", "x"=>".") * "\$") => ApiClientDataErrorResponse,
    Regex("^" * replace("401", "x"=>".") * "\$") => ApiUnauthorizedErrorResponse,
    Regex("^" * replace("403", "x"=>".") * "\$") => ApiForbiddenErrorResponse,
    Regex("^" * replace("404", "x"=>".") * "\$") => ApiNotFoundErrorResponse,
    Regex("^" * replace("420", "x"=>".") * "\$") => ApiLimitErrorResponse,
    Regex("^" * replace("500", "x"=>".") * "\$") => ApiServerErrorResponse,
)

function _oacinternal_update_goods_feedback_comment(_api::GoodsFeedbackApi, business_id::Int64, update_goods_feedback_comment_request::UpdateGoodsFeedbackCommentRequest; _mediaType=nothing)
    _ctx = OpenAPI.Clients.Ctx(_api.client, "POST", _returntypes_update_goods_feedback_comment_GoodsFeedbackApi, "/businesses/{businessId}/goods-feedback/comments/update", ["OAuth", ], update_goods_feedback_comment_request)
    OpenAPI.Clients.set_param(_ctx.path, "businessId", business_id)  # type Int64
    OpenAPI.Clients.set_header_accept(_ctx, ["application/json", ])
    OpenAPI.Clients.set_header_content_type(_ctx, (_mediaType === nothing) ? ["application/json", ] : [_mediaType])
    return _ctx
end

@doc raw"""Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

Params:
- business_id::Int64 (required)
- update_goods_feedback_comment_request::UpdateGoodsFeedbackCommentRequest (required)

Return: UpdateGoodsFeedbackCommentResponse, OpenAPI.Clients.ApiResponse
"""
function update_goods_feedback_comment(_api::GoodsFeedbackApi, business_id::Int64, update_goods_feedback_comment_request::UpdateGoodsFeedbackCommentRequest; _mediaType=nothing)
    _ctx = _oacinternal_update_goods_feedback_comment(_api, business_id, update_goods_feedback_comment_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx)
end

function update_goods_feedback_comment(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, update_goods_feedback_comment_request::UpdateGoodsFeedbackCommentRequest; _mediaType=nothing)
    _ctx = _oacinternal_update_goods_feedback_comment(_api, business_id, update_goods_feedback_comment_request; _mediaType=_mediaType)
    return OpenAPI.Clients.exec(_ctx, response_stream)
end

export delete_goods_feedback_comment
export get_goods_feedback_comments
export get_goods_feedbacks
export skip_goods_feedbacks_reaction
export update_goods_feedback_comment
