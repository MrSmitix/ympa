# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.get_campaign_logins_response import GetCampaignLoginsResponse
from ympa_python_fastapi_server.models.get_campaign_region_response import GetCampaignRegionResponse
from ympa_python_fastapi_server.models.get_campaign_response import GetCampaignResponse
from ympa_python_fastapi_server.models.get_campaign_settings_response import GetCampaignSettingsResponse
from ympa_python_fastapi_server.models.get_campaigns_response import GetCampaignsResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseCampaignsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCampaignsApi.subclasses = BaseCampaignsApi.subclasses + (cls,)
    async def get_campaign(
        self,
        campaignId: int,
    ) -> GetCampaignResponse:
        """Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaign_logins(
        self,
        campaignId: int,
    ) -> GetCampaignLoginsResponse:
        """Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaign_region(
        self,
        campaignId: int,
    ) -> GetCampaignRegionResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| """
        ...


    async def get_campaign_settings(
        self,
        campaignId: int,
    ) -> GetCampaignSettingsResponse:
        """Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaigns(
        self,
        page: int,
        page_size: int,
    ) -> GetCampaignsResponse:
        """Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaigns_by_login(
        self,
        login: str,
        page: int,
        page_size: int,
    ) -> GetCampaignsResponse:
        """Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...
