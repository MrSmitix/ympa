from typing import List, Dict
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.delete_promo_offers_request import DeletePromoOffersRequest
from ympa_python_aiohttp_server.models.delete_promo_offers_response import DeletePromoOffersResponse
from ympa_python_aiohttp_server.models.get_promo_offers_request import GetPromoOffersRequest
from ympa_python_aiohttp_server.models.get_promo_offers_response import GetPromoOffersResponse
from ympa_python_aiohttp_server.models.get_promos_request import GetPromosRequest
from ympa_python_aiohttp_server.models.get_promos_response import GetPromosResponse
from ympa_python_aiohttp_server.models.update_promo_offers_request import UpdatePromoOffersRequest
from ympa_python_aiohttp_server.models.update_promo_offers_response import UpdatePromoOffersResponse
from ympa_python_aiohttp_server import util


async def delete_promo_offers(request: web.Request, business_id, body) -> web.Response:
    """Удаление товаров из акции

    Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = DeletePromoOffersRequest.from_dict(body)
    return web.Response(status=200)


async def get_promo_offers(request: web.Request, business_id, body, page_token=None, limit=None) -> web.Response:
    """Получение списка товаров, которые участвуют или могут участвовать в акции

    Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    """
    body = GetPromoOffersRequest.from_dict(body)
    return web.Response(status=200)


async def get_promos(request: web.Request, business_id, body=None) -> web.Response:
    """Получение списка акций

    Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = GetPromosRequest.from_dict(body)
    return web.Response(status=200)


async def update_promo_offers(request: web.Request, business_id, body) -> web.Response:
    """Добавление товаров в акцию или изменение их цен

    Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = UpdatePromoOffersRequest.from_dict(body)
    return web.Response(status=200)
