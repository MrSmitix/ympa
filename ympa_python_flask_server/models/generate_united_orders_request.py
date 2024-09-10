from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class GenerateUnitedOrdersRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, business_id=None, date_from=None, date_to=None, campaign_ids=None, promo_id=None):  # noqa: E501
        """GenerateUnitedOrdersRequest - a model defined in OpenAPI

        :param business_id: The business_id of this GenerateUnitedOrdersRequest.  # noqa: E501
        :type business_id: int
        :param date_from: The date_from of this GenerateUnitedOrdersRequest.  # noqa: E501
        :type date_from: date
        :param date_to: The date_to of this GenerateUnitedOrdersRequest.  # noqa: E501
        :type date_to: date
        :param campaign_ids: The campaign_ids of this GenerateUnitedOrdersRequest.  # noqa: E501
        :type campaign_ids: List[int]
        :param promo_id: The promo_id of this GenerateUnitedOrdersRequest.  # noqa: E501
        :type promo_id: str
        """
        self.openapi_types = {
            'business_id': int,
            'date_from': date,
            'date_to': date,
            'campaign_ids': List[int],
            'promo_id': str
        }

        self.attribute_map = {
            'business_id': 'businessId',
            'date_from': 'dateFrom',
            'date_to': 'dateTo',
            'campaign_ids': 'campaignIds',
            'promo_id': 'promoId'
        }

        self._business_id = business_id
        self._date_from = date_from
        self._date_to = date_to
        self._campaign_ids = campaign_ids
        self._promo_id = promo_id

    @classmethod
    def from_dict(cls, dikt) -> 'GenerateUnitedOrdersRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GenerateUnitedOrdersRequest of this GenerateUnitedOrdersRequest.  # noqa: E501
        :rtype: GenerateUnitedOrdersRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def business_id(self) -> int:
        """Gets the business_id of this GenerateUnitedOrdersRequest.

        Идентификатор бизнеса.  # noqa: E501

        :return: The business_id of this GenerateUnitedOrdersRequest.
        :rtype: int
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id: int):
        """Sets the business_id of this GenerateUnitedOrdersRequest.

        Идентификатор бизнеса.  # noqa: E501

        :param business_id: The business_id of this GenerateUnitedOrdersRequest.
        :type business_id: int
        """
        if business_id is None:
            raise ValueError("Invalid value for `business_id`, must not be `None`")  # noqa: E501

        self._business_id = business_id

    @property
    def date_from(self) -> date:
        """Gets the date_from of this GenerateUnitedOrdersRequest.

        Начало периода, включительно.  # noqa: E501

        :return: The date_from of this GenerateUnitedOrdersRequest.
        :rtype: date
        """
        return self._date_from

    @date_from.setter
    def date_from(self, date_from: date):
        """Sets the date_from of this GenerateUnitedOrdersRequest.

        Начало периода, включительно.  # noqa: E501

        :param date_from: The date_from of this GenerateUnitedOrdersRequest.
        :type date_from: date
        """
        if date_from is None:
            raise ValueError("Invalid value for `date_from`, must not be `None`")  # noqa: E501

        self._date_from = date_from

    @property
    def date_to(self) -> date:
        """Gets the date_to of this GenerateUnitedOrdersRequest.

        Конец периода, включительно. Максимальный период — 1 год.  # noqa: E501

        :return: The date_to of this GenerateUnitedOrdersRequest.
        :rtype: date
        """
        return self._date_to

    @date_to.setter
    def date_to(self, date_to: date):
        """Sets the date_to of this GenerateUnitedOrdersRequest.

        Конец периода, включительно. Максимальный период — 1 год.  # noqa: E501

        :param date_to: The date_to of this GenerateUnitedOrdersRequest.
        :type date_to: date
        """
        if date_to is None:
            raise ValueError("Invalid value for `date_to`, must not be `None`")  # noqa: E501

        self._date_to = date_to

    @property
    def campaign_ids(self) -> List[int]:
        """Gets the campaign_ids of this GenerateUnitedOrdersRequest.

        Список магазинов, которые нужны в отчете.  # noqa: E501

        :return: The campaign_ids of this GenerateUnitedOrdersRequest.
        :rtype: List[int]
        """
        return self._campaign_ids

    @campaign_ids.setter
    def campaign_ids(self, campaign_ids: List[int]):
        """Sets the campaign_ids of this GenerateUnitedOrdersRequest.

        Список магазинов, которые нужны в отчете.  # noqa: E501

        :param campaign_ids: The campaign_ids of this GenerateUnitedOrdersRequest.
        :type campaign_ids: List[int]
        """

        self._campaign_ids = campaign_ids

    @property
    def promo_id(self) -> str:
        """Gets the promo_id of this GenerateUnitedOrdersRequest.

        Идентификатор акции, товары из которой нужны в отчете.  # noqa: E501

        :return: The promo_id of this GenerateUnitedOrdersRequest.
        :rtype: str
        """
        return self._promo_id

    @promo_id.setter
    def promo_id(self, promo_id: str):
        """Sets the promo_id of this GenerateUnitedOrdersRequest.

        Идентификатор акции, товары из которой нужны в отчете.  # noqa: E501

        :param promo_id: The promo_id of this GenerateUnitedOrdersRequest.
        :type promo_id: str
        """

        self._promo_id = promo_id