# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class OrdersStatsStockType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    FIT = 'FIT'
    FREEZE = 'FREEZE'
    AVAILABLE = 'AVAILABLE'
    QUARANTINE = 'QUARANTINE'
    UTILIZATION = 'UTILIZATION'
    DEFECT = 'DEFECT'
    EXPIRED = 'EXPIRED'

    def __init__(self):
        """OrdersStatsStockType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrdersStatsStockType':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrdersStatsStockType of this OrdersStatsStockType.
        """
        return util.deserialize_model(dikt, cls)
