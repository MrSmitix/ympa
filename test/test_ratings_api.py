# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.api.ratings_api import RatingsApi


class TestRatingsApi(unittest.TestCase):
    """RatingsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = RatingsApi()

    def tearDown(self) -> None:
        pass

    def test_get_quality_rating_details(self) -> None:
        """Test case for get_quality_rating_details

        Заказы, которые повлияли на индекс качества
        """
        pass

    def test_get_quality_ratings(self) -> None:
        """Test case for get_quality_ratings

        Индекс качества магазинов
        """
        pass


if __name__ == '__main__':
    unittest.main()
