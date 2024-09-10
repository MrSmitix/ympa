from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.offer_processing_note_type import OfferProcessingNoteType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.offer_processing_note_type import OfferProcessingNoteType  # noqa: E501

class OfferProcessingNoteDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, payload=None):  # noqa: E501
        """OfferProcessingNoteDTO - a model defined in OpenAPI

        :param type: The type of this OfferProcessingNoteDTO.  # noqa: E501
        :type type: OfferProcessingNoteType
        :param payload: The payload of this OfferProcessingNoteDTO.  # noqa: E501
        :type payload: str
        """
        self.openapi_types = {
            'type': OfferProcessingNoteType,
            'payload': str
        }

        self.attribute_map = {
            'type': 'type',
            'payload': 'payload'
        }

        self._type = type
        self._payload = payload

    @classmethod
    def from_dict(cls, dikt) -> 'OfferProcessingNoteDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferProcessingNoteDTO of this OfferProcessingNoteDTO.  # noqa: E501
        :rtype: OfferProcessingNoteDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> OfferProcessingNoteType:
        """Gets the type of this OfferProcessingNoteDTO.


        :return: The type of this OfferProcessingNoteDTO.
        :rtype: OfferProcessingNoteType
        """
        return self._type

    @type.setter
    def type(self, type: OfferProcessingNoteType):
        """Sets the type of this OfferProcessingNoteDTO.


        :param type: The type of this OfferProcessingNoteDTO.
        :type type: OfferProcessingNoteType
        """

        self._type = type

    @property
    def payload(self) -> str:
        """Gets the payload of this OfferProcessingNoteDTO.

        Дополнительная информация о причине отклонения товара.   # noqa: E501

        :return: The payload of this OfferProcessingNoteDTO.
        :rtype: str
        """
        return self._payload

    @payload.setter
    def payload(self, payload: str):
        """Sets the payload of this OfferProcessingNoteDTO.

        Дополнительная информация о причине отклонения товара.   # noqa: E501

        :param payload: The payload of this OfferProcessingNoteDTO.
        :type payload: str
        """

        self._payload = payload
