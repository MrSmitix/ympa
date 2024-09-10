from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OrderSubstatusType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    RESERVATION_EXPIRED = 'RESERVATION_EXPIRED'
    USER_NOT_PAID = 'USER_NOT_PAID'
    USER_UNREACHABLE = 'USER_UNREACHABLE'
    USER_CHANGED_MIND = 'USER_CHANGED_MIND'
    USER_REFUSED_DELIVERY = 'USER_REFUSED_DELIVERY'
    USER_REFUSED_PRODUCT = 'USER_REFUSED_PRODUCT'
    SHOP_FAILED = 'SHOP_FAILED'
    USER_REFUSED_QUALITY = 'USER_REFUSED_QUALITY'
    REPLACING_ORDER = 'REPLACING_ORDER'
    PROCESSING_EXPIRED = 'PROCESSING_EXPIRED'
    PENDING_EXPIRED = 'PENDING_EXPIRED'
    SHOP_PENDING_CANCELLED = 'SHOP_PENDING_CANCELLED'
    PENDING_CANCELLED = 'PENDING_CANCELLED'
    USER_FRAUD = 'USER_FRAUD'
    RESERVATION_FAILED = 'RESERVATION_FAILED'
    USER_PLACED_OTHER_ORDER = 'USER_PLACED_OTHER_ORDER'
    USER_BOUGHT_CHEAPER = 'USER_BOUGHT_CHEAPER'
    MISSING_ITEM = 'MISSING_ITEM'
    BROKEN_ITEM = 'BROKEN_ITEM'
    WRONG_ITEM = 'WRONG_ITEM'
    PICKUP_EXPIRED = 'PICKUP_EXPIRED'
    DELIVERY_PROBLEMS = 'DELIVERY_PROBLEMS'
    LATE_CONTACT = 'LATE_CONTACT'
    CUSTOM = 'CUSTOM'
    DELIVERY_SERVICE_FAILED = 'DELIVERY_SERVICE_FAILED'
    WAREHOUSE_FAILED_TO_SHIP = 'WAREHOUSE_FAILED_TO_SHIP'
    DELIVERY_SERIVCE_UNDELIVERED = 'DELIVERY_SERIVCE_UNDELIVERED'
    DELIVERY_SERVICE_UNDELIVERED = 'DELIVERY_SERVICE_UNDELIVERED'
    PREORDER = 'PREORDER'
    AWAIT_CONFIRMATION = 'AWAIT_CONFIRMATION'
    STARTED = 'STARTED'
    PACKAGING = 'PACKAGING'
    READY_TO_SHIP = 'READY_TO_SHIP'
    SHIPPED = 'SHIPPED'
    ASYNC_PROCESSING = 'ASYNC_PROCESSING'
    USER_REFUSED_TO_PROVIDE_PERSONAL_DATA = 'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA'
    WAITING_USER_INPUT = 'WAITING_USER_INPUT'
    WAITING_BANK_DECISION = 'WAITING_BANK_DECISION'
    BANK_REJECT_CREDIT_OFFER = 'BANK_REJECT_CREDIT_OFFER'
    CUSTOMER_REJECT_CREDIT_OFFER = 'CUSTOMER_REJECT_CREDIT_OFFER'
    CREDIT_OFFER_FAILED = 'CREDIT_OFFER_FAILED'
    AWAIT_DELIVERY_DATES_CONFIRMATION = 'AWAIT_DELIVERY_DATES_CONFIRMATION'
    SERVICE_FAULT = 'SERVICE_FAULT'
    DELIVERY_SERVICE_RECEIVED = 'DELIVERY_SERVICE_RECEIVED'
    USER_RECEIVED = 'USER_RECEIVED'
    WAITING_FOR_STOCKS = 'WAITING_FOR_STOCKS'
    AS_PART_OF_MULTI_ORDER = 'AS_PART_OF_MULTI_ORDER'
    READY_FOR_LAST_MILE = 'READY_FOR_LAST_MILE'
    LAST_MILE_STARTED = 'LAST_MILE_STARTED'
    ANTIFRAUD = 'ANTIFRAUD'
    DELIVERY_USER_NOT_RECEIVED = 'DELIVERY_USER_NOT_RECEIVED'
    DELIVERY_SERVICE_DELIVERED = 'DELIVERY_SERVICE_DELIVERED'
    DELIVERED_USER_NOT_RECEIVED = 'DELIVERED_USER_NOT_RECEIVED'
    USER_WANTED_ANOTHER_PAYMENT_METHOD = 'USER_WANTED_ANOTHER_PAYMENT_METHOD'
    USER_RECEIVED_TECHNICAL_ERROR = 'USER_RECEIVED_TECHNICAL_ERROR'
    USER_FORGOT_TO_USE_BONUS = 'USER_FORGOT_TO_USE_BONUS'
    RECEIVED_ON_DISTRIBUTION_CENTER = 'RECEIVED_ON_DISTRIBUTION_CENTER'
    DELIVERY_SERVICE_NOT_RECEIVED = 'DELIVERY_SERVICE_NOT_RECEIVED'
    DELIVERY_SERVICE_LOST = 'DELIVERY_SERVICE_LOST'
    SHIPPED_TO_WRONG_DELIVERY_SERVICE = 'SHIPPED_TO_WRONG_DELIVERY_SERVICE'
    DELIVERED_USER_RECEIVED = 'DELIVERED_USER_RECEIVED'
    WAITING_TINKOFF_DECISION = 'WAITING_TINKOFF_DECISION'
    COURIER_SEARCH = 'COURIER_SEARCH'
    COURIER_FOUND = 'COURIER_FOUND'
    COURIER_IN_TRANSIT_TO_SENDER = 'COURIER_IN_TRANSIT_TO_SENDER'
    COURIER_ARRIVED_TO_SENDER = 'COURIER_ARRIVED_TO_SENDER'
    COURIER_RECEIVED = 'COURIER_RECEIVED'
    COURIER_NOT_FOUND = 'COURIER_NOT_FOUND'
    COURIER_NOT_DELIVER_ORDER = 'COURIER_NOT_DELIVER_ORDER'
    COURIER_RETURNS_ORDER = 'COURIER_RETURNS_ORDER'
    COURIER_RETURNED_ORDER = 'COURIER_RETURNED_ORDER'
    WAITING_USER_DELIVERY_INPUT = 'WAITING_USER_DELIVERY_INPUT'
    PICKUP_SERVICE_RECEIVED = 'PICKUP_SERVICE_RECEIVED'
    PICKUP_USER_RECEIVED = 'PICKUP_USER_RECEIVED'
    CANCELLED_COURIER_NOT_FOUND = 'CANCELLED_COURIER_NOT_FOUND'
    COURIER_NOT_COME_FOR_ORDER = 'COURIER_NOT_COME_FOR_ORDER'
    DELIVERY_NOT_MANAGED_REGION = 'DELIVERY_NOT_MANAGED_REGION'
    INCOMPLETE_CONTACT_INFORMATION = 'INCOMPLETE_CONTACT_INFORMATION'
    INCOMPLETE_MULTI_ORDER = 'INCOMPLETE_MULTI_ORDER'
    INAPPROPRIATE_WEIGHT_SIZE = 'INAPPROPRIATE_WEIGHT_SIZE'
    TECHNICAL_ERROR = 'TECHNICAL_ERROR'
    SORTING_CENTER_LOST = 'SORTING_CENTER_LOST'
    COURIER_SEARCH_NOT_STARTED = 'COURIER_SEARCH_NOT_STARTED'
    LOST = 'LOST'
    AWAIT_PAYMENT = 'AWAIT_PAYMENT'
    AWAIT_LAVKA_RESERVATION = 'AWAIT_LAVKA_RESERVATION'
    USER_WANTS_TO_CHANGE_ADDRESS = 'USER_WANTS_TO_CHANGE_ADDRESS'
    FULL_NOT_RANSOM = 'FULL_NOT_RANSOM'
    PRESCRIPTION_MISMATCH = 'PRESCRIPTION_MISMATCH'
    DROPOFF_LOST = 'DROPOFF_LOST'
    DROPOFF_CLOSED = 'DROPOFF_CLOSED'
    DELIVERY_TO_STORE_STARTED = 'DELIVERY_TO_STORE_STARTED'
    USER_WANTS_TO_CHANGE_DELIVERY_DATE = 'USER_WANTS_TO_CHANGE_DELIVERY_DATE'
    WRONG_ITEM_DELIVERED = 'WRONG_ITEM_DELIVERED'
    DAMAGED_BOX = 'DAMAGED_BOX'
    AWAIT_DELIVERY_DATES = 'AWAIT_DELIVERY_DATES'
    LAST_MILE_COURIER_SEARCH = 'LAST_MILE_COURIER_SEARCH'
    PICKUP_POINT_CLOSED = 'PICKUP_POINT_CLOSED'
    LEGAL_INFO_CHANGED = 'LEGAL_INFO_CHANGED'
    USER_HAS_NO_TIME_TO_PICKUP_ORDER = 'USER_HAS_NO_TIME_TO_PICKUP_ORDER'
    DELIVERY_CUSTOMS_ARRIVED = 'DELIVERY_CUSTOMS_ARRIVED'
    DELIVERY_CUSTOMS_CLEARED = 'DELIVERY_CUSTOMS_CLEARED'
    FIRST_MILE_DELIVERY_SERVICE_RECEIVED = 'FIRST_MILE_DELIVERY_SERVICE_RECEIVED'
    AWAIT_AUTO_DELIVERY_DATES = 'AWAIT_AUTO_DELIVERY_DATES'
    AWAIT_USER_PERSONAL_DATA = 'AWAIT_USER_PERSONAL_DATA'
    NO_PERSONAL_DATA_EXPIRED = 'NO_PERSONAL_DATA_EXPIRED'
    CUSTOMS_PROBLEMS = 'CUSTOMS_PROBLEMS'
    AWAIT_CASHIER = 'AWAIT_CASHIER'
    WAITING_POSTPAID_BUDGET_RESERVATION = 'WAITING_POSTPAID_BUDGET_RESERVATION'
    AWAIT_SERVICEABLE_CONFIRMATION = 'AWAIT_SERVICEABLE_CONFIRMATION'
    POSTPAID_BUDGET_RESERVATION_FAILED = 'POSTPAID_BUDGET_RESERVATION_FAILED'
    AWAIT_CUSTOM_PRICE_CONFIRMATION = 'AWAIT_CUSTOM_PRICE_CONFIRMATION'
    READY_FOR_PICKUP = 'READY_FOR_PICKUP'
    UNKNOWN = 'UNKNOWN'
    def __init__(self):  # noqa: E501
        """OrderSubstatusType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'OrderSubstatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderSubstatusType of this OrderSubstatusType.  # noqa: E501
        :rtype: OrderSubstatusType
        """
        return util.deserialize_model(dikt, cls)