# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.goods_stats_dto import GoodsStatsDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetGoodsStatsResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: GoodsStatsDTO=None):  # noqa: E501
        """GetGoodsStatsResponse - a model defined in Swagger

        :param status: The status of this GetGoodsStatsResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetGoodsStatsResponse.  # noqa: E501
        :type result: GoodsStatsDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': GoodsStatsDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetGoodsStatsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetGoodsStatsResponse of this GetGoodsStatsResponse.  # noqa: E501
        :rtype: GetGoodsStatsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetGoodsStatsResponse.


        :return: The status of this GetGoodsStatsResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetGoodsStatsResponse.


        :param status: The status of this GetGoodsStatsResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> GoodsStatsDTO:
        """Gets the result of this GetGoodsStatsResponse.


        :return: The result of this GetGoodsStatsResponse.
        :rtype: GoodsStatsDTO
        """
        return self._result

    @result.setter
    def result(self, result: GoodsStatsDTO):
        """Sets the result of this GetGoodsStatsResponse.


        :param result: The result of this GetGoodsStatsResponse.
        :type result: GoodsStatsDTO
        """

        self._result = result
