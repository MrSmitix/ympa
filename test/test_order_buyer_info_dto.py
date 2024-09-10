# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.order_buyer_info_dto import OrderBuyerInfoDTO

class TestOrderBuyerInfoDTO(unittest.TestCase):
    """OrderBuyerInfoDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrderBuyerInfoDTO:
        """Test OrderBuyerInfoDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrderBuyerInfoDTO`
        """
        model = OrderBuyerInfoDTO()
        if include_optional:
            return OrderBuyerInfoDTO(
                id = '',
                last_name = '',
                first_name = '',
                middle_name = '',
                type = 'PERSON',
                phone = ''
            )
        else:
            return OrderBuyerInfoDTO(
        )
        """

    def testOrderBuyerInfoDTO(self):
        """Test OrderBuyerInfoDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
