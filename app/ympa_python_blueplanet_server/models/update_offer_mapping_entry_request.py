# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.update_offer_mapping_entry_dto import UpdateOfferMappingEntryDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdateOfferMappingEntryRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_mapping_entries: List[UpdateOfferMappingEntryDTO]=None):  # noqa: E501
        """UpdateOfferMappingEntryRequest - a model defined in Swagger

        :param offer_mapping_entries: The offer_mapping_entries of this UpdateOfferMappingEntryRequest.  # noqa: E501
        :type offer_mapping_entries: List[UpdateOfferMappingEntryDTO]
        """
        self.swagger_types = {
            'offer_mapping_entries': List[UpdateOfferMappingEntryDTO]
        }

        self.attribute_map = {
            'offer_mapping_entries': 'offerMappingEntries'
        }

        self._offer_mapping_entries = offer_mapping_entries

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOfferMappingEntryRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOfferMappingEntryRequest of this UpdateOfferMappingEntryRequest.  # noqa: E501
        :rtype: UpdateOfferMappingEntryRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_mapping_entries(self) -> List[UpdateOfferMappingEntryDTO]:
        """Gets the offer_mapping_entries of this UpdateOfferMappingEntryRequest.

        Информация о товарах в каталоге.  # noqa: E501

        :return: The offer_mapping_entries of this UpdateOfferMappingEntryRequest.
        :rtype: List[UpdateOfferMappingEntryDTO]
        """
        return self._offer_mapping_entries

    @offer_mapping_entries.setter
    def offer_mapping_entries(self, offer_mapping_entries: List[UpdateOfferMappingEntryDTO]):
        """Sets the offer_mapping_entries of this UpdateOfferMappingEntryRequest.

        Информация о товарах в каталоге.  # noqa: E501

        :param offer_mapping_entries: The offer_mapping_entries of this UpdateOfferMappingEntryRequest.
        :type offer_mapping_entries: List[UpdateOfferMappingEntryDTO]
        """
        if offer_mapping_entries is None:
            raise ValueError("Invalid value for `offer_mapping_entries`, must not be `None`")  # noqa: E501
        if offer_mapping_entries is not None and len(offer_mapping_entries) > 500:
            raise ValueError("Invalid value for `offer_mapping_entries`, number of items must be less than or equal to `500`")  # noqa: E501
        if offer_mapping_entries is not None and len(offer_mapping_entries) < 1:
            raise ValueError("Invalid value for `offer_mapping_entries`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._offer_mapping_entries = offer_mapping_entries
