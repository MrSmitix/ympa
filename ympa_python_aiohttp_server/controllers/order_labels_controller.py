from typing import List, Dict
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse
from ympa_python_aiohttp_server.models.page_format_type import PageFormatType
from ympa_python_aiohttp_server import util


async def generate_order_label(request: web.Request, campaign_id, order_id, shipment_id, box_id, format=None) -> web.Response:
    """Готовый ярлык‑наклейка для коробки в заказе

    Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param shipment_id: Идентификатор грузоместа.
    :type shipment_id: int
    :param box_id: Идентификатор коробки.
    :type box_id: int
    :param format: Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    :type format: dict | bytes

    """
    format = .from_dict(format)
    return web.Response(status=200)


async def generate_order_labels(request: web.Request, campaign_id, order_id, format=None) -> web.Response:
    """Готовые ярлыки‑наклейки на все коробки в одном заказе

    Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param format: Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    :type format: dict | bytes

    """
    format = .from_dict(format)
    return web.Response(status=200)


async def get_order_labels_data(request: web.Request, campaign_id, order_id) -> web.Response:
    """Данные для самостоятельного изготовления ярлыков

    Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int

    """
    return web.Response(status=200)
