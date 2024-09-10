# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.feed_content_error_type import FeedContentErrorType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class FeedContentErrorDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: FeedContentErrorType=None):  # noqa: E501
        """FeedContentErrorDTO - a model defined in Swagger

        :param type: The type of this FeedContentErrorDTO.  # noqa: E501
        :type type: FeedContentErrorType
        """
        self.swagger_types = {
            'type': FeedContentErrorType
        }

        self.attribute_map = {
            'type': 'type'
        }

        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'FeedContentErrorDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeedContentErrorDTO of this FeedContentErrorDTO.  # noqa: E501
        :rtype: FeedContentErrorDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> FeedContentErrorType:
        """Gets the type of this FeedContentErrorDTO.


        :return: The type of this FeedContentErrorDTO.
        :rtype: FeedContentErrorType
        """
        return self._type

    @type.setter
    def type(self, type: FeedContentErrorType):
        """Sets the type of this FeedContentErrorDTO.


        :param type: The type of this FeedContentErrorDTO.
        :type type: FeedContentErrorType
        """

        self._type = type
