from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OfferConditionType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    PREOWNED = 'PREOWNED'
    SHOWCASESAMPLE = 'SHOWCASESAMPLE'
    REFURBISHED = 'REFURBISHED'
    REDUCTION = 'REDUCTION'
    RENOVATED = 'RENOVATED'
    NOT_SPECIFIED = 'NOT_SPECIFIED'
    def __init__(self):  # noqa: E501
        """OfferConditionType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'OfferConditionType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferConditionType of this OfferConditionType.  # noqa: E501
        :rtype: OfferConditionType
        """
        return util.deserialize_model(dikt, cls)