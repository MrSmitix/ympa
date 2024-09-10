from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PromoOfferDiscountParamsDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, price=None, promo_price=None, max_promo_price=None):  # noqa: E501
        """PromoOfferDiscountParamsDTO - a model defined in OpenAPI

        :param price: The price of this PromoOfferDiscountParamsDTO.  # noqa: E501
        :type price: int
        :param promo_price: The promo_price of this PromoOfferDiscountParamsDTO.  # noqa: E501
        :type promo_price: int
        :param max_promo_price: The max_promo_price of this PromoOfferDiscountParamsDTO.  # noqa: E501
        :type max_promo_price: int
        """
        self.openapi_types = {
            'price': int,
            'promo_price': int,
            'max_promo_price': int
        }

        self.attribute_map = {
            'price': 'price',
            'promo_price': 'promoPrice',
            'max_promo_price': 'maxPromoPrice'
        }

        self._price = price
        self._promo_price = promo_price
        self._max_promo_price = max_promo_price

    @classmethod
    def from_dict(cls, dikt) -> 'PromoOfferDiscountParamsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PromoOfferDiscountParamsDTO of this PromoOfferDiscountParamsDTO.  # noqa: E501
        :rtype: PromoOfferDiscountParamsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def price(self) -> int:
        """Gets the price of this PromoOfferDiscountParamsDTO.

        Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.   # noqa: E501

        :return: The price of this PromoOfferDiscountParamsDTO.
        :rtype: int
        """
        return self._price

    @price.setter
    def price(self, price: int):
        """Sets the price of this PromoOfferDiscountParamsDTO.

        Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.   # noqa: E501

        :param price: The price of this PromoOfferDiscountParamsDTO.
        :type price: int
        """

        self._price = price

    @property
    def promo_price(self) -> int:
        """Gets the promo_price of this PromoOfferDiscountParamsDTO.

        Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.   # noqa: E501

        :return: The promo_price of this PromoOfferDiscountParamsDTO.
        :rtype: int
        """
        return self._promo_price

    @promo_price.setter
    def promo_price(self, promo_price: int):
        """Sets the promo_price of this PromoOfferDiscountParamsDTO.

        Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.   # noqa: E501

        :param promo_price: The promo_price of this PromoOfferDiscountParamsDTO.
        :type promo_price: int
        """

        self._promo_price = promo_price

    @property
    def max_promo_price(self) -> int:
        """Gets the max_promo_price of this PromoOfferDiscountParamsDTO.

        Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.   # noqa: E501

        :return: The max_promo_price of this PromoOfferDiscountParamsDTO.
        :rtype: int
        """
        return self._max_promo_price

    @max_promo_price.setter
    def max_promo_price(self, max_promo_price: int):
        """Sets the max_promo_price of this PromoOfferDiscountParamsDTO.

        Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.   # noqa: E501

        :param max_promo_price: The max_promo_price of this PromoOfferDiscountParamsDTO.
        :type max_promo_price: int
        """
        if max_promo_price is None:
            raise ValueError("Invalid value for `max_promo_price`, must not be `None`")  # noqa: E501

        self._max_promo_price = max_promo_price
