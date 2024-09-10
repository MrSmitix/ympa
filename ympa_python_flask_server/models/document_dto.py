from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_document_status_type import OrderDocumentStatusType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_document_status_type import OrderDocumentStatusType  # noqa: E501

class DocumentDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, number=None, _date=None):  # noqa: E501
        """DocumentDTO - a model defined in OpenAPI

        :param status: The status of this DocumentDTO.  # noqa: E501
        :type status: OrderDocumentStatusType
        :param number: The number of this DocumentDTO.  # noqa: E501
        :type number: str
        :param _date: The _date of this DocumentDTO.  # noqa: E501
        :type _date: date
        """
        self.openapi_types = {
            'status': OrderDocumentStatusType,
            'number': str,
            '_date': date
        }

        self.attribute_map = {
            'status': 'status',
            'number': 'number',
            '_date': 'date'
        }

        self._status = status
        self._number = number
        self.__date = _date

    @classmethod
    def from_dict(cls, dikt) -> 'DocumentDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DocumentDTO of this DocumentDTO.  # noqa: E501
        :rtype: DocumentDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> OrderDocumentStatusType:
        """Gets the status of this DocumentDTO.


        :return: The status of this DocumentDTO.
        :rtype: OrderDocumentStatusType
        """
        return self._status

    @status.setter
    def status(self, status: OrderDocumentStatusType):
        """Sets the status of this DocumentDTO.


        :param status: The status of this DocumentDTO.
        :type status: OrderDocumentStatusType
        """

        self._status = status

    @property
    def number(self) -> str:
        """Gets the number of this DocumentDTO.

        Номер документа.  # noqa: E501

        :return: The number of this DocumentDTO.
        :rtype: str
        """
        return self._number

    @number.setter
    def number(self, number: str):
        """Sets the number of this DocumentDTO.

        Номер документа.  # noqa: E501

        :param number: The number of this DocumentDTO.
        :type number: str
        """

        self._number = number

    @property
    def _date(self) -> date:
        """Gets the _date of this DocumentDTO.

        Дата создания документа.  # noqa: E501

        :return: The _date of this DocumentDTO.
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date: date):
        """Sets the _date of this DocumentDTO.

        Дата создания документа.  # noqa: E501

        :param _date: The _date of this DocumentDTO.
        :type _date: date
        """

        self.__date = _date
