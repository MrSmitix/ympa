# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.offer_card_dto import OfferCardDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OfferCardsContentStatusDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_cards: List[OfferCardDTO]=None, paging: ForwardScrollingPagerDTO=None):  # noqa: E501
        """OfferCardsContentStatusDTO - a model defined in Swagger

        :param offer_cards: The offer_cards of this OfferCardsContentStatusDTO.  # noqa: E501
        :type offer_cards: List[OfferCardDTO]
        :param paging: The paging of this OfferCardsContentStatusDTO.  # noqa: E501
        :type paging: ForwardScrollingPagerDTO
        """
        self.swagger_types = {
            'offer_cards': List[OfferCardDTO],
            'paging': ForwardScrollingPagerDTO
        }

        self.attribute_map = {
            'offer_cards': 'offerCards',
            'paging': 'paging'
        }

        self._offer_cards = offer_cards
        self._paging = paging

    @classmethod
    def from_dict(cls, dikt) -> 'OfferCardsContentStatusDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferCardsContentStatusDTO of this OfferCardsContentStatusDTO.  # noqa: E501
        :rtype: OfferCardsContentStatusDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_cards(self) -> List[OfferCardDTO]:
        """Gets the offer_cards of this OfferCardsContentStatusDTO.

        Страница списка товаров с информацией о состоянии карточек.  # noqa: E501

        :return: The offer_cards of this OfferCardsContentStatusDTO.
        :rtype: List[OfferCardDTO]
        """
        return self._offer_cards

    @offer_cards.setter
    def offer_cards(self, offer_cards: List[OfferCardDTO]):
        """Sets the offer_cards of this OfferCardsContentStatusDTO.

        Страница списка товаров с информацией о состоянии карточек.  # noqa: E501

        :param offer_cards: The offer_cards of this OfferCardsContentStatusDTO.
        :type offer_cards: List[OfferCardDTO]
        """
        if offer_cards is None:
            raise ValueError("Invalid value for `offer_cards`, must not be `None`")  # noqa: E501

        self._offer_cards = offer_cards

    @property
    def paging(self) -> ForwardScrollingPagerDTO:
        """Gets the paging of this OfferCardsContentStatusDTO.


        :return: The paging of this OfferCardsContentStatusDTO.
        :rtype: ForwardScrollingPagerDTO
        """
        return self._paging

    @paging.setter
    def paging(self, paging: ForwardScrollingPagerDTO):
        """Sets the paging of this OfferCardsContentStatusDTO.


        :param paging: The paging of this OfferCardsContentStatusDTO.
        :type paging: ForwardScrollingPagerDTO
        """

        self._paging = paging
