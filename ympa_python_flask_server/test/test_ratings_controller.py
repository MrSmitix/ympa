import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse  # noqa: E501
from ympa_python_flask_server.models.get_quality_rating_request import GetQualityRatingRequest  # noqa: E501
from ympa_python_flask_server.models.get_quality_rating_response import GetQualityRatingResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestRatingsController(BaseTestCase):
    """RatingsController integration test stubs"""

    def test_get_quality_rating_details(self):
        """Test case for get_quality_rating_details

        Заказы, которые повлияли на индекс качества
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/ratings/quality/details'.format(campaign_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_quality_ratings(self):
        """Test case for get_quality_ratings

        Индекс качества магазинов
        """
        get_quality_rating_request = {"dateTo":"2000-01-23","campaignIds":[0,0,0,0,0],"dateFrom":"2000-01-23"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/ratings/quality'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_quality_rating_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
