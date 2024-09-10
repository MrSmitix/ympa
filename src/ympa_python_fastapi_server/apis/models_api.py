# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.models_api_base import BaseModelsApi
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
from ympa_python_fastapi_server.models.currency_type import CurrencyType
from ympa_python_fastapi_server.models.get_models_offers_response import GetModelsOffersResponse
from ympa_python_fastapi_server.models.get_models_request import GetModelsRequest
from ympa_python_fastapi_server.models.get_models_response import GetModelsResponse
from ympa_python_fastapi_server.models.search_models_response import SearchModelsResponse
from ympa_python_fastapi_server.models.sort_order_type import SortOrderType
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/models/{modelId}",
    responses={
        200: {"model": GetModelsResponse, "description": "Информация о модели."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["models","dbs"],
    summary="Информация об одной модели",
    response_model_by_alias=True,
)
async def get_model(
    modelId: int = Path(..., description="Идентификатор модели товара.", ge=0),
    region_id: int = Query(None, description="Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", alias="regionId"),
    currency:  = Query(None, description="Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", alias="currency"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetModelsResponse:
    """Возвращает информацию о модели товара.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) """
    if not BaseModelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseModelsApi.subclasses[0]().get_model(modelId, region_id, currency)


@router.get(
    "/models/{modelId}/offers",
    responses={
        200: {"model": GetModelsOffersResponse, "description": "Список предложений для модели."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["models","dbs"],
    summary="Список предложений для одной модели",
    response_model_by_alias=True,
)
async def get_model_offers(
    modelId: int = Path(..., description="Идентификатор модели товара.", ge=0),
    region_id: int = Query(None, description="Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", alias="regionId"),
    currency:  = Query(None, description="Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", alias="currency"),
    order_by_price:  = Query(None, description="Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. ", alias="orderByPrice"),
    count: int = Query(10, description="Количество предложений на странице ответа.", alias="count"),
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetModelsOffersResponse:
    """Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) """
    if not BaseModelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseModelsApi.subclasses[0]().get_model_offers(modelId, region_id, currency, order_by_price, count, page)


@router.post(
    "/models",
    responses={
        200: {"model": GetModelsResponse, "description": "Информация о моделях."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["models","dbs"],
    summary="Информация о нескольких моделях",
    response_model_by_alias=True,
)
async def get_models(
    region_id: int = Query(None, description="Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", alias="regionId"),
    get_models_request: GetModelsRequest = Body(None, description=""),
    currency:  = Query(None, description="Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", alias="currency"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetModelsResponse:
    """Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) """
    if not BaseModelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseModelsApi.subclasses[0]().get_models(region_id, get_models_request, currency)


@router.post(
    "/models/offers",
    responses={
        200: {"model": GetModelsOffersResponse, "description": "Список предложений для моделей."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["models","dbs"],
    summary="Список предложений для нескольких моделей",
    response_model_by_alias=True,
)
async def get_models_offers(
    region_id: int = Query(None, description="Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", alias="regionId"),
    get_models_request: GetModelsRequest = Body(None, description=""),
    currency:  = Query(None, description="Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", alias="currency"),
    order_by_price:  = Query(None, description="Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. ", alias="orderByPrice"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetModelsOffersResponse:
    """Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) """
    if not BaseModelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseModelsApi.subclasses[0]().get_models_offers(region_id, get_models_request, currency, order_by_price)


@router.get(
    "/models",
    responses={
        200: {"model": SearchModelsResponse, "description": "Информация о моделях."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["models","dbs"],
    summary="Поиск модели товара",
    response_model_by_alias=True,
)
async def search_models(
    query: str = Query(None, description="Поисковый запрос по названию модели товара.", alias="query"),
    region_id: int = Query(None, description="Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", alias="regionId"),
    currency:  = Query(None, description="Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", alias="currency"),
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    page_size: int = Query(None, description="Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="pageSize"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> SearchModelsResponse:
    """Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) """
    if not BaseModelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseModelsApi.subclasses[0]().search_models(query, region_id, currency, page, page_size)
