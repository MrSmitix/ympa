# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.goods_feedback_api_base import BaseGoodsFeedbackApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from ympa_python_fastapi_server.models.extra_models import TokenModel  # noqa: F401
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest
from ympa_python_fastapi_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse
from ympa_python_fastapi_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest
from ympa_python_fastapi_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse
from ympa_python_fastapi_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest
from ympa_python_fastapi_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest
from ympa_python_fastapi_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/businesses/{businessId}/goods-feedback/comments/delete",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Удаление комментария к отзыву",
    response_model_by_alias=True,
)
async def delete_goods_feedback_comment(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_goods_feedback_comment_request: DeleteGoodsFeedbackCommentRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseGoodsFeedbackApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGoodsFeedbackApi.subclasses[0]().delete_goods_feedback_comment(businessId, delete_goods_feedback_comment_request)


@router.post(
    "/businesses/{businessId}/goods-feedback/comments",
    responses={
        200: {"model": GetGoodsFeedbackCommentsResponse, "description": "Дерево комментариев к отзыву."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Получение комментариев к отзыву",
    response_model_by_alias=True,
)
async def get_goods_feedback_comments(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_goods_feedback_comments_request: GetGoodsFeedbackCommentsRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetGoodsFeedbackCommentsResponse:
    """Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseGoodsFeedbackApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGoodsFeedbackApi.subclasses[0]().get_goods_feedback_comments(businessId, get_goods_feedback_comments_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/goods-feedback",
    responses={
        200: {"model": GetGoodsFeedbackResponse, "description": "Список отзывов."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Получение отзывов о товарах продавца",
    response_model_by_alias=True,
)
async def get_goods_feedbacks(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_goods_feedback_request: GetGoodsFeedbackRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetGoodsFeedbackResponse:
    """Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseGoodsFeedbackApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGoodsFeedbackApi.subclasses[0]().get_goods_feedbacks(businessId, page_token, limit, get_goods_feedback_request)


@router.post(
    "/businesses/{businessId}/goods-feedback/skip-reaction",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Отказ от ответа на отзывы",
    response_model_by_alias=True,
)
async def skip_goods_feedbacks_reaction(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    skip_goods_feedback_reaction_request: SkipGoodsFeedbackReactionRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseGoodsFeedbackApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGoodsFeedbackApi.subclasses[0]().skip_goods_feedbacks_reaction(businessId, skip_goods_feedback_reaction_request)


@router.post(
    "/businesses/{businessId}/goods-feedback/comments/update",
    responses={
        200: {"model": UpdateGoodsFeedbackCommentResponse, "description": "Информация о добавленном или измененном комментарии."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Добавление нового или изменение созданного комментария",
    response_model_by_alias=True,
)
async def update_goods_feedback_comment(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_goods_feedback_comment_request: UpdateGoodsFeedbackCommentRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdateGoodsFeedbackCommentResponse:
    """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseGoodsFeedbackApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGoodsFeedbackApi.subclasses[0]().update_goods_feedback_comment(businessId, update_goods_feedback_comment_request)
