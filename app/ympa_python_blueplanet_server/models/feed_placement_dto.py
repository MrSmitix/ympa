# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.feed_status_type import FeedStatusType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class FeedPlacementDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: FeedStatusType=None, total_offers_count: int=None):  # noqa: E501
        """FeedPlacementDTO - a model defined in Swagger

        :param status: The status of this FeedPlacementDTO.  # noqa: E501
        :type status: FeedStatusType
        :param total_offers_count: The total_offers_count of this FeedPlacementDTO.  # noqa: E501
        :type total_offers_count: int
        """
        self.swagger_types = {
            'status': FeedStatusType,
            'total_offers_count': int
        }

        self.attribute_map = {
            'status': 'status',
            'total_offers_count': 'totalOffersCount'
        }

        self._status = status
        self._total_offers_count = total_offers_count

    @classmethod
    def from_dict(cls, dikt) -> 'FeedPlacementDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeedPlacementDTO of this FeedPlacementDTO.  # noqa: E501
        :rtype: FeedPlacementDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> FeedStatusType:
        """Gets the status of this FeedPlacementDTO.


        :return: The status of this FeedPlacementDTO.
        :rtype: FeedStatusType
        """
        return self._status

    @status.setter
    def status(self, status: FeedStatusType):
        """Sets the status of this FeedPlacementDTO.


        :param status: The status of this FeedPlacementDTO.
        :type status: FeedStatusType
        """

        self._status = status

    @property
    def total_offers_count(self) -> int:
        """Gets the total_offers_count of this FeedPlacementDTO.

        Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.  # noqa: E501

        :return: The total_offers_count of this FeedPlacementDTO.
        :rtype: int
        """
        return self._total_offers_count

    @total_offers_count.setter
    def total_offers_count(self, total_offers_count: int):
        """Sets the total_offers_count of this FeedPlacementDTO.

        Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.  # noqa: E501

        :param total_offers_count: The total_offers_count of this FeedPlacementDTO.
        :type total_offers_count: int
        """

        self._total_offers_count = total_offers_count