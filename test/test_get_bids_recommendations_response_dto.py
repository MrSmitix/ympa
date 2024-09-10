# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_bids_recommendations_response_dto import GetBidsRecommendationsResponseDTO

class TestGetBidsRecommendationsResponseDTO(unittest.TestCase):
    """GetBidsRecommendationsResponseDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetBidsRecommendationsResponseDTO:
        """Test GetBidsRecommendationsResponseDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetBidsRecommendationsResponseDTO`
        """
        model = GetBidsRecommendationsResponseDTO()
        if include_optional:
            return GetBidsRecommendationsResponseDTO(
                recommendations = [
                    ympa_python_client.models.sku_bid_recommendation_item_dto.SkuBidRecommendationItemDTO(
                        sku = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                        bid = 570, 
                        bid_recommendations = [
                            ympa_python_client.models.bid_recommendation_item_dto.BidRecommendationItemDTO(
                                bid = 570, 
                                show_percent = 0, )
                            ], 
                        price_recommendations = [
                            ympa_python_client.models.price_recommendation_item_dto.PriceRecommendationItemDTO(
                                campaign_id = 56, 
                                price = 1, )
                            ], )
                    ]
            )
        else:
            return GetBidsRecommendationsResponseDTO(
                recommendations = [
                    ympa_python_client.models.sku_bid_recommendation_item_dto.SkuBidRecommendationItemDTO(
                        sku = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                        bid = 570, 
                        bid_recommendations = [
                            ympa_python_client.models.bid_recommendation_item_dto.BidRecommendationItemDTO(
                                bid = 570, 
                                show_percent = 0, )
                            ], 
                        price_recommendations = [
                            ympa_python_client.models.price_recommendation_item_dto.PriceRecommendationItemDTO(
                                campaign_id = 56, 
                                price = 1, )
                            ], )
                    ],
        )
        """

    def testGetBidsRecommendationsResponseDTO(self):
        """Test GetBidsRecommendationsResponseDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
