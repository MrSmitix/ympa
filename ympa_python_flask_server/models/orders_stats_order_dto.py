from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_stats_status_type import OrderStatsStatusType
from ympa_python_flask_server.models.orders_stats_commission_dto import OrdersStatsCommissionDTO
from ympa_python_flask_server.models.orders_stats_delivery_region_dto import OrdersStatsDeliveryRegionDTO
from ympa_python_flask_server.models.orders_stats_item_dto import OrdersStatsItemDTO
from ympa_python_flask_server.models.orders_stats_order_payment_type import OrdersStatsOrderPaymentType
from ympa_python_flask_server.models.orders_stats_payment_dto import OrdersStatsPaymentDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_stats_status_type import OrderStatsStatusType  # noqa: E501
from ympa_python_flask_server.models.orders_stats_commission_dto import OrdersStatsCommissionDTO  # noqa: E501
from ympa_python_flask_server.models.orders_stats_delivery_region_dto import OrdersStatsDeliveryRegionDTO  # noqa: E501
from ympa_python_flask_server.models.orders_stats_item_dto import OrdersStatsItemDTO  # noqa: E501
from ympa_python_flask_server.models.orders_stats_order_payment_type import OrdersStatsOrderPaymentType  # noqa: E501
from ympa_python_flask_server.models.orders_stats_payment_dto import OrdersStatsPaymentDTO  # noqa: E501

class OrdersStatsOrderDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, creation_date=None, status_update_date=None, status=None, partner_order_id=None, payment_type=None, fake=None, delivery_region=None, items=None, initial_items=None, payments=None, commissions=None):  # noqa: E501
        """OrdersStatsOrderDTO - a model defined in OpenAPI

        :param id: The id of this OrdersStatsOrderDTO.  # noqa: E501
        :type id: int
        :param creation_date: The creation_date of this OrdersStatsOrderDTO.  # noqa: E501
        :type creation_date: date
        :param status_update_date: The status_update_date of this OrdersStatsOrderDTO.  # noqa: E501
        :type status_update_date: datetime
        :param status: The status of this OrdersStatsOrderDTO.  # noqa: E501
        :type status: OrderStatsStatusType
        :param partner_order_id: The partner_order_id of this OrdersStatsOrderDTO.  # noqa: E501
        :type partner_order_id: str
        :param payment_type: The payment_type of this OrdersStatsOrderDTO.  # noqa: E501
        :type payment_type: OrdersStatsOrderPaymentType
        :param fake: The fake of this OrdersStatsOrderDTO.  # noqa: E501
        :type fake: bool
        :param delivery_region: The delivery_region of this OrdersStatsOrderDTO.  # noqa: E501
        :type delivery_region: OrdersStatsDeliveryRegionDTO
        :param items: The items of this OrdersStatsOrderDTO.  # noqa: E501
        :type items: List[OrdersStatsItemDTO]
        :param initial_items: The initial_items of this OrdersStatsOrderDTO.  # noqa: E501
        :type initial_items: List[OrdersStatsItemDTO]
        :param payments: The payments of this OrdersStatsOrderDTO.  # noqa: E501
        :type payments: List[OrdersStatsPaymentDTO]
        :param commissions: The commissions of this OrdersStatsOrderDTO.  # noqa: E501
        :type commissions: List[OrdersStatsCommissionDTO]
        """
        self.openapi_types = {
            'id': int,
            'creation_date': date,
            'status_update_date': datetime,
            'status': OrderStatsStatusType,
            'partner_order_id': str,
            'payment_type': OrdersStatsOrderPaymentType,
            'fake': bool,
            'delivery_region': OrdersStatsDeliveryRegionDTO,
            'items': List[OrdersStatsItemDTO],
            'initial_items': List[OrdersStatsItemDTO],
            'payments': List[OrdersStatsPaymentDTO],
            'commissions': List[OrdersStatsCommissionDTO]
        }

        self.attribute_map = {
            'id': 'id',
            'creation_date': 'creationDate',
            'status_update_date': 'statusUpdateDate',
            'status': 'status',
            'partner_order_id': 'partnerOrderId',
            'payment_type': 'paymentType',
            'fake': 'fake',
            'delivery_region': 'deliveryRegion',
            'items': 'items',
            'initial_items': 'initialItems',
            'payments': 'payments',
            'commissions': 'commissions'
        }

        self._id = id
        self._creation_date = creation_date
        self._status_update_date = status_update_date
        self._status = status
        self._partner_order_id = partner_order_id
        self._payment_type = payment_type
        self._fake = fake
        self._delivery_region = delivery_region
        self._items = items
        self._initial_items = initial_items
        self._payments = payments
        self._commissions = commissions

    @classmethod
    def from_dict(cls, dikt) -> 'OrdersStatsOrderDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrdersStatsOrderDTO of this OrdersStatsOrderDTO.  # noqa: E501
        :rtype: OrdersStatsOrderDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this OrdersStatsOrderDTO.

        Идентификатор заказа.  # noqa: E501

        :return: The id of this OrdersStatsOrderDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this OrdersStatsOrderDTO.

        Идентификатор заказа.  # noqa: E501

        :param id: The id of this OrdersStatsOrderDTO.
        :type id: int
        """

        self._id = id

    @property
    def creation_date(self) -> date:
        """Gets the creation_date of this OrdersStatsOrderDTO.

        Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :return: The creation_date of this OrdersStatsOrderDTO.
        :rtype: date
        """
        return self._creation_date

    @creation_date.setter
    def creation_date(self, creation_date: date):
        """Sets the creation_date of this OrdersStatsOrderDTO.

        Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :param creation_date: The creation_date of this OrdersStatsOrderDTO.
        :type creation_date: date
        """

        self._creation_date = creation_date

    @property
    def status_update_date(self) -> datetime:
        """Gets the status_update_date of this OrdersStatsOrderDTO.

        Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).   # noqa: E501

        :return: The status_update_date of this OrdersStatsOrderDTO.
        :rtype: datetime
        """
        return self._status_update_date

    @status_update_date.setter
    def status_update_date(self, status_update_date: datetime):
        """Sets the status_update_date of this OrdersStatsOrderDTO.

        Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).   # noqa: E501

        :param status_update_date: The status_update_date of this OrdersStatsOrderDTO.
        :type status_update_date: datetime
        """

        self._status_update_date = status_update_date

    @property
    def status(self) -> OrderStatsStatusType:
        """Gets the status of this OrdersStatsOrderDTO.


        :return: The status of this OrdersStatsOrderDTO.
        :rtype: OrderStatsStatusType
        """
        return self._status

    @status.setter
    def status(self, status: OrderStatsStatusType):
        """Sets the status of this OrdersStatsOrderDTO.


        :param status: The status of this OrdersStatsOrderDTO.
        :type status: OrderStatsStatusType
        """

        self._status = status

    @property
    def partner_order_id(self) -> str:
        """Gets the partner_order_id of this OrdersStatsOrderDTO.

        Идентификатор заказа в информационной системе магазина.  # noqa: E501

        :return: The partner_order_id of this OrdersStatsOrderDTO.
        :rtype: str
        """
        return self._partner_order_id

    @partner_order_id.setter
    def partner_order_id(self, partner_order_id: str):
        """Sets the partner_order_id of this OrdersStatsOrderDTO.

        Идентификатор заказа в информационной системе магазина.  # noqa: E501

        :param partner_order_id: The partner_order_id of this OrdersStatsOrderDTO.
        :type partner_order_id: str
        """

        self._partner_order_id = partner_order_id

    @property
    def payment_type(self) -> OrdersStatsOrderPaymentType:
        """Gets the payment_type of this OrdersStatsOrderDTO.


        :return: The payment_type of this OrdersStatsOrderDTO.
        :rtype: OrdersStatsOrderPaymentType
        """
        return self._payment_type

    @payment_type.setter
    def payment_type(self, payment_type: OrdersStatsOrderPaymentType):
        """Sets the payment_type of this OrdersStatsOrderDTO.


        :param payment_type: The payment_type of this OrdersStatsOrderDTO.
        :type payment_type: OrdersStatsOrderPaymentType
        """

        self._payment_type = payment_type

    @property
    def fake(self) -> bool:
        """Gets the fake of this OrdersStatsOrderDTO.

        Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.   # noqa: E501

        :return: The fake of this OrdersStatsOrderDTO.
        :rtype: bool
        """
        return self._fake

    @fake.setter
    def fake(self, fake: bool):
        """Sets the fake of this OrdersStatsOrderDTO.

        Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.   # noqa: E501

        :param fake: The fake of this OrdersStatsOrderDTO.
        :type fake: bool
        """

        self._fake = fake

    @property
    def delivery_region(self) -> OrdersStatsDeliveryRegionDTO:
        """Gets the delivery_region of this OrdersStatsOrderDTO.


        :return: The delivery_region of this OrdersStatsOrderDTO.
        :rtype: OrdersStatsDeliveryRegionDTO
        """
        return self._delivery_region

    @delivery_region.setter
    def delivery_region(self, delivery_region: OrdersStatsDeliveryRegionDTO):
        """Sets the delivery_region of this OrdersStatsOrderDTO.


        :param delivery_region: The delivery_region of this OrdersStatsOrderDTO.
        :type delivery_region: OrdersStatsDeliveryRegionDTO
        """

        self._delivery_region = delivery_region

    @property
    def items(self) -> List[OrdersStatsItemDTO]:
        """Gets the items of this OrdersStatsOrderDTO.

        Список товаров в заказе после возможных изменений.  # noqa: E501

        :return: The items of this OrdersStatsOrderDTO.
        :rtype: List[OrdersStatsItemDTO]
        """
        return self._items

    @items.setter
    def items(self, items: List[OrdersStatsItemDTO]):
        """Sets the items of this OrdersStatsOrderDTO.

        Список товаров в заказе после возможных изменений.  # noqa: E501

        :param items: The items of this OrdersStatsOrderDTO.
        :type items: List[OrdersStatsItemDTO]
        """
        if items is None:
            raise ValueError("Invalid value for `items`, must not be `None`")  # noqa: E501

        self._items = items

    @property
    def initial_items(self) -> List[OrdersStatsItemDTO]:
        """Gets the initial_items of this OrdersStatsOrderDTO.

        Список товаров в заказе до изменений.  # noqa: E501

        :return: The initial_items of this OrdersStatsOrderDTO.
        :rtype: List[OrdersStatsItemDTO]
        """
        return self._initial_items

    @initial_items.setter
    def initial_items(self, initial_items: List[OrdersStatsItemDTO]):
        """Sets the initial_items of this OrdersStatsOrderDTO.

        Список товаров в заказе до изменений.  # noqa: E501

        :param initial_items: The initial_items of this OrdersStatsOrderDTO.
        :type initial_items: List[OrdersStatsItemDTO]
        """

        self._initial_items = initial_items

    @property
    def payments(self) -> List[OrdersStatsPaymentDTO]:
        """Gets the payments of this OrdersStatsOrderDTO.

        Информация о денежных переводах по заказу.  # noqa: E501

        :return: The payments of this OrdersStatsOrderDTO.
        :rtype: List[OrdersStatsPaymentDTO]
        """
        return self._payments

    @payments.setter
    def payments(self, payments: List[OrdersStatsPaymentDTO]):
        """Sets the payments of this OrdersStatsOrderDTO.

        Информация о денежных переводах по заказу.  # noqa: E501

        :param payments: The payments of this OrdersStatsOrderDTO.
        :type payments: List[OrdersStatsPaymentDTO]
        """
        if payments is None:
            raise ValueError("Invalid value for `payments`, must not be `None`")  # noqa: E501

        self._payments = payments

    @property
    def commissions(self) -> List[OrdersStatsCommissionDTO]:
        """Gets the commissions of this OrdersStatsOrderDTO.

        Информация о комиссиях за заказ.  # noqa: E501

        :return: The commissions of this OrdersStatsOrderDTO.
        :rtype: List[OrdersStatsCommissionDTO]
        """
        return self._commissions

    @commissions.setter
    def commissions(self, commissions: List[OrdersStatsCommissionDTO]):
        """Sets the commissions of this OrdersStatsOrderDTO.

        Информация о комиссиях за заказ.  # noqa: E501

        :param commissions: The commissions of this OrdersStatsOrderDTO.
        :type commissions: List[OrdersStatsCommissionDTO]
        """
        if commissions is None:
            raise ValueError("Invalid value for `commissions`, must not be `None`")  # noqa: E501

        self._commissions = commissions