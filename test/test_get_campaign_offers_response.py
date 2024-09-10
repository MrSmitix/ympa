# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_campaign_offers_response import GetCampaignOffersResponse

class TestGetCampaignOffersResponse(unittest.TestCase):
    """GetCampaignOffersResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetCampaignOffersResponse:
        """Test GetCampaignOffersResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetCampaignOffersResponse`
        """
        model = GetCampaignOffersResponse()
        if include_optional:
            return GetCampaignOffersResponse(
                status = 'OK',
                result = ympa_python_client.models.get_campaign_offers_result_dto.GetCampaignOffersResultDTO(
                    paging = ympa_python_client.models.scrolling_pager_dto.ScrollingPagerDTO(), 
                    offers = [
                        ympa_python_client.models.get_campaign_offer_dto.GetCampaignOfferDTO()
                        ], )
            )
        else:
            return GetCampaignOffersResponse(
        )
        """

    def testGetCampaignOffersResponse(self):
        """Test GetCampaignOffersResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
