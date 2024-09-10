# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.warehouse_address_dto import WarehouseAddressDTO
from ympa_python_aiohttp_server import util


class WarehouseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None, campaign_id: int=None, express: bool=None, address: WarehouseAddressDTO=None):
        """WarehouseDTO - a model defined in OpenAPI

        :param id: The id of this WarehouseDTO.
        :param name: The name of this WarehouseDTO.
        :param campaign_id: The campaign_id of this WarehouseDTO.
        :param express: The express of this WarehouseDTO.
        :param address: The address of this WarehouseDTO.
        """
        self.openapi_types = {
            'id': int,
            'name': str,
            'campaign_id': int,
            'express': bool,
            'address': WarehouseAddressDTO
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'campaign_id': 'campaignId',
            'express': 'express',
            'address': 'address'
        }

        self._id = id
        self._name = name
        self._campaign_id = campaign_id
        self._express = express
        self._address = address

    @classmethod
    def from_dict(cls, dikt: dict) -> 'WarehouseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The WarehouseDTO of this WarehouseDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this WarehouseDTO.

        Идентификатор склада.

        :return: The id of this WarehouseDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this WarehouseDTO.

        Идентификатор склада.

        :param id: The id of this WarehouseDTO.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def name(self):
        """Gets the name of this WarehouseDTO.

        Название склада.

        :return: The name of this WarehouseDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this WarehouseDTO.

        Название склада.

        :param name: The name of this WarehouseDTO.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def campaign_id(self):
        """Gets the campaign_id of this WarehouseDTO.

        Идентификатор кампании в API и идентификатор магазина.

        :return: The campaign_id of this WarehouseDTO.
        :rtype: int
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id):
        """Sets the campaign_id of this WarehouseDTO.

        Идентификатор кампании в API и идентификатор магазина.

        :param campaign_id: The campaign_id of this WarehouseDTO.
        :type campaign_id: int
        """
        if campaign_id is None:
            raise ValueError("Invalid value for `campaign_id`, must not be `None`")

        self._campaign_id = campaign_id

    @property
    def express(self):
        """Gets the express of this WarehouseDTO.

        Возможна ли доставка по модели Экспресс.

        :return: The express of this WarehouseDTO.
        :rtype: bool
        """
        return self._express

    @express.setter
    def express(self, express):
        """Sets the express of this WarehouseDTO.

        Возможна ли доставка по модели Экспресс.

        :param express: The express of this WarehouseDTO.
        :type express: bool
        """
        if express is None:
            raise ValueError("Invalid value for `express`, must not be `None`")

        self._express = express

    @property
    def address(self):
        """Gets the address of this WarehouseDTO.


        :return: The address of this WarehouseDTO.
        :rtype: WarehouseAddressDTO
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this WarehouseDTO.


        :param address: The address of this WarehouseDTO.
        :type address: WarehouseAddressDTO
        """

        self._address = address
