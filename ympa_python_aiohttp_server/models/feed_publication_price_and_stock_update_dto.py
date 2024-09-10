# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class FeedPublicationPriceAndStockUpdateDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, file_time: datetime=None, published_time: datetime=None):
        """FeedPublicationPriceAndStockUpdateDTO - a model defined in OpenAPI

        :param file_time: The file_time of this FeedPublicationPriceAndStockUpdateDTO.
        :param published_time: The published_time of this FeedPublicationPriceAndStockUpdateDTO.
        """
        self.openapi_types = {
            'file_time': datetime,
            'published_time': datetime
        }

        self.attribute_map = {
            'file_time': 'fileTime',
            'published_time': 'publishedTime'
        }

        self._file_time = file_time
        self._published_time = published_time

    @classmethod
    def from_dict(cls, dikt: dict) -> 'FeedPublicationPriceAndStockUpdateDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FeedPublicationPriceAndStockUpdateDTO of this FeedPublicationPriceAndStockUpdateDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def file_time(self):
        """Gets the file_time of this FeedPublicationPriceAndStockUpdateDTO.

        Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 

        :return: The file_time of this FeedPublicationPriceAndStockUpdateDTO.
        :rtype: datetime
        """
        return self._file_time

    @file_time.setter
    def file_time(self, file_time):
        """Sets the file_time of this FeedPublicationPriceAndStockUpdateDTO.

        Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 

        :param file_time: The file_time of this FeedPublicationPriceAndStockUpdateDTO.
        :type file_time: datetime
        """

        self._file_time = file_time

    @property
    def published_time(self):
        """Gets the published_time of this FeedPublicationPriceAndStockUpdateDTO.

        Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 

        :return: The published_time of this FeedPublicationPriceAndStockUpdateDTO.
        :rtype: datetime
        """
        return self._published_time

    @published_time.setter
    def published_time(self, published_time):
        """Sets the published_time of this FeedPublicationPriceAndStockUpdateDTO.

        Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 

        :param published_time: The published_time of this FeedPublicationPriceAndStockUpdateDTO.
        :type published_time: datetime
        """

        self._published_time = published_time
