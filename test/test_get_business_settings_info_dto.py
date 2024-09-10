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

from ympa_python_pydantic_v1_client.models.get_business_settings_info_dto import GetBusinessSettingsInfoDTO  # noqa: E501

class TestGetBusinessSettingsInfoDTO(unittest.TestCase):
    """GetBusinessSettingsInfoDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetBusinessSettingsInfoDTO:
        """Test GetBusinessSettingsInfoDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetBusinessSettingsInfoDTO`
        """
        model = GetBusinessSettingsInfoDTO()  # noqa: E501
        if include_optional:
            return GetBusinessSettingsInfoDTO(
                info = ympa_python_pydantic_v1_client.models.business_dto.BusinessDTO(
                    id = 56, 
                    name = '', ),
                settings = ympa_python_pydantic_v1_client.models.business_settings_dto.BusinessSettingsDTO(
                    only_default_price = True, 
                    currency = 'RUR', )
            )
        else:
            return GetBusinessSettingsInfoDTO(
        )
        """

    def testGetBusinessSettingsInfoDTO(self):
        """Test GetBusinessSettingsInfoDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
