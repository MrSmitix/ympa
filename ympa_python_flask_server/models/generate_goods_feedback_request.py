from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class GenerateGoodsFeedbackRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, business_id=None):  # noqa: E501
        """GenerateGoodsFeedbackRequest - a model defined in OpenAPI

        :param business_id: The business_id of this GenerateGoodsFeedbackRequest.  # noqa: E501
        :type business_id: int
        """
        self.openapi_types = {
            'business_id': int
        }

        self.attribute_map = {
            'business_id': 'businessId'
        }

        self._business_id = business_id

    @classmethod
    def from_dict(cls, dikt) -> 'GenerateGoodsFeedbackRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GenerateGoodsFeedbackRequest of this GenerateGoodsFeedbackRequest.  # noqa: E501
        :rtype: GenerateGoodsFeedbackRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def business_id(self) -> int:
        """Gets the business_id of this GenerateGoodsFeedbackRequest.

        Идентификатор бизнеса.  # noqa: E501

        :return: The business_id of this GenerateGoodsFeedbackRequest.
        :rtype: int
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id: int):
        """Sets the business_id of this GenerateGoodsFeedbackRequest.

        Идентификатор бизнеса.  # noqa: E501

        :param business_id: The business_id of this GenerateGoodsFeedbackRequest.
        :type business_id: int
        """
        if business_id is None:
            raise ValueError("Invalid value for `business_id`, must not be `None`")  # noqa: E501

        self._business_id = business_id
