import unittest

from flask import json

from ympa_python_flask_server.models.add_hidden_offers_request import AddHiddenOffersRequest  # noqa: E501
from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_hidden_offers_response import GetHiddenOffersResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestHiddenOffersController(BaseTestCase):
    """HiddenOffersController integration test stubs"""

    def test_add_hidden_offers(self):
        """Test case for add_hidden_offers

        Скрытие товаров и настройки скрытия
        """
        add_hidden_offers_request = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(add_hidden_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_hidden_offers(self):
        """Test case for delete_hidden_offers

        Возобновление показа товаров
        """
        delete_hidden_offers_request = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/hidden-offers/delete'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_hidden_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_hidden_offers(self):
        """Test case for get_hidden_offers

        Информация о скрытых вами товарах
        """
        query_string = [('offer_id', ['offer_id_example']),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('offset', 56),
                        ('page', 1),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
