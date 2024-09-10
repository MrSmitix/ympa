# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class FeedbackReactionStatusType(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    ALL = 'ALL'
    NEED_REACTION = 'NEED_REACTION'

    def __init__(self):  # noqa: E501
        """FeedbackReactionStatusType - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'FeedbackReactionStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeedbackReactionStatusType of this FeedbackReactionStatusType.  # noqa: E501
        :rtype: FeedbackReactionStatusType
        """
        return util.deserialize_model(dikt, cls)