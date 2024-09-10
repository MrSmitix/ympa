# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.change_outlet_request import ChangeOutletRequest
from ympa_python_fastapi_server.models.create_outlet_response import CreateOutletResponse
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_outlet_response import GetOutletResponse
from ympa_python_fastapi_server.models.get_outlets_response import GetOutletsResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseOutletsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseOutletsApi.subclasses = BaseOutletsApi.subclasses + (cls,)
    async def create_outlet(
        self,
        campaignId: int,
        change_outlet_request: ChangeOutletRequest,
    ) -> CreateOutletResponse:
        """Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| """
        ...


    async def delete_outlet(
        self,
        campaignId: int,
        outletId: int,
    ) -> EmptyApiResponse:
        """Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| """
        ...


    async def get_outlet(
        self,
        campaignId: int,
        outletId: int,
    ) -> GetOutletResponse:
        """Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| """
        ...


    async def get_outlets(
        self,
        campaignId: int,
        page_token: str,
        region_id: int,
        shop_outlet_code: str,
        region_id2: int,
    ) -> GetOutletsResponse:
        """Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| """
        ...


    async def update_outlet(
        self,
        campaignId: int,
        outletId: int,
        change_outlet_request: ChangeOutletRequest,
    ) -> EmptyApiResponse:
        """Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| """
        ...
