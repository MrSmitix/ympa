# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_all_offers_response import GetAllOffersResponse

class TestGetAllOffersResponse(unittest.TestCase):
    """GetAllOffersResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetAllOffersResponse:
        """Test GetAllOffersResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetAllOffersResponse`
        """
        model = GetAllOffersResponse()
        if include_optional:
            return GetAllOffersResponse(
                offers = [
                    ympa_python_client.models.offer_dto.OfferDTO(
                        price = 1.337, 
                        feed_id = 56, 
                        id = '', 
                        shop_category_id = '', 
                        market_category_id = 56, 
                        pre_discount_price = 1.337, 
                        discount = 56, 
                        cut_price = True, 
                        url = '', 
                        model_id = 56, 
                        name = '', 
                        currency = 'RUR', 
                        bid = 1.337, 
                        cbid = 1.337, 
                        fee = 1.337, 
                        blocked = True, )
                    ]
            )
        else:
            return GetAllOffersResponse(
                offers = [
                    ympa_python_client.models.offer_dto.OfferDTO(
                        price = 1.337, 
                        feed_id = 56, 
                        id = '', 
                        shop_category_id = '', 
                        market_category_id = 56, 
                        pre_discount_price = 1.337, 
                        discount = 56, 
                        cut_price = True, 
                        url = '', 
                        model_id = 56, 
                        name = '', 
                        currency = 'RUR', 
                        bid = 1.337, 
                        cbid = 1.337, 
                        fee = 1.337, 
                        blocked = True, )
                    ],
        )
        """

    def testGetAllOffersResponse(self):
        """Test GetAllOffersResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
