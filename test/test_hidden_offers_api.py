# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_pydantic_v1_client.api.hidden_offers_api import HiddenOffersApi  # noqa: E501


class TestHiddenOffersApi(unittest.TestCase):
    """HiddenOffersApi unit test stubs"""

    def setUp(self) -> None:
        self.api = HiddenOffersApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_add_hidden_offers(self) -> None:
        """Test case for add_hidden_offers

        Скрытие товаров и настройки скрытия  # noqa: E501
        """
        pass

    def test_delete_hidden_offers(self) -> None:
        """Test case for delete_hidden_offers

        Возобновление показа товаров  # noqa: E501
        """
        pass

    def test_get_hidden_offers(self) -> None:
        """Test case for get_hidden_offers

        Информация о скрытых вами товарах  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
