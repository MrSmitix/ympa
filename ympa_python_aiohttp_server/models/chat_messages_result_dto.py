# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.chat_message_dto import ChatMessageDTO
from ympa_python_aiohttp_server.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO
from ympa_python_aiohttp_server import util


class ChatMessagesResultDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, order_id: int=None, messages: List[ChatMessageDTO]=None, paging: ForwardScrollingPagerDTO=None):
        """ChatMessagesResultDTO - a model defined in OpenAPI

        :param order_id: The order_id of this ChatMessagesResultDTO.
        :param messages: The messages of this ChatMessagesResultDTO.
        :param paging: The paging of this ChatMessagesResultDTO.
        """
        self.openapi_types = {
            'order_id': int,
            'messages': List[ChatMessageDTO],
            'paging': ForwardScrollingPagerDTO
        }

        self.attribute_map = {
            'order_id': 'orderId',
            'messages': 'messages',
            'paging': 'paging'
        }

        self._order_id = order_id
        self._messages = messages
        self._paging = paging

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ChatMessagesResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatMessagesResultDTO of this ChatMessagesResultDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def order_id(self):
        """Gets the order_id of this ChatMessagesResultDTO.

        Идентификатор заказа.

        :return: The order_id of this ChatMessagesResultDTO.
        :rtype: int
        """
        return self._order_id

    @order_id.setter
    def order_id(self, order_id):
        """Sets the order_id of this ChatMessagesResultDTO.

        Идентификатор заказа.

        :param order_id: The order_id of this ChatMessagesResultDTO.
        :type order_id: int
        """
        if order_id is None:
            raise ValueError("Invalid value for `order_id`, must not be `None`")

        self._order_id = order_id

    @property
    def messages(self):
        """Gets the messages of this ChatMessagesResultDTO.

        Информация о сообщениях.

        :return: The messages of this ChatMessagesResultDTO.
        :rtype: List[ChatMessageDTO]
        """
        return self._messages

    @messages.setter
    def messages(self, messages):
        """Sets the messages of this ChatMessagesResultDTO.

        Информация о сообщениях.

        :param messages: The messages of this ChatMessagesResultDTO.
        :type messages: List[ChatMessageDTO]
        """
        if messages is None:
            raise ValueError("Invalid value for `messages`, must not be `None`")

        self._messages = messages

    @property
    def paging(self):
        """Gets the paging of this ChatMessagesResultDTO.


        :return: The paging of this ChatMessagesResultDTO.
        :rtype: ForwardScrollingPagerDTO
        """
        return self._paging

    @paging.setter
    def paging(self, paging):
        """Sets the paging of this ChatMessagesResultDTO.


        :param paging: The paging of this ChatMessagesResultDTO.
        :type paging: ForwardScrollingPagerDTO
        """

        self._paging = paging
