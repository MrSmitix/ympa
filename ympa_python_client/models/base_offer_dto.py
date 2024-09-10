# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from ympa_python_client.models.age_dto import AgeDTO
from ympa_python_client.models.offer_condition_dto import OfferConditionDTO
from ympa_python_client.models.offer_manual_dto import OfferManualDTO
from ympa_python_client.models.offer_param_dto import OfferParamDTO
from ympa_python_client.models.offer_type import OfferType
from ympa_python_client.models.offer_weight_dimensions_dto import OfferWeightDimensionsDTO
from ympa_python_client.models.time_period_dto import TimePeriodDTO
from typing import Optional, Set
from typing_extensions import Self

class BaseOfferDTO(BaseModel):
    """
    Основные параметры товара.
    """ # noqa: E501
    offer_id: Annotated[str, Field(min_length=1, strict=True, max_length=255)] = Field(description="Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", alias="offerId")
    name: Optional[Annotated[str, Field(strict=True, max_length=256)]] = Field(default=None, description="Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
    market_category_id: Optional[StrictInt] = Field(default=None, description="Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ", alias="marketCategoryId")
    category: Optional[StrictStr] = Field(default=None, description="Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
    pictures: Optional[List[StrictStr]] = Field(default=None, description="Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ")
    videos: Optional[Annotated[List[StrictStr], Field(max_length=6)]] = Field(default=None, description="Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ")
    manuals: Optional[Annotated[List[OfferManualDTO], Field(max_length=6)]] = Field(default=None, description="Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. ")
    vendor: Optional[StrictStr] = Field(default=None, description="Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
    barcodes: Optional[List[StrictStr]] = Field(default=None, description="Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ")
    description: Optional[Annotated[str, Field(strict=True, max_length=6000)]] = Field(default=None, description="Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
    manufacturer_countries: Optional[List[StrictStr]] = Field(default=None, description="Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ", alias="manufacturerCountries")
    weight_dimensions: Optional[OfferWeightDimensionsDTO] = Field(default=None, alias="weightDimensions")
    vendor_code: Optional[StrictStr] = Field(default=None, description="Артикул товара от производителя.", alias="vendorCode")
    tags: Optional[List[StrictStr]] = Field(default=None, description="Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. ")
    shelf_life: Optional[TimePeriodDTO] = Field(default=None, alias="shelfLife")
    life_time: Optional[TimePeriodDTO] = Field(default=None, alias="lifeTime")
    guarantee_period: Optional[TimePeriodDTO] = Field(default=None, alias="guaranteePeriod")
    customs_commodity_code: Optional[StrictStr] = Field(default=None, description="Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ", alias="customsCommodityCode")
    certificates: Optional[List[StrictStr]] = Field(default=None, description="Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). ")
    box_count: Optional[StrictInt] = Field(default=None, description="Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. ", alias="boxCount")
    condition: Optional[OfferConditionDTO] = None
    type: Optional[OfferType] = None
    downloadable: Optional[StrictBool] = Field(default=None, description="Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ")
    adult: Optional[StrictBool] = Field(default=None, description="Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. ")
    age: Optional[AgeDTO] = None
    params: Optional[List[OfferParamDTO]] = Field(default=None, description="{% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. ")
    __properties: ClassVar[List[str]] = ["offerId", "name", "marketCategoryId", "category", "pictures", "videos", "manuals", "vendor", "barcodes", "description", "manufacturerCountries", "weightDimensions", "vendorCode", "tags", "shelfLife", "lifeTime", "guaranteePeriod", "customsCommodityCode", "certificates", "boxCount", "condition", "type", "downloadable", "adult", "age", "params"]

    @field_validator('offer_id')
    def offer_id_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if not re.match(r"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$", value):
            raise ValueError(r"must validate the regular expression /^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of BaseOfferDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in manuals (list)
        _items = []
        if self.manuals:
            for _item_manuals in self.manuals:
                if _item_manuals:
                    _items.append(_item_manuals.to_dict())
            _dict['manuals'] = _items
        # override the default output from pydantic by calling `to_dict()` of weight_dimensions
        if self.weight_dimensions:
            _dict['weightDimensions'] = self.weight_dimensions.to_dict()
        # override the default output from pydantic by calling `to_dict()` of shelf_life
        if self.shelf_life:
            _dict['shelfLife'] = self.shelf_life.to_dict()
        # override the default output from pydantic by calling `to_dict()` of life_time
        if self.life_time:
            _dict['lifeTime'] = self.life_time.to_dict()
        # override the default output from pydantic by calling `to_dict()` of guarantee_period
        if self.guarantee_period:
            _dict['guaranteePeriod'] = self.guarantee_period.to_dict()
        # override the default output from pydantic by calling `to_dict()` of condition
        if self.condition:
            _dict['condition'] = self.condition.to_dict()
        # override the default output from pydantic by calling `to_dict()` of age
        if self.age:
            _dict['age'] = self.age.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in params (list)
        _items = []
        if self.params:
            for _item_params in self.params:
                if _item_params:
                    _items.append(_item_params.to_dict())
            _dict['params'] = _items
        # set to None if pictures (nullable) is None
        # and model_fields_set contains the field
        if self.pictures is None and "pictures" in self.model_fields_set:
            _dict['pictures'] = None

        # set to None if videos (nullable) is None
        # and model_fields_set contains the field
        if self.videos is None and "videos" in self.model_fields_set:
            _dict['videos'] = None

        # set to None if manuals (nullable) is None
        # and model_fields_set contains the field
        if self.manuals is None and "manuals" in self.model_fields_set:
            _dict['manuals'] = None

        # set to None if barcodes (nullable) is None
        # and model_fields_set contains the field
        if self.barcodes is None and "barcodes" in self.model_fields_set:
            _dict['barcodes'] = None

        # set to None if manufacturer_countries (nullable) is None
        # and model_fields_set contains the field
        if self.manufacturer_countries is None and "manufacturer_countries" in self.model_fields_set:
            _dict['manufacturerCountries'] = None

        # set to None if tags (nullable) is None
        # and model_fields_set contains the field
        if self.tags is None and "tags" in self.model_fields_set:
            _dict['tags'] = None

        # set to None if certificates (nullable) is None
        # and model_fields_set contains the field
        if self.certificates is None and "certificates" in self.model_fields_set:
            _dict['certificates'] = None

        # set to None if params (nullable) is None
        # and model_fields_set contains the field
        if self.params is None and "params" in self.model_fields_set:
            _dict['params'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of BaseOfferDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "offerId": obj.get("offerId"),
            "name": obj.get("name"),
            "marketCategoryId": obj.get("marketCategoryId"),
            "category": obj.get("category"),
            "pictures": obj.get("pictures"),
            "videos": obj.get("videos"),
            "manuals": [OfferManualDTO.from_dict(_item) for _item in obj["manuals"]] if obj.get("manuals") is not None else None,
            "vendor": obj.get("vendor"),
            "barcodes": obj.get("barcodes"),
            "description": obj.get("description"),
            "manufacturerCountries": obj.get("manufacturerCountries"),
            "weightDimensions": OfferWeightDimensionsDTO.from_dict(obj["weightDimensions"]) if obj.get("weightDimensions") is not None else None,
            "vendorCode": obj.get("vendorCode"),
            "tags": obj.get("tags"),
            "shelfLife": TimePeriodDTO.from_dict(obj["shelfLife"]) if obj.get("shelfLife") is not None else None,
            "lifeTime": TimePeriodDTO.from_dict(obj["lifeTime"]) if obj.get("lifeTime") is not None else None,
            "guaranteePeriod": TimePeriodDTO.from_dict(obj["guaranteePeriod"]) if obj.get("guaranteePeriod") is not None else None,
            "customsCommodityCode": obj.get("customsCommodityCode"),
            "certificates": obj.get("certificates"),
            "boxCount": obj.get("boxCount"),
            "condition": OfferConditionDTO.from_dict(obj["condition"]) if obj.get("condition") is not None else None,
            "type": obj.get("type"),
            "downloadable": obj.get("downloadable"),
            "adult": obj.get("adult"),
            "age": AgeDTO.from_dict(obj["age"]) if obj.get("age") is not None else None,
            "params": [OfferParamDTO.from_dict(_item) for _item in obj["params"]] if obj.get("params") is not None else None
        })
        return _obj


