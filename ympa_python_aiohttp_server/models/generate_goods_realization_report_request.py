# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class GenerateGoodsRealizationReportRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, campaign_id: int=None, year: int=None, month: int=None):
        """GenerateGoodsRealizationReportRequest - a model defined in OpenAPI

        :param campaign_id: The campaign_id of this GenerateGoodsRealizationReportRequest.
        :param year: The year of this GenerateGoodsRealizationReportRequest.
        :param month: The month of this GenerateGoodsRealizationReportRequest.
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
    def from_dict(cls, dikt: dict) -> 'GenerateGoodsRealizationReportRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GenerateGoodsRealizationReportRequest of this GenerateGoodsRealizationReportRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def campaign_id(self):
        """Gets the campaign_id of this GenerateGoodsRealizationReportRequest.

        Идентификатор кампании.

        :return: The campaign_id of this GenerateGoodsRealizationReportRequest.
        :rtype: int
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id):
        """Sets the campaign_id of this GenerateGoodsRealizationReportRequest.

        Идентификатор кампании.

        :param campaign_id: The campaign_id of this GenerateGoodsRealizationReportRequest.
        :type campaign_id: int
        """
        if campaign_id is None:
            raise ValueError("Invalid value for `campaign_id`, must not be `None`")

        self._campaign_id = campaign_id

    @property
    def year(self):
        """Gets the year of this GenerateGoodsRealizationReportRequest.

        Год.

        :return: The year of this GenerateGoodsRealizationReportRequest.
        :rtype: int
        """
        return self._year

    @year.setter
    def year(self, year):
        """Sets the year of this GenerateGoodsRealizationReportRequest.

        Год.

        :param year: The year of this GenerateGoodsRealizationReportRequest.
        :type year: int
        """
        if year is None:
            raise ValueError("Invalid value for `year`, must not be `None`")

        self._year = year

    @property
    def month(self):
        """Gets the month of this GenerateGoodsRealizationReportRequest.

        Номер месяца.

        :return: The month of this GenerateGoodsRealizationReportRequest.
        :rtype: int
        """
        return self._month

    @month.setter
    def month(self, month):
        """Sets the month of this GenerateGoodsRealizationReportRequest.

        Номер месяца.

        :param month: The month of this GenerateGoodsRealizationReportRequest.
        :type month: int
        """
        if month is None:
            raise ValueError("Invalid value for `month`, must not be `None`")
        if month is not None and month > 12:
            raise ValueError("Invalid value for `month`, must be a value less than or equal to `12`")
        if month is not None and month < 1:
            raise ValueError("Invalid value for `month`, must be a value greater than or equal to `1`")

        self._month = month
