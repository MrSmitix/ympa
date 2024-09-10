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
from app.ympa_python_blueplanet_server.models.get_order_buyer_info_response import GetOrderBuyerInfoResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.set_order_delivery_date_request import SetOrderDeliveryDateRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.set_order_delivery_track_code_request import SetOrderDeliveryTrackCodeRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_order_storage_limit_request import UpdateOrderStorageLimitRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.verify_order_eac_request import VerifyOrderEacRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.verify_order_eac_response import VerifyOrderEacResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestOrderDeliveryController(BaseTestCase):
    """OrderDeliveryController integration test stubs"""

    def test_get_order_buyer_info(self):
        """Test case for get_order_buyer_info

        Информация о покупателе — физическом лице
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/buyer'.format(campaign_id=56, order_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_delivery_date(self):
        """Test case for set_order_delivery_date

        Изменение даты доставки заказа
        """
        body = {"reason":"USER_MOVED_DELIVERY_DATES","dates":{"toDate":"2000-01-23"}}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/date'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_delivery_track_code(self):
        """Test case for set_order_delivery_track_code

        Передача трек‑номера посылки
        """
        body = {"trackCode":"trackCode","deliveryServiceId":0}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/track'.format(campaign_id=56, order_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_storage_limit(self):
        """Test case for update_order_storage_limit

        Продление срока хранения заказа
        """
        body = {"newDate":"2000-01-23"}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/storage-limit'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_verify_order_eac(self):
        """Test case for verify_order_eac

        Передача кода подтверждения
        """
        body = {"code":"code"}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/verifyEac'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
