# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.feeds_api_base import BaseFeedsApi
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
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType
from ympa_python_fastapi_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse
from ympa_python_fastapi_server.models.get_feed_response import GetFeedResponse
from ympa_python_fastapi_server.models.get_feeds_response import GetFeedsResponse
from ympa_python_fastapi_server.models.set_feed_params_request import SetFeedParamsRequest
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/campaigns/{campaignId}/feeds/{feedId}",
    responses={
        200: {"model": GetFeedResponse, "description": "Информация о прайс-листе."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Информация о прайс-листе",
    response_model_by_alias=True,
)
async def get_feed(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFeedResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFeedsApi.subclasses[0]().get_feed(campaignId, feedId)


@router.get(
    "/campaigns/{campaignId}/feeds/{feedId}/index-logs",
    responses={
        200: {"model": GetFeedIndexLogsResponse, "description": "Отчет по индексации прайс-листа."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Отчет по индексации прайс-листа",
    response_model_by_alias=True,
)
async def get_feed_index_logs(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    published_time_from: str = Query(None, description="Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. ", alias="published_time_from"),
    published_time_to: str = Query(None, description="Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} ", alias="published_time_to"),
    status:  = Query(None, description="Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. ", alias="status"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFeedIndexLogsResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFeedsApi.subclasses[0]().get_feed_index_logs(campaignId, feedId, limit, published_time_from, published_time_to, status)


@router.get(
    "/campaigns/{campaignId}/feeds",
    responses={
        200: {"model": GetFeedsResponse, "description": "Список прайс-листов."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Список прайс-листов магазина",
    response_model_by_alias=True,
)
async def get_feeds(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFeedsResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFeedsApi.subclasses[0]().get_feeds(campaignId)


@router.post(
    "/campaigns/{campaignId}/feeds/{feedId}/refresh",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Сообщить, что прайс-лист обновился",
    response_model_by_alias=True,
)
async def refresh_feed(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| """
    if not BaseFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFeedsApi.subclasses[0]().refresh_feed(campaignId, feedId)


@router.post(
    "/campaigns/{campaignId}/feeds/{feedId}/params",
    responses={
        200: {"model": EmptyApiResponse, "description": "Статус выполнения операции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Изменение параметров прайс-листа",
    response_model_by_alias=True,
)
async def set_feed_params(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    set_feed_params_request: SetFeedParamsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| """
    if not BaseFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFeedsApi.subclasses[0]().set_feed_params(campaignId, feedId, set_feed_params_request)
