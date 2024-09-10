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
from app.ympa_python_blueplanet_server.models.currency_type import CurrencyType  # noqa: E501
from app.ympa_python_blueplanet_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_all_offers_response import GetAllOffersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_campaign_offers_request import GetCampaignOffersRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_campaign_offers_response import GetCampaignOffersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_offers_response import GetOffersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestOffersController(BaseTestCase):
    """OffersController integration test stubs"""

    def test_delete_campaign_offers(self):
        """Test case for delete_campaign_offers

        Удаление товаров из ассортимента магазина
        """
        body = {"offerIds":[null,null,null,null,null]}
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/delete'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_offers(self):
        """Test case for get_all_offers

        Все предложения магазина
        """
        query_string = [('feed_id', 56),
                        ('chunk', 56)]
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/all'.format(campaign_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_offers(self):
        """Test case for get_campaign_offers

        Информация о товарах, которые размещены в заданном магазине
        """
        body = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"statuses":["PUBLISHED","PUBLISHED"],"offerIds":[null,null,null,null,null],"tags":["tags","tags"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/campaigns/{campaign_id}/offers'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offer_recommendations(self):
        """Test case for get_offer_recommendations

        Рекомендации Маркета, касающиеся цен
        """
        body = {"cofinancePriceFilter":"SPECIFIED","competitivenessFilter":"OPTIMAL","offerIds":[null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/offers/recommendations'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offers(self):
        """Test case for get_offers

        Предложения магазина
        """
        query_string = [('query', 'query_example'),
                        ('feed_id', 56),
                        ('shop_category_id', 'shop_category_id_example'),
                        ('currency', ympa_python_blueplanet_server.CurrencyType()),
                        ('matched', True),
                        ('page', 1),
                        ('page_size', 56)]
        response = self.client.open(
            '/campaigns/{campaign_id}/offers'.format(campaign_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_campaign_offers(self):
        """Test case for update_campaign_offers

        Изменение условий продажи товаров в магазине
        """
        body = {"offers":[{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/update'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
