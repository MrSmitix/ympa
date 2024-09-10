from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.chat_message_payload_dto import ChatMessagePayloadDTO
from ympa_python_flask_server.models.chat_message_sender_type import ChatMessageSenderType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.chat_message_payload_dto import ChatMessagePayloadDTO  # noqa: E501
from ympa_python_flask_server.models.chat_message_sender_type import ChatMessageSenderType  # noqa: E501

class ChatMessageDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, message_id=None, created_at=None, sender=None, message=None, payload=None):  # noqa: E501
        """ChatMessageDTO - a model defined in OpenAPI

        :param message_id: The message_id of this ChatMessageDTO.  # noqa: E501
        :type message_id: int
        :param created_at: The created_at of this ChatMessageDTO.  # noqa: E501
        :type created_at: datetime
        :param sender: The sender of this ChatMessageDTO.  # noqa: E501
        :type sender: ChatMessageSenderType
        :param message: The message of this ChatMessageDTO.  # noqa: E501
        :type message: str
        :param payload: The payload of this ChatMessageDTO.  # noqa: E501
        :type payload: List[ChatMessagePayloadDTO]
        """
        self.openapi_types = {
            'message_id': int,
            'created_at': datetime,
            'sender': ChatMessageSenderType,
            'message': str,
            'payload': List[ChatMessagePayloadDTO]
        }

        self.attribute_map = {
            'message_id': 'messageId',
            'created_at': 'createdAt',
            'sender': 'sender',
            'message': 'message',
            'payload': 'payload'
        }

        self._message_id = message_id
        self._created_at = created_at
        self._sender = sender
        self._message = message
        self._payload = payload

    @classmethod
    def from_dict(cls, dikt) -> 'ChatMessageDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatMessageDTO of this ChatMessageDTO.  # noqa: E501
        :rtype: ChatMessageDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message_id(self) -> int:
        """Gets the message_id of this ChatMessageDTO.

        Идентификатор сообщения.  # noqa: E501

        :return: The message_id of this ChatMessageDTO.
        :rtype: int
        """
        return self._message_id

    @message_id.setter
    def message_id(self, message_id: int):
        """Sets the message_id of this ChatMessageDTO.

        Идентификатор сообщения.  # noqa: E501

        :param message_id: The message_id of this ChatMessageDTO.
        :type message_id: int
        """
        if message_id is None:
            raise ValueError("Invalid value for `message_id`, must not be `None`")  # noqa: E501

        self._message_id = message_id

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this ChatMessageDTO.

        Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.   # noqa: E501

        :return: The created_at of this ChatMessageDTO.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this ChatMessageDTO.

        Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.   # noqa: E501

        :param created_at: The created_at of this ChatMessageDTO.
        :type created_at: datetime
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")  # noqa: E501

        self._created_at = created_at

    @property
    def sender(self) -> ChatMessageSenderType:
        """Gets the sender of this ChatMessageDTO.


        :return: The sender of this ChatMessageDTO.
        :rtype: ChatMessageSenderType
        """
        return self._sender

    @sender.setter
    def sender(self, sender: ChatMessageSenderType):
        """Sets the sender of this ChatMessageDTO.


        :param sender: The sender of this ChatMessageDTO.
        :type sender: ChatMessageSenderType
        """
        if sender is None:
            raise ValueError("Invalid value for `sender`, must not be `None`")  # noqa: E501

        self._sender = sender

    @property
    def message(self) -> str:
        """Gets the message of this ChatMessageDTO.

        Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.   # noqa: E501

        :return: The message of this ChatMessageDTO.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this ChatMessageDTO.

        Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.   # noqa: E501

        :param message: The message of this ChatMessageDTO.
        :type message: str
        """

        self._message = message

    @property
    def payload(self) -> List[ChatMessagePayloadDTO]:
        """Gets the payload of this ChatMessageDTO.

        Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.   # noqa: E501

        :return: The payload of this ChatMessageDTO.
        :rtype: List[ChatMessagePayloadDTO]
        """
        return self._payload

    @payload.setter
    def payload(self, payload: List[ChatMessagePayloadDTO]):
        """Sets the payload of this ChatMessageDTO.

        Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.   # noqa: E501

        :param payload: The payload of this ChatMessageDTO.
        :type payload: List[ChatMessagePayloadDTO]
        """

        self._payload = payload
