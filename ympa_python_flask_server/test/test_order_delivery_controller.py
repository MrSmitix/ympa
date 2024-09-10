import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_order_buyer_info_response import GetOrderBuyerInfoResponse  # noqa: E501
from ympa_python_flask_server.models.set_order_delivery_date_request import SetOrderDeliveryDateRequest  # noqa: E501
from ympa_python_flask_server.models.set_order_delivery_track_code_request import SetOrderDeliveryTrackCodeRequest  # noqa: E501
from ympa_python_flask_server.models.update_order_storage_limit_request import UpdateOrderStorageLimitRequest  # noqa: E501
from ympa_python_flask_server.models.verify_order_eac_request import VerifyOrderEacRequest  # noqa: E501
from ympa_python_flask_server.models.verify_order_eac_response import VerifyOrderEacResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestOrderDeliveryController(BaseTestCase):
    """OrderDeliveryController integration test stubs"""

    def test_get_order_buyer_info(self):
        """Test case for get_order_buyer_info

        Информация о покупателе — физическом лице
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/buyer'.format(campaign_id=56, order_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_delivery_date(self):
        """Test case for set_order_delivery_date

        Изменение даты доставки заказа
        """
        set_order_delivery_date_request = {"reason":"USER_MOVED_DELIVERY_DATES","dates":{"toDate":"2000-01-23"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/date'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(set_order_delivery_date_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_delivery_track_code(self):
        """Test case for set_order_delivery_track_code

        Передача трек‑номера посылки
        """
        set_order_delivery_track_code_request = {"trackCode":"trackCode","deliveryServiceId":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/track'.format(campaign_id=56, order_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(set_order_delivery_track_code_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_storage_limit(self):
        """Test case for update_order_storage_limit

        Продление срока хранения заказа
        """
        update_order_storage_limit_request = {"newDate":"2000-01-23"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/storage-limit'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_order_storage_limit_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_verify_order_eac(self):
        """Test case for verify_order_eac

        Передача кода подтверждения
        """
        verify_order_eac_request = {"code":"code"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/verifyEac'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(verify_order_eac_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
