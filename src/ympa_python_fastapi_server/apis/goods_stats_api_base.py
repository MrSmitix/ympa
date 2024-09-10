# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.get_goods_stats_request import GetGoodsStatsRequest
from ympa_python_fastapi_server.models.get_goods_stats_response import GetGoodsStatsResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseGoodsStatsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGoodsStatsApi.subclasses = BaseGoodsStatsApi.subclasses + (cls,)
    async def get_goods_stats(
        self,
        campaignId: int,
        get_goods_stats_request: GetGoodsStatsRequest,
    ) -> GetGoodsStatsResponse:
        """Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...
