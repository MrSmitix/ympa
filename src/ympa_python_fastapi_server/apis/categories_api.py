# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.categories_api_base import BaseCategoriesApi
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
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse
from ympa_python_fastapi_server.models.get_categories_request import GetCategoriesRequest
from ympa_python_fastapi_server.models.get_categories_response import GetCategoriesResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/categories/max-sale-quantum",
    responses={
        200: {"model": GetCategoriesMaxSaleQuantumResponse, "description": "Лимит на установку кванта и минимального количества товаров."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["categories","fby","fbs","dbs","express"],
    summary="Лимит на установку кванта продажи и минимального количества товаров в заказе",
    response_model_by_alias=True,
)
async def get_categories_max_sale_quantum(
    get_categories_max_sale_quantum_request: GetCategoriesMaxSaleQuantumRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCategoriesMaxSaleQuantumResponse:
    """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseCategoriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCategoriesApi.subclasses[0]().get_categories_max_sale_quantum(get_categories_max_sale_quantum_request)


@router.post(
    "/categories/tree",
    responses={
        200: {"model": GetCategoriesResponse, "description": "Категории Маркета."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["categories","fby","fbs","dbs","express"],
    summary="Дерево категорий",
    response_model_by_alias=True,
)
async def get_categories_tree(
    get_categories_request: GetCategoriesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCategoriesResponse:
    """Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseCategoriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCategoriesApi.subclasses[0]().get_categories_tree(get_categories_request)
