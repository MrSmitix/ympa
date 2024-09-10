# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.get_business_settings_response import GetBusinessSettingsResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseBusinessesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBusinessesApi.subclasses = BaseBusinessesApi.subclasses + (cls,)
    async def get_business_settings(
        self,
        businessId: int,
    ) -> GetBusinessSettingsResponse:
        """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...
