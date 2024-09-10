# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_pydantic_v1_client.api.orders_stats_api import OrdersStatsApi  # noqa: E501


class TestOrdersStatsApi(unittest.TestCase):
    """OrdersStatsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = OrdersStatsApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_get_orders_stats(self) -> None:
        """Test case for get_orders_stats

        Детальная информация по заказам  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
