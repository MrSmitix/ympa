# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.hidden_offer_dto import HiddenOfferDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.scrolling_pager_dto import ScrollingPagerDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetHiddenOffersResultDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, paging: ScrollingPagerDTO=None, hidden_offers: List[HiddenOfferDTO]=None):  # noqa: E501
        """GetHiddenOffersResultDTO - a model defined in Swagger

        :param paging: The paging of this GetHiddenOffersResultDTO.  # noqa: E501
        :type paging: ScrollingPagerDTO
        :param hidden_offers: The hidden_offers of this GetHiddenOffersResultDTO.  # noqa: E501
        :type hidden_offers: List[HiddenOfferDTO]
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'GetHiddenOffersResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetHiddenOffersResultDTO of this GetHiddenOffersResultDTO.  # noqa: E501
        :rtype: GetHiddenOffersResultDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def paging(self) -> ScrollingPagerDTO:
        """Gets the paging of this GetHiddenOffersResultDTO.


        :return: The paging of this GetHiddenOffersResultDTO.
        :rtype: ScrollingPagerDTO
        """
        return self._paging

    @paging.setter
    def paging(self, paging: ScrollingPagerDTO):
        """Sets the paging of this GetHiddenOffersResultDTO.


        :param paging: The paging of this GetHiddenOffersResultDTO.
        :type paging: ScrollingPagerDTO
        """

        self._paging = paging

    @property
    def hidden_offers(self) -> List[HiddenOfferDTO]:
        """Gets the hidden_offers of this GetHiddenOffersResultDTO.

        Список скрытых товаров.  # noqa: E501

        :return: The hidden_offers of this GetHiddenOffersResultDTO.
        :rtype: List[HiddenOfferDTO]
        """
        return self._hidden_offers

    @hidden_offers.setter
    def hidden_offers(self, hidden_offers: List[HiddenOfferDTO]):
        """Sets the hidden_offers of this GetHiddenOffersResultDTO.

        Список скрытых товаров.  # noqa: E501

        :param hidden_offers: The hidden_offers of this GetHiddenOffersResultDTO.
        :type hidden_offers: List[HiddenOfferDTO]
        """
        if hidden_offers is None:
            raise ValueError("Invalid value for `hidden_offers`, must not be `None`")  # noqa: E501

        self._hidden_offers = hidden_offers
