# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_pydantic_v1_client.api.campaigns_api import CampaignsApi  # noqa: E501


class TestCampaignsApi(unittest.TestCase):
    """CampaignsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = CampaignsApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_get_campaign(self) -> None:
        """Test case for get_campaign

        Информация о магазине  # noqa: E501
        """
        pass

    def test_get_campaign_logins(self) -> None:
        """Test case for get_campaign_logins

        Логины, связанные с магазином  # noqa: E501
        """
        pass

    def test_get_campaign_region(self) -> None:
        """Test case for get_campaign_region

        Регион магазина  # noqa: E501
        """
        pass

    def test_get_campaign_settings(self) -> None:
        """Test case for get_campaign_settings

        Настройки магазина  # noqa: E501
        """
        pass

    def test_get_campaigns(self) -> None:
        """Test case for get_campaigns

        Список магазинов пользователя  # noqa: E501
        """
        pass

    def test_get_campaigns_by_login(self) -> None:
        """Test case for get_campaigns_by_login

        Магазины, доступные логину  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
