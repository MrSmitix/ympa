from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OfferMappingKindType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    ACTIVE = 'ACTIVE'
    ALL = 'ALL'
    def __init__(self):  # noqa: E501
        """OfferMappingKindType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'OfferMappingKindType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferMappingKindType of this OfferMappingKindType.  # noqa: E501
        :rtype: OfferMappingKindType
        """
        return util.deserialize_model(dikt, cls)