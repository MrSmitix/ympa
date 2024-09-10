from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PickupAddressDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, country=None, city=None, street=None, house=None, postcode=None):  # noqa: E501
        """PickupAddressDTO - a model defined in OpenAPI

        :param country: The country of this PickupAddressDTO.  # noqa: E501
        :type country: str
        :param city: The city of this PickupAddressDTO.  # noqa: E501
        :type city: str
        :param street: The street of this PickupAddressDTO.  # noqa: E501
        :type street: str
        :param house: The house of this PickupAddressDTO.  # noqa: E501
        :type house: str
        :param postcode: The postcode of this PickupAddressDTO.  # noqa: E501
        :type postcode: str
        """
        self.openapi_types = {
            'country': str,
            'city': str,
            'street': str,
            'house': str,
            'postcode': str
        }

        self.attribute_map = {
            'country': 'country',
            'city': 'city',
            'street': 'street',
            'house': 'house',
            'postcode': 'postcode'
        }

        self._country = country
        self._city = city
        self._street = street
        self._house = house
        self._postcode = postcode

    @classmethod
    def from_dict(cls, dikt) -> 'PickupAddressDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PickupAddressDTO of this PickupAddressDTO.  # noqa: E501
        :rtype: PickupAddressDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def country(self) -> str:
        """Gets the country of this PickupAddressDTO.

        Страна.  # noqa: E501

        :return: The country of this PickupAddressDTO.
        :rtype: str
        """
        return self._country

    @country.setter
    def country(self, country: str):
        """Sets the country of this PickupAddressDTO.

        Страна.  # noqa: E501

        :param country: The country of this PickupAddressDTO.
        :type country: str
        """

        self._country = country

    @property
    def city(self) -> str:
        """Gets the city of this PickupAddressDTO.

        Город.  # noqa: E501

        :return: The city of this PickupAddressDTO.
        :rtype: str
        """
        return self._city

    @city.setter
    def city(self, city: str):
        """Sets the city of this PickupAddressDTO.

        Город.  # noqa: E501

        :param city: The city of this PickupAddressDTO.
        :type city: str
        """

        self._city = city

    @property
    def street(self) -> str:
        """Gets the street of this PickupAddressDTO.

        Улица.  # noqa: E501

        :return: The street of this PickupAddressDTO.
        :rtype: str
        """
        return self._street

    @street.setter
    def street(self, street: str):
        """Sets the street of this PickupAddressDTO.

        Улица.  # noqa: E501

        :param street: The street of this PickupAddressDTO.
        :type street: str
        """

        self._street = street

    @property
    def house(self) -> str:
        """Gets the house of this PickupAddressDTO.

        Номер дома.  # noqa: E501

        :return: The house of this PickupAddressDTO.
        :rtype: str
        """
        return self._house

    @house.setter
    def house(self, house: str):
        """Sets the house of this PickupAddressDTO.

        Номер дома.  # noqa: E501

        :param house: The house of this PickupAddressDTO.
        :type house: str
        """

        self._house = house

    @property
    def postcode(self) -> str:
        """Gets the postcode of this PickupAddressDTO.

        Почтовый индекс.  # noqa: E501

        :return: The postcode of this PickupAddressDTO.
        :rtype: str
        """
        return self._postcode

    @postcode.setter
    def postcode(self, postcode: str):
        """Sets the postcode of this PickupAddressDTO.

        Почтовый индекс.  # noqa: E501

        :param postcode: The postcode of this PickupAddressDTO.
        :type postcode: str
        """

        self._postcode = postcode