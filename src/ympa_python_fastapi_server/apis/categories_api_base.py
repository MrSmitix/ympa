# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

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

class BaseCategoriesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCategoriesApi.subclasses = BaseCategoriesApi.subclasses + (cls,)
    async def get_categories_max_sale_quantum(
        self,
        get_categories_max_sale_quantum_request: GetCategoriesMaxSaleQuantumRequest,
    ) -> GetCategoriesMaxSaleQuantumResponse:
        """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_categories_tree(
        self,
        get_categories_request: GetCategoriesRequest,
    ) -> GetCategoriesResponse:
        """Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...
