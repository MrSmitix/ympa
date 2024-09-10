# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.delete_promo_offers_request import DeletePromoOffersRequest
from ympa_python_fastapi_server.models.delete_promo_offers_response import DeletePromoOffersResponse
from ympa_python_fastapi_server.models.get_promo_offers_request import GetPromoOffersRequest
from ympa_python_fastapi_server.models.get_promo_offers_response import GetPromoOffersResponse
from ympa_python_fastapi_server.models.get_promos_request import GetPromosRequest
from ympa_python_fastapi_server.models.get_promos_response import GetPromosResponse
from ympa_python_fastapi_server.models.update_promo_offers_request import UpdatePromoOffersRequest
from ympa_python_fastapi_server.models.update_promo_offers_response import UpdatePromoOffersResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BasePromosApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePromosApi.subclasses = BasePromosApi.subclasses + (cls,)
    async def delete_promo_offers(
        self,
        businessId: int,
        delete_promo_offers_request: DeletePromoOffersRequest,
    ) -> DeletePromoOffersResponse:
        """Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def get_promo_offers(
        self,
        businessId: int,
        get_promo_offers_request: GetPromoOffersRequest,
        page_token: str,
        limit: int,
    ) -> GetPromoOffersResponse:
        """Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def get_promos(
        self,
        businessId: int,
        get_promos_request: GetPromosRequest,
    ) -> GetPromosResponse:
        """Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def update_promo_offers(
        self,
        businessId: int,
        update_promo_offers_request: UpdatePromoOffersRequest,
    ) -> UpdatePromoOffersResponse:
        """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...
