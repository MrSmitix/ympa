from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.shelfs_statistics_attribution_type import ShelfsStatisticsAttributionType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.shelfs_statistics_attribution_type import ShelfsStatisticsAttributionType  # noqa: E501

class GenerateShelfsStatisticsRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, business_id=None, date_from=None, date_to=None, attribution_type=None):  # noqa: E501
        """GenerateShelfsStatisticsRequest - a model defined in OpenAPI

        :param business_id: The business_id of this GenerateShelfsStatisticsRequest.  # noqa: E501
        :type business_id: int
        :param date_from: The date_from of this GenerateShelfsStatisticsRequest.  # noqa: E501
        :type date_from: date
        :param date_to: The date_to of this GenerateShelfsStatisticsRequest.  # noqa: E501
        :type date_to: date
        :param attribution_type: The attribution_type of this GenerateShelfsStatisticsRequest.  # noqa: E501
        :type attribution_type: ShelfsStatisticsAttributionType
        """
        self.openapi_types = {
            'business_id': int,
            'date_from': date,
            'date_to': date,
            'attribution_type': ShelfsStatisticsAttributionType
        }

        self.attribute_map = {
            'business_id': 'businessId',
            'date_from': 'dateFrom',
            'date_to': 'dateTo',
            'attribution_type': 'attributionType'
        }

        self._business_id = business_id
        self._date_from = date_from
        self._date_to = date_to
        self._attribution_type = attribution_type

    @classmethod
    def from_dict(cls, dikt) -> 'GenerateShelfsStatisticsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GenerateShelfsStatisticsRequest of this GenerateShelfsStatisticsRequest.  # noqa: E501
        :rtype: GenerateShelfsStatisticsRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def business_id(self) -> int:
        """Gets the business_id of this GenerateShelfsStatisticsRequest.

        Идентификатор бизнеса.  # noqa: E501

        :return: The business_id of this GenerateShelfsStatisticsRequest.
        :rtype: int
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id: int):
        """Sets the business_id of this GenerateShelfsStatisticsRequest.

        Идентификатор бизнеса.  # noqa: E501

        :param business_id: The business_id of this GenerateShelfsStatisticsRequest.
        :type business_id: int
        """
        if business_id is None:
            raise ValueError("Invalid value for `business_id`, must not be `None`")  # noqa: E501

        self._business_id = business_id

    @property
    def date_from(self) -> date:
        """Gets the date_from of this GenerateShelfsStatisticsRequest.

        Начало периода, включительно.  # noqa: E501

        :return: The date_from of this GenerateShelfsStatisticsRequest.
        :rtype: date
        """
        return self._date_from

    @date_from.setter
    def date_from(self, date_from: date):
        """Sets the date_from of this GenerateShelfsStatisticsRequest.

        Начало периода, включительно.  # noqa: E501

        :param date_from: The date_from of this GenerateShelfsStatisticsRequest.
        :type date_from: date
        """
        if date_from is None:
            raise ValueError("Invalid value for `date_from`, must not be `None`")  # noqa: E501

        self._date_from = date_from

    @property
    def date_to(self) -> date:
        """Gets the date_to of this GenerateShelfsStatisticsRequest.

        Конец периода, включительно.  # noqa: E501

        :return: The date_to of this GenerateShelfsStatisticsRequest.
        :rtype: date
        """
        return self._date_to

    @date_to.setter
    def date_to(self, date_to: date):
        """Sets the date_to of this GenerateShelfsStatisticsRequest.

        Конец периода, включительно.  # noqa: E501

        :param date_to: The date_to of this GenerateShelfsStatisticsRequest.
        :type date_to: date
        """
        if date_to is None:
            raise ValueError("Invalid value for `date_to`, must not be `None`")  # noqa: E501

        self._date_to = date_to

    @property
    def attribution_type(self) -> ShelfsStatisticsAttributionType:
        """Gets the attribution_type of this GenerateShelfsStatisticsRequest.


        :return: The attribution_type of this GenerateShelfsStatisticsRequest.
        :rtype: ShelfsStatisticsAttributionType
        """
        return self._attribution_type

    @attribution_type.setter
    def attribution_type(self, attribution_type: ShelfsStatisticsAttributionType):
        """Sets the attribution_type of this GenerateShelfsStatisticsRequest.


        :param attribution_type: The attribution_type of this GenerateShelfsStatisticsRequest.
        :type attribution_type: ShelfsStatisticsAttributionType
        """
        if attribution_type is None:
            raise ValueError("Invalid value for `attribution_type`, must not be `None`")  # noqa: E501

        self._attribution_type = attribution_type
