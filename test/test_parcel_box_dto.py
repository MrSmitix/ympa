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

from ympa_python_pydantic_v1_client.models.parcel_box_dto import ParcelBoxDTO  # noqa: E501

class TestParcelBoxDTO(unittest.TestCase):
    """ParcelBoxDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ParcelBoxDTO:
        """Test ParcelBoxDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ParcelBoxDTO`
        """
        model = ParcelBoxDTO()  # noqa: E501
        if include_optional:
            return ParcelBoxDTO(
                id = 56,
                fulfilment_id = ERROR_TO_EXAMPLE_VALUE
            )
        else:
            return ParcelBoxDTO(
        )
        """

    def testParcelBoxDTO(self):
        """Test ParcelBoxDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
