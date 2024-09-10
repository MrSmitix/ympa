from typing import List, Dict
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest
from ympa_python_aiohttp_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse
from ympa_python_aiohttp_server.models.get_categories_request import GetCategoriesRequest
from ympa_python_aiohttp_server.models.get_categories_response import GetCategoriesResponse
from ympa_python_aiohttp_server import util


async def get_categories_max_sale_quantum(request: web.Request, body) -> web.Response:
    """Лимит на установку кванта продажи и минимального количества товаров в заказе

    Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

    :param body: 
    :type body: dict | bytes

    """
    body = GetCategoriesMaxSaleQuantumRequest.from_dict(body)
    return web.Response(status=200)


async def get_categories_tree(request: web.Request, body=None) -> web.Response:
    """Дерево категорий

    Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

    :param body: 
    :type body: dict | bytes

    """
    body = GetCategoriesRequest.from_dict(body)
    return web.Response(status=200)
