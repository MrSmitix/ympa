# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.enriched_mappings_offer_dto import EnrichedMappingsOfferDTO
from ympa_python_aiohttp_server import util


class OfferMappingSuggestionsListDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offers: List[EnrichedMappingsOfferDTO]=None):
        """OfferMappingSuggestionsListDTO - a model defined in OpenAPI

        :param offers: The offers of this OfferMappingSuggestionsListDTO.
        """
        self.openapi_types = {
            'offers': List[EnrichedMappingsOfferDTO]
        }

        self.attribute_map = {
            'offers': 'offers'
        }

        self._offers = offers

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OfferMappingSuggestionsListDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OfferMappingSuggestionsListDTO of this OfferMappingSuggestionsListDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offers(self):
        """Gets the offers of this OfferMappingSuggestionsListDTO.

        Список товаров.

        :return: The offers of this OfferMappingSuggestionsListDTO.
        :rtype: List[EnrichedMappingsOfferDTO]
        """
        return self._offers

    @offers.setter
    def offers(self, offers):
        """Sets the offers of this OfferMappingSuggestionsListDTO.

        Список товаров.

        :param offers: The offers of this OfferMappingSuggestionsListDTO.
        :type offers: List[EnrichedMappingsOfferDTO]
        """
        if offers is None:
            raise ValueError("Invalid value for `offers`, must not be `None`")

        self._offers = offers
