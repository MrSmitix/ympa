import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.calculate_tariffs_request import CalculateTariffsRequest  # noqa: E501
from ympa_python_flask_server.models.calculate_tariffs_response import CalculateTariffsResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestTariffsController(BaseTestCase):
    """TariffsController integration test stubs"""

    def test_calculate_tariffs(self):
        """Test case for calculate_tariffs

        Калькулятор стоимости услуг
        """
        calculate_tariffs_request = {"offers":[{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328}],"parameters":{"campaignId":0,"sellingProgram":"FBY","frequency":"DAILY"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/tariffs/calculate',
            method='POST',
            headers=headers,
            data=json.dumps(calculate_tariffs_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
