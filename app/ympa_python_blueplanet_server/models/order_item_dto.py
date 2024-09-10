# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_item_detail_dto import OrderItemDetailDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_item_instance_dto import OrderItemInstanceDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_item_instance_type import OrderItemInstanceType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_item_promo_dto import OrderItemPromoDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_item_subsidy_dto import OrderItemSubsidyDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_vat_type import OrderVatType  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OrderItemDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, offer_id: str=None, offer_name: str=None, price: float=None, buyer_price: float=None, buyer_price_before_discount: float=None, price_before_discount: float=None, count: int=None, vat: OrderVatType=None, shop_sku: str=None, subsidy: float=None, partner_warehouse_id: str=None, promos: List[OrderItemPromoDTO]=None, instances: List[OrderItemInstanceDTO]=None, details: List[OrderItemDetailDTO]=None, subsidies: List[OrderItemSubsidyDTO]=None, required_instance_types: List[OrderItemInstanceType]=None):  # noqa: E501
        """OrderItemDTO - a model defined in Swagger

        :param id: The id of this OrderItemDTO.  # noqa: E501
        :type id: int
        :param offer_id: The offer_id of this OrderItemDTO.  # noqa: E501
        :type offer_id: str
        :param offer_name: The offer_name of this OrderItemDTO.  # noqa: E501
        :type offer_name: str
        :param price: The price of this OrderItemDTO.  # noqa: E501
        :type price: float
        :param buyer_price: The buyer_price of this OrderItemDTO.  # noqa: E501
        :type buyer_price: float
        :param buyer_price_before_discount: The buyer_price_before_discount of this OrderItemDTO.  # noqa: E501
        :type buyer_price_before_discount: float
        :param price_before_discount: The price_before_discount of this OrderItemDTO.  # noqa: E501
        :type price_before_discount: float
        :param count: The count of this OrderItemDTO.  # noqa: E501
        :type count: int
        :param vat: The vat of this OrderItemDTO.  # noqa: E501
        :type vat: OrderVatType
        :param shop_sku: The shop_sku of this OrderItemDTO.  # noqa: E501
        :type shop_sku: str
        :param subsidy: The subsidy of this OrderItemDTO.  # noqa: E501
        :type subsidy: float
        :param partner_warehouse_id: The partner_warehouse_id of this OrderItemDTO.  # noqa: E501
        :type partner_warehouse_id: str
        :param promos: The promos of this OrderItemDTO.  # noqa: E501
        :type promos: List[OrderItemPromoDTO]
        :param instances: The instances of this OrderItemDTO.  # noqa: E501
        :type instances: List[OrderItemInstanceDTO]
        :param details: The details of this OrderItemDTO.  # noqa: E501
        :type details: List[OrderItemDetailDTO]
        :param subsidies: The subsidies of this OrderItemDTO.  # noqa: E501
        :type subsidies: List[OrderItemSubsidyDTO]
        :param required_instance_types: The required_instance_types of this OrderItemDTO.  # noqa: E501
        :type required_instance_types: List[OrderItemInstanceType]
        """
        self.swagger_types = {
            'id': int,
            'offer_id': str,
            'offer_name': str,
            'price': float,
            'buyer_price': float,
            'buyer_price_before_discount': float,
            'price_before_discount': float,
            'count': int,
            'vat': OrderVatType,
            'shop_sku': str,
            'subsidy': float,
            'partner_warehouse_id': str,
            'promos': List[OrderItemPromoDTO],
            'instances': List[OrderItemInstanceDTO],
            'details': List[OrderItemDetailDTO],
            'subsidies': List[OrderItemSubsidyDTO],
            'required_instance_types': List[OrderItemInstanceType]
        }

        self.attribute_map = {
            'id': 'id',
            'offer_id': 'offerId',
            'offer_name': 'offerName',
            'price': 'price',
            'buyer_price': 'buyerPrice',
            'buyer_price_before_discount': 'buyerPriceBeforeDiscount',
            'price_before_discount': 'priceBeforeDiscount',
            'count': 'count',
            'vat': 'vat',
            'shop_sku': 'shopSku',
            'subsidy': 'subsidy',
            'partner_warehouse_id': 'partnerWarehouseId',
            'promos': 'promos',
            'instances': 'instances',
            'details': 'details',
            'subsidies': 'subsidies',
            'required_instance_types': 'requiredInstanceTypes'
        }

        self._id = id
        self._offer_id = offer_id
        self._offer_name = offer_name
        self._price = price
        self._buyer_price = buyer_price
        self._buyer_price_before_discount = buyer_price_before_discount
        self._price_before_discount = price_before_discount
        self._count = count
        self._vat = vat
        self._shop_sku = shop_sku
        self._subsidy = subsidy
        self._partner_warehouse_id = partner_warehouse_id
        self._promos = promos
        self._instances = instances
        self._details = details
        self._subsidies = subsidies
        self._required_instance_types = required_instance_types

    @classmethod
    def from_dict(cls, dikt) -> 'OrderItemDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderItemDTO of this OrderItemDTO.  # noqa: E501
        :rtype: OrderItemDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this OrderItemDTO.

        Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.   # noqa: E501

        :return: The id of this OrderItemDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this OrderItemDTO.

        Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.   # noqa: E501

        :param id: The id of this OrderItemDTO.
        :type id: int
        """

        self._id = id

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this OrderItemDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this OrderItemDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this OrderItemDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this OrderItemDTO.
        :type offer_id: str
        """
        if offer_id is not None and len(offer_id) > 255:
            raise ValueError("Invalid value for `offer_id`, length must be less than or equal to `255`")  # noqa: E501
        if offer_id is not None and len(offer_id) < 1:
            raise ValueError("Invalid value for `offer_id`, length must be greater than or equal to `1`")  # noqa: E501
        if offer_id is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', offer_id):  # noqa: E501
            raise ValueError("Invalid value for `offer_id`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")  # noqa: E501

        self._offer_id = offer_id

    @property
    def offer_name(self) -> str:
        """Gets the offer_name of this OrderItemDTO.

        Название товара.  # noqa: E501

        :return: The offer_name of this OrderItemDTO.
        :rtype: str
        """
        return self._offer_name

    @offer_name.setter
    def offer_name(self, offer_name: str):
        """Sets the offer_name of this OrderItemDTO.

        Название товара.  # noqa: E501

        :param offer_name: The offer_name of this OrderItemDTO.
        :type offer_name: str
        """

        self._offer_name = offer_name

    @property
    def price(self) -> float:
        """Gets the price of this OrderItemDTO.

        Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).   # noqa: E501

        :return: The price of this OrderItemDTO.
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price: float):
        """Sets the price of this OrderItemDTO.

        Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).   # noqa: E501

        :param price: The price of this OrderItemDTO.
        :type price: float
        """

        self._price = price

    @property
    def buyer_price(self) -> float:
        """Gets the buyer_price of this OrderItemDTO.

        Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.   # noqa: E501

        :return: The buyer_price of this OrderItemDTO.
        :rtype: float
        """
        return self._buyer_price

    @buyer_price.setter
    def buyer_price(self, buyer_price: float):
        """Sets the buyer_price of this OrderItemDTO.

        Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.   # noqa: E501

        :param buyer_price: The buyer_price of this OrderItemDTO.
        :type buyer_price: float
        """

        self._buyer_price = buyer_price

    @property
    def buyer_price_before_discount(self) -> float:
        """Gets the buyer_price_before_discount of this OrderItemDTO.

        Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.   # noqa: E501

        :return: The buyer_price_before_discount of this OrderItemDTO.
        :rtype: float
        """
        return self._buyer_price_before_discount

    @buyer_price_before_discount.setter
    def buyer_price_before_discount(self, buyer_price_before_discount: float):
        """Sets the buyer_price_before_discount of this OrderItemDTO.

        Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.   # noqa: E501

        :param buyer_price_before_discount: The buyer_price_before_discount of this OrderItemDTO.
        :type buyer_price_before_discount: float
        """

        self._buyer_price_before_discount = buyer_price_before_discount

    @property
    def price_before_discount(self) -> float:
        """Gets the price_before_discount of this OrderItemDTO.

        {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.   # noqa: E501

        :return: The price_before_discount of this OrderItemDTO.
        :rtype: float
        """
        return self._price_before_discount

    @price_before_discount.setter
    def price_before_discount(self, price_before_discount: float):
        """Sets the price_before_discount of this OrderItemDTO.

        {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.   # noqa: E501

        :param price_before_discount: The price_before_discount of this OrderItemDTO.
        :type price_before_discount: float
        """

        self._price_before_discount = price_before_discount

    @property
    def count(self) -> int:
        """Gets the count of this OrderItemDTO.

        Количество единиц товара.  # noqa: E501

        :return: The count of this OrderItemDTO.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count: int):
        """Sets the count of this OrderItemDTO.

        Количество единиц товара.  # noqa: E501

        :param count: The count of this OrderItemDTO.
        :type count: int
        """

        self._count = count

    @property
    def vat(self) -> OrderVatType:
        """Gets the vat of this OrderItemDTO.


        :return: The vat of this OrderItemDTO.
        :rtype: OrderVatType
        """
        return self._vat

    @vat.setter
    def vat(self, vat: OrderVatType):
        """Sets the vat of this OrderItemDTO.


        :param vat: The vat of this OrderItemDTO.
        :type vat: OrderVatType
        """

        self._vat = vat

    @property
    def shop_sku(self) -> str:
        """Gets the shop_sku of this OrderItemDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The shop_sku of this OrderItemDTO.
        :rtype: str
        """
        return self._shop_sku

    @shop_sku.setter
    def shop_sku(self, shop_sku: str):
        """Sets the shop_sku of this OrderItemDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param shop_sku: The shop_sku of this OrderItemDTO.
        :type shop_sku: str
        """
        if shop_sku is not None and len(shop_sku) > 255:
            raise ValueError("Invalid value for `shop_sku`, length must be less than or equal to `255`")  # noqa: E501
        if shop_sku is not None and len(shop_sku) < 1:
            raise ValueError("Invalid value for `shop_sku`, length must be greater than or equal to `1`")  # noqa: E501
        if shop_sku is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', shop_sku):  # noqa: E501
            raise ValueError("Invalid value for `shop_sku`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")  # noqa: E501

        self._shop_sku = shop_sku

    @property
    def subsidy(self) -> float:
        """Gets the subsidy of this OrderItemDTO.

        {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.   # noqa: E501

        :return: The subsidy of this OrderItemDTO.
        :rtype: float
        """
        return self._subsidy

    @subsidy.setter
    def subsidy(self, subsidy: float):
        """Sets the subsidy of this OrderItemDTO.

        {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.   # noqa: E501

        :param subsidy: The subsidy of this OrderItemDTO.
        :type subsidy: float
        """

        self._subsidy = subsidy

    @property
    def partner_warehouse_id(self) -> str:
        """Gets the partner_warehouse_id of this OrderItemDTO.

        {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.   # noqa: E501

        :return: The partner_warehouse_id of this OrderItemDTO.
        :rtype: str
        """
        return self._partner_warehouse_id

    @partner_warehouse_id.setter
    def partner_warehouse_id(self, partner_warehouse_id: str):
        """Sets the partner_warehouse_id of this OrderItemDTO.

        {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.   # noqa: E501

        :param partner_warehouse_id: The partner_warehouse_id of this OrderItemDTO.
        :type partner_warehouse_id: str
        """

        self._partner_warehouse_id = partner_warehouse_id

    @property
    def promos(self) -> List[OrderItemPromoDTO]:
        """Gets the promos of this OrderItemDTO.

        Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.  # noqa: E501

        :return: The promos of this OrderItemDTO.
        :rtype: List[OrderItemPromoDTO]
        """
        return self._promos

    @promos.setter
    def promos(self, promos: List[OrderItemPromoDTO]):
        """Sets the promos of this OrderItemDTO.

        Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.  # noqa: E501

        :param promos: The promos of this OrderItemDTO.
        :type promos: List[OrderItemPromoDTO]
        """

        self._promos = promos

    @property
    def instances(self) -> List[OrderItemInstanceDTO]:
        """Gets the instances of this OrderItemDTO.

        Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.   # noqa: E501

        :return: The instances of this OrderItemDTO.
        :rtype: List[OrderItemInstanceDTO]
        """
        return self._instances

    @instances.setter
    def instances(self, instances: List[OrderItemInstanceDTO]):
        """Sets the instances of this OrderItemDTO.

        Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.   # noqa: E501

        :param instances: The instances of this OrderItemDTO.
        :type instances: List[OrderItemInstanceDTO]
        """

        self._instances = instances

    @property
    def details(self) -> List[OrderItemDetailDTO]:
        """Gets the details of this OrderItemDTO.

        Информация об удалении товара из заказа.   # noqa: E501

        :return: The details of this OrderItemDTO.
        :rtype: List[OrderItemDetailDTO]
        """
        return self._details

    @details.setter
    def details(self, details: List[OrderItemDetailDTO]):
        """Sets the details of this OrderItemDTO.

        Информация об удалении товара из заказа.   # noqa: E501

        :param details: The details of this OrderItemDTO.
        :type details: List[OrderItemDetailDTO]
        """

        self._details = details

    @property
    def subsidies(self) -> List[OrderItemSubsidyDTO]:
        """Gets the subsidies of this OrderItemDTO.

        Список субсидий по типам.  # noqa: E501

        :return: The subsidies of this OrderItemDTO.
        :rtype: List[OrderItemSubsidyDTO]
        """
        return self._subsidies

    @subsidies.setter
    def subsidies(self, subsidies: List[OrderItemSubsidyDTO]):
        """Sets the subsidies of this OrderItemDTO.

        Список субсидий по типам.  # noqa: E501

        :param subsidies: The subsidies of this OrderItemDTO.
        :type subsidies: List[OrderItemSubsidyDTO]
        """

        self._subsidies = subsidies

    @property
    def required_instance_types(self) -> List[OrderItemInstanceType]:
        """Gets the required_instance_types of this OrderItemDTO.

        Список необходимых маркировок товара.  # noqa: E501

        :return: The required_instance_types of this OrderItemDTO.
        :rtype: List[OrderItemInstanceType]
        """
        return self._required_instance_types

    @required_instance_types.setter
    def required_instance_types(self, required_instance_types: List[OrderItemInstanceType]):
        """Sets the required_instance_types of this OrderItemDTO.

        Список необходимых маркировок товара.  # noqa: E501

        :param required_instance_types: The required_instance_types of this OrderItemDTO.
        :type required_instance_types: List[OrderItemInstanceType]
        """

        self._required_instance_types = required_instance_types
