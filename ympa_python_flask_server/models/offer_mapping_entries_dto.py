from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.offer_mapping_entry_dto import OfferMappingEntryDTO
from ympa_python_flask_server.models.scrolling_pager_dto import ScrollingPagerDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.offer_mapping_entry_dto import OfferMappingEntryDTO  # noqa: E501
from ympa_python_flask_server.models.scrolling_pager_dto import ScrollingPagerDTO  # noqa: E501

class OfferMappingEntriesDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, paging=None, offer_mapping_entries=None):  # noqa: E501
        """OfferMappingEntriesDTO - a model defined in OpenAPI

        :param paging: The paging of this OfferMappingEntriesDTO.  # noqa: E501
        :type paging: ScrollingPagerDTO
        :param offer_mapping_entries: The offer_mapping_entries of this OfferMappingEntriesDTO.  # noqa: E501
        :type offer_mapping_entries: List[OfferMappingEntryDTO]
        """
        self.openapi_types = {
            'paging': ScrollingPagerDTO,
            'offer_mapping_entries': List[OfferMappingEntryDTO]
        }

        self.attribute_map = {
            'paging': 'paging',
            'offer_mapping_entries': 'offerMappingEntries'
        }

        self._paging = paging
        self._offer_mapping_entries = offer_mapping_entries

    @classmethod
    def from_dict(cls, dikt) -> 'OfferMappingEntriesDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferMappingEntriesDTO of this OfferMappingEntriesDTO.  # noqa: E501
        :rtype: OfferMappingEntriesDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def paging(self) -> ScrollingPagerDTO:
        """Gets the paging of this OfferMappingEntriesDTO.


        :return: The paging of this OfferMappingEntriesDTO.
        :rtype: ScrollingPagerDTO
        """
        return self._paging

    @paging.setter
    def paging(self, paging: ScrollingPagerDTO):
        """Sets the paging of this OfferMappingEntriesDTO.


        :param paging: The paging of this OfferMappingEntriesDTO.
        :type paging: ScrollingPagerDTO
        """

        self._paging = paging

    @property
    def offer_mapping_entries(self) -> List[OfferMappingEntryDTO]:
        """Gets the offer_mapping_entries of this OfferMappingEntriesDTO.

        Информация о товарах в каталоге.  # noqa: E501

        :return: The offer_mapping_entries of this OfferMappingEntriesDTO.
        :rtype: List[OfferMappingEntryDTO]
        """
        return self._offer_mapping_entries

    @offer_mapping_entries.setter
    def offer_mapping_entries(self, offer_mapping_entries: List[OfferMappingEntryDTO]):
        """Sets the offer_mapping_entries of this OfferMappingEntriesDTO.

        Информация о товарах в каталоге.  # noqa: E501

        :param offer_mapping_entries: The offer_mapping_entries of this OfferMappingEntriesDTO.
        :type offer_mapping_entries: List[OfferMappingEntryDTO]
        """
        if offer_mapping_entries is None:
            raise ValueError("Invalid value for `offer_mapping_entries`, must not be `None`")  # noqa: E501

        self._offer_mapping_entries = offer_mapping_entries