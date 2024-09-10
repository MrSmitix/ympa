# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.update_offer_mapping_entry_dto import UpdateOfferMappingEntryDTO
from ympa_python_aiohttp_server import util


class UpdateOfferMappingEntryRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_mapping_entries: List[UpdateOfferMappingEntryDTO]=None):
        """UpdateOfferMappingEntryRequest - a model defined in OpenAPI

        :param offer_mapping_entries: The offer_mapping_entries of this UpdateOfferMappingEntryRequest.
        """
        self.openapi_types = {
            'offer_mapping_entries': List[UpdateOfferMappingEntryDTO]
        }

        self.attribute_map = {
            'offer_mapping_entries': 'offerMappingEntries'
        }

        self._offer_mapping_entries = offer_mapping_entries

    @classmethod
    def from_dict(cls, dikt: dict) -> 'UpdateOfferMappingEntryRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The UpdateOfferMappingEntryRequest of this UpdateOfferMappingEntryRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_mapping_entries(self):
        """Gets the offer_mapping_entries of this UpdateOfferMappingEntryRequest.

        Информация о товарах в каталоге.

        :return: The offer_mapping_entries of this UpdateOfferMappingEntryRequest.
        :rtype: List[UpdateOfferMappingEntryDTO]
        """
        return self._offer_mapping_entries

    @offer_mapping_entries.setter
    def offer_mapping_entries(self, offer_mapping_entries):
        """Sets the offer_mapping_entries of this UpdateOfferMappingEntryRequest.

        Информация о товарах в каталоге.

        :param offer_mapping_entries: The offer_mapping_entries of this UpdateOfferMappingEntryRequest.
        :type offer_mapping_entries: List[UpdateOfferMappingEntryDTO]
        """
        if offer_mapping_entries is None:
            raise ValueError("Invalid value for `offer_mapping_entries`, must not be `None`")
        if offer_mapping_entries is not None and len(offer_mapping_entries) > 500:
            raise ValueError("Invalid value for `offer_mapping_entries`, number of items must be less than or equal to `500`")
        if offer_mapping_entries is not None and len(offer_mapping_entries) < 1:
            raise ValueError("Invalid value for `offer_mapping_entries`, number of items must be greater than or equal to `1`")

        self._offer_mapping_entries = offer_mapping_entries
