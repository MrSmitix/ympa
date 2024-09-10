import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.delete_promo_offers_request import DeletePromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.delete_promo_offers_response import DeletePromoOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_promo_offers_request import GetPromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.get_promo_offers_response import GetPromoOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_promos_request import GetPromosRequest  # noqa: E501
from ympa_python_flask_server.models.get_promos_response import GetPromosResponse  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_request import UpdatePromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_response import UpdatePromoOffersResponse  # noqa: E501
from ympa_python_flask_server import util


def delete_promo_offers(business_id, delete_promo_offers_request):  # noqa: E501
    """Удаление товаров из акции

    Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param delete_promo_offers_request: 
    :type delete_promo_offers_request: dict | bytes

    :rtype: Union[DeletePromoOffersResponse, Tuple[DeletePromoOffersResponse, int], Tuple[DeletePromoOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_promo_offers_request = DeletePromoOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_promo_offers(business_id, get_promo_offers_request, page_token=None, limit=None):  # noqa: E501
    """Получение списка товаров, которые участвуют или могут участвовать в акции

    Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_promo_offers_request: 
    :type get_promo_offers_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetPromoOffersResponse, Tuple[GetPromoOffersResponse, int], Tuple[GetPromoOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_promo_offers_request = GetPromoOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_promos(business_id, get_promos_request=None):  # noqa: E501
    """Получение списка акций

    Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_promos_request: 
    :type get_promos_request: dict | bytes

    :rtype: Union[GetPromosResponse, Tuple[GetPromosResponse, int], Tuple[GetPromosResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_promos_request = GetPromosRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_promo_offers(business_id, update_promo_offers_request):  # noqa: E501
    """Добавление товаров в акцию или изменение их цен

    Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_promo_offers_request: 
    :type update_promo_offers_request: dict | bytes

    :rtype: Union[UpdatePromoOffersResponse, Tuple[UpdatePromoOffersResponse, int], Tuple[UpdatePromoOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_promo_offers_request = UpdatePromoOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
