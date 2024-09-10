# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.order_courier_dto import OrderCourierDTO
from ympa_python_aiohttp_server.models.order_delivery_address_dto import OrderDeliveryAddressDTO
from ympa_python_aiohttp_server.models.order_delivery_dates_dto import OrderDeliveryDatesDTO
from ympa_python_aiohttp_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType
from ympa_python_aiohttp_server.models.order_delivery_eac_type import OrderDeliveryEacType
from ympa_python_aiohttp_server.models.order_delivery_partner_type import OrderDeliveryPartnerType
from ympa_python_aiohttp_server.models.order_delivery_type import OrderDeliveryType
from ympa_python_aiohttp_server.models.order_lift_type import OrderLiftType
from ympa_python_aiohttp_server.models.order_shipment_dto import OrderShipmentDTO
from ympa_python_aiohttp_server.models.order_track_dto import OrderTrackDTO
from ympa_python_aiohttp_server.models.order_vat_type import OrderVatType
from ympa_python_aiohttp_server.models.region_dto import RegionDTO
from ympa_python_aiohttp_server import util


class OrderDeliveryDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, type: OrderDeliveryType=None, service_name: str=None, price: float=None, delivery_partner_type: OrderDeliveryPartnerType=None, courier: OrderCourierDTO=None, dates: OrderDeliveryDatesDTO=None, region: RegionDTO=None, address: OrderDeliveryAddressDTO=None, vat: OrderVatType=None, delivery_service_id: int=None, lift_type: OrderLiftType=None, lift_price: float=None, outlet_code: str=None, outlet_storage_limit_date: str=None, dispatch_type: OrderDeliveryDispatchType=None, tracks: List[OrderTrackDTO]=None, shipments: List[OrderShipmentDTO]=None, estimated: bool=None, eac_type: OrderDeliveryEacType=None, eac_code: str=None):
        """OrderDeliveryDTO - a model defined in OpenAPI

        :param id: The id of this OrderDeliveryDTO.
        :param type: The type of this OrderDeliveryDTO.
        :param service_name: The service_name of this OrderDeliveryDTO.
        :param price: The price of this OrderDeliveryDTO.
        :param delivery_partner_type: The delivery_partner_type of this OrderDeliveryDTO.
        :param courier: The courier of this OrderDeliveryDTO.
        :param dates: The dates of this OrderDeliveryDTO.
        :param region: The region of this OrderDeliveryDTO.
        :param address: The address of this OrderDeliveryDTO.
        :param vat: The vat of this OrderDeliveryDTO.
        :param delivery_service_id: The delivery_service_id of this OrderDeliveryDTO.
        :param lift_type: The lift_type of this OrderDeliveryDTO.
        :param lift_price: The lift_price of this OrderDeliveryDTO.
        :param outlet_code: The outlet_code of this OrderDeliveryDTO.
        :param outlet_storage_limit_date: The outlet_storage_limit_date of this OrderDeliveryDTO.
        :param dispatch_type: The dispatch_type of this OrderDeliveryDTO.
        :param tracks: The tracks of this OrderDeliveryDTO.
        :param shipments: The shipments of this OrderDeliveryDTO.
        :param estimated: The estimated of this OrderDeliveryDTO.
        :param eac_type: The eac_type of this OrderDeliveryDTO.
        :param eac_code: The eac_code of this OrderDeliveryDTO.
        """
        self.openapi_types = {
            'id': str,
            'type': OrderDeliveryType,
            'service_name': str,
            'price': float,
            'delivery_partner_type': OrderDeliveryPartnerType,
            'courier': OrderCourierDTO,
            'dates': OrderDeliveryDatesDTO,
            'region': RegionDTO,
            'address': OrderDeliveryAddressDTO,
            'vat': OrderVatType,
            'delivery_service_id': int,
            'lift_type': OrderLiftType,
            'lift_price': float,
            'outlet_code': str,
            'outlet_storage_limit_date': str,
            'dispatch_type': OrderDeliveryDispatchType,
            'tracks': List[OrderTrackDTO],
            'shipments': List[OrderShipmentDTO],
            'estimated': bool,
            'eac_type': OrderDeliveryEacType,
            'eac_code': str
        }

        self.attribute_map = {
            'id': 'id',
            'type': 'type',
            'service_name': 'serviceName',
            'price': 'price',
            'delivery_partner_type': 'deliveryPartnerType',
            'courier': 'courier',
            'dates': 'dates',
            'region': 'region',
            'address': 'address',
            'vat': 'vat',
            'delivery_service_id': 'deliveryServiceId',
            'lift_type': 'liftType',
            'lift_price': 'liftPrice',
            'outlet_code': 'outletCode',
            'outlet_storage_limit_date': 'outletStorageLimitDate',
            'dispatch_type': 'dispatchType',
            'tracks': 'tracks',
            'shipments': 'shipments',
            'estimated': 'estimated',
            'eac_type': 'eacType',
            'eac_code': 'eacCode'
        }

        self._id = id
        self._type = type
        self._service_name = service_name
        self._price = price
        self._delivery_partner_type = delivery_partner_type
        self._courier = courier
        self._dates = dates
        self._region = region
        self._address = address
        self._vat = vat
        self._delivery_service_id = delivery_service_id
        self._lift_type = lift_type
        self._lift_price = lift_price
        self._outlet_code = outlet_code
        self._outlet_storage_limit_date = outlet_storage_limit_date
        self._dispatch_type = dispatch_type
        self._tracks = tracks
        self._shipments = shipments
        self._estimated = estimated
        self._eac_type = eac_type
        self._eac_code = eac_code

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrderDeliveryDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrderDeliveryDTO of this OrderDeliveryDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this OrderDeliveryDTO.

        Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 

        :return: The id of this OrderDeliveryDTO.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this OrderDeliveryDTO.

        Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 

        :param id: The id of this OrderDeliveryDTO.
        :type id: str
        """

        self._id = id

    @property
    def type(self):
        """Gets the type of this OrderDeliveryDTO.


        :return: The type of this OrderDeliveryDTO.
        :rtype: OrderDeliveryType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this OrderDeliveryDTO.


        :param type: The type of this OrderDeliveryDTO.
        :type type: OrderDeliveryType
        """

        self._type = type

    @property
    def service_name(self):
        """Gets the service_name of this OrderDeliveryDTO.

        Наименование службы доставки.

        :return: The service_name of this OrderDeliveryDTO.
        :rtype: str
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name):
        """Sets the service_name of this OrderDeliveryDTO.

        Наименование службы доставки.

        :param service_name: The service_name of this OrderDeliveryDTO.
        :type service_name: str
        """

        self._service_name = service_name

    @property
    def price(self):
        """Gets the price of this OrderDeliveryDTO.

        {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 

        :return: The price of this OrderDeliveryDTO.
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this OrderDeliveryDTO.

        {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 

        :param price: The price of this OrderDeliveryDTO.
        :type price: float
        """

        self._price = price

    @property
    def delivery_partner_type(self):
        """Gets the delivery_partner_type of this OrderDeliveryDTO.


        :return: The delivery_partner_type of this OrderDeliveryDTO.
        :rtype: OrderDeliveryPartnerType
        """
        return self._delivery_partner_type

    @delivery_partner_type.setter
    def delivery_partner_type(self, delivery_partner_type):
        """Sets the delivery_partner_type of this OrderDeliveryDTO.


        :param delivery_partner_type: The delivery_partner_type of this OrderDeliveryDTO.
        :type delivery_partner_type: OrderDeliveryPartnerType
        """

        self._delivery_partner_type = delivery_partner_type

    @property
    def courier(self):
        """Gets the courier of this OrderDeliveryDTO.


        :return: The courier of this OrderDeliveryDTO.
        :rtype: OrderCourierDTO
        """
        return self._courier

    @courier.setter
    def courier(self, courier):
        """Sets the courier of this OrderDeliveryDTO.


        :param courier: The courier of this OrderDeliveryDTO.
        :type courier: OrderCourierDTO
        """

        self._courier = courier

    @property
    def dates(self):
        """Gets the dates of this OrderDeliveryDTO.


        :return: The dates of this OrderDeliveryDTO.
        :rtype: OrderDeliveryDatesDTO
        """
        return self._dates

    @dates.setter
    def dates(self, dates):
        """Sets the dates of this OrderDeliveryDTO.


        :param dates: The dates of this OrderDeliveryDTO.
        :type dates: OrderDeliveryDatesDTO
        """

        self._dates = dates

    @property
    def region(self):
        """Gets the region of this OrderDeliveryDTO.


        :return: The region of this OrderDeliveryDTO.
        :rtype: RegionDTO
        """
        return self._region

    @region.setter
    def region(self, region):
        """Sets the region of this OrderDeliveryDTO.


        :param region: The region of this OrderDeliveryDTO.
        :type region: RegionDTO
        """

        self._region = region

    @property
    def address(self):
        """Gets the address of this OrderDeliveryDTO.


        :return: The address of this OrderDeliveryDTO.
        :rtype: OrderDeliveryAddressDTO
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this OrderDeliveryDTO.


        :param address: The address of this OrderDeliveryDTO.
        :type address: OrderDeliveryAddressDTO
        """

        self._address = address

    @property
    def vat(self):
        """Gets the vat of this OrderDeliveryDTO.


        :return: The vat of this OrderDeliveryDTO.
        :rtype: OrderVatType
        """
        return self._vat

    @vat.setter
    def vat(self, vat):
        """Sets the vat of this OrderDeliveryDTO.


        :param vat: The vat of this OrderDeliveryDTO.
        :type vat: OrderVatType
        """

        self._vat = vat

    @property
    def delivery_service_id(self):
        """Gets the delivery_service_id of this OrderDeliveryDTO.

        Идентификатор службы доставки.

        :return: The delivery_service_id of this OrderDeliveryDTO.
        :rtype: int
        """
        return self._delivery_service_id

    @delivery_service_id.setter
    def delivery_service_id(self, delivery_service_id):
        """Sets the delivery_service_id of this OrderDeliveryDTO.

        Идентификатор службы доставки.

        :param delivery_service_id: The delivery_service_id of this OrderDeliveryDTO.
        :type delivery_service_id: int
        """

        self._delivery_service_id = delivery_service_id

    @property
    def lift_type(self):
        """Gets the lift_type of this OrderDeliveryDTO.


        :return: The lift_type of this OrderDeliveryDTO.
        :rtype: OrderLiftType
        """
        return self._lift_type

    @lift_type.setter
    def lift_type(self, lift_type):
        """Sets the lift_type of this OrderDeliveryDTO.


        :param lift_type: The lift_type of this OrderDeliveryDTO.
        :type lift_type: OrderLiftType
        """

        self._lift_type = lift_type

    @property
    def lift_price(self):
        """Gets the lift_price of this OrderDeliveryDTO.

        Стоимость подъема на этаж.

        :return: The lift_price of this OrderDeliveryDTO.
        :rtype: float
        """
        return self._lift_price

    @lift_price.setter
    def lift_price(self, lift_price):
        """Sets the lift_price of this OrderDeliveryDTO.

        Стоимость подъема на этаж.

        :param lift_price: The lift_price of this OrderDeliveryDTO.
        :type lift_price: float
        """

        self._lift_price = lift_price

    @property
    def outlet_code(self):
        """Gets the outlet_code of this OrderDeliveryDTO.

        Идентификатор пункта самовывоза, присвоенный магазином.

        :return: The outlet_code of this OrderDeliveryDTO.
        :rtype: str
        """
        return self._outlet_code

    @outlet_code.setter
    def outlet_code(self, outlet_code):
        """Sets the outlet_code of this OrderDeliveryDTO.

        Идентификатор пункта самовывоза, присвоенный магазином.

        :param outlet_code: The outlet_code of this OrderDeliveryDTO.
        :type outlet_code: str
        """

        self._outlet_code = outlet_code

    @property
    def outlet_storage_limit_date(self):
        """Gets the outlet_storage_limit_date of this OrderDeliveryDTO.

        Формат даты: `ДД-ММ-ГГГГ`. 

        :return: The outlet_storage_limit_date of this OrderDeliveryDTO.
        :rtype: str
        """
        return self._outlet_storage_limit_date

    @outlet_storage_limit_date.setter
    def outlet_storage_limit_date(self, outlet_storage_limit_date):
        """Sets the outlet_storage_limit_date of this OrderDeliveryDTO.

        Формат даты: `ДД-ММ-ГГГГ`. 

        :param outlet_storage_limit_date: The outlet_storage_limit_date of this OrderDeliveryDTO.
        :type outlet_storage_limit_date: str
        """

        self._outlet_storage_limit_date = outlet_storage_limit_date

    @property
    def dispatch_type(self):
        """Gets the dispatch_type of this OrderDeliveryDTO.


        :return: The dispatch_type of this OrderDeliveryDTO.
        :rtype: OrderDeliveryDispatchType
        """
        return self._dispatch_type

    @dispatch_type.setter
    def dispatch_type(self, dispatch_type):
        """Sets the dispatch_type of this OrderDeliveryDTO.


        :param dispatch_type: The dispatch_type of this OrderDeliveryDTO.
        :type dispatch_type: OrderDeliveryDispatchType
        """

        self._dispatch_type = dispatch_type

    @property
    def tracks(self):
        """Gets the tracks of this OrderDeliveryDTO.

        Информация для отслеживания перемещений посылки.

        :return: The tracks of this OrderDeliveryDTO.
        :rtype: List[OrderTrackDTO]
        """
        return self._tracks

    @tracks.setter
    def tracks(self, tracks):
        """Sets the tracks of this OrderDeliveryDTO.

        Информация для отслеживания перемещений посылки.

        :param tracks: The tracks of this OrderDeliveryDTO.
        :type tracks: List[OrderTrackDTO]
        """

        self._tracks = tracks

    @property
    def shipments(self):
        """Gets the shipments of this OrderDeliveryDTO.

        Информация о посылках.

        :return: The shipments of this OrderDeliveryDTO.
        :rtype: List[OrderShipmentDTO]
        """
        return self._shipments

    @shipments.setter
    def shipments(self, shipments):
        """Sets the shipments of this OrderDeliveryDTO.

        Информация о посылках.

        :param shipments: The shipments of this OrderDeliveryDTO.
        :type shipments: List[OrderShipmentDTO]
        """

        self._shipments = shipments

    @property
    def estimated(self):
        """Gets the estimated of this OrderDeliveryDTO.

        Приблизительная ли дата доставки.

        :return: The estimated of this OrderDeliveryDTO.
        :rtype: bool
        """
        return self._estimated

    @estimated.setter
    def estimated(self, estimated):
        """Sets the estimated of this OrderDeliveryDTO.

        Приблизительная ли дата доставки.

        :param estimated: The estimated of this OrderDeliveryDTO.
        :type estimated: bool
        """

        self._estimated = estimated

    @property
    def eac_type(self):
        """Gets the eac_type of this OrderDeliveryDTO.


        :return: The eac_type of this OrderDeliveryDTO.
        :rtype: OrderDeliveryEacType
        """
        return self._eac_type

    @eac_type.setter
    def eac_type(self, eac_type):
        """Sets the eac_type of this OrderDeliveryDTO.


        :param eac_type: The eac_type of this OrderDeliveryDTO.
        :type eac_type: OrderDeliveryEacType
        """

        self._eac_type = eac_type

    @property
    def eac_code(self):
        """Gets the eac_code of this OrderDeliveryDTO.

        Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 

        :return: The eac_code of this OrderDeliveryDTO.
        :rtype: str
        """
        return self._eac_code

    @eac_code.setter
    def eac_code(self, eac_code):
        """Sets the eac_code of this OrderDeliveryDTO.

        Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 

        :param eac_code: The eac_code of this OrderDeliveryDTO.
        :type eac_code: str
        """

        self._eac_code = eac_code
