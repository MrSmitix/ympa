# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.campaign_settings_schedule_dto import CampaignSettingsScheduleDTO
from ympa_python_aiohttp_server import util


class CampaignSettingsDeliveryDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, schedule: CampaignSettingsScheduleDTO=None):
        """CampaignSettingsDeliveryDTO - a model defined in OpenAPI

        :param schedule: The schedule of this CampaignSettingsDeliveryDTO.
        """
        self.openapi_types = {
            'schedule': CampaignSettingsScheduleDTO
        }

        self.attribute_map = {
            'schedule': 'schedule'
        }

        self._schedule = schedule

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CampaignSettingsDeliveryDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CampaignSettingsDeliveryDTO of this CampaignSettingsDeliveryDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def schedule(self):
        """Gets the schedule of this CampaignSettingsDeliveryDTO.


        :return: The schedule of this CampaignSettingsDeliveryDTO.
        :rtype: CampaignSettingsScheduleDTO
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """Sets the schedule of this CampaignSettingsDeliveryDTO.


        :param schedule: The schedule of this CampaignSettingsDeliveryDTO.
        :type schedule: CampaignSettingsScheduleDTO
        """

        self._schedule = schedule
