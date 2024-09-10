# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.order_labels_api_base import BaseOrderLabelsApi
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
from ympa_python_fastapi_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse
from ympa_python_fastapi_server.models.page_format_type import PageFormatType
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label",
    responses={
        200: {"model": file, "description": "PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["order-labels","fbs","dbs","express"],
    summary="Готовый ярлык‑наклейка для коробки в заказе",
    response_model_by_alias=True,
)
async def generate_order_label(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    shipmentId: int = Path(..., description="Идентификатор грузоместа."),
    boxId: int = Path(..., description="Идентификатор коробки."),
    format:  = Query(None, description="Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> file:
    """Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
    if not BaseOrderLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOrderLabelsApi.subclasses[0]().generate_order_label(campaignId, orderId, shipmentId, boxId, format)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/delivery/labels",
    responses={
        200: {"model": file, "description": "PDF‑файл с ярлыками на все коробки."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["order-labels","fbs","dbs","express"],
    summary="Готовые ярлыки‑наклейки на все коробки в одном заказе",
    response_model_by_alias=True,
)
async def generate_order_labels(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    format:  = Query(None, description="Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> file:
    """Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
    if not BaseOrderLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOrderLabelsApi.subclasses[0]().generate_order_labels(campaignId, orderId, format)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data",
    responses={
        200: {"model": GetOrderLabelsDataResponse, "description": "Информация для печати ярлыков."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["order-labels","fbs","dbs","express"],
    summary="Данные для самостоятельного изготовления ярлыков",
    response_model_by_alias=True,
)
async def get_order_labels_data(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOrderLabelsDataResponse:
    """Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
    if not BaseOrderLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOrderLabelsApi.subclasses[0]().get_order_labels_data(campaignId, orderId)
