from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PriceSuggestType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    BUYBOX = 'BUYBOX'
    DEFAULT_OFFER = 'DEFAULT_OFFER'
    MIN_PRICE_MARKET = 'MIN_PRICE_MARKET'
    def __init__(self):  # noqa: E501
        """PriceSuggestType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PriceSuggestType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PriceSuggestType of this PriceSuggestType.  # noqa: E501
        :rtype: PriceSuggestType
        """
        return util.deserialize_model(dikt, cls)
