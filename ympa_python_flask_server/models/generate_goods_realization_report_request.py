from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class GenerateGoodsRealizationReportRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, campaign_id=None, year=None, month=None):  # noqa: E501
        """GenerateGoodsRealizationReportRequest - a model defined in OpenAPI

        :param campaign_id: The campaign_id of this GenerateGoodsRealizationReportRequest.  # noqa: E501
        :type campaign_id: int
        :param year: The year of this GenerateGoodsRealizationReportRequest.  # noqa: E501
        :type year: int
        :param month: The month of this GenerateGoodsRealizationReportRequest.  # noqa: E501
        :type month: int
        """
        self.openapi_types = {
            'campaign_id': int,
            'year': int,
            'month': int
        }

        self.attribute_map = {
            'campaign_id': 'campaignId',
            'year': 'year',
            'month': 'month'
        }

        self._campaign_id = campaign_id
        self._year = year
        self._month = month

    @classmethod
    def from_dict(cls, dikt) -> 'GenerateGoodsRealizationReportRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GenerateGoodsRealizationReportRequest of this GenerateGoodsRealizationReportRequest.  # noqa: E501
        :rtype: GenerateGoodsRealizationReportRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def campaign_id(self) -> int:
        """Gets the campaign_id of this GenerateGoodsRealizationReportRequest.

        Идентификатор кампании.  # noqa: E501

        :return: The campaign_id of this GenerateGoodsRealizationReportRequest.
        :rtype: int
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id: int):
        """Sets the campaign_id of this GenerateGoodsRealizationReportRequest.

        Идентификатор кампании.  # noqa: E501

        :param campaign_id: The campaign_id of this GenerateGoodsRealizationReportRequest.
        :type campaign_id: int
        """
        if campaign_id is None:
            raise ValueError("Invalid value for `campaign_id`, must not be `None`")  # noqa: E501

        self._campaign_id = campaign_id

    @property
    def year(self) -> int:
        """Gets the year of this GenerateGoodsRealizationReportRequest.

        Год.  # noqa: E501

        :return: The year of this GenerateGoodsRealizationReportRequest.
        :rtype: int
        """
        return self._year

    @year.setter
    def year(self, year: int):
        """Sets the year of this GenerateGoodsRealizationReportRequest.

        Год.  # noqa: E501

        :param year: The year of this GenerateGoodsRealizationReportRequest.
        :type year: int
        """
        if year is None:
            raise ValueError("Invalid value for `year`, must not be `None`")  # noqa: E501

        self._year = year

    @property
    def month(self) -> int:
        """Gets the month of this GenerateGoodsRealizationReportRequest.

        Номер месяца.  # noqa: E501

        :return: The month of this GenerateGoodsRealizationReportRequest.
        :rtype: int
        """
        return self._month

    @month.setter
    def month(self, month: int):
        """Sets the month of this GenerateGoodsRealizationReportRequest.

        Номер месяца.  # noqa: E501

        :param month: The month of this GenerateGoodsRealizationReportRequest.
        :type month: int
        """
        if month is None:
            raise ValueError("Invalid value for `month`, must not be `None`")  # noqa: E501
        if month is not None and month > 12:  # noqa: E501
            raise ValueError("Invalid value for `month`, must be a value less than or equal to `12`")  # noqa: E501
        if month is not None and month < 1:  # noqa: E501
            raise ValueError("Invalid value for `month`, must be a value greater than or equal to `1`")  # noqa: E501

        self._month = month
