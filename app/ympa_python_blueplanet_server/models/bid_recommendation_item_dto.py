# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class BidRecommendationItemDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, bid: int=None, show_percent: int=None):  # noqa: E501
        """BidRecommendationItemDTO - a model defined in Swagger

        :param bid: The bid of this BidRecommendationItemDTO.  # noqa: E501
        :type bid: int
        :param show_percent: The show_percent of this BidRecommendationItemDTO.  # noqa: E501
        :type show_percent: int
        """
        self.swagger_types = {
            'bid': int,
            'show_percent': int
        }

        self.attribute_map = {
            'bid': 'bid',
            'show_percent': 'showPercent'
        }

        self._bid = bid
        self._show_percent = show_percent

    @classmethod
    def from_dict(cls, dikt) -> 'BidRecommendationItemDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BidRecommendationItemDTO of this BidRecommendationItemDTO.  # noqa: E501
        :rtype: BidRecommendationItemDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bid(self) -> int:
        """Gets the bid of this BidRecommendationItemDTO.

        Значение ставки.  # noqa: E501

        :return: The bid of this BidRecommendationItemDTO.
        :rtype: int
        """
        return self._bid

    @bid.setter
    def bid(self, bid: int):
        """Sets the bid of this BidRecommendationItemDTO.

        Значение ставки.  # noqa: E501

        :param bid: The bid of this BidRecommendationItemDTO.
        :type bid: int
        """
        if bid is None:
            raise ValueError("Invalid value for `bid`, must not be `None`")  # noqa: E501
        if bid is not None and bid > 9999:  # noqa: E501
            raise ValueError("Invalid value for `bid`, must be a value less than or equal to `9999`")  # noqa: E501
        if bid is not None and bid < 0:  # noqa: E501
            raise ValueError("Invalid value for `bid`, must be a value greater than or equal to `0`")  # noqa: E501

        self._bid = bid

    @property
    def show_percent(self) -> int:
        """Gets the show_percent of this BidRecommendationItemDTO.

        Доля показов.   # noqa: E501

        :return: The show_percent of this BidRecommendationItemDTO.
        :rtype: int
        """
        return self._show_percent

    @show_percent.setter
    def show_percent(self, show_percent: int):
        """Sets the show_percent of this BidRecommendationItemDTO.

        Доля показов.   # noqa: E501

        :param show_percent: The show_percent of this BidRecommendationItemDTO.
        :type show_percent: int
        """
        if show_percent is None:
            raise ValueError("Invalid value for `show_percent`, must not be `None`")  # noqa: E501
        if show_percent is not None and show_percent > 100:  # noqa: E501
            raise ValueError("Invalid value for `show_percent`, must be a value less than or equal to `100`")  # noqa: E501
        if show_percent is not None and show_percent < 0:  # noqa: E501
            raise ValueError("Invalid value for `show_percent`, must be a value greater than or equal to `0`")  # noqa: E501

        self._show_percent = show_percent
