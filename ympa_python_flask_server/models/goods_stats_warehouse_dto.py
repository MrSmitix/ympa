from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.warehouse_stock_dto import WarehouseStockDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.warehouse_stock_dto import WarehouseStockDTO  # noqa: E501

class GoodsStatsWarehouseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, name=None, stocks=None):  # noqa: E501
        """GoodsStatsWarehouseDTO - a model defined in OpenAPI

        :param id: The id of this GoodsStatsWarehouseDTO.  # noqa: E501
        :type id: int
        :param name: The name of this GoodsStatsWarehouseDTO.  # noqa: E501
        :type name: str
        :param stocks: The stocks of this GoodsStatsWarehouseDTO.  # noqa: E501
        :type stocks: List[WarehouseStockDTO]
        """
        self.openapi_types = {
            'id': int,
            'name': str,
            'stocks': List[WarehouseStockDTO]
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'stocks': 'stocks'
        }

        self._id = id
        self._name = name
        self._stocks = stocks

    @classmethod
    def from_dict(cls, dikt) -> 'GoodsStatsWarehouseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GoodsStatsWarehouseDTO of this GoodsStatsWarehouseDTO.  # noqa: E501
        :rtype: GoodsStatsWarehouseDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this GoodsStatsWarehouseDTO.

        Идентификатор склада.  # noqa: E501

        :return: The id of this GoodsStatsWarehouseDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this GoodsStatsWarehouseDTO.

        Идентификатор склада.  # noqa: E501

        :param id: The id of this GoodsStatsWarehouseDTO.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this GoodsStatsWarehouseDTO.

        Название склада.  # noqa: E501

        :return: The name of this GoodsStatsWarehouseDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this GoodsStatsWarehouseDTO.

        Название склада.  # noqa: E501

        :param name: The name of this GoodsStatsWarehouseDTO.
        :type name: str
        """

        self._name = name

    @property
    def stocks(self) -> List[WarehouseStockDTO]:
        """Gets the stocks of this GoodsStatsWarehouseDTO.

        Информация об остатках товаров на складе.  # noqa: E501

        :return: The stocks of this GoodsStatsWarehouseDTO.
        :rtype: List[WarehouseStockDTO]
        """
        return self._stocks

    @stocks.setter
    def stocks(self, stocks: List[WarehouseStockDTO]):
        """Sets the stocks of this GoodsStatsWarehouseDTO.

        Информация об остатках товаров на складе.  # noqa: E501

        :param stocks: The stocks of this GoodsStatsWarehouseDTO.
        :type stocks: List[WarehouseStockDTO]
        """
        if stocks is None:
            raise ValueError("Invalid value for `stocks`, must not be `None`")  # noqa: E501

        self._stocks = stocks