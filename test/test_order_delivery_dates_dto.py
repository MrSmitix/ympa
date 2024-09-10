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

from ympa_python_pydantic_v1_client.models.order_delivery_dates_dto import OrderDeliveryDatesDTO  # noqa: E501

class TestOrderDeliveryDatesDTO(unittest.TestCase):
    """OrderDeliveryDatesDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrderDeliveryDatesDTO:
        """Test OrderDeliveryDatesDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrderDeliveryDatesDTO`
        """
        model = OrderDeliveryDatesDTO()  # noqa: E501
        if include_optional:
            return OrderDeliveryDatesDTO(
                from_date = '23-09-2022',
                to_date = '23-09-2022',
                from_time = '',
                to_time = '',
                real_delivery_date = '23-09-2022'
            )
        else:
            return OrderDeliveryDatesDTO(
        )
        """

    def testOrderDeliveryDatesDTO(self):
        """Test OrderDeliveryDatesDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
