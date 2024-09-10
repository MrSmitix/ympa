# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.returns_api_base import BaseReturnsApi
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
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_return_response import GetReturnResponse
from ympa_python_fastapi_server.models.get_returns_response import GetReturnsResponse
from ympa_python_fastapi_server.models.refund_status_type import RefundStatusType
from ympa_python_fastapi_server.models.return_type import ReturnType
from ympa_python_fastapi_server.models.set_return_decision_request import SetReturnDecisionRequest
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}",
    responses={
        200: {"model": GetReturnResponse, "description": "Детали возврата."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","fbs","dbs","express","fby"],
    summary="Информация о невыкупе или возврате",
    response_model_by_alias=True,
)
async def get_return(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    returnId: int = Path(..., description="Идентификатор возврата."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetReturnResponse:
    """Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseReturnsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReturnsApi.subclasses[0]().get_return(campaignId, orderId, returnId)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application",
    responses={
        200: {"model": file, "description": "Заявление на возврат."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","fbs","dbs","express"],
    summary="Получение заявления на возврат",
    response_model_by_alias=True,
)
async def get_return_application(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    returnId: int = Path(..., description="Идентификатор возврата."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> file:
    """Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseReturnsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReturnsApi.subclasses[0]().get_return_application(campaignId, orderId, returnId)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}",
    responses={
        200: {"model": file, "description": "Фотография возврата."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","fbs","dbs","express","fby"],
    summary="Получение фотографии возврата",
    response_model_by_alias=True,
)
async def get_return_photo(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    returnId: int = Path(..., description="Идентификатор возврата."),
    itemId: int = Path(..., description="Идентификатор товара в возврате."),
    imageHash: str = Path(..., description="Хеш ссылки изображения для загрузки."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> file:
    """Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseReturnsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReturnsApi.subclasses[0]().get_return_photo(campaignId, orderId, returnId, itemId, imageHash)


@router.get(
    "/campaigns/{campaignId}/returns",
    responses={
        200: {"model": GetReturnsResponse, "description": "Постраничные возвраты партнера."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","fbs","dbs","express","fby"],
    summary="Список невыкупов и возвратов",
    response_model_by_alias=True,
)
async def get_returns(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    order_ids: List[int] = Query(None, description="Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. ", alias="orderIds"),
    statuses: List[RefundStatusType] = Query(None, description="Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. ", alias="statuses"),
    type:  = Query(None, description="Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. ", alias="type"),
    from_date: str = Query(None, description="Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ", alias="fromDate"),
    to_date: str = Query(None, description="Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ", alias="toDate"),
    from_date2: str = Query(None, description="{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. ", alias="from_date"),
    to_date2: str = Query(None, description="{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. ", alias="to_date"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetReturnsResponse:
    """Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseReturnsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReturnsApi.subclasses[0]().get_returns(campaignId, page_token, limit, order_ids, statuses, type, from_date, to_date, from_date2, to_date2)


@router.post(
    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision",
    responses={
        200: {"model": EmptyApiResponse, "description": "Детали возврата."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","dbs"],
    summary="Принятие или изменение решения по возврату",
    response_model_by_alias=True,
)
async def set_return_decision(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    returnId: int = Path(..., description="Идентификатор возврата."),
    set_return_decision_request: SetReturnDecisionRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseReturnsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReturnsApi.subclasses[0]().set_return_decision(campaignId, orderId, returnId, set_return_decision_request)


@router.post(
    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit",
    responses={
        200: {"model": EmptyApiResponse, "description": "Статус выполнения операции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","dbs"],
    summary="Подтверждение решения по возврату",
    response_model_by_alias=True,
)
async def submit_return_decision(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    returnId: int = Path(..., description="Идентификатор возврата."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseReturnsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseReturnsApi.subclasses[0]().submit_return_decision(campaignId, orderId, returnId)
