# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.order_document_status_type import OrderDocumentStatusType
from ympa_python_aiohttp_server import util


class DocumentDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status: OrderDocumentStatusType=None, number: str=None, _date: date=None):
        """DocumentDTO - a model defined in OpenAPI

        :param status: The status of this DocumentDTO.
        :param number: The number of this DocumentDTO.
        :param _date: The _date of this DocumentDTO.
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
    def from_dict(cls, dikt: dict) -> 'DocumentDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DocumentDTO of this DocumentDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this DocumentDTO.


        :return: The status of this DocumentDTO.
        :rtype: OrderDocumentStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this DocumentDTO.


        :param status: The status of this DocumentDTO.
        :type status: OrderDocumentStatusType
        """

        self._status = status

    @property
    def number(self):
        """Gets the number of this DocumentDTO.

        Номер документа.

        :return: The number of this DocumentDTO.
        :rtype: str
        """
        return self._number

    @number.setter
    def number(self, number):
        """Sets the number of this DocumentDTO.

        Номер документа.

        :param number: The number of this DocumentDTO.
        :type number: str
        """

        self._number = number

    @property
    def _date(self):
        """Gets the _date of this DocumentDTO.

        Дата создания документа.

        :return: The _date of this DocumentDTO.
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this DocumentDTO.

        Дата создания документа.

        :param _date: The _date of this DocumentDTO.
        :type _date: date
        """

        self.__date = _date
