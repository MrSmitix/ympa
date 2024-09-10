import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse  # noqa: E501
from ympa_python_flask_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest  # noqa: E501
from ympa_python_flask_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse  # noqa: E501
from ympa_python_flask_server.models.update_offer_content_request import UpdateOfferContentRequest  # noqa: E501
from ympa_python_flask_server.models.update_offer_content_response import UpdateOfferContentResponse  # noqa: E501
from ympa_python_flask_server import util


def get_category_content_parameters(category_id):  # noqa: E501
    """Списки характеристик товаров по категориям

    Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-|  # noqa: E501

    :param category_id: Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    :type category_id: int

    :rtype: Union[GetCategoryContentParametersResponse, Tuple[GetCategoryContentParametersResponse, int], Tuple[GetCategoryContentParametersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_cards_content_status(business_id, page_token=None, limit=None, get_offer_cards_content_status_request=None):  # noqa: E501
    """Получение информации о заполненности карточек магазина

    Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_offer_cards_content_status_request: 
    :type get_offer_cards_content_status_request: dict | bytes

    :rtype: Union[GetOfferCardsContentStatusResponse, Tuple[GetOfferCardsContentStatusResponse, int], Tuple[GetOfferCardsContentStatusResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_offer_cards_content_status_request = GetOfferCardsContentStatusRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_offer_content(business_id, update_offer_content_request):  # noqa: E501
    """Редактирование категорийных характеристик товара

    Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_offer_content_request: 
    :type update_offer_content_request: dict | bytes

    :rtype: Union[UpdateOfferContentResponse, Tuple[UpdateOfferContentResponse, int], Tuple[UpdateOfferContentResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_offer_content_request = UpdateOfferContentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
