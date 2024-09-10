# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.model_offer_dto import ModelOfferDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.model_price_dto import ModelPriceDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class EnrichedModelDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None, prices: ModelPriceDTO=None, offers: List[ModelOfferDTO]=None, offline_offers: int=None, online_offers: int=None):  # noqa: E501
        """EnrichedModelDTO - a model defined in Swagger

        :param id: The id of this EnrichedModelDTO.  # noqa: E501
        :type id: int
        :param name: The name of this EnrichedModelDTO.  # noqa: E501
        :type name: str
        :param prices: The prices of this EnrichedModelDTO.  # noqa: E501
        :type prices: ModelPriceDTO
        :param offers: The offers of this EnrichedModelDTO.  # noqa: E501
        :type offers: List[ModelOfferDTO]
        :param offline_offers: The offline_offers of this EnrichedModelDTO.  # noqa: E501
        :type offline_offers: int
        :param online_offers: The online_offers of this EnrichedModelDTO.  # noqa: E501
        :type online_offers: int
        """
        self.swagger_types = {
            'id': int,
            'name': str,
            'prices': ModelPriceDTO,
            'offers': List[ModelOfferDTO],
            'offline_offers': int,
            'online_offers': int
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'prices': 'prices',
            'offers': 'offers',
            'offline_offers': 'offlineOffers',
            'online_offers': 'onlineOffers'
        }

        self._id = id
        self._name = name
        self._prices = prices
        self._offers = offers
        self._offline_offers = offline_offers
        self._online_offers = online_offers

    @classmethod
    def from_dict(cls, dikt) -> 'EnrichedModelDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnrichedModelDTO of this EnrichedModelDTO.  # noqa: E501
        :rtype: EnrichedModelDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this EnrichedModelDTO.

        Идентификатор модели товара.  # noqa: E501

        :return: The id of this EnrichedModelDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this EnrichedModelDTO.

        Идентификатор модели товара.  # noqa: E501

        :param id: The id of this EnrichedModelDTO.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this EnrichedModelDTO.

        Название модели товара.  # noqa: E501

        :return: The name of this EnrichedModelDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this EnrichedModelDTO.

        Название модели товара.  # noqa: E501

        :param name: The name of this EnrichedModelDTO.
        :type name: str
        """

        self._name = name

    @property
    def prices(self) -> ModelPriceDTO:
        """Gets the prices of this EnrichedModelDTO.


        :return: The prices of this EnrichedModelDTO.
        :rtype: ModelPriceDTO
        """
        return self._prices

    @prices.setter
    def prices(self, prices: ModelPriceDTO):
        """Sets the prices of this EnrichedModelDTO.


        :param prices: The prices of this EnrichedModelDTO.
        :type prices: ModelPriceDTO
        """

        self._prices = prices

    @property
    def offers(self) -> List[ModelOfferDTO]:
        """Gets the offers of this EnrichedModelDTO.

        Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.   # noqa: E501

        :return: The offers of this EnrichedModelDTO.
        :rtype: List[ModelOfferDTO]
        """
        return self._offers

    @offers.setter
    def offers(self, offers: List[ModelOfferDTO]):
        """Sets the offers of this EnrichedModelDTO.

        Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.   # noqa: E501

        :param offers: The offers of this EnrichedModelDTO.
        :type offers: List[ModelOfferDTO]
        """

        self._offers = offers

    @property
    def offline_offers(self) -> int:
        """Gets the offline_offers of this EnrichedModelDTO.

        Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.  # noqa: E501

        :return: The offline_offers of this EnrichedModelDTO.
        :rtype: int
        """
        return self._offline_offers

    @offline_offers.setter
    def offline_offers(self, offline_offers: int):
        """Sets the offline_offers of this EnrichedModelDTO.

        Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.  # noqa: E501

        :param offline_offers: The offline_offers of this EnrichedModelDTO.
        :type offline_offers: int
        """

        self._offline_offers = offline_offers

    @property
    def online_offers(self) -> int:
        """Gets the online_offers of this EnrichedModelDTO.

        Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.  # noqa: E501

        :return: The online_offers of this EnrichedModelDTO.
        :rtype: int
        """
        return self._online_offers

    @online_offers.setter
    def online_offers(self, online_offers: int):
        """Sets the online_offers of this EnrichedModelDTO.

        Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.  # noqa: E501

        :param online_offers: The online_offers of this EnrichedModelDTO.
        :type online_offers: int
        """

        self._online_offers = online_offers
