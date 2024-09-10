from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class LicenseCheckStatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    NEW = 'NEW'
    SUCCESS = 'SUCCESS'
    FAIL = 'FAIL'
    REVOKE = 'REVOKE'
    DONT_WANT = 'DONT_WANT'
    FAIL_MANUAL = 'FAIL_MANUAL'
    def __init__(self):  # noqa: E501
        """LicenseCheckStatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'LicenseCheckStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LicenseCheckStatusType of this LicenseCheckStatusType.  # noqa: E501
        :rtype: LicenseCheckStatusType
        """
        return util.deserialize_model(dikt, cls)
