from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class WarehouseStockType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    FIT = 'FIT'
    FREEZE = 'FREEZE'
    AVAILABLE = 'AVAILABLE'
    QUARANTINE = 'QUARANTINE'
    UTILIZATION = 'UTILIZATION'
    DEFECT = 'DEFECT'
    EXPIRED = 'EXPIRED'
    def __init__(self):  # noqa: E501
        """WarehouseStockType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'WarehouseStockType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WarehouseStockType of this WarehouseStockType.  # noqa: E501
        :rtype: WarehouseStockType
        """
        return util.deserialize_model(dikt, cls)