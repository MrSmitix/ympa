from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.goods_stats_goods_dto import GoodsStatsGoodsDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.goods_stats_goods_dto import GoodsStatsGoodsDTO  # noqa: E501

class GoodsStatsDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, shop_skus=None):  # noqa: E501
        """GoodsStatsDTO - a model defined in OpenAPI

        :param shop_skus: The shop_skus of this GoodsStatsDTO.  # noqa: E501
        :type shop_skus: List[GoodsStatsGoodsDTO]
        """
        self.openapi_types = {
            'shop_skus': List[GoodsStatsGoodsDTO]
        }

        self.attribute_map = {
            'shop_skus': 'shopSkus'
        }

        self._shop_skus = shop_skus

    @classmethod
    def from_dict(cls, dikt) -> 'GoodsStatsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GoodsStatsDTO of this GoodsStatsDTO.  # noqa: E501
        :rtype: GoodsStatsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def shop_skus(self) -> List[GoodsStatsGoodsDTO]:
        """Gets the shop_skus of this GoodsStatsDTO.

        Список товаров.  # noqa: E501

        :return: The shop_skus of this GoodsStatsDTO.
        :rtype: List[GoodsStatsGoodsDTO]
        """
        return self._shop_skus

    @shop_skus.setter
    def shop_skus(self, shop_skus: List[GoodsStatsGoodsDTO]):
        """Sets the shop_skus of this GoodsStatsDTO.

        Список товаров.  # noqa: E501

        :param shop_skus: The shop_skus of this GoodsStatsDTO.
        :type shop_skus: List[GoodsStatsGoodsDTO]
        """
        if shop_skus is None:
            raise ValueError("Invalid value for `shop_skus`, must not be `None`")  # noqa: E501

        self._shop_skus = shop_skus
