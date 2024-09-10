# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.gps_dto import GpsDTO
from ympa_python_aiohttp_server import util


class OrderDeliveryAddressDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, country: str=None, postcode: str=None, city: str=None, district: str=None, subway: str=None, street: str=None, house: str=None, block: str=None, entrance: str=None, entryphone: str=None, floor: str=None, apartment: str=None, phone: str=None, recipient: str=None, gps: GpsDTO=None):
        """OrderDeliveryAddressDTO - a model defined in OpenAPI

        :param country: The country of this OrderDeliveryAddressDTO.
        :param postcode: The postcode of this OrderDeliveryAddressDTO.
        :param city: The city of this OrderDeliveryAddressDTO.
        :param district: The district of this OrderDeliveryAddressDTO.
        :param subway: The subway of this OrderDeliveryAddressDTO.
        :param street: The street of this OrderDeliveryAddressDTO.
        :param house: The house of this OrderDeliveryAddressDTO.
        :param block: The block of this OrderDeliveryAddressDTO.
        :param entrance: The entrance of this OrderDeliveryAddressDTO.
        :param entryphone: The entryphone of this OrderDeliveryAddressDTO.
        :param floor: The floor of this OrderDeliveryAddressDTO.
        :param apartment: The apartment of this OrderDeliveryAddressDTO.
        :param phone: The phone of this OrderDeliveryAddressDTO.
        :param recipient: The recipient of this OrderDeliveryAddressDTO.
        :param gps: The gps of this OrderDeliveryAddressDTO.
        """
        self.openapi_types = {
            'country': str,
            'postcode': str,
            'city': str,
            'district': str,
            'subway': str,
            'street': str,
            'house': str,
            'block': str,
            'entrance': str,
            'entryphone': str,
            'floor': str,
            'apartment': str,
            'phone': str,
            'recipient': str,
            'gps': GpsDTO
        }

        self.attribute_map = {
            'country': 'country',
            'postcode': 'postcode',
            'city': 'city',
            'district': 'district',
            'subway': 'subway',
            'street': 'street',
            'house': 'house',
            'block': 'block',
            'entrance': 'entrance',
            'entryphone': 'entryphone',
            'floor': 'floor',
            'apartment': 'apartment',
            'phone': 'phone',
            'recipient': 'recipient',
            'gps': 'gps'
        }

        self._country = country
        self._postcode = postcode
        self._city = city
        self._district = district
        self._subway = subway
        self._street = street
        self._house = house
        self._block = block
        self._entrance = entrance
        self._entryphone = entryphone
        self._floor = floor
        self._apartment = apartment
        self._phone = phone
        self._recipient = recipient
        self._gps = gps

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrderDeliveryAddressDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrderDeliveryAddressDTO of this OrderDeliveryAddressDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def country(self):
        """Gets the country of this OrderDeliveryAddressDTO.

        Страна.  Обязательный параметр. 

        :return: The country of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._country

    @country.setter
    def country(self, country):
        """Sets the country of this OrderDeliveryAddressDTO.

        Страна.  Обязательный параметр. 

        :param country: The country of this OrderDeliveryAddressDTO.
        :type country: str
        """

        self._country = country

    @property
    def postcode(self):
        """Gets the postcode of this OrderDeliveryAddressDTO.

        Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 

        :return: The postcode of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._postcode

    @postcode.setter
    def postcode(self, postcode):
        """Sets the postcode of this OrderDeliveryAddressDTO.

        Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 

        :param postcode: The postcode of this OrderDeliveryAddressDTO.
        :type postcode: str
        """

        self._postcode = postcode

    @property
    def city(self):
        """Gets the city of this OrderDeliveryAddressDTO.

        Город или населенный пункт.  Обязательный параметр. 

        :return: The city of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._city

    @city.setter
    def city(self, city):
        """Sets the city of this OrderDeliveryAddressDTO.

        Город или населенный пункт.  Обязательный параметр. 

        :param city: The city of this OrderDeliveryAddressDTO.
        :type city: str
        """

        self._city = city

    @property
    def district(self):
        """Gets the district of this OrderDeliveryAddressDTO.

        Район.

        :return: The district of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._district

    @district.setter
    def district(self, district):
        """Sets the district of this OrderDeliveryAddressDTO.

        Район.

        :param district: The district of this OrderDeliveryAddressDTO.
        :type district: str
        """

        self._district = district

    @property
    def subway(self):
        """Gets the subway of this OrderDeliveryAddressDTO.

        Станция метро.

        :return: The subway of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._subway

    @subway.setter
    def subway(self, subway):
        """Sets the subway of this OrderDeliveryAddressDTO.

        Станция метро.

        :param subway: The subway of this OrderDeliveryAddressDTO.
        :type subway: str
        """

        self._subway = subway

    @property
    def street(self):
        """Gets the street of this OrderDeliveryAddressDTO.

        Улица.  Обязательный параметр. 

        :return: The street of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._street

    @street.setter
    def street(self, street):
        """Sets the street of this OrderDeliveryAddressDTO.

        Улица.  Обязательный параметр. 

        :param street: The street of this OrderDeliveryAddressDTO.
        :type street: str
        """

        self._street = street

    @property
    def house(self):
        """Gets the house of this OrderDeliveryAddressDTO.

        Дом или владение.  Обязательный параметр. 

        :return: The house of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._house

    @house.setter
    def house(self, house):
        """Sets the house of this OrderDeliveryAddressDTO.

        Дом или владение.  Обязательный параметр. 

        :param house: The house of this OrderDeliveryAddressDTO.
        :type house: str
        """

        self._house = house

    @property
    def block(self):
        """Gets the block of this OrderDeliveryAddressDTO.

        Корпус или строение.

        :return: The block of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._block

    @block.setter
    def block(self, block):
        """Sets the block of this OrderDeliveryAddressDTO.

        Корпус или строение.

        :param block: The block of this OrderDeliveryAddressDTO.
        :type block: str
        """

        self._block = block

    @property
    def entrance(self):
        """Gets the entrance of this OrderDeliveryAddressDTO.

        Подъезд.

        :return: The entrance of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._entrance

    @entrance.setter
    def entrance(self, entrance):
        """Sets the entrance of this OrderDeliveryAddressDTO.

        Подъезд.

        :param entrance: The entrance of this OrderDeliveryAddressDTO.
        :type entrance: str
        """

        self._entrance = entrance

    @property
    def entryphone(self):
        """Gets the entryphone of this OrderDeliveryAddressDTO.

        Код домофона.

        :return: The entryphone of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._entryphone

    @entryphone.setter
    def entryphone(self, entryphone):
        """Sets the entryphone of this OrderDeliveryAddressDTO.

        Код домофона.

        :param entryphone: The entryphone of this OrderDeliveryAddressDTO.
        :type entryphone: str
        """

        self._entryphone = entryphone

    @property
    def floor(self):
        """Gets the floor of this OrderDeliveryAddressDTO.

        Этаж.

        :return: The floor of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._floor

    @floor.setter
    def floor(self, floor):
        """Sets the floor of this OrderDeliveryAddressDTO.

        Этаж.

        :param floor: The floor of this OrderDeliveryAddressDTO.
        :type floor: str
        """

        self._floor = floor

    @property
    def apartment(self):
        """Gets the apartment of this OrderDeliveryAddressDTO.

        Квартира или офис.

        :return: The apartment of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._apartment

    @apartment.setter
    def apartment(self, apartment):
        """Sets the apartment of this OrderDeliveryAddressDTO.

        Квартира или офис.

        :param apartment: The apartment of this OrderDeliveryAddressDTO.
        :type apartment: str
        """

        self._apartment = apartment

    @property
    def phone(self):
        """Gets the phone of this OrderDeliveryAddressDTO.

        Телефон получателя заказа.  Обязательный параметр. 

        :return: The phone of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """Sets the phone of this OrderDeliveryAddressDTO.

        Телефон получателя заказа.  Обязательный параметр. 

        :param phone: The phone of this OrderDeliveryAddressDTO.
        :type phone: str
        """

        self._phone = phone

    @property
    def recipient(self):
        """Gets the recipient of this OrderDeliveryAddressDTO.

        Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 

        :return: The recipient of this OrderDeliveryAddressDTO.
        :rtype: str
        """
        return self._recipient

    @recipient.setter
    def recipient(self, recipient):
        """Sets the recipient of this OrderDeliveryAddressDTO.

        Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 

        :param recipient: The recipient of this OrderDeliveryAddressDTO.
        :type recipient: str
        """

        self._recipient = recipient

    @property
    def gps(self):
        """Gets the gps of this OrderDeliveryAddressDTO.


        :return: The gps of this OrderDeliveryAddressDTO.
        :rtype: GpsDTO
        """
        return self._gps

    @gps.setter
    def gps(self, gps):
        """Sets the gps of this OrderDeliveryAddressDTO.


        :param gps: The gps of this OrderDeliveryAddressDTO.
        :type gps: GpsDTO
        """

        self._gps = gps
