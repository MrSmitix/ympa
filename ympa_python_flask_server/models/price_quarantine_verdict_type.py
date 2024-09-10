from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PriceQuarantineVerdictType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    PRICE_CHANGE = 'PRICE_CHANGE'
    LOW_PRICE = 'LOW_PRICE'
    LOW_PRICE_PROMO = 'LOW_PRICE_PROMO'
    def __init__(self):  # noqa: E501
        """PriceQuarantineVerdictType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PriceQuarantineVerdictType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PriceQuarantineVerdictType of this PriceQuarantineVerdictType.  # noqa: E501
        :rtype: PriceQuarantineVerdictType
        """
        return util.deserialize_model(dikt, cls)