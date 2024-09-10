# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class AffectedOrderQualityRatingComponentType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    DBS_CANCELLATION_RATE = 'DBS_CANCELLATION_RATE'
    DBS_LATE_DELIVERY_RATE = 'DBS_LATE_DELIVERY_RATE'
    FBS_CANCELLATION_RATE = 'FBS_CANCELLATION_RATE'
    FBS_LATE_SHIP_RATE = 'FBS_LATE_SHIP_RATE'

    def __init__(self):
        """AffectedOrderQualityRatingComponentType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AffectedOrderQualityRatingComponentType':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AffectedOrderQualityRatingComponentType of this AffectedOrderQualityRatingComponentType.
        """
        return util.deserialize_model(dikt, cls)
