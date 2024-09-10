# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.parameter_value_dto import ParameterValueDTO  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OfferContentDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, category_id: int=None, parameter_values: List[ParameterValueDTO]=None):  # noqa: E501
        """OfferContentDTO - a model defined in Swagger

        :param offer_id: The offer_id of this OfferContentDTO.  # noqa: E501
        :type offer_id: str
        :param category_id: The category_id of this OfferContentDTO.  # noqa: E501
        :type category_id: int
        :param parameter_values: The parameter_values of this OfferContentDTO.  # noqa: E501
        :type parameter_values: List[ParameterValueDTO]
        """
        self.swagger_types = {
            'offer_id': str,
            'category_id': int,
            'parameter_values': List[ParameterValueDTO]
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'category_id': 'categoryId',
            'parameter_values': 'parameterValues'
        }

        self._offer_id = offer_id
        self._category_id = category_id
        self._parameter_values = parameter_values

    @classmethod
    def from_dict(cls, dikt) -> 'OfferContentDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferContentDTO of this OfferContentDTO.  # noqa: E501
        :rtype: OfferContentDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this OfferContentDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this OfferContentDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this OfferContentDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this OfferContentDTO.
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
    def category_id(self) -> int:
        """Gets the category_id of this OfferContentDTO.

        Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  # noqa: E501

        :return: The category_id of this OfferContentDTO.
        :rtype: int
        """
        return self._category_id

    @category_id.setter
    def category_id(self, category_id: int):
        """Sets the category_id of this OfferContentDTO.

        Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  # noqa: E501

        :param category_id: The category_id of this OfferContentDTO.
        :type category_id: int
        """
        if category_id is None:
            raise ValueError("Invalid value for `category_id`, must not be `None`")  # noqa: E501

        self._category_id = category_id

    @property
    def parameter_values(self) -> List[ParameterValueDTO]:
        """Gets the parameter_values of this OfferContentDTO.

        Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300.   # noqa: E501

        :return: The parameter_values of this OfferContentDTO.
        :rtype: List[ParameterValueDTO]
        """
        return self._parameter_values

    @parameter_values.setter
    def parameter_values(self, parameter_values: List[ParameterValueDTO]):
        """Sets the parameter_values of this OfferContentDTO.

        Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300.   # noqa: E501

        :param parameter_values: The parameter_values of this OfferContentDTO.
        :type parameter_values: List[ParameterValueDTO]
        """
        if parameter_values is None:
            raise ValueError("Invalid value for `parameter_values`, must not be `None`")  # noqa: E501
        if parameter_values is not None and len(parameter_values) > 300:
            raise ValueError("Invalid value for `parameter_values`, number of items must be less than or equal to `300`")  # noqa: E501
        if parameter_values is not None and len(parameter_values) < 1:
            raise ValueError("Invalid value for `parameter_values`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._parameter_values = parameter_values