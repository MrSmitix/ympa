import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.delete_promo_offers_request import DeletePromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.delete_promo_offers_response import DeletePromoOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_promo_offers_request import GetPromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.get_promo_offers_response import GetPromoOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_promos_request import GetPromosRequest  # noqa: E501
from ympa_python_flask_server.models.get_promos_response import GetPromosResponse  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_request import UpdatePromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_response import UpdatePromoOffersResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestPromosController(BaseTestCase):
    """PromosController integration test stubs"""

    def test_delete_promo_offers(self):
        """Test case for delete_promo_offers

        Удаление товаров из акции
        """
        delete_promo_offers_request = {"deleteAllOffers":True,"promoId":"promoId","offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos/offers/delete'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_promo_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_promo_offers(self):
        """Test case for get_promo_offers

        Получение списка товаров, которые участвуют или могут участвовать в акции
        """
        get_promo_offers_request = {"statusType":"MANUALLY_ADDED","promoId":"promoId"}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos/offers'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_promo_offers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_promos(self):
        """Test case for get_promos

        Получение списка акций
        """
        get_promos_request = {"participation":"PARTICIPATING_NOW","mechanics":"DIRECT_DISCOUNT"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_promos_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_promo_offers(self):
        """Test case for update_promo_offers

        Добавление товаров в акцию или изменение их цен
        """
        update_promo_offers_request = {"offers":[{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}}],"promoId":"promoId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos/offers/update'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_promo_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
