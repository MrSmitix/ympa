# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.calculate_tariffs_parameters_dto import CalculateTariffsParametersDTO

class TestCalculateTariffsParametersDTO(unittest.TestCase):
    """CalculateTariffsParametersDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CalculateTariffsParametersDTO:
        """Test CalculateTariffsParametersDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CalculateTariffsParametersDTO`
        """
        model = CalculateTariffsParametersDTO()
        if include_optional:
            return CalculateTariffsParametersDTO(
                campaign_id = 56,
                selling_program = 'FBY',
                frequency = 'DAILY'
            )
        else:
            return CalculateTariffsParametersDTO(
        )
        """

    def testCalculateTariffsParametersDTO(self):
        """Test CalculateTariffsParametersDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
