# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.update_promo_offer_params_dto import UpdatePromoOfferParamsDTO  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdatePromoOfferDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, params: UpdatePromoOfferParamsDTO=None):  # noqa: E501
        """UpdatePromoOfferDTO - a model defined in Swagger

        :param offer_id: The offer_id of this UpdatePromoOfferDTO.  # noqa: E501
        :type offer_id: str
        :param params: The params of this UpdatePromoOfferDTO.  # noqa: E501
        :type params: UpdatePromoOfferParamsDTO
        """
        self.swagger_types = {
            'offer_id': str,
            'params': UpdatePromoOfferParamsDTO
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'params': 'params'
        }

        self._offer_id = offer_id
        self._params = params

    @classmethod
    def from_dict(cls, dikt) -> 'UpdatePromoOfferDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdatePromoOfferDTO of this UpdatePromoOfferDTO.  # noqa: E501
        :rtype: UpdatePromoOfferDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this UpdatePromoOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this UpdatePromoOfferDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this UpdatePromoOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this UpdatePromoOfferDTO.
        :type offer_id: str
        """
        if offer_id is None:
            raise ValueError("Invalid value for `offer_id`, must not be `None`")  # noqa: E501
        if offer_id is not None and len(offer_id) > 255:
            raise ValueError("Invalid value for `offer_id`, length must be less than or equal to `255`")  # noqa: E501
        if offer_id is not None and len(offer_id) < 1:
            raise ValueError("Invalid value for `offer_id`, length must be greater than or equal to `1`")  # noqa: E501
        if offer_id is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', offer_id):  # noqa: E501
            raise ValueError("Invalid value for `offer_id`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")  # noqa: E501

        self._offer_id = offer_id

    @property
    def params(self) -> UpdatePromoOfferParamsDTO:
        """Gets the params of this UpdatePromoOfferDTO.


        :return: The params of this UpdatePromoOfferDTO.
        :rtype: UpdatePromoOfferParamsDTO
        """
        return self._params

    @params.setter
    def params(self, params: UpdatePromoOfferParamsDTO):
        """Sets the params of this UpdatePromoOfferDTO.


        :param params: The params of this UpdatePromoOfferDTO.
        :type params: UpdatePromoOfferParamsDTO
        """

        self._params = params
