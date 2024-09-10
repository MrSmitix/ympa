# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.offer_campaign_status_type import OfferCampaignStatusType
from ympa_python_aiohttp_server import util


class OfferCampaignStatusDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, campaign_id: int=None, status: OfferCampaignStatusType=None):
        """OfferCampaignStatusDTO - a model defined in OpenAPI

        :param campaign_id: The campaign_id of this OfferCampaignStatusDTO.
        :param status: The status of this OfferCampaignStatusDTO.
        """
        self.openapi_types = {
            'campaign_id': int,
            'status': OfferCampaignStatusType
        }

        self.attribute_map = {
            'campaign_id': 'campaignId',
            'status': 'status'
        }

        self._campaign_id = campaign_id
        self._status = status

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OfferCampaignStatusDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OfferCampaignStatusDTO of this OfferCampaignStatusDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def campaign_id(self):
        """Gets the campaign_id of this OfferCampaignStatusDTO.

        Идентификатор кампании. 

        :return: The campaign_id of this OfferCampaignStatusDTO.
        :rtype: int
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id):
        """Sets the campaign_id of this OfferCampaignStatusDTO.

        Идентификатор кампании. 

        :param campaign_id: The campaign_id of this OfferCampaignStatusDTO.
        :type campaign_id: int
        """
        if campaign_id is None:
            raise ValueError("Invalid value for `campaign_id`, must not be `None`")

        self._campaign_id = campaign_id

    @property
    def status(self):
        """Gets the status of this OfferCampaignStatusDTO.


        :return: The status of this OfferCampaignStatusDTO.
        :rtype: OfferCampaignStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this OfferCampaignStatusDTO.


        :param status: The status of this OfferCampaignStatusDTO.
        :type status: OfferCampaignStatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")

        self._status = status
