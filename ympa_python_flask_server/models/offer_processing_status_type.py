from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OfferProcessingStatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    UNKNOWN = 'UNKNOWN'
    READY = 'READY'
    IN_WORK = 'IN_WORK'
    NEED_INFO = 'NEED_INFO'
    NEED_MAPPING = 'NEED_MAPPING'
    NEED_CONTENT = 'NEED_CONTENT'
    CONTENT_PROCESSING = 'CONTENT_PROCESSING'
    SUSPENDED = 'SUSPENDED'
    REJECTED = 'REJECTED'
    REVIEW = 'REVIEW'
    CREATE_ERROR = 'CREATE_ERROR'
    UPDATE_ERROR = 'UPDATE_ERROR'
    def __init__(self):  # noqa: E501
        """OfferProcessingStatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'OfferProcessingStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferProcessingStatusType of this OfferProcessingStatusType.  # noqa: E501
        :rtype: OfferProcessingStatusType
        """
        return util.deserialize_model(dikt, cls)
