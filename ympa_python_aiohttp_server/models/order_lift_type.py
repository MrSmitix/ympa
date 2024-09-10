# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class OrderLiftType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    NOT_NEEDED = 'NOT_NEEDED'
    MANUAL = 'MANUAL'
    ELEVATOR = 'ELEVATOR'
    CARGO_ELEVATOR = 'CARGO_ELEVATOR'
    FREE = 'FREE'
    UNKNOWN = 'UNKNOWN'

    def __init__(self):
        """OrderLiftType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrderLiftType':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrderLiftType of this OrderLiftType.
        """
        return util.deserialize_model(dikt, cls)
