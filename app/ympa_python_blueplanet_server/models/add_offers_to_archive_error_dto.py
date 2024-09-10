# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.add_offers_to_archive_error_type import AddOffersToArchiveErrorType  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class AddOffersToArchiveErrorDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, error: AddOffersToArchiveErrorType=None):  # noqa: E501
        """AddOffersToArchiveErrorDTO - a model defined in Swagger

        :param offer_id: The offer_id of this AddOffersToArchiveErrorDTO.  # noqa: E501
        :type offer_id: str
        :param error: The error of this AddOffersToArchiveErrorDTO.  # noqa: E501
        :type error: AddOffersToArchiveErrorType
        """
        self.swagger_types = {
            'offer_id': str,
            'error': AddOffersToArchiveErrorType
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'error': 'error'
        }

        self._offer_id = offer_id
        self._error = error

    @classmethod
    def from_dict(cls, dikt) -> 'AddOffersToArchiveErrorDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AddOffersToArchiveErrorDTO of this AddOffersToArchiveErrorDTO.  # noqa: E501
        :rtype: AddOffersToArchiveErrorDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this AddOffersToArchiveErrorDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this AddOffersToArchiveErrorDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this AddOffersToArchiveErrorDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this AddOffersToArchiveErrorDTO.
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
    def error(self) -> AddOffersToArchiveErrorType:
        """Gets the error of this AddOffersToArchiveErrorDTO.


        :return: The error of this AddOffersToArchiveErrorDTO.
        :rtype: AddOffersToArchiveErrorType
        """
        return self._error

    @error.setter
    def error(self, error: AddOffersToArchiveErrorType):
        """Sets the error of this AddOffersToArchiveErrorDTO.


        :param error: The error of this AddOffersToArchiveErrorDTO.
        :type error: AddOffersToArchiveErrorType
        """
        if error is None:
            raise ValueError("Invalid value for `error`, must not be `None`")  # noqa: E501

        self._error = error
