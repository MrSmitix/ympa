import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.change_outlet_request import ChangeOutletRequest  # noqa: E501
from ympa_python_flask_server.models.create_outlet_response import CreateOutletResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_outlet_response import GetOutletResponse  # noqa: E501
from ympa_python_flask_server.models.get_outlets_response import GetOutletsResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestOutletsController(BaseTestCase):
    """OutletsController integration test stubs"""

    def test_create_outlet(self):
        """Test case for create_outlet

        Создание точки продаж
        """
        change_outlet_request = {"storagePeriod":0,"address":{"number":"number","km":6,"regionId":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","isMain":True,"shopOutletCode":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","workingSchedule":{"scheduleItems":[{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"},{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"}],"workInHoliday":True},"deliveryRules":[{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True},{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(change_outlet_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_outlet(self):
        """Test case for delete_outlet

        Удаление точки продаж
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_outlet(self):
        """Test case for get_outlet

        Информация об одной точке продаж
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_outlets(self):
        """Test case for get_outlets

        Информация о нескольких точках продаж
        """
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('region_id', 56),
                        ('shop_outlet_code', 'shop_outlet_code_example'),
                        ('regionId', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_outlet(self):
        """Test case for update_outlet

        Изменение информации о точке продаж
        """
        change_outlet_request = {"storagePeriod":0,"address":{"number":"number","km":6,"regionId":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","isMain":True,"shopOutletCode":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","workingSchedule":{"scheduleItems":[{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"},{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"}],"workInHoliday":True},"deliveryRules":[{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True},{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(change_outlet_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
