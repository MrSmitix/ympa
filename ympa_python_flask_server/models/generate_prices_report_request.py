from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class GeneratePricesReportRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, business_id=None, campaign_id=None, category_ids=None, creation_date_from=None, creation_date_to=None):  # noqa: E501
        """GeneratePricesReportRequest - a model defined in OpenAPI

        :param business_id: The business_id of this GeneratePricesReportRequest.  # noqa: E501
        :type business_id: int
        :param campaign_id: The campaign_id of this GeneratePricesReportRequest.  # noqa: E501
        :type campaign_id: int
        :param category_ids: The category_ids of this GeneratePricesReportRequest.  # noqa: E501
        :type category_ids: List[int]
        :param creation_date_from: The creation_date_from of this GeneratePricesReportRequest.  # noqa: E501
        :type creation_date_from: date
        :param creation_date_to: The creation_date_to of this GeneratePricesReportRequest.  # noqa: E501
        :type creation_date_to: date
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
    def from_dict(cls, dikt) -> 'GeneratePricesReportRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GeneratePricesReportRequest of this GeneratePricesReportRequest.  # noqa: E501
        :rtype: GeneratePricesReportRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def business_id(self) -> int:
        """Gets the business_id of this GeneratePricesReportRequest.

        Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.   # noqa: E501

        :return: The business_id of this GeneratePricesReportRequest.
        :rtype: int
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id: int):
        """Sets the business_id of this GeneratePricesReportRequest.

        Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.   # noqa: E501

        :param business_id: The business_id of this GeneratePricesReportRequest.
        :type business_id: int
        """

        self._business_id = business_id

    @property
    def campaign_id(self) -> int:
        """Gets the campaign_id of this GeneratePricesReportRequest.

        Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.   # noqa: E501

        :return: The campaign_id of this GeneratePricesReportRequest.
        :rtype: int
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id: int):
        """Sets the campaign_id of this GeneratePricesReportRequest.

        Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.   # noqa: E501

        :param campaign_id: The campaign_id of this GeneratePricesReportRequest.
        :type campaign_id: int
        """

        self._campaign_id = campaign_id

    @property
    def category_ids(self) -> List[int]:
        """Gets the category_ids of this GeneratePricesReportRequest.

        Фильтр по категориям на Маркете.  # noqa: E501

        :return: The category_ids of this GeneratePricesReportRequest.
        :rtype: List[int]
        """
        return self._category_ids

    @category_ids.setter
    def category_ids(self, category_ids: List[int]):
        """Sets the category_ids of this GeneratePricesReportRequest.

        Фильтр по категориям на Маркете.  # noqa: E501

        :param category_ids: The category_ids of this GeneratePricesReportRequest.
        :type category_ids: List[int]
        """

        self._category_ids = category_ids

    @property
    def creation_date_from(self) -> date:
        """Gets the creation_date_from of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.   # noqa: E501

        :return: The creation_date_from of this GeneratePricesReportRequest.
        :rtype: date
        """
        return self._creation_date_from

    @creation_date_from.setter
    def creation_date_from(self, creation_date_from: date):
        """Sets the creation_date_from of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.   # noqa: E501

        :param creation_date_from: The creation_date_from of this GeneratePricesReportRequest.
        :type creation_date_from: date
        """

        self._creation_date_from = creation_date_from

    @property
    def creation_date_to(self) -> date:
        """Gets the creation_date_to of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.   # noqa: E501

        :return: The creation_date_to of this GeneratePricesReportRequest.
        :rtype: date
        """
        return self._creation_date_to

    @creation_date_to.setter
    def creation_date_to(self, creation_date_to: date):
        """Sets the creation_date_to of this GeneratePricesReportRequest.

        Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.   # noqa: E501

        :param creation_date_to: The creation_date_to of this GeneratePricesReportRequest.
        :type creation_date_to: date
        """

        self._creation_date_to = creation_date_to
