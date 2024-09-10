from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PaymentFrequencyType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    DAILY = 'DAILY'
    WEEKLY = 'WEEKLY'
    BIWEEKLY = 'BIWEEKLY'
    MONTHLY = 'MONTHLY'
    def __init__(self):  # noqa: E501
        """PaymentFrequencyType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PaymentFrequencyType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PaymentFrequencyType of this PaymentFrequencyType.  # noqa: E501
        :rtype: PaymentFrequencyType
        """
        return util.deserialize_model(dikt, cls)
