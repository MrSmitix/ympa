# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class GetChatHistoryRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, message_id_from: int=None):  # noqa: E501
        """GetChatHistoryRequest - a model defined in Swagger

        :param message_id_from: The message_id_from of this GetChatHistoryRequest.  # noqa: E501
        :type message_id_from: int
        """
        self.swagger_types = {
            'message_id_from': int
        }

        self.attribute_map = {
            'message_id_from': 'messageIdFrom'
        }

        self._message_id_from = message_id_from

    @classmethod
    def from_dict(cls, dikt) -> 'GetChatHistoryRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetChatHistoryRequest of this GetChatHistoryRequest.  # noqa: E501
        :rtype: GetChatHistoryRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message_id_from(self) -> int:
        """Gets the message_id_from of this GetChatHistoryRequest.

        Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.  # noqa: E501

        :return: The message_id_from of this GetChatHistoryRequest.
        :rtype: int
        """
        return self._message_id_from

    @message_id_from.setter
    def message_id_from(self, message_id_from: int):
        """Sets the message_id_from of this GetChatHistoryRequest.

        Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.  # noqa: E501

        :param message_id_from: The message_id_from of this GetChatHistoryRequest.
        :type message_id_from: int
        """

        self._message_id_from = message_id_from
