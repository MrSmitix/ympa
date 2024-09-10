from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.chat_status_type import ChatStatusType
from ympa_python_flask_server.models.chat_type import ChatType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.chat_status_type import ChatStatusType  # noqa: E501
from ympa_python_flask_server.models.chat_type import ChatType  # noqa: E501

class GetChatsRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, order_ids=None, types=None, statuses=None):  # noqa: E501
        """GetChatsRequest - a model defined in OpenAPI

        :param order_ids: The order_ids of this GetChatsRequest.  # noqa: E501
        :type order_ids: List[int]
        :param types: The types of this GetChatsRequest.  # noqa: E501
        :type types: List[ChatType]
        :param statuses: The statuses of this GetChatsRequest.  # noqa: E501
        :type statuses: List[ChatStatusType]
        """
        self.openapi_types = {
            'order_ids': List[int],
            'types': List[ChatType],
            'statuses': List[ChatStatusType]
        }

        self.attribute_map = {
            'order_ids': 'orderIds',
            'types': 'types',
            'statuses': 'statuses'
        }

        self._order_ids = order_ids
        self._types = types
        self._statuses = statuses

    @classmethod
    def from_dict(cls, dikt) -> 'GetChatsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetChatsRequest of this GetChatsRequest.  # noqa: E501
        :rtype: GetChatsRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def order_ids(self) -> List[int]:
        """Gets the order_ids of this GetChatsRequest.

        Фильтр по идентификаторам заказов на Маркете.  # noqa: E501

        :return: The order_ids of this GetChatsRequest.
        :rtype: List[int]
        """
        return self._order_ids

    @order_ids.setter
    def order_ids(self, order_ids: List[int]):
        """Sets the order_ids of this GetChatsRequest.

        Фильтр по идентификаторам заказов на Маркете.  # noqa: E501

        :param order_ids: The order_ids of this GetChatsRequest.
        :type order_ids: List[int]
        """
        if order_ids is not None and len(order_ids) < 1:
            raise ValueError("Invalid value for `order_ids`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._order_ids = order_ids

    @property
    def types(self) -> List[ChatType]:
        """Gets the types of this GetChatsRequest.

        Фильтр по типам чатов.  # noqa: E501

        :return: The types of this GetChatsRequest.
        :rtype: List[ChatType]
        """
        return self._types

    @types.setter
    def types(self, types: List[ChatType]):
        """Sets the types of this GetChatsRequest.

        Фильтр по типам чатов.  # noqa: E501

        :param types: The types of this GetChatsRequest.
        :type types: List[ChatType]
        """
        if types is not None and len(types) < 1:
            raise ValueError("Invalid value for `types`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._types = types

    @property
    def statuses(self) -> List[ChatStatusType]:
        """Gets the statuses of this GetChatsRequest.

        Фильтр по статусам чатов.  # noqa: E501

        :return: The statuses of this GetChatsRequest.
        :rtype: List[ChatStatusType]
        """
        return self._statuses

    @statuses.setter
    def statuses(self, statuses: List[ChatStatusType]):
        """Sets the statuses of this GetChatsRequest.

        Фильтр по статусам чатов.  # noqa: E501

        :param statuses: The statuses of this GetChatsRequest.
        :type statuses: List[ChatStatusType]
        """
        if statuses is not None and len(statuses) < 1:
            raise ValueError("Invalid value for `statuses`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._statuses = statuses
