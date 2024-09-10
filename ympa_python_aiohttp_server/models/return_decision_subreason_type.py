# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class ReturnDecisionSubreasonType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    USER_DID_NOT_LIKE = 'USER_DID_NOT_LIKE'
    USER_CHANGED_MIND = 'USER_CHANGED_MIND'
    DELIVERED_TOO_LONG = 'DELIVERED_TOO_LONG'
    BAD_PACKAGE = 'BAD_PACKAGE'
    DAMAGED = 'DAMAGED'
    NOT_WORKING = 'NOT_WORKING'
    INCOMPLETENESS = 'INCOMPLETENESS'
    WRONG_ITEM = 'WRONG_ITEM'
    WRONG_COLOR = 'WRONG_COLOR'
    DID_NOT_MATCH_DESCRIPTION = 'DID_NOT_MATCH_DESCRIPTION'
    UNKNOWN = 'UNKNOWN'

    def __init__(self):
        """ReturnDecisionSubreasonType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ReturnDecisionSubreasonType':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ReturnDecisionSubreasonType of this ReturnDecisionSubreasonType.
        """
        return util.deserialize_model(dikt, cls)
