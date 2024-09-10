from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.goods_feedback_comment_list_dto import GoodsFeedbackCommentListDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.goods_feedback_comment_list_dto import GoodsFeedbackCommentListDTO  # noqa: E501

class GetGoodsFeedbackCommentsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """GetGoodsFeedbackCommentsResponse - a model defined in OpenAPI

        :param status: The status of this GetGoodsFeedbackCommentsResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetGoodsFeedbackCommentsResponse.  # noqa: E501
        :type result: GoodsFeedbackCommentListDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': GoodsFeedbackCommentListDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetGoodsFeedbackCommentsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetGoodsFeedbackCommentsResponse of this GetGoodsFeedbackCommentsResponse.  # noqa: E501
        :rtype: GetGoodsFeedbackCommentsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetGoodsFeedbackCommentsResponse.


        :return: The status of this GetGoodsFeedbackCommentsResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetGoodsFeedbackCommentsResponse.


        :param status: The status of this GetGoodsFeedbackCommentsResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> GoodsFeedbackCommentListDTO:
        """Gets the result of this GetGoodsFeedbackCommentsResponse.


        :return: The result of this GetGoodsFeedbackCommentsResponse.
        :rtype: GoodsFeedbackCommentListDTO
        """
        return self._result

    @result.setter
    def result(self, result: GoodsFeedbackCommentListDTO):
        """Sets the result of this GetGoodsFeedbackCommentsResponse.


        :param result: The result of this GetGoodsFeedbackCommentsResponse.
        :type result: GoodsFeedbackCommentListDTO
        """

        self._result = result