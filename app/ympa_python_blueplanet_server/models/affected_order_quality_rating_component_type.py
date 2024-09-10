# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class AffectedOrderQualityRatingComponentType(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    DBS_CANCELLATION_RATE = 'DBS_CANCELLATION_RATE'
    DBS_LATE_DELIVERY_RATE = 'DBS_LATE_DELIVERY_RATE'
    FBS_CANCELLATION_RATE = 'FBS_CANCELLATION_RATE'
    FBS_LATE_SHIP_RATE = 'FBS_LATE_SHIP_RATE'

    def __init__(self):  # noqa: E501
        """AffectedOrderQualityRatingComponentType - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'AffectedOrderQualityRatingComponentType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AffectedOrderQualityRatingComponentType of this AffectedOrderQualityRatingComponentType.  # noqa: E501
        :rtype: AffectedOrderQualityRatingComponentType
        """
        return util.deserialize_model(dikt, cls)
