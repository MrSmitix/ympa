# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.update_offer_mapping_dto import UpdateOfferMappingDTO

class TestUpdateOfferMappingDTO(unittest.TestCase):
    """UpdateOfferMappingDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateOfferMappingDTO:
        """Test UpdateOfferMappingDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateOfferMappingDTO`
        """
        model = UpdateOfferMappingDTO()
        if include_optional:
            return UpdateOfferMappingDTO(
                offer = ympa_python_client.models.update_offer_dto.UpdateOfferDTO(),
                mapping = ympa_python_client.models.update_mapping_dto.UpdateMappingDTO(
                    market_sku = 56, )
            )
        else:
            return UpdateOfferMappingDTO(
                offer = ympa_python_client.models.update_offer_dto.UpdateOfferDTO(),
        )
        """

    def testUpdateOfferMappingDTO(self):
        """Test UpdateOfferMappingDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
