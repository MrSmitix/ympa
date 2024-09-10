import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest  # noqa: E501
from ympa_python_flask_server.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse  # noqa: E501
from ympa_python_flask_server.models.get_prices_response import GetPricesResponse  # noqa: E501
from ympa_python_flask_server.models.suggest_prices_request import SuggestPricesRequest  # noqa: E501
from ympa_python_flask_server.models.suggest_prices_response import SuggestPricesResponse  # noqa: E501
from ympa_python_flask_server.models.update_business_prices_request import UpdateBusinessPricesRequest  # noqa: E501
from ympa_python_flask_server.models.update_prices_request import UpdatePricesRequest  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestPricesController(BaseTestCase):
    """PricesController integration test stubs"""

    def test_get_prices(self):
        """Test case for get_prices

        Список цен
        """
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('archived', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_prices_by_offer_ids(self):
        """Test case for get_prices_by_offer_ids

        Просмотр цен на указанные товары в магазине
        """
        get_prices_by_offer_ids_request = {"offerIds":[null,null,null,null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_prices_by_offer_ids_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_suggested_prices(self):
        """Test case for get_suggested_prices

        Цены для продвижения товаров
        """
        suggest_prices_request = {"offers":[{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices/suggestions'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(suggest_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_business_prices(self):
        """Test case for update_business_prices

        Установка цен на товары во всех магазинах
        """
        update_business_prices_request = {"offers":[{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-prices/updates'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_business_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_prices(self):
        """Test case for update_prices

        Установка цен на товары в конкретном магазине
        """
        update_prices_request = {"offers":[{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices/updates'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
