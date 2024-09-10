# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.promos_api_base import BasePromosApi
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
from ympa_python_fastapi_server.models.delete_promo_offers_request import DeletePromoOffersRequest
from ympa_python_fastapi_server.models.delete_promo_offers_response import DeletePromoOffersResponse
from ympa_python_fastapi_server.models.get_promo_offers_request import GetPromoOffersRequest
from ympa_python_fastapi_server.models.get_promo_offers_response import GetPromoOffersResponse
from ympa_python_fastapi_server.models.get_promos_request import GetPromosRequest
from ympa_python_fastapi_server.models.get_promos_response import GetPromosResponse
from ympa_python_fastapi_server.models.update_promo_offers_request import UpdatePromoOffersRequest
from ympa_python_fastapi_server.models.update_promo_offers_response import UpdatePromoOffersResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/businesses/{businessId}/promos/offers/delete",
    responses={
        200: {"model": DeletePromoOffersResponse, "description": "Результат удаления товаров из акции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Удаление товаров из акции",
    response_model_by_alias=True,
)
async def delete_promo_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_promo_offers_request: DeletePromoOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> DeletePromoOffersResponse:
    """Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BasePromosApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromosApi.subclasses[0]().delete_promo_offers(businessId, delete_promo_offers_request)


@router.post(
    "/businesses/{businessId}/promos/offers",
    responses={
        200: {"model": GetPromoOffersResponse, "description": "Список товаров, которые участвуют или могут участвовать в акции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Получение списка товаров, которые участвуют или могут участвовать в акции",
    response_model_by_alias=True,
)
async def get_promo_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_promo_offers_request: GetPromoOffersRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetPromoOffersResponse:
    """Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BasePromosApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromosApi.subclasses[0]().get_promo_offers(businessId, get_promo_offers_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/promos",
    responses={
        200: {"model": GetPromosResponse, "description": "Список акций Маркета."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Получение списка акций",
    response_model_by_alias=True,
)
async def get_promos(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_promos_request: GetPromosRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetPromosResponse:
    """Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BasePromosApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromosApi.subclasses[0]().get_promos(businessId, get_promos_request)


@router.post(
    "/businesses/{businessId}/promos/offers/update",
    responses={
        200: {"model": UpdatePromoOffersResponse, "description": "Результат добавления товаров в акцию или обновления их цен."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Добавление товаров в акцию или изменение их цен",
    response_model_by_alias=True,
)
async def update_promo_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_promo_offers_request: UpdatePromoOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdatePromoOffersResponse:
    """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BasePromosApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromosApi.subclasses[0]().update_promo_offers(businessId, update_promo_offers_request)
