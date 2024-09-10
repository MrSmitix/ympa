# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_pydantic_v1_client.api.returns_api import ReturnsApi  # noqa: E501


class TestReturnsApi(unittest.TestCase):
    """ReturnsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ReturnsApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_get_return(self) -> None:
        """Test case for get_return

        Информация о невыкупе или возврате  # noqa: E501
        """
        pass

    def test_get_return_application(self) -> None:
        """Test case for get_return_application

        Получение заявления на возврат  # noqa: E501
        """
        pass

    def test_get_return_photo(self) -> None:
        """Test case for get_return_photo

        Получение фотографии возврата  # noqa: E501
        """
        pass

    def test_get_returns(self) -> None:
        """Test case for get_returns

        Список невыкупов и возвратов  # noqa: E501
        """
        pass

    def test_set_return_decision(self) -> None:
        """Test case for set_return_decision

        Принятие или изменение решения по возврату  # noqa: E501
        """
        pass

    def test_submit_return_decision(self) -> None:
        """Test case for submit_return_decision

        Подтверждение решения по возврату  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
