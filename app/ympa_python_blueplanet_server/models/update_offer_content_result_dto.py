# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.offer_content_error_dto import OfferContentErrorDTO  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdateOfferContentResultDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, errors: List[OfferContentErrorDTO]=None, warnings: List[OfferContentErrorDTO]=None):  # noqa: E501
        """UpdateOfferContentResultDTO - a model defined in Swagger

        :param offer_id: The offer_id of this UpdateOfferContentResultDTO.  # noqa: E501
        :type offer_id: str
        :param errors: The errors of this UpdateOfferContentResultDTO.  # noqa: E501
        :type errors: List[OfferContentErrorDTO]
        :param warnings: The warnings of this UpdateOfferContentResultDTO.  # noqa: E501
        :type warnings: List[OfferContentErrorDTO]
        """
        self.swagger_types = {
            'offer_id': str,
            'errors': List[OfferContentErrorDTO],
            'warnings': List[OfferContentErrorDTO]
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'errors': 'errors',
            'warnings': 'warnings'
        }

        self._offer_id = offer_id
        self._errors = errors
        self._warnings = warnings

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOfferContentResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOfferContentResultDTO of this UpdateOfferContentResultDTO.  # noqa: E501
        :rtype: UpdateOfferContentResultDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this UpdateOfferContentResultDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this UpdateOfferContentResultDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this UpdateOfferContentResultDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this UpdateOfferContentResultDTO.
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
    def errors(self) -> List[OfferContentErrorDTO]:
        """Gets the errors of this UpdateOfferContentResultDTO.

        Ошибки — информация в каталоге не обновится.  # noqa: E501

        :return: The errors of this UpdateOfferContentResultDTO.
        :rtype: List[OfferContentErrorDTO]
        """
        return self._errors

    @errors.setter
    def errors(self, errors: List[OfferContentErrorDTO]):
        """Sets the errors of this UpdateOfferContentResultDTO.

        Ошибки — информация в каталоге не обновится.  # noqa: E501

        :param errors: The errors of this UpdateOfferContentResultDTO.
        :type errors: List[OfferContentErrorDTO]
        """

        self._errors = errors

    @property
    def warnings(self) -> List[OfferContentErrorDTO]:
        """Gets the warnings of this UpdateOfferContentResultDTO.

        Предупреждения — информация в каталоге обновится.  # noqa: E501

        :return: The warnings of this UpdateOfferContentResultDTO.
        :rtype: List[OfferContentErrorDTO]
        """
        return self._warnings

    @warnings.setter
    def warnings(self, warnings: List[OfferContentErrorDTO]):
        """Sets the warnings of this UpdateOfferContentResultDTO.

        Предупреждения — информация в каталоге обновится.  # noqa: E501

        :param warnings: The warnings of this UpdateOfferContentResultDTO.
        :type warnings: List[OfferContentErrorDTO]
        """

        self._warnings = warnings
