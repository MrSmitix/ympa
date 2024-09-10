from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OrderItemsModificationRequestReasonType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    PARTNER_REQUESTED_REMOVE = 'PARTNER_REQUESTED_REMOVE'
    USER_REQUESTED_REMOVE = 'USER_REQUESTED_REMOVE'
    def __init__(self):  # noqa: E501
        """OrderItemsModificationRequestReasonType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'OrderItemsModificationRequestReasonType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderItemsModificationRequestReasonType of this OrderItemsModificationRequestReasonType.  # noqa: E501
        :rtype: OrderItemsModificationRequestReasonType
        """
        return util.deserialize_model(dikt, cls)