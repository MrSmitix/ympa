# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.delete_hidden_offers_request import DeleteHiddenOffersRequest

class TestDeleteHiddenOffersRequest(unittest.TestCase):
    """DeleteHiddenOffersRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DeleteHiddenOffersRequest:
        """Test DeleteHiddenOffersRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DeleteHiddenOffersRequest`
        """
        model = DeleteHiddenOffersRequest()
        if include_optional:
            return DeleteHiddenOffersRequest(
                hidden_offers = [
                    ympa_python_client.models.hidden_offer_dto.HiddenOfferDTO(
                        offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', )
                    ]
            )
        else:
            return DeleteHiddenOffersRequest(
                hidden_offers = [
                    ympa_python_client.models.hidden_offer_dto.HiddenOfferDTO(
                        offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', )
                    ],
        )
        """

    def testDeleteHiddenOffersRequest(self):
        """Test DeleteHiddenOffersRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
