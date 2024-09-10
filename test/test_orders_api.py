# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_pydantic_v1_client.api.orders_api import OrdersApi  # noqa: E501


class TestOrdersApi(unittest.TestCase):
    """OrdersApi unit test stubs"""

    def setUp(self) -> None:
        self.api = OrdersApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_accept_order_cancellation(self) -> None:
        """Test case for accept_order_cancellation

        Отмена заказа покупателем  # noqa: E501
        """
        pass

    def test_get_order(self) -> None:
        """Test case for get_order

        Информация об одном заказе  # noqa: E501
        """
        pass

    def test_get_orders(self) -> None:
        """Test case for get_orders

        Информация о нескольких заказах  # noqa: E501
        """
        pass

    def test_provide_order_digital_codes(self) -> None:
        """Test case for provide_order_digital_codes

        Передача ключей цифровых товаров  # noqa: E501
        """
        pass

    def test_provide_order_item_identifiers(self) -> None:
        """Test case for provide_order_item_identifiers

        Передача кодов маркировки единиц товара  # noqa: E501
        """
        pass

    def test_set_order_box_layout(self) -> None:
        """Test case for set_order_box_layout

        Подготовка заказа  # noqa: E501
        """
        pass

    def test_set_order_shipment_boxes(self) -> None:
        """Test case for set_order_shipment_boxes

        Передача количества грузовых мест в заказе  # noqa: E501
        """
        pass

    def test_update_order_items(self) -> None:
        """Test case for update_order_items

        Удаление товара из заказа или уменьшение числа единиц  # noqa: E501
        """
        pass

    def test_update_order_status(self) -> None:
        """Test case for update_order_status

        Изменение статуса одного заказа  # noqa: E501
        """
        pass

    def test_update_order_statuses(self) -> None:
        """Test case for update_order_statuses

        Изменение статусов нескольких заказов  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
