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
from app.ympa_python_blueplanet_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_bids_info_request import GetBidsInfoRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_bids_info_response import GetBidsInfoResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_bids_recommendations_request import GetBidsRecommendationsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_bids_recommendations_response import GetBidsRecommendationsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.put_sku_bids_request import PutSkuBidsRequest  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestBidsController(BaseTestCase):
    """BidsController integration test stubs"""

    def test_get_bids_info_for_business(self):
        """Test case for get_bids_info_for_business

        Информация об установленных ставках
        """
        body = {"skus":[null,null,null,null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/bids/info'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bids_recommendations(self):
        """Test case for get_bids_recommendations

        Рекомендованные ставки для заданных товаров
        """
        body = {"skus":[null,null,null,null,null]}
        response = self.client.open(
            '/businesses/{business_id}/bids/recommendations'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_bids_for_business(self):
        """Test case for put_bids_for_business

        Включение буста продаж и установка ставок
        """
        body = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}
        response = self.client.open(
            '/businesses/{business_id}/bids'.format(business_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_bids_for_campaign(self):
        """Test case for put_bids_for_campaign

        Включение буста продаж и установка ставок для магазина
        """
        body = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/bids'.format(campaign_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
