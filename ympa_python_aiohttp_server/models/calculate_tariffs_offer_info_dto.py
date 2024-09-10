# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.calculate_tariffs_offer_dto import CalculateTariffsOfferDTO
from ympa_python_aiohttp_server.models.calculated_tariff_dto import CalculatedTariffDTO
from ympa_python_aiohttp_server import util


class CalculateTariffsOfferInfoDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer: CalculateTariffsOfferDTO=None, tariffs: List[CalculatedTariffDTO]=None):
        """CalculateTariffsOfferInfoDTO - a model defined in OpenAPI

        :param offer: The offer of this CalculateTariffsOfferInfoDTO.
        :param tariffs: The tariffs of this CalculateTariffsOfferInfoDTO.
        """
        self.openapi_types = {
            'offer': CalculateTariffsOfferDTO,
            'tariffs': List[CalculatedTariffDTO]
        }

        self.attribute_map = {
            'offer': 'offer',
            'tariffs': 'tariffs'
        }

        self._offer = offer
        self._tariffs = tariffs

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CalculateTariffsOfferInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CalculateTariffsOfferInfoDTO of this CalculateTariffsOfferInfoDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer(self):
        """Gets the offer of this CalculateTariffsOfferInfoDTO.


        :return: The offer of this CalculateTariffsOfferInfoDTO.
        :rtype: CalculateTariffsOfferDTO
        """
        return self._offer

    @offer.setter
    def offer(self, offer):
        """Sets the offer of this CalculateTariffsOfferInfoDTO.


        :param offer: The offer of this CalculateTariffsOfferInfoDTO.
        :type offer: CalculateTariffsOfferDTO
        """
        if offer is None:
            raise ValueError("Invalid value for `offer`, must not be `None`")

        self._offer = offer

    @property
    def tariffs(self):
        """Gets the tariffs of this CalculateTariffsOfferInfoDTO.

        Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 

        :return: The tariffs of this CalculateTariffsOfferInfoDTO.
        :rtype: List[CalculatedTariffDTO]
        """
        return self._tariffs

    @tariffs.setter
    def tariffs(self, tariffs):
        """Sets the tariffs of this CalculateTariffsOfferInfoDTO.

        Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 

        :param tariffs: The tariffs of this CalculateTariffsOfferInfoDTO.
        :type tariffs: List[CalculatedTariffDTO]
        """
        if tariffs is None:
            raise ValueError("Invalid value for `tariffs`, must not be `None`")

        self._tariffs = tariffs
