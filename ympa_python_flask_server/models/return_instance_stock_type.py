from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ReturnInstanceStockType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    FIT = 'FIT'
    DEFECT = 'DEFECT'
    ANOMALY = 'ANOMALY'
    SURPLUS = 'SURPLUS'
    EXPIRED = 'EXPIRED'
    MISGRADING = 'MISGRADING'
    UNDEFINED = 'UNDEFINED'
    INCORRECT_IMEI = 'INCORRECT_IMEI'
    INCORRECT_SERIAL_NUMBER = 'INCORRECT_SERIAL_NUMBER'
    INCORRECT_CIS = 'INCORRECT_CIS'
    PART_MISSING = 'PART_MISSING'
    NON_COMPLIENT = 'NON_COMPLIENT'
    NOT_ACCEPTABLE = 'NOT_ACCEPTABLE'
    SERVICE = 'SERVICE'
    MARKDOWN = 'MARKDOWN'
    DEMO = 'DEMO'
    REPAIR = 'REPAIR'
    FIRMWARE = 'FIRMWARE'
    UNKNOWN = 'UNKNOWN'
    def __init__(self):  # noqa: E501
        """ReturnInstanceStockType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ReturnInstanceStockType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReturnInstanceStockType of this ReturnInstanceStockType.  # noqa: E501
        :rtype: ReturnInstanceStockType
        """
        return util.deserialize_model(dikt, cls)
