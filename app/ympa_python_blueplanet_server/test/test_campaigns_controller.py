# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_campaign_logins_response import GetCampaignLoginsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_campaign_region_response import GetCampaignRegionResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_campaign_response import GetCampaignResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_campaign_settings_response import GetCampaignSettingsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_campaigns_response import GetCampaignsResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestCampaignsController(BaseTestCase):
    """CampaignsController integration test stubs"""

    def test_get_campaign(self):
        """Test case for get_campaign

        Информация о магазине
        """
        response = self.client.open(
            '/campaigns/{campaign_id}'.format(campaign_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_logins(self):
        """Test case for get_campaign_logins

        Логины, связанные с магазином
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/logins'.format(campaign_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_region(self):
        """Test case for get_campaign_region

        Регион магазина
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/region'.format(campaign_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_settings(self):
        """Test case for get_campaign_settings

        Настройки магазина
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/settings'.format(campaign_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaigns(self):
        """Test case for get_campaigns

        Список магазинов пользователя
        """
        query_string = [('page', 1),
                        ('page_size', 56)]
        response = self.client.open(
            '/campaigns',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaigns_by_login(self):
        """Test case for get_campaigns_by_login

        Магазины, доступные логину
        """
        query_string = [('page', 1),
                        ('page_size', 56)]
        response = self.client.open(
            '/campaigns/by_login/{login}'.format(login='login_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
