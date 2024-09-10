from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.orders_stats_item_status_type import OrdersStatsItemStatusType
from ympa_python_flask_server.models.orders_stats_stock_type import OrdersStatsStockType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.orders_stats_item_status_type import OrdersStatsItemStatusType  # noqa: E501
from ympa_python_flask_server.models.orders_stats_stock_type import OrdersStatsStockType  # noqa: E501

class OrdersStatsDetailsDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, item_status=None, item_count=None, update_date=None, stock_type=None):  # noqa: E501
        """OrdersStatsDetailsDTO - a model defined in OpenAPI

        :param item_status: The item_status of this OrdersStatsDetailsDTO.  # noqa: E501
        :type item_status: OrdersStatsItemStatusType
        :param item_count: The item_count of this OrdersStatsDetailsDTO.  # noqa: E501
        :type item_count: int
        :param update_date: The update_date of this OrdersStatsDetailsDTO.  # noqa: E501
        :type update_date: date
        :param stock_type: The stock_type of this OrdersStatsDetailsDTO.  # noqa: E501
        :type stock_type: OrdersStatsStockType
        """
        self.openapi_types = {
            'item_status': OrdersStatsItemStatusType,
            'item_count': int,
            'update_date': date,
            'stock_type': OrdersStatsStockType
        }

        self.attribute_map = {
            'item_status': 'itemStatus',
            'item_count': 'itemCount',
            'update_date': 'updateDate',
            'stock_type': 'stockType'
        }

        self._item_status = item_status
        self._item_count = item_count
        self._update_date = update_date
        self._stock_type = stock_type

    @classmethod
    def from_dict(cls, dikt) -> 'OrdersStatsDetailsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrdersStatsDetailsDTO of this OrdersStatsDetailsDTO.  # noqa: E501
        :rtype: OrdersStatsDetailsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def item_status(self) -> OrdersStatsItemStatusType:
        """Gets the item_status of this OrdersStatsDetailsDTO.


        :return: The item_status of this OrdersStatsDetailsDTO.
        :rtype: OrdersStatsItemStatusType
        """
        return self._item_status

    @item_status.setter
    def item_status(self, item_status: OrdersStatsItemStatusType):
        """Sets the item_status of this OrdersStatsDetailsDTO.


        :param item_status: The item_status of this OrdersStatsDetailsDTO.
        :type item_status: OrdersStatsItemStatusType
        """

        self._item_status = item_status

    @property
    def item_count(self) -> int:
        """Gets the item_count of this OrdersStatsDetailsDTO.

        Количество товара со статусом, указанном в параметре `itemStatus`.  # noqa: E501

        :return: The item_count of this OrdersStatsDetailsDTO.
        :rtype: int
        """
        return self._item_count

    @item_count.setter
    def item_count(self, item_count: int):
        """Sets the item_count of this OrdersStatsDetailsDTO.

        Количество товара со статусом, указанном в параметре `itemStatus`.  # noqa: E501

        :param item_count: The item_count of this OrdersStatsDetailsDTO.
        :type item_count: int
        """

        self._item_count = item_count

    @property
    def update_date(self) -> date:
        """Gets the update_date of this OrdersStatsDetailsDTO.

        Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :return: The update_date of this OrdersStatsDetailsDTO.
        :rtype: date
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date: date):
        """Sets the update_date of this OrdersStatsDetailsDTO.

        Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :param update_date: The update_date of this OrdersStatsDetailsDTO.
        :type update_date: date
        """

        self._update_date = update_date

    @property
    def stock_type(self) -> OrdersStatsStockType:
        """Gets the stock_type of this OrdersStatsDetailsDTO.


        :return: The stock_type of this OrdersStatsDetailsDTO.
        :rtype: OrdersStatsStockType
        """
        return self._stock_type

    @stock_type.setter
    def stock_type(self, stock_type: OrdersStatsStockType):
        """Sets the stock_type of this OrdersStatsDetailsDTO.


        :param stock_type: The stock_type of this OrdersStatsDetailsDTO.
        :type stock_type: OrdersStatsStockType
        """

        self._stock_type = stock_type
