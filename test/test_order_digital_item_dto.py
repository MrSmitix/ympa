# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.order_digital_item_dto import OrderDigitalItemDTO

class TestOrderDigitalItemDTO(unittest.TestCase):
    """OrderDigitalItemDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrderDigitalItemDTO:
        """Test OrderDigitalItemDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrderDigitalItemDTO`
        """
        model = OrderDigitalItemDTO()
        if include_optional:
            return OrderDigitalItemDTO(
                id = 56,
                code = '',
                slip = '',
                activate_till = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date()
            )
        else:
            return OrderDigitalItemDTO(
                id = 56,
                code = '',
                slip = '',
                activate_till = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(),
        )
        """

    def testOrderDigitalItemDTO(self):
        """Test OrderDigitalItemDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
