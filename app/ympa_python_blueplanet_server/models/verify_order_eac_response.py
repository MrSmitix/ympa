# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.eac_verification_result_dto import EacVerificationResultDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class VerifyOrderEacResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: EacVerificationResultDTO=None):  # noqa: E501
        """VerifyOrderEacResponse - a model defined in Swagger

        :param status: The status of this VerifyOrderEacResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this VerifyOrderEacResponse.  # noqa: E501
        :type result: EacVerificationResultDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': EacVerificationResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'VerifyOrderEacResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VerifyOrderEacResponse of this VerifyOrderEacResponse.  # noqa: E501
        :rtype: VerifyOrderEacResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this VerifyOrderEacResponse.


        :return: The status of this VerifyOrderEacResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this VerifyOrderEacResponse.


        :param status: The status of this VerifyOrderEacResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> EacVerificationResultDTO:
        """Gets the result of this VerifyOrderEacResponse.


        :return: The result of this VerifyOrderEacResponse.
        :rtype: EacVerificationResultDTO
        """
        return self._result

    @result.setter
    def result(self, result: EacVerificationResultDTO):
        """Sets the result of this VerifyOrderEacResponse.


        :param result: The result of this VerifyOrderEacResponse.
        :type result: EacVerificationResultDTO
        """

        self._result = result
