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
from app.ympa_python_blueplanet_server.models.get_goods_stats_request import GetGoodsStatsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_goods_stats_response import GetGoodsStatsResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestGoodsStatsController(BaseTestCase):
    """GoodsStatsController integration test stubs"""

    def test_get_goods_stats(self):
        """Test case for get_goods_stats

        Отчет по товарам
        """
        body = {"shopSkus":[null,null,null,null,null]}
        response = self.client.open(
            '/campaigns/{campaign_id}/stats/skus'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
