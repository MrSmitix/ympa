# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.api.feedbacks_api import FeedbacksApi


class TestFeedbacksApi(unittest.TestCase):
    """FeedbacksApi unit test stubs"""

    def setUp(self) -> None:
        self.api = FeedbacksApi()

    def tearDown(self) -> None:
        pass

    def test_get_feedback_and_comment_updates(self) -> None:
        """Test case for get_feedback_and_comment_updates

        Новые и обновленные отзывы о магазине
        """
        pass


if __name__ == '__main__':
    unittest.main()
