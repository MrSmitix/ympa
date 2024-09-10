# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.confirm_prices_request import ConfirmPricesRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_quarantine_offers_request import GetQuarantineOffersRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_quarantine_offers_response import GetQuarantineOffersResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestPriceQuarantineController(BaseTestCase):
    """PriceQuarantineController integration test stubs"""

    def test_confirm_business_prices(self):
        """Test case for confirm_business_prices

        Удаление товара из карантина по цене в кабинете
        """
        body = {"offerIds":[null,null,null,null,null]}
        response = self.client.open(
            '/businesses/{business_id}/price-quarantine/confirm'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_confirm_campaign_prices(self):
        """Test case for confirm_campaign_prices

        Удаление товара из карантина по цене в магазине
        """
        body = {"offerIds":[null,null,null,null,null]}
        response = self.client.open(
            '/campaigns/{campaign_id}/price-quarantine/confirm'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_business_quarantine_offers(self):
        """Test case for get_business_quarantine_offers

        Список товаров, находящихся в карантине по цене в кабинете
        """
        body = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/price-quarantine'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_quarantine_offers(self):
        """Test case for get_campaign_quarantine_offers

        Список товаров, находящихся в карантине по цене в магазине
        """
        body = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/campaigns/{campaign_id}/price-quarantine'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
