from typing import List, Dict
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_return_response import GetReturnResponse
from ympa_python_aiohttp_server.models.get_returns_response import GetReturnsResponse
from ympa_python_aiohttp_server.models.refund_status_type import RefundStatusType
from ympa_python_aiohttp_server.models.return_type import ReturnType
from ympa_python_aiohttp_server.models.set_return_decision_request import SetReturnDecisionRequest
from ympa_python_aiohttp_server import util


async def get_return(request: web.Request, campaign_id, order_id, return_id) -> web.Response:
    """Информация о невыкупе или возврате

    Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param return_id: Идентификатор возврата.
    :type return_id: int

    """
    return web.Response(status=200)


async def get_return_application(request: web.Request, campaign_id, order_id, return_id) -> web.Response:
    """Получение заявления на возврат

    Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param return_id: Идентификатор возврата.
    :type return_id: int

    """
    return web.Response(status=200)


async def get_return_photo(request: web.Request, campaign_id, order_id, return_id, item_id, image_hash) -> web.Response:
    """Получение фотографии возврата

    Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param return_id: Идентификатор возврата.
    :type return_id: int
    :param item_id: Идентификатор товара в возврате.
    :type item_id: int
    :param image_hash: Хеш ссылки изображения для загрузки.
    :type image_hash: str

    """
    return web.Response(status=200)


async def get_returns(request: web.Request, campaign_id, page_token=None, limit=None, order_ids=None, statuses=None, type=None, from_date=None, to_date=None, from_date2=None, to_date2=None) -> web.Response:
    """Список невыкупов и возвратов

    Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param order_ids: Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
    :type order_ids: List[int]
    :param statuses: Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
    :type statuses: list | bytes
    :param type: Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
    :type type: dict | bytes
    :param from_date: Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
    :type from_date: str
    :param to_date: Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
    :type to_date: str
    :param from_date2: {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
    :type from_date2: str
    :param to_date2: {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
    :type to_date2: str

    """
    statuses = [RefundStatusType.from_dict(d) for d in statuses]
    type = .from_dict(type)
    from_date = util.deserialize_date(from_date)
    to_date = util.deserialize_date(to_date)
    from_date2 = util.deserialize_date(from_date2)
    to_date2 = util.deserialize_date(to_date2)
    return web.Response(status=200)


async def set_return_decision(request: web.Request, campaign_id, order_id, return_id, body) -> web.Response:
    """Принятие или изменение решения по возврату

    Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param return_id: Идентификатор возврата.
    :type return_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = SetReturnDecisionRequest.from_dict(body)
    return web.Response(status=200)


async def submit_return_decision(request: web.Request, campaign_id, order_id, return_id) -> web.Response:
    """Подтверждение решения по возврату

    Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param return_id: Идентификатор возврата.
    :type return_id: int

    """
    return web.Response(status=200)
