# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

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

class BaseReturnsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseReturnsApi.subclasses = BaseReturnsApi.subclasses + (cls,)
    async def get_return(
        self,
        campaignId: int,
        orderId: int,
        returnId: int,
    ) -> GetReturnResponse:
        """Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def get_return_application(
        self,
        campaignId: int,
        orderId: int,
        returnId: int,
    ) -> file:
        """Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def get_return_photo(
        self,
        campaignId: int,
        orderId: int,
        returnId: int,
        itemId: int,
        imageHash: str,
    ) -> file:
        """Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def get_returns(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        order_ids: List[int],
        statuses: List[RefundStatusType],
        type: ,
        from_date: str,
        to_date: str,
        from_date2: str,
        to_date2: str,
    ) -> GetReturnsResponse:
        """Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def set_return_decision(
        self,
        campaignId: int,
        orderId: int,
        returnId: int,
        set_return_decision_request: SetReturnDecisionRequest,
    ) -> EmptyApiResponse:
        """Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def submit_return_decision(
        self,
        campaignId: int,
        orderId: int,
        returnId: int,
    ) -> EmptyApiResponse:
        """Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...
