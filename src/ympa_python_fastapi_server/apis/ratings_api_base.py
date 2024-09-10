# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse
from ympa_python_fastapi_server.models.get_quality_rating_request import GetQualityRatingRequest
from ympa_python_fastapi_server.models.get_quality_rating_response import GetQualityRatingResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseRatingsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseRatingsApi.subclasses = BaseRatingsApi.subclasses + (cls,)
    async def get_quality_rating_details(
        self,
        campaignId: int,
    ) -> GetQualityRatingDetailsResponse:
        """Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| """
        ...


    async def get_quality_ratings(
        self,
        businessId: int,
        get_quality_rating_request: GetQualityRatingRequest,
    ) -> GetQualityRatingResponse:
        """Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...
