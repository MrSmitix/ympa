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

from ympa_python_pydantic_v1_client.models.price_competitiveness_thresholds_dto import PriceCompetitivenessThresholdsDTO  # noqa: E501

class TestPriceCompetitivenessThresholdsDTO(unittest.TestCase):
    """PriceCompetitivenessThresholdsDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PriceCompetitivenessThresholdsDTO:
        """Test PriceCompetitivenessThresholdsDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PriceCompetitivenessThresholdsDTO`
        """
        model = PriceCompetitivenessThresholdsDTO()  # noqa: E501
        if include_optional:
            return PriceCompetitivenessThresholdsDTO(
                optimal_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                    value = 0, 
                    currency_id = 'RUR', ),
                average_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                    value = 0, 
                    currency_id = 'RUR', )
            )
        else:
            return PriceCompetitivenessThresholdsDTO(
        )
        """

    def testPriceCompetitivenessThresholdsDTO(self):
        """Test PriceCompetitivenessThresholdsDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
