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

from ympa_python_pydantic_v1_client.models.get_campaign_settings_response import GetCampaignSettingsResponse  # noqa: E501

class TestGetCampaignSettingsResponse(unittest.TestCase):
    """GetCampaignSettingsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetCampaignSettingsResponse:
        """Test GetCampaignSettingsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetCampaignSettingsResponse`
        """
        model = GetCampaignSettingsResponse()  # noqa: E501
        if include_optional:
            return GetCampaignSettingsResponse(
                settings = ympa_python_pydantic_v1_client.models.campaign_settings_dto.CampaignSettingsDTO(
                    country_region = 56, 
                    shop_name = '', 
                    show_in_context = True, 
                    show_in_premium = True, 
                    use_open_stat = True, 
                    local_region = ympa_python_pydantic_v1_client.models.campaign_settings_local_region_dto.CampaignSettingsLocalRegionDTO(
                        id = 56, 
                        name = '', 
                        type = 'OTHER', 
                        delivery_options_source = 'WEB', 
                        delivery = ympa_python_pydantic_v1_client.models.campaign_settings_delivery_dto.CampaignSettingsDeliveryDTO(
                            schedule = ympa_python_pydantic_v1_client.models.campaign_settings_schedule_dto.CampaignSettingsScheduleDTO(
                                available_on_holidays = True, 
                                custom_holidays = [
                                    '23-09-2022'
                                    ], 
                                custom_working_days = [
                                    '23-09-2022'
                                    ], 
                                period = ympa_python_pydantic_v1_client.models.campaign_settings_time_period_dto.CampaignSettingsTimePeriodDTO(
                                    from_date = '23-09-2022', 
                                    to_date = '23-09-2022', ), 
                                total_holidays = [
                                    '23-09-2022'
                                    ], 
                                weekly_holidays = [
                                    1
                                    ], ), ), ), )
            )
        else:
            return GetCampaignSettingsResponse(
        )
        """

    def testGetCampaignSettingsResponse(self):
        """Test GetCampaignSettingsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
