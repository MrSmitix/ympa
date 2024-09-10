# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GenerateGoodsMovementReportRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, campaign_id: int=None, date_from: date=None, date_to: date=None, shop_sku: str=None):  # noqa: E501
        """GenerateGoodsMovementReportRequest - a model defined in Swagger

        :param campaign_id: The campaign_id of this GenerateGoodsMovementReportRequest.  # noqa: E501
        :type campaign_id: int
        :param date_from: The date_from of this GenerateGoodsMovementReportRequest.  # noqa: E501
        :type date_from: date
        :param date_to: The date_to of this GenerateGoodsMovementReportRequest.  # noqa: E501
        :type date_to: date
        :param shop_sku: The shop_sku of this GenerateGoodsMovementReportRequest.  # noqa: E501
        :type shop_sku: str
        """
        self.swagger_types = {
            'campaign_id': int,
            'date_from': date,
            'date_to': date,
            'shop_sku': str
        }

        self.attribute_map = {
            'campaign_id': 'campaignId',
            'date_from': 'dateFrom',
            'date_to': 'dateTo',
            'shop_sku': 'shopSku'
        }

        self._campaign_id = campaign_id
        self._date_from = date_from
        self._date_to = date_to
        self._shop_sku = shop_sku

    @classmethod
    def from_dict(cls, dikt) -> 'GenerateGoodsMovementReportRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GenerateGoodsMovementReportRequest of this GenerateGoodsMovementReportRequest.  # noqa: E501
        :rtype: GenerateGoodsMovementReportRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def campaign_id(self) -> int:
        """Gets the campaign_id of this GenerateGoodsMovementReportRequest.

        Идентификатор кампании.  # noqa: E501

        :return: The campaign_id of this GenerateGoodsMovementReportRequest.
        :rtype: int
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id: int):
        """Sets the campaign_id of this GenerateGoodsMovementReportRequest.

        Идентификатор кампании.  # noqa: E501

        :param campaign_id: The campaign_id of this GenerateGoodsMovementReportRequest.
        :type campaign_id: int
        """
        if campaign_id is None:
            raise ValueError("Invalid value for `campaign_id`, must not be `None`")  # noqa: E501

        self._campaign_id = campaign_id

    @property
    def date_from(self) -> date:
        """Gets the date_from of this GenerateGoodsMovementReportRequest.

        Начало периода, включительно.  # noqa: E501

        :return: The date_from of this GenerateGoodsMovementReportRequest.
        :rtype: date
        """
        return self._date_from

    @date_from.setter
    def date_from(self, date_from: date):
        """Sets the date_from of this GenerateGoodsMovementReportRequest.

        Начало периода, включительно.  # noqa: E501

        :param date_from: The date_from of this GenerateGoodsMovementReportRequest.
        :type date_from: date
        """
        if date_from is None:
            raise ValueError("Invalid value for `date_from`, must not be `None`")  # noqa: E501

        self._date_from = date_from

    @property
    def date_to(self) -> date:
        """Gets the date_to of this GenerateGoodsMovementReportRequest.

        Конец периода, включительно.  # noqa: E501

        :return: The date_to of this GenerateGoodsMovementReportRequest.
        :rtype: date
        """
        return self._date_to

    @date_to.setter
    def date_to(self, date_to: date):
        """Sets the date_to of this GenerateGoodsMovementReportRequest.

        Конец периода, включительно.  # noqa: E501

        :param date_to: The date_to of this GenerateGoodsMovementReportRequest.
        :type date_to: date
        """
        if date_to is None:
            raise ValueError("Invalid value for `date_to`, must not be `None`")  # noqa: E501

        self._date_to = date_to

    @property
    def shop_sku(self) -> str:
        """Gets the shop_sku of this GenerateGoodsMovementReportRequest.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The shop_sku of this GenerateGoodsMovementReportRequest.
        :rtype: str
        """
        return self._shop_sku

    @shop_sku.setter
    def shop_sku(self, shop_sku: str):
        """Sets the shop_sku of this GenerateGoodsMovementReportRequest.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param shop_sku: The shop_sku of this GenerateGoodsMovementReportRequest.
        :type shop_sku: str
        """
        if shop_sku is not None and len(shop_sku) > 255:
            raise ValueError("Invalid value for `shop_sku`, length must be less than or equal to `255`")  # noqa: E501
        if shop_sku is not None and len(shop_sku) < 1:
            raise ValueError("Invalid value for `shop_sku`, length must be greater than or equal to `1`")  # noqa: E501
        if shop_sku is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', shop_sku):  # noqa: E501
            raise ValueError("Invalid value for `shop_sku`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")  # noqa: E501

        self._shop_sku = shop_sku
