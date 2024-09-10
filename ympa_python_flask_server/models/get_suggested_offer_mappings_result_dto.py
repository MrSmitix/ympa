from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.suggested_offer_mapping_dto import SuggestedOfferMappingDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.suggested_offer_mapping_dto import SuggestedOfferMappingDTO  # noqa: E501

class GetSuggestedOfferMappingsResultDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offers=None):  # noqa: E501
        """GetSuggestedOfferMappingsResultDTO - a model defined in OpenAPI

        :param offers: The offers of this GetSuggestedOfferMappingsResultDTO.  # noqa: E501
        :type offers: List[SuggestedOfferMappingDTO]
        """
        self.openapi_types = {
            'offers': List[SuggestedOfferMappingDTO]
        }

        self.attribute_map = {
            'offers': 'offers'
        }

        self._offers = offers

    @classmethod
    def from_dict(cls, dikt) -> 'GetSuggestedOfferMappingsResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetSuggestedOfferMappingsResultDTO of this GetSuggestedOfferMappingsResultDTO.  # noqa: E501
        :rtype: GetSuggestedOfferMappingsResultDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offers(self) -> List[SuggestedOfferMappingDTO]:
        """Gets the offers of this GetSuggestedOfferMappingsResultDTO.

        Список товаров.  # noqa: E501

        :return: The offers of this GetSuggestedOfferMappingsResultDTO.
        :rtype: List[SuggestedOfferMappingDTO]
        """
        return self._offers

    @offers.setter
    def offers(self, offers: List[SuggestedOfferMappingDTO]):
        """Sets the offers of this GetSuggestedOfferMappingsResultDTO.

        Список товаров.  # noqa: E501

        :param offers: The offers of this GetSuggestedOfferMappingsResultDTO.
        :type offers: List[SuggestedOfferMappingDTO]
        """
        if offers is None:
            raise ValueError("Invalid value for `offers`, must not be `None`")  # noqa: E501

        self._offers = offers
