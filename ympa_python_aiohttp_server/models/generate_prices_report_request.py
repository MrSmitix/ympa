# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class GeneratePricesReportRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, business_id: int=None, campaign_id: int=None, category_ids: List[int]=None, creation_date_from: date=None, creation_date_to: date=None):
        """GeneratePricesReportRequest - a model defined in OpenAPI

        :param business_id: The business_id of this GeneratePricesReportRequest.
        :param campaign_id: The campaign_id of this GeneratePricesReportRequest.
        :param category_ids: The category_ids of this GeneratePricesReportRequest.
        :param creation_date_from: The creation_date_from of this GeneratePricesReportRequest.
        :param creation_date_to: The creation_date_to of this GeneratePricesReportRequest.
        """
        self.openapi_types = {
            'business_id': int,
            'campaign_id': int,
            'category_ids': List[int],
            'creation_date_from': date,
            'creation_date_to': date
        }

        self.attribute_map = {
            'business_id': 'businessId',
            'campaign_id': 'campaignId',
            'category_ids': 'categoryIds',
            'creation_date_from': 'creationDateFrom',
            'creation_date_to': 'creationDateTo'
        }

        self._business_id = business_id
        self._campaign_id = campaign_id
        self._category_ids = category_ids
        self._creation_date_from = creation_date_from
        self._creation_date_to = creation_date_to

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GeneratePricesReportRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GeneratePricesReportRequest of this GeneratePricesReportRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def business_id(self):
        """Gets the business_id of this GeneratePricesReportRequest.

        Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 

        :return: The business_id of this GeneratePricesReportRequest.
        :rtype: int
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id):
        """Sets the business_id of this GeneratePricesReportRequest.

        Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 

        :param business_id: The business_id of this GeneratePricesReportRequest.
        :type business_id: int
        """

        self._business_id = business_id

    @property
    def campaign_id(self):
        """Gets the campaign_id of this GeneratePricesReportRequest.

        Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 

        :return: The campaign_id of this GeneratePricesReportRequest.
        :rtype: int
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id):
        """Sets the campaign_id of this GeneratePricesReportRequest.

        Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 

        :param campaign_id: The campaign_id of this GeneratePricesReportRequest.
        :type campaign_id: int
        """

        self._campaign_id = campaign_id

    @property
    def category_ids(self):
        """Gets the category_ids of this GeneratePricesReportRequest.

        Фильтр по категориям на Маркете.

        :return: The category_ids of this GeneratePricesReportRequest.
        :rtype: List[int]
        """
        return self._category_ids

    @category_ids.setter
    def category_ids(self, category_ids):
        """Sets the category_ids of this GeneratePricesReportRequest.

        Фильтр по категориям на Маркете.

        :param category_ids: The category_ids of this GeneratePricesReportRequest.
        :type category_ids: List[int]
        """

        self._category_ids = category_ids

    @property
    def creation_date_from(self):
        """Gets the creation_date_from of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 

        :return: The creation_date_from of this GeneratePricesReportRequest.
        :rtype: date
        """
        return self._creation_date_from

    @creation_date_from.setter
    def creation_date_from(self, creation_date_from):
        """Sets the creation_date_from of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 

        :param creation_date_from: The creation_date_from of this GeneratePricesReportRequest.
        :type creation_date_from: date
        """

        self._creation_date_from = creation_date_from

    @property
    def creation_date_to(self):
        """Gets the creation_date_to of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 

        :return: The creation_date_to of this GeneratePricesReportRequest.
        :rtype: date
        """
        return self._creation_date_to

    @creation_date_to.setter
    def creation_date_to(self, creation_date_to):
        """Sets the creation_date_to of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 

        :param creation_date_to: The creation_date_to of this GeneratePricesReportRequest.
        :type creation_date_to: date
        """

        self._creation_date_to = creation_date_to
