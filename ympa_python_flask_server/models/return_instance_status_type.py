from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ReturnInstanceStatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    CREATED = 'CREATED'
    RECEIVED = 'RECEIVED'
    IN_TRANSIT = 'IN_TRANSIT'
    READY_FOR_PICKUP = 'READY_FOR_PICKUP'
    PICKED = 'PICKED'
    RECEIVED_ON_FULFILLMENT = 'RECEIVED_ON_FULFILLMENT'
    CANCELLED = 'CANCELLED'
    LOST = 'LOST'
    UTILIZED = 'UTILIZED'
    PREPARED_FOR_UTILIZATION = 'PREPARED_FOR_UTILIZATION'
    EXPROPRIATED = 'EXPROPRIATED'
    NOT_IN_DEMAND = 'NOT_IN_DEMAND'
    def __init__(self):  # noqa: E501
        """ReturnInstanceStatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ReturnInstanceStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReturnInstanceStatusType of this ReturnInstanceStatusType.  # noqa: E501
        :rtype: ReturnInstanceStatusType
        """
        return util.deserialize_model(dikt, cls)