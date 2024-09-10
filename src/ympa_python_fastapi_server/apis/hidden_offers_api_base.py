# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.add_hidden_offers_request import AddHiddenOffersRequest
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_hidden_offers_response import GetHiddenOffersResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseHiddenOffersApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseHiddenOffersApi.subclasses = BaseHiddenOffersApi.subclasses + (cls,)
    async def add_hidden_offers(
        self,
        campaignId: int,
        add_hidden_offers_request: AddHiddenOffersRequest,
    ) -> EmptyApiResponse:
        """Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def delete_hidden_offers(
        self,
        campaignId: int,
        delete_hidden_offers_request: DeleteHiddenOffersRequest,
    ) -> EmptyApiResponse:
        """Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def get_hidden_offers(
        self,
        campaignId: int,
        offer_id: List[str],
        page_token: str,
        limit: int,
        offset: int,
        page: int,
        page_size: int,
    ) -> GetHiddenOffersResponse:
        """Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
        ...
