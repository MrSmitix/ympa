from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ParameterType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    TEXT = 'TEXT'
    ENUM = 'ENUM'
    BOOLEAN = 'BOOLEAN'
    NUMERIC = 'NUMERIC'
    def __init__(self):  # noqa: E501
        """ParameterType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ParameterType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ParameterType of this ParameterType.  # noqa: E501
        :rtype: ParameterType
        """
        return util.deserialize_model(dikt, cls)
