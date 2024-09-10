from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.get_mapping_dto import GetMappingDTO
from ympa_python_flask_server.models.offer_card_recommendation_dto import OfferCardRecommendationDTO
from ympa_python_flask_server.models.offer_card_status_type import OfferCardStatusType
from ympa_python_flask_server.models.offer_error_dto import OfferErrorDTO
from ympa_python_flask_server.models.parameter_value_dto import ParameterValueDTO
import re
from ympa_python_flask_server import util

from ympa_python_flask_server.models.get_mapping_dto import GetMappingDTO  # noqa: E501
from ympa_python_flask_server.models.offer_card_recommendation_dto import OfferCardRecommendationDTO  # noqa: E501
from ympa_python_flask_server.models.offer_card_status_type import OfferCardStatusType  # noqa: E501
from ympa_python_flask_server.models.offer_error_dto import OfferErrorDTO  # noqa: E501
from ympa_python_flask_server.models.parameter_value_dto import ParameterValueDTO  # noqa: E501
import re  # noqa: E501

class OfferCardDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_id=None, mapping=None, parameter_values=None, card_status=None, content_rating=None, recommendations=None, errors=None, warnings=None):  # noqa: E501
        """OfferCardDTO - a model defined in OpenAPI

        :param offer_id: The offer_id of this OfferCardDTO.  # noqa: E501
        :type offer_id: str
        :param mapping: The mapping of this OfferCardDTO.  # noqa: E501
        :type mapping: GetMappingDTO
        :param parameter_values: The parameter_values of this OfferCardDTO.  # noqa: E501
        :type parameter_values: List[ParameterValueDTO]
        :param card_status: The card_status of this OfferCardDTO.  # noqa: E501
        :type card_status: OfferCardStatusType
        :param content_rating: The content_rating of this OfferCardDTO.  # noqa: E501
        :type content_rating: int
        :param recommendations: The recommendations of this OfferCardDTO.  # noqa: E501
        :type recommendations: List[OfferCardRecommendationDTO]
        :param errors: The errors of this OfferCardDTO.  # noqa: E501
        :type errors: List[OfferErrorDTO]
        :param warnings: The warnings of this OfferCardDTO.  # noqa: E501
        :type warnings: List[OfferErrorDTO]
        """
        self.openapi_types = {
            'offer_id': str,
            'mapping': GetMappingDTO,
            'parameter_values': List[ParameterValueDTO],
            'card_status': OfferCardStatusType,
            'content_rating': int,
            'recommendations': List[OfferCardRecommendationDTO],
            'errors': List[OfferErrorDTO],
            'warnings': List[OfferErrorDTO]
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'mapping': 'mapping',
            'parameter_values': 'parameterValues',
            'card_status': 'cardStatus',
            'content_rating': 'contentRating',
            'recommendations': 'recommendations',
            'errors': 'errors',
            'warnings': 'warnings'
        }

        self._offer_id = offer_id
        self._mapping = mapping
        self._parameter_values = parameter_values
        self._card_status = card_status
        self._content_rating = content_rating
        self._recommendations = recommendations
        self._errors = errors
        self._warnings = warnings

    @classmethod
    def from_dict(cls, dikt) -> 'OfferCardDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferCardDTO of this OfferCardDTO.  # noqa: E501
        :rtype: OfferCardDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this OfferCardDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this OfferCardDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this OfferCardDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this OfferCardDTO.
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
    def mapping(self) -> GetMappingDTO:
        """Gets the mapping of this OfferCardDTO.


        :return: The mapping of this OfferCardDTO.
        :rtype: GetMappingDTO
        """
        return self._mapping

    @mapping.setter
    def mapping(self, mapping: GetMappingDTO):
        """Sets the mapping of this OfferCardDTO.


        :param mapping: The mapping of this OfferCardDTO.
        :type mapping: GetMappingDTO
        """

        self._mapping = mapping

    @property
    def parameter_values(self) -> List[ParameterValueDTO]:
        """Gets the parameter_values of this OfferCardDTO.

        Список характеристик с их значениями.   # noqa: E501

        :return: The parameter_values of this OfferCardDTO.
        :rtype: List[ParameterValueDTO]
        """
        return self._parameter_values

    @parameter_values.setter
    def parameter_values(self, parameter_values: List[ParameterValueDTO]):
        """Sets the parameter_values of this OfferCardDTO.

        Список характеристик с их значениями.   # noqa: E501

        :param parameter_values: The parameter_values of this OfferCardDTO.
        :type parameter_values: List[ParameterValueDTO]
        """

        self._parameter_values = parameter_values

    @property
    def card_status(self) -> OfferCardStatusType:
        """Gets the card_status of this OfferCardDTO.


        :return: The card_status of this OfferCardDTO.
        :rtype: OfferCardStatusType
        """
        return self._card_status

    @card_status.setter
    def card_status(self, card_status: OfferCardStatusType):
        """Sets the card_status of this OfferCardDTO.


        :param card_status: The card_status of this OfferCardDTO.
        :type card_status: OfferCardStatusType
        """

        self._card_status = card_status

    @property
    def content_rating(self) -> int:
        """Gets the content_rating of this OfferCardDTO.

        Процент заполненности карточки.  # noqa: E501

        :return: The content_rating of this OfferCardDTO.
        :rtype: int
        """
        return self._content_rating

    @content_rating.setter
    def content_rating(self, content_rating: int):
        """Sets the content_rating of this OfferCardDTO.

        Процент заполненности карточки.  # noqa: E501

        :param content_rating: The content_rating of this OfferCardDTO.
        :type content_rating: int
        """

        self._content_rating = content_rating

    @property
    def recommendations(self) -> List[OfferCardRecommendationDTO]:
        """Gets the recommendations of this OfferCardDTO.

        Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.   # noqa: E501

        :return: The recommendations of this OfferCardDTO.
        :rtype: List[OfferCardRecommendationDTO]
        """
        return self._recommendations

    @recommendations.setter
    def recommendations(self, recommendations: List[OfferCardRecommendationDTO]):
        """Sets the recommendations of this OfferCardDTO.

        Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.   # noqa: E501

        :param recommendations: The recommendations of this OfferCardDTO.
        :type recommendations: List[OfferCardRecommendationDTO]
        """

        self._recommendations = recommendations

    @property
    def errors(self) -> List[OfferErrorDTO]:
        """Gets the errors of this OfferCardDTO.

        Ошибки в контенте, препятствующие размещению товара на витрине.  # noqa: E501

        :return: The errors of this OfferCardDTO.
        :rtype: List[OfferErrorDTO]
        """
        return self._errors

    @errors.setter
    def errors(self, errors: List[OfferErrorDTO]):
        """Sets the errors of this OfferCardDTO.

        Ошибки в контенте, препятствующие размещению товара на витрине.  # noqa: E501

        :param errors: The errors of this OfferCardDTO.
        :type errors: List[OfferErrorDTO]
        """

        self._errors = errors

    @property
    def warnings(self) -> List[OfferErrorDTO]:
        """Gets the warnings of this OfferCardDTO.

        Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.  # noqa: E501

        :return: The warnings of this OfferCardDTO.
        :rtype: List[OfferErrorDTO]
        """
        return self._warnings

    @warnings.setter
    def warnings(self, warnings: List[OfferErrorDTO]):
        """Sets the warnings of this OfferCardDTO.

        Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.  # noqa: E501

        :param warnings: The warnings of this OfferCardDTO.
        :type warnings: List[OfferErrorDTO]
        """

        self._warnings = warnings