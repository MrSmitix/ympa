from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_stats_status_type import OrderStatsStatusType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_stats_status_type import OrderStatsStatusType  # noqa: E501

class GetOrdersStatsRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, date_from=None, date_to=None, update_from=None, update_to=None, orders=None, statuses=None, has_cis=None):  # noqa: E501
        """GetOrdersStatsRequest - a model defined in OpenAPI

        :param date_from: The date_from of this GetOrdersStatsRequest.  # noqa: E501
        :type date_from: date
        :param date_to: The date_to of this GetOrdersStatsRequest.  # noqa: E501
        :type date_to: date
        :param update_from: The update_from of this GetOrdersStatsRequest.  # noqa: E501
        :type update_from: date
        :param update_to: The update_to of this GetOrdersStatsRequest.  # noqa: E501
        :type update_to: date
        :param orders: The orders of this GetOrdersStatsRequest.  # noqa: E501
        :type orders: List[int]
        :param statuses: The statuses of this GetOrdersStatsRequest.  # noqa: E501
        :type statuses: List[OrderStatsStatusType]
        :param has_cis: The has_cis of this GetOrdersStatsRequest.  # noqa: E501
        :type has_cis: bool
        """
        self.openapi_types = {
            'date_from': date,
            'date_to': date,
            'update_from': date,
            'update_to': date,
            'orders': List[int],
            'statuses': List[OrderStatsStatusType],
            'has_cis': bool
        }

        self.attribute_map = {
            'date_from': 'dateFrom',
            'date_to': 'dateTo',
            'update_from': 'updateFrom',
            'update_to': 'updateTo',
            'orders': 'orders',
            'statuses': 'statuses',
            'has_cis': 'hasCis'
        }

        self._date_from = date_from
        self._date_to = date_to
        self._update_from = update_from
        self._update_to = update_to
        self._orders = orders
        self._statuses = statuses
        self._has_cis = has_cis

    @classmethod
    def from_dict(cls, dikt) -> 'GetOrdersStatsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetOrdersStatsRequest of this GetOrdersStatsRequest.  # noqa: E501
        :rtype: GetOrdersStatsRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def date_from(self) -> date:
        """Gets the date_from of this GetOrdersStatsRequest.

        Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.   # noqa: E501

        :return: The date_from of this GetOrdersStatsRequest.
        :rtype: date
        """
        return self._date_from

    @date_from.setter
    def date_from(self, date_from: date):
        """Sets the date_from of this GetOrdersStatsRequest.

        Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.   # noqa: E501

        :param date_from: The date_from of this GetOrdersStatsRequest.
        :type date_from: date
        """

        self._date_from = date_from

    @property
    def date_to(self) -> date:
        """Gets the date_to of this GetOrdersStatsRequest.

        Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.   # noqa: E501

        :return: The date_to of this GetOrdersStatsRequest.
        :rtype: date
        """
        return self._date_to

    @date_to.setter
    def date_to(self, date_to: date):
        """Sets the date_to of this GetOrdersStatsRequest.

        Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.   # noqa: E501

        :param date_to: The date_to of this GetOrdersStatsRequest.
        :type date_to: date
        """

        self._date_to = date_to

    @property
    def update_from(self) -> date:
        """Gets the update_from of this GetOrdersStatsRequest.

        Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.   # noqa: E501

        :return: The update_from of this GetOrdersStatsRequest.
        :rtype: date
        """
        return self._update_from

    @update_from.setter
    def update_from(self, update_from: date):
        """Sets the update_from of this GetOrdersStatsRequest.

        Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.   # noqa: E501

        :param update_from: The update_from of this GetOrdersStatsRequest.
        :type update_from: date
        """

        self._update_from = update_from

    @property
    def update_to(self) -> date:
        """Gets the update_to of this GetOrdersStatsRequest.

        Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.   # noqa: E501

        :return: The update_to of this GetOrdersStatsRequest.
        :rtype: date
        """
        return self._update_to

    @update_to.setter
    def update_to(self, update_to: date):
        """Sets the update_to of this GetOrdersStatsRequest.

        Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.   # noqa: E501

        :param update_to: The update_to of this GetOrdersStatsRequest.
        :type update_to: date
        """

        self._update_to = update_to

    @property
    def orders(self) -> List[int]:
        """Gets the orders of this GetOrdersStatsRequest.

        Список идентификаторов заказов.  # noqa: E501

        :return: The orders of this GetOrdersStatsRequest.
        :rtype: List[int]
        """
        return self._orders

    @orders.setter
    def orders(self, orders: List[int]):
        """Sets the orders of this GetOrdersStatsRequest.

        Список идентификаторов заказов.  # noqa: E501

        :param orders: The orders of this GetOrdersStatsRequest.
        :type orders: List[int]
        """

        self._orders = orders

    @property
    def statuses(self) -> List[OrderStatsStatusType]:
        """Gets the statuses of this GetOrdersStatsRequest.

        Список статусов заказов.  # noqa: E501

        :return: The statuses of this GetOrdersStatsRequest.
        :rtype: List[OrderStatsStatusType]
        """
        return self._statuses

    @statuses.setter
    def statuses(self, statuses: List[OrderStatsStatusType]):
        """Sets the statuses of this GetOrdersStatsRequest.

        Список статусов заказов.  # noqa: E501

        :param statuses: The statuses of this GetOrdersStatsRequest.
        :type statuses: List[OrderStatsStatusType]
        """

        self._statuses = statuses

    @property
    def has_cis(self) -> bool:
        """Gets the has_cis of this GetOrdersStatsRequest.

        Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.   # noqa: E501

        :return: The has_cis of this GetOrdersStatsRequest.
        :rtype: bool
        """
        return self._has_cis

    @has_cis.setter
    def has_cis(self, has_cis: bool):
        """Sets the has_cis of this GetOrdersStatsRequest.

        Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.   # noqa: E501

        :param has_cis: The has_cis of this GetOrdersStatsRequest.
        :type has_cis: bool
        """

        self._has_cis = has_cis
