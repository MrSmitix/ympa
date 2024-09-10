# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_offer_content_request import UpdateOfferContentRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_offer_content_response import UpdateOfferContentResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestContentController(BaseTestCase):
    """ContentController integration test stubs"""

    def test_get_category_content_parameters(self):
        """Test case for get_category_content_parameters

        Списки характеристик товаров по категориям
        """
        response = self.client.open(
            '/category/{category_id}/parameters'.format(category_id=56),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offer_cards_content_status(self):
        """Test case for get_offer_cards_content_status

        Получение информации о заполненности карточек магазина
        """
        body = {"categoryIds":[null,null,null,null,null],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/offer-cards'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_offer_content(self):
        """Test case for update_offer_content

        Редактирование категорийных характеристик товара
        """
        body = {"offersContent":[{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]}]}
        response = self.client.open(
            '/businesses/{business_id}/offer-cards/update'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
