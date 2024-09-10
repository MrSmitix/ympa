from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ReportSubStatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    NO_DATA = 'NO_DATA'
    TOO_LARGE = 'TOO_LARGE'
    RESOURCE_NOT_FOUND = 'RESOURCE_NOT_FOUND'
    def __init__(self):  # noqa: E501
        """ReportSubStatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ReportSubStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReportSubStatusType of this ReportSubStatusType.  # noqa: E501
        :rtype: ReportSubStatusType
        """
        return util.deserialize_model(dikt, cls)