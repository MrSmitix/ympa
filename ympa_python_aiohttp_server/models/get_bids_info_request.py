# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class GetBidsInfoRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, skus: List[str]=None):
        """GetBidsInfoRequest - a model defined in OpenAPI

        :param skus: The skus of this GetBidsInfoRequest.
        """
        self.openapi_types = {
            'skus': List[str]
        }

        self.attribute_map = {
            'skus': 'skus'
        }

        self._skus = skus

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetBidsInfoRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetBidsInfoRequest of this GetBidsInfoRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def skus(self):
        """Gets the skus of this GetBidsInfoRequest.

        Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 

        :return: The skus of this GetBidsInfoRequest.
        :rtype: List[str]
        """
        return self._skus

    @skus.setter
    def skus(self, skus):
        """Sets the skus of this GetBidsInfoRequest.

        Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 

        :param skus: The skus of this GetBidsInfoRequest.
        :type skus: List[str]
        """
        if skus is not None and len(skus) > 1500:
            raise ValueError("Invalid value for `skus`, number of items must be less than or equal to `1500`")
        if skus is not None and len(skus) < 1:
            raise ValueError("Invalid value for `skus`, number of items must be greater than or equal to `1`")

        self._skus = skus
