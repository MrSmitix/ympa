# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.hidden_offer_dto import HiddenOfferDTO
from ympa_python_aiohttp_server.models.scrolling_pager_dto import ScrollingPagerDTO
from ympa_python_aiohttp_server import util


class GetHiddenOffersResultDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, paging: ScrollingPagerDTO=None, hidden_offers: List[HiddenOfferDTO]=None):
        """GetHiddenOffersResultDTO - a model defined in OpenAPI

        :param paging: The paging of this GetHiddenOffersResultDTO.
        :param hidden_offers: The hidden_offers of this GetHiddenOffersResultDTO.
        """
        self.openapi_types = {
            'paging': ScrollingPagerDTO,
            'hidden_offers': List[HiddenOfferDTO]
        }

        self.attribute_map = {
            'paging': 'paging',
            'hidden_offers': 'hiddenOffers'
        }

        self._paging = paging
        self._hidden_offers = hidden_offers

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetHiddenOffersResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetHiddenOffersResultDTO of this GetHiddenOffersResultDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def paging(self):
        """Gets the paging of this GetHiddenOffersResultDTO.


        :return: The paging of this GetHiddenOffersResultDTO.
        :rtype: ScrollingPagerDTO
        """
        return self._paging

    @paging.setter
    def paging(self, paging):
        """Sets the paging of this GetHiddenOffersResultDTO.


        :param paging: The paging of this GetHiddenOffersResultDTO.
        :type paging: ScrollingPagerDTO
        """

        self._paging = paging

    @property
    def hidden_offers(self):
        """Gets the hidden_offers of this GetHiddenOffersResultDTO.

        Список скрытых товаров.

        :return: The hidden_offers of this GetHiddenOffersResultDTO.
        :rtype: List[HiddenOfferDTO]
        """
        return self._hidden_offers

    @hidden_offers.setter
    def hidden_offers(self, hidden_offers):
        """Sets the hidden_offers of this GetHiddenOffersResultDTO.

        Список скрытых товаров.

        :param hidden_offers: The hidden_offers of this GetHiddenOffersResultDTO.
        :type hidden_offers: List[HiddenOfferDTO]
        """
        if hidden_offers is None:
            raise ValueError("Invalid value for `hidden_offers`, must not be `None`")

        self._hidden_offers = hidden_offers
