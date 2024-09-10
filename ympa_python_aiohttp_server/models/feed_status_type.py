# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class FeedStatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    ERROR = 'ERROR'
    NA = 'NA'
    OK = 'OK'

    def __init__(self):
        """FeedStatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'FeedStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FeedStatusType of this FeedStatusType.
        """
        return util.deserialize_model(dikt, cls)
