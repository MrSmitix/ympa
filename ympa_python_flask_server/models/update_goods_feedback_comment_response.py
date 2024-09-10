from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.goods_feedback_comment_dto import GoodsFeedbackCommentDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.goods_feedback_comment_dto import GoodsFeedbackCommentDTO  # noqa: E501

class UpdateGoodsFeedbackCommentResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """UpdateGoodsFeedbackCommentResponse - a model defined in OpenAPI

        :param status: The status of this UpdateGoodsFeedbackCommentResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this UpdateGoodsFeedbackCommentResponse.  # noqa: E501
        :type result: GoodsFeedbackCommentDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': GoodsFeedbackCommentDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateGoodsFeedbackCommentResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateGoodsFeedbackCommentResponse of this UpdateGoodsFeedbackCommentResponse.  # noqa: E501
        :rtype: UpdateGoodsFeedbackCommentResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this UpdateGoodsFeedbackCommentResponse.


        :return: The status of this UpdateGoodsFeedbackCommentResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this UpdateGoodsFeedbackCommentResponse.


        :param status: The status of this UpdateGoodsFeedbackCommentResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> GoodsFeedbackCommentDTO:
        """Gets the result of this UpdateGoodsFeedbackCommentResponse.


        :return: The result of this UpdateGoodsFeedbackCommentResponse.
        :rtype: GoodsFeedbackCommentDTO
        """
        return self._result

    @result.setter
    def result(self, result: GoodsFeedbackCommentDTO):
        """Sets the result of this UpdateGoodsFeedbackCommentResponse.


        :param result: The result of this UpdateGoodsFeedbackCommentResponse.
        :type result: GoodsFeedbackCommentDTO
        """

        self._result = result
