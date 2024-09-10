# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse
from ympa_python_fastapi_server.models.page_format_type import PageFormatType
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseOrderLabelsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseOrderLabelsApi.subclasses = BaseOrderLabelsApi.subclasses + (cls,)
    async def generate_order_label(
        self,
        campaignId: int,
        orderId: int,
        shipmentId: int,
        boxId: int,
        format: ,
    ) -> file:
        """Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
        ...


    async def generate_order_labels(
        self,
        campaignId: int,
        orderId: int,
        format: ,
    ) -> file:
        """Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
        ...


    async def get_order_labels_data(
        self,
        campaignId: int,
        orderId: int,
    ) -> GetOrderLabelsDataResponse:
        """Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
        ...
