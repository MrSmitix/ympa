from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PromoOfferParticipationStatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    AUTO = 'AUTO'
    PARTIALLY_AUTO = 'PARTIALLY_AUTO'
    MANUAL = 'MANUAL'
    NOT_PARTICIPATING = 'NOT_PARTICIPATING'
    def __init__(self):  # noqa: E501
        """PromoOfferParticipationStatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PromoOfferParticipationStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PromoOfferParticipationStatusType of this PromoOfferParticipationStatusType.  # noqa: E501
        :rtype: PromoOfferParticipationStatusType
        """
        return util.deserialize_model(dikt, cls)
