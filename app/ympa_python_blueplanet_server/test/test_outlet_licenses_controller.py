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
from app.ympa_python_blueplanet_server.models.get_outlet_licenses_response import GetOutletLicensesResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_outlet_license_request import UpdateOutletLicenseRequest  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestOutletLicensesController(BaseTestCase):
    """OutletLicensesController integration test stubs"""

    def test_delete_outlet_licenses(self):
        """Test case for delete_outlet_licenses

        Удаление лицензий для точек продаж
        """
        query_string = [('ids', [56])]
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_outlet_licenses(self):
        """Test case for get_outlet_licenses

        Информация о лицензиях для точек продаж
        """
        query_string = [('outlet_ids', [56]),
                        ('ids', [56])]
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_outlet_licenses(self):
        """Test case for update_outlet_licenses

        Создание и изменение лицензий для точек продаж
        """
        body = {"licenses":[{"licenseType":"ALCOHOL","number":"number","dateOfExpiry":"2000-01-23T04:56:07.000+00:00","outletId":6,"id":0,"dateOfIssue":"2000-01-23T04:56:07.000+00:00"},{"licenseType":"ALCOHOL","number":"number","dateOfExpiry":"2000-01-23T04:56:07.000+00:00","outletId":6,"id":0,"dateOfIssue":"2000-01-23T04:56:07.000+00:00"}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
