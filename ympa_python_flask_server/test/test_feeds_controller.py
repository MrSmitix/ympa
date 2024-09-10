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
from ympa_python_flask_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType  # noqa: E501
from ympa_python_flask_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse  # noqa: E501
from ympa_python_flask_server.models.get_feed_response import GetFeedResponse  # noqa: E501
from ympa_python_flask_server.models.get_feeds_response import GetFeedsResponse  # noqa: E501
from ympa_python_flask_server.models.set_feed_params_request import SetFeedParamsRequest  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestFeedsController(BaseTestCase):
    """FeedsController integration test stubs"""

    def test_get_feed(self):
        """Test case for get_feed

        Информация о прайс-листе
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}'.format(campaign_id=56, feed_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feed_index_logs(self):
        """Test case for get_feed_index_logs

        Отчет по индексации прайс-листа
        """
        query_string = [('limit', 20),
                        ('published_time_from', '2013-10-20T19:20:30+01:00'),
                        ('published_time_to', '2013-10-20T19:20:30+01:00'),
                        ('status', ympa_python_flask_server.FeedIndexLogsStatusType())]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}/index-logs'.format(campaign_id=56, feed_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feeds(self):
        """Test case for get_feeds

        Список прайс-листов магазина
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds'.format(campaign_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_refresh_feed(self):
        """Test case for refresh_feed

        Сообщить, что прайс-лист обновился
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}/refresh'.format(campaign_id=56, feed_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_feed_params(self):
        """Test case for set_feed_params

        Изменение параметров прайс-листа
        """
        set_feed_params_request = {"parameters":[{"deleted":True,"values":[0,0],"name":"name"},{"deleted":True,"values":[0,0],"name":"name"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}/params'.format(campaign_id=56, feed_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(set_feed_params_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
