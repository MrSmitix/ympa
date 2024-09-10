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

from ympa_python_pydantic_v1_client.models.quarantine_offer_dto import QuarantineOfferDTO  # noqa: E501

class TestQuarantineOfferDTO(unittest.TestCase):
    """QuarantineOfferDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> QuarantineOfferDTO:
        """Test QuarantineOfferDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `QuarantineOfferDTO`
        """
        model = QuarantineOfferDTO()  # noqa: E501
        if include_optional:
            return QuarantineOfferDTO(
                offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0',
                current_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                    value = 0, 
                    currency_id = 'RUR', ),
                last_valid_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                    value = 0, 
                    currency_id = 'RUR', ),
                verdicts = [
                    ympa_python_pydantic_v1_client.models.price_quarantine_verdict_dto.PriceQuarantineVerdictDTO(
                        type = 'PRICE_CHANGE', 
                        params = [
                            ympa_python_pydantic_v1_client.models.price_quarantine_verdict_parameter_dto.PriceQuarantineVerdictParameterDTO(
                                name = 'CURRENT_PRICE', 
                                value = '', )
                            ], )
                    ]
            )
        else:
            return QuarantineOfferDTO(
        )
        """

    def testQuarantineOfferDTO(self):
        """Test QuarantineOfferDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
