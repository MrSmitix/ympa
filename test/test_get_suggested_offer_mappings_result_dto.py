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

from ympa_python_pydantic_v1_client.models.get_suggested_offer_mappings_result_dto import GetSuggestedOfferMappingsResultDTO  # noqa: E501

class TestGetSuggestedOfferMappingsResultDTO(unittest.TestCase):
    """GetSuggestedOfferMappingsResultDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetSuggestedOfferMappingsResultDTO:
        """Test GetSuggestedOfferMappingsResultDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetSuggestedOfferMappingsResultDTO`
        """
        model = GetSuggestedOfferMappingsResultDTO()  # noqa: E501
        if include_optional:
            return GetSuggestedOfferMappingsResultDTO(
                offers = [
                    ympa_python_pydantic_v1_client.models.suggested_offer_mapping_dto.SuggestedOfferMappingDTO(
                        offer = ympa_python_pydantic_v1_client.models.suggested_offer_dto.SuggestedOfferDTO(
                            offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                            name = 'Ударная дрель Makita HP1630, 710 Вт', 
                            category = '', 
                            vendor = 'LEVENHUK', 
                            barcodes = [
                                '46012300000000'
                                ], 
                            description = '', 
                            vendor_code = 'VNDR-0005A', 
                            basic_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                                value = 0, 
                                currency_id = 'RUR', ), ), 
                        mapping = ympa_python_pydantic_v1_client.models.get_mapping_dto.GetMappingDTO(), )
                    ]
            )
        else:
            return GetSuggestedOfferMappingsResultDTO(
                offers = [
                    ympa_python_pydantic_v1_client.models.suggested_offer_mapping_dto.SuggestedOfferMappingDTO(
                        offer = ympa_python_pydantic_v1_client.models.suggested_offer_dto.SuggestedOfferDTO(
                            offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                            name = 'Ударная дрель Makita HP1630, 710 Вт', 
                            category = '', 
                            vendor = 'LEVENHUK', 
                            barcodes = [
                                '46012300000000'
                                ], 
                            description = '', 
                            vendor_code = 'VNDR-0005A', 
                            basic_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                                value = 0, 
                                currency_id = 'RUR', ), ), 
                        mapping = ympa_python_pydantic_v1_client.models.get_mapping_dto.GetMappingDTO(), )
                    ],
        )
        """

    def testGetSuggestedOfferMappingsResultDTO(self):
        """Test GetSuggestedOfferMappingsResultDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
