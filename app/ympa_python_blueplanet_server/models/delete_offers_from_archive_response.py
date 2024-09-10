# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.delete_offers_from_archive_dto import DeleteOffersFromArchiveDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class DeleteOffersFromArchiveResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: DeleteOffersFromArchiveDTO=None):  # noqa: E501
        """DeleteOffersFromArchiveResponse - a model defined in Swagger

        :param status: The status of this DeleteOffersFromArchiveResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this DeleteOffersFromArchiveResponse.  # noqa: E501
        :type result: DeleteOffersFromArchiveDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': DeleteOffersFromArchiveDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'DeleteOffersFromArchiveResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteOffersFromArchiveResponse of this DeleteOffersFromArchiveResponse.  # noqa: E501
        :rtype: DeleteOffersFromArchiveResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this DeleteOffersFromArchiveResponse.


        :return: The status of this DeleteOffersFromArchiveResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this DeleteOffersFromArchiveResponse.


        :param status: The status of this DeleteOffersFromArchiveResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> DeleteOffersFromArchiveDTO:
        """Gets the result of this DeleteOffersFromArchiveResponse.


        :return: The result of this DeleteOffersFromArchiveResponse.
        :rtype: DeleteOffersFromArchiveDTO
        """
        return self._result

    @result.setter
    def result(self, result: DeleteOffersFromArchiveDTO):
        """Sets the result of this DeleteOffersFromArchiveResponse.


        :param result: The result of this DeleteOffersFromArchiveResponse.
        :type result: DeleteOffersFromArchiveDTO
        """

        self._result = result