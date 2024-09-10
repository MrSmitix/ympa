# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.option_values_limited_dto import OptionValuesLimitedDTO

class TestOptionValuesLimitedDTO(unittest.TestCase):
    """OptionValuesLimitedDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OptionValuesLimitedDTO:
        """Test OptionValuesLimitedDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OptionValuesLimitedDTO`
        """
        model = OptionValuesLimitedDTO()
        if include_optional:
            return OptionValuesLimitedDTO(
                limiting_option_value_id = 56,
                option_value_ids = [
                    56
                    ]
            )
        else:
            return OptionValuesLimitedDTO(
                limiting_option_value_id = 56,
                option_value_ids = [
                    56
                    ],
        )
        """

    def testOptionValuesLimitedDTO(self):
        """Test OptionValuesLimitedDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
