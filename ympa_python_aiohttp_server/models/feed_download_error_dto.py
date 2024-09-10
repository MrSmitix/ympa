# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.feed_download_error_type import FeedDownloadErrorType
from ympa_python_aiohttp_server import util


class FeedDownloadErrorDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, http_status_code: int=None, type: FeedDownloadErrorType=None, description: str=None):
        """FeedDownloadErrorDTO - a model defined in OpenAPI

        :param http_status_code: The http_status_code of this FeedDownloadErrorDTO.
        :param type: The type of this FeedDownloadErrorDTO.
        :param description: The description of this FeedDownloadErrorDTO.
        """
        self.openapi_types = {
            'http_status_code': int,
            'type': FeedDownloadErrorType,
            'description': str
        }

        self.attribute_map = {
            'http_status_code': 'httpStatusCode',
            'type': 'type',
            'description': 'description'
        }

        self._http_status_code = http_status_code
        self._type = type
        self._description = description

    @classmethod
    def from_dict(cls, dikt: dict) -> 'FeedDownloadErrorDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FeedDownloadErrorDTO of this FeedDownloadErrorDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def http_status_code(self):
        """Gets the http_status_code of this FeedDownloadErrorDTO.

        HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 

        :return: The http_status_code of this FeedDownloadErrorDTO.
        :rtype: int
        """
        return self._http_status_code

    @http_status_code.setter
    def http_status_code(self, http_status_code):
        """Sets the http_status_code of this FeedDownloadErrorDTO.

        HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 

        :param http_status_code: The http_status_code of this FeedDownloadErrorDTO.
        :type http_status_code: int
        """

        self._http_status_code = http_status_code

    @property
    def type(self):
        """Gets the type of this FeedDownloadErrorDTO.


        :return: The type of this FeedDownloadErrorDTO.
        :rtype: FeedDownloadErrorType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this FeedDownloadErrorDTO.


        :param type: The type of this FeedDownloadErrorDTO.
        :type type: FeedDownloadErrorType
        """

        self._type = type

    @property
    def description(self):
        """Gets the description of this FeedDownloadErrorDTO.

        Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 

        :return: The description of this FeedDownloadErrorDTO.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this FeedDownloadErrorDTO.

        Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 

        :param description: The description of this FeedDownloadErrorDTO.
        :type description: str
        """

        self._description = description
