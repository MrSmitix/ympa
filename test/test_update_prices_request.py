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

from ympa_python_pydantic_v1_client.models.update_prices_request import UpdatePricesRequest  # noqa: E501

class TestUpdatePricesRequest(unittest.TestCase):
    """UpdatePricesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdatePricesRequest:
        """Test UpdatePricesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdatePricesRequest`
        """
        model = UpdatePricesRequest()  # noqa: E501
        if include_optional:
            return UpdatePricesRequest(
                offers = [
                    ympa_python_pydantic_v1_client.models.offer_price_dto.OfferPriceDTO(
                        offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                        price = ympa_python_pydantic_v1_client.models.price_dto.PriceDTO(
                            value = 1.337, 
                            discount_base = 1.337, 
                            currency_id = 'RUR', 
                            vat = 56, ), )
                    ]
            )
        else:
            return UpdatePricesRequest(
                offers = [
                    ympa_python_pydantic_v1_client.models.offer_price_dto.OfferPriceDTO(
                        offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                        price = ympa_python_pydantic_v1_client.models.price_dto.PriceDTO(
                            value = 1.337, 
                            discount_base = 1.337, 
                            currency_id = 'RUR', 
                            vat = 56, ), )
                    ],
        )
        """

    def testUpdatePricesRequest(self):
        """Test UpdatePricesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
