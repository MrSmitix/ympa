# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.reports_api_base import BaseReportsApi
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
from ympa_python_fastapi_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest
from ympa_python_fastapi_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest
from ympa_python_fastapi_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest
from ympa_python_fastapi_server.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest
from ympa_python_fastapi_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest
from ympa_python_fastapi_server.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest
from ympa_python_fastapi_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest
from ympa_python_fastapi_server.models.generate_prices_report_request import GeneratePricesReportRequest
from ympa_python_fastapi_server.models.generate_report_response import GenerateReportResponse
from ympa_python_fastapi_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest
from ympa_python_fastapi_server.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest
from ympa_python_fastapi_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest
from ympa_python_fastapi_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest
from ympa_python_fastapi_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest
from ympa_python_fastapi_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest
from ympa_python_fastapi_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest
from ympa_python_fastapi_server.models.get_report_info_response import GetReportInfoResponse
from ympa_python_fastapi_server.models.page_format_type import PageFormatType
from ympa_python_fastapi_server.models.report_format_type import ReportFormatType
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/reports/boost-consolidated/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по бусту продаж",
    response_model_by_alias=True,
)
async def generate_boost_consolidated_report(
    generate_boost_consolidated_request: GenerateBoostConsolidatedRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_boost_consolidated_report(generate_boost_consolidated_request, format)


@router.post(
    "/reports/competitors-position/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет «Конкурентная позиция»",
    response_model_by_alias=True,
)
async def generate_competitors_position_report(
    generate_competitors_position_report_request: GenerateCompetitorsPositionReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_competitors_position_report(generate_competitors_position_report_request, format)


@router.post(
    "/reports/goods-feedback/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по отзывам о товарах",
    response_model_by_alias=True,
)
async def generate_goods_feedback_report(
    generate_goods_feedback_request: GenerateGoodsFeedbackRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_goods_feedback_report(generate_goods_feedback_request, format)


@router.post(
    "/reports/goods-movement/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby"],
    summary="Отчет по движению товаров",
    response_model_by_alias=True,
)
async def generate_goods_movement_report(
    generate_goods_movement_report_request: GenerateGoodsMovementReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_goods_movement_report(generate_goods_movement_report_request, format)


@router.post(
    "/reports/goods-realization/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","express"],
    summary="Отчет по реализации",
    response_model_by_alias=True,
)
async def generate_goods_realization_report(
    generate_goods_realization_report_request: GenerateGoodsRealizationReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_goods_realization_report(generate_goods_realization_report_request, format)


@router.post(
    "/reports/goods-turnover/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby"],
    summary="Отчет по оборачиваемости",
    response_model_by_alias=True,
)
async def generate_goods_turnover_report(
    generate_goods_turnover_request: GenerateGoodsTurnoverRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_goods_turnover_report(generate_goods_turnover_request, format)


@router.post(
    "/reports/documents/labels/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fbs","dbs","express"],
    summary="Готовые ярлыки‑наклейки на все коробки в нескольких заказах",
    response_model_by_alias=True,
)
async def generate_mass_order_labels_report(
    generate_mass_order_labels_request: GenerateMassOrderLabelsRequest = Body(None, description=""),
    format:  = Query(None, description="Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_mass_order_labels_report(generate_mass_order_labels_request, format)


@router.post(
    "/reports/prices/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет «Цены на рынке»",
    response_model_by_alias=True,
)
async def generate_prices_report(
    generate_prices_report_request: GeneratePricesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_prices_report(generate_prices_report_request, format)


@router.post(
    "/reports/shelf-statistics/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по полкам",
    response_model_by_alias=True,
)
async def generate_shelfs_statistics_report(
    generate_shelfs_statistics_request: GenerateShelfsStatisticsRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_shelfs_statistics_report(generate_shelfs_statistics_request, format)


@router.post(
    "/reports/documents/shipment-list/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fbs"],
    summary="Получение листа сборки",
    response_model_by_alias=True,
)
async def generate_shipment_list_document_report(
    generate_shipment_list_document_report_request: GenerateShipmentListDocumentReportRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_shipment_list_document_report(generate_shipment_list_document_report_request)


@router.post(
    "/reports/shows-sales/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет «Аналитика продаж»",
    response_model_by_alias=True,
)
async def generate_shows_sales_report(
    generate_shows_sales_report_request: GenerateShowsSalesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_shows_sales_report(generate_shows_sales_report_request, format)


@router.post(
    "/reports/stocks-on-warehouses/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по остаткам на складах",
    response_model_by_alias=True,
)
async def generate_stocks_on_warehouses_report(
    generate_stocks_on_warehouses_report_request: GenerateStocksOnWarehousesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, format)


@router.post(
    "/reports/united-marketplace-services/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет по стоимости услуг",
    response_model_by_alias=True,
)
async def generate_united_marketplace_services_report(
    generate_united_marketplace_services_report_request: GenerateUnitedMarketplaceServicesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, format)


@router.post(
    "/reports/united-netting/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет по платежам",
    response_model_by_alias=True,
)
async def generate_united_netting_report(
    generate_united_netting_report_request: GenerateUnitedNettingReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_united_netting_report(generate_united_netting_report_request, format)


@router.post(
    "/reports/united-orders/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по заказам",
    response_model_by_alias=True,
)
async def generate_united_orders_report(
    generate_united_orders_request: GenerateUnitedOrdersRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().generate_united_orders_report(generate_united_orders_request, format)


@router.get(
    "/reports/info/{reportId}",
    responses={
        200: {"model": GetReportInfoResponse, "description": "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Получение заданного отчета",
    response_model_by_alias=True,
)
async def get_report_info(
    reportId: str = Path(..., description="Идентификатор отчета, который вы получили после запуска генерации. "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetReportInfoResponse:
    """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
    if not BaseReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReportsApi.subclasses[0]().get_report_info(reportId)
