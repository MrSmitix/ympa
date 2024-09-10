# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.orders_stats_payment_order_dto import OrdersStatsPaymentOrderDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.orders_stats_payment_source_type import OrdersStatsPaymentSourceType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.orders_stats_payment_type import OrdersStatsPaymentType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OrdersStatsPaymentDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, _date: date=None, type: OrdersStatsPaymentType=None, source: OrdersStatsPaymentSourceType=None, total: float=None, payment_order: OrdersStatsPaymentOrderDTO=None):  # noqa: E501
        """OrdersStatsPaymentDTO - a model defined in Swagger

        :param id: The id of this OrdersStatsPaymentDTO.  # noqa: E501
        :type id: str
        :param _date: The _date of this OrdersStatsPaymentDTO.  # noqa: E501
        :type _date: date
        :param type: The type of this OrdersStatsPaymentDTO.  # noqa: E501
        :type type: OrdersStatsPaymentType
        :param source: The source of this OrdersStatsPaymentDTO.  # noqa: E501
        :type source: OrdersStatsPaymentSourceType
        :param total: The total of this OrdersStatsPaymentDTO.  # noqa: E501
        :type total: float
        :param payment_order: The payment_order of this OrdersStatsPaymentDTO.  # noqa: E501
        :type payment_order: OrdersStatsPaymentOrderDTO
        """
        self.swagger_types = {
            'id': str,
            '_date': date,
            'type': OrdersStatsPaymentType,
            'source': OrdersStatsPaymentSourceType,
            'total': float,
            'payment_order': OrdersStatsPaymentOrderDTO
        }

        self.attribute_map = {
            'id': 'id',
            '_date': 'date',
            'type': 'type',
            'source': 'source',
            'total': 'total',
            'payment_order': 'paymentOrder'
        }

        self._id = id
        self.__date = _date
        self._type = type
        self._source = source
        self._total = total
        self._payment_order = payment_order

    @classmethod
    def from_dict(cls, dikt) -> 'OrdersStatsPaymentDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrdersStatsPaymentDTO of this OrdersStatsPaymentDTO.  # noqa: E501
        :rtype: OrdersStatsPaymentDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this OrdersStatsPaymentDTO.

        Идентификатор денежного перевода.  # noqa: E501

        :return: The id of this OrdersStatsPaymentDTO.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this OrdersStatsPaymentDTO.

        Идентификатор денежного перевода.  # noqa: E501

        :param id: The id of this OrdersStatsPaymentDTO.
        :type id: str
        """

        self._id = id

    @property
    def _date(self) -> date:
        """Gets the _date of this OrdersStatsPaymentDTO.

        Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :return: The _date of this OrdersStatsPaymentDTO.
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date: date):
        """Sets the _date of this OrdersStatsPaymentDTO.

        Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :param _date: The _date of this OrdersStatsPaymentDTO.
        :type _date: date
        """

        self.__date = _date

    @property
    def type(self) -> OrdersStatsPaymentType:
        """Gets the type of this OrdersStatsPaymentDTO.


        :return: The type of this OrdersStatsPaymentDTO.
        :rtype: OrdersStatsPaymentType
        """
        return self._type

    @type.setter
    def type(self, type: OrdersStatsPaymentType):
        """Sets the type of this OrdersStatsPaymentDTO.


        :param type: The type of this OrdersStatsPaymentDTO.
        :type type: OrdersStatsPaymentType
        """

        self._type = type

    @property
    def source(self) -> OrdersStatsPaymentSourceType:
        """Gets the source of this OrdersStatsPaymentDTO.


        :return: The source of this OrdersStatsPaymentDTO.
        :rtype: OrdersStatsPaymentSourceType
        """
        return self._source

    @source.setter
    def source(self, source: OrdersStatsPaymentSourceType):
        """Sets the source of this OrdersStatsPaymentDTO.


        :param source: The source of this OrdersStatsPaymentDTO.
        :type source: OrdersStatsPaymentSourceType
        """

        self._source = source

    @property
    def total(self) -> float:
        """Gets the total of this OrdersStatsPaymentDTO.

        Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.   # noqa: E501

        :return: The total of this OrdersStatsPaymentDTO.
        :rtype: float
        """
        return self._total

    @total.setter
    def total(self, total: float):
        """Sets the total of this OrdersStatsPaymentDTO.

        Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.   # noqa: E501

        :param total: The total of this OrdersStatsPaymentDTO.
        :type total: float
        """

        self._total = total

    @property
    def payment_order(self) -> OrdersStatsPaymentOrderDTO:
        """Gets the payment_order of this OrdersStatsPaymentDTO.


        :return: The payment_order of this OrdersStatsPaymentDTO.
        :rtype: OrdersStatsPaymentOrderDTO
        """
        return self._payment_order

    @payment_order.setter
    def payment_order(self, payment_order: OrdersStatsPaymentOrderDTO):
        """Sets the payment_order of this OrdersStatsPaymentDTO.


        :param payment_order: The payment_order of this OrdersStatsPaymentDTO.
        :type payment_order: OrdersStatsPaymentOrderDTO
        """

        self._payment_order = payment_order
