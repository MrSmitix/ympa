# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.offer_price_dto import OfferPriceDTO
from ympa_python_aiohttp_server import util


class UpdatePricesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offers: List[OfferPriceDTO]=None):
        """UpdatePricesRequest - a model defined in OpenAPI

        :param offers: The offers of this UpdatePricesRequest.
        """
        self.openapi_types = {
            'offers': List[OfferPriceDTO]
        }

        self.attribute_map = {
            'offers': 'offers'
        }

        self._offers = offers

    @classmethod
    def from_dict(cls, dikt: dict) -> 'UpdatePricesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The UpdatePricesRequest of this UpdatePricesRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offers(self):
        """Gets the offers of this UpdatePricesRequest.

        Список товаров.

        :return: The offers of this UpdatePricesRequest.
        :rtype: List[OfferPriceDTO]
        """
        return self._offers

    @offers.setter
    def offers(self, offers):
        """Sets the offers of this UpdatePricesRequest.

        Список товаров.

        :param offers: The offers of this UpdatePricesRequest.
        :type offers: List[OfferPriceDTO]
        """
        if offers is None:
            raise ValueError("Invalid value for `offers`, must not be `None`")
        if offers is not None and len(offers) > 2000:
            raise ValueError("Invalid value for `offers`, number of items must be less than or equal to `2000`")
        if offers is not None and len(offers) < 1:
            raise ValueError("Invalid value for `offers`, number of items must be greater than or equal to `1`")

        self._offers = offers
