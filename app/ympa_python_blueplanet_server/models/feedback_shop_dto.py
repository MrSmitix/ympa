# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class FeedbackShopDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, name: str=None):  # noqa: E501
        """FeedbackShopDTO - a model defined in Swagger

        :param name: The name of this FeedbackShopDTO.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'name': str
        }

        self.attribute_map = {
            'name': 'name'
        }

        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'FeedbackShopDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeedbackShopDTO of this FeedbackShopDTO.  # noqa: E501
        :rtype: FeedbackShopDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this FeedbackShopDTO.

        Название магазина.  # noqa: E501

        :return: The name of this FeedbackShopDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this FeedbackShopDTO.

        Название магазина.  # noqa: E501

        :param name: The name of this FeedbackShopDTO.
        :type name: str
        """

        self._name = name
