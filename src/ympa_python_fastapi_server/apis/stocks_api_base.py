# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest
from ympa_python_fastapi_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse
from ympa_python_fastapi_server.models.update_stocks_request import UpdateStocksRequest
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseStocksApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseStocksApi.subclasses = BaseStocksApi.subclasses + (cls,)
    async def get_stocks(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        get_warehouse_stocks_request: GetWarehouseStocksRequest,
    ) -> GetWarehouseStocksResponse:
        """Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) """
        ...


    async def update_stocks(
        self,
        campaignId: int,
        update_stocks_request: UpdateStocksRequest,
    ) -> EmptyApiResponse:
        """Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| """
        ...
