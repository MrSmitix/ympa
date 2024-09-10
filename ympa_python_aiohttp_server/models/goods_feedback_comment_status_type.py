# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class GoodsFeedbackCommentStatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    PUBLISHED = 'PUBLISHED'
    UNMODERATED = 'UNMODERATED'
    BANNED = 'BANNED'
    DELETED = 'DELETED'

    def __init__(self):
        """GoodsFeedbackCommentStatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GoodsFeedbackCommentStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GoodsFeedbackCommentStatusType of this GoodsFeedbackCommentStatusType.
        """
        return util.deserialize_model(dikt, cls)
