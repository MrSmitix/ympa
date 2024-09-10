# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from ympa_python_pydantic_v1_client.models.get_campaigns_response import GetCampaignsResponse  # noqa: E501

class TestGetCampaignsResponse(unittest.TestCase):
    """GetCampaignsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetCampaignsResponse:
        """Test GetCampaignsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetCampaignsResponse`
        """
        model = GetCampaignsResponse()  # noqa: E501
        if include_optional:
            return GetCampaignsResponse(
                campaigns = [
                    ympa_python_pydantic_v1_client.models.campaign_dto.CampaignDTO(
                        domain = '', 
                        id = 56, 
                        client_id = 56, 
                        business = ympa_python_pydantic_v1_client.models.business_dto.BusinessDTO(
                            id = 56, 
                            name = '', ), 
                        placement_type = 'FBS', )
                    ],
                pager = ympa_python_pydantic_v1_client.models.flipping_pager_dto.FlippingPagerDTO(
                    total = 56, 
                    from = 56, 
                    to = 56, 
                    current_page = 56, 
                    pages_count = 56, 
                    page_size = 56, )
            )
        else:
            return GetCampaignsResponse(
                campaigns = [
                    ympa_python_pydantic_v1_client.models.campaign_dto.CampaignDTO(
                        domain = '', 
                        id = 56, 
                        client_id = 56, 
                        business = ympa_python_pydantic_v1_client.models.business_dto.BusinessDTO(
                            id = 56, 
                            name = '', ), 
                        placement_type = 'FBS', )
                    ],
        )
        """

    def testGetCampaignsResponse(self):
        """Test GetCampaignsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
