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
from ympa_python_flask_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse  # noqa: E501
from ympa_python_flask_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest  # noqa: E501
from ympa_python_flask_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest  # noqa: E501
from ympa_python_flask_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse  # noqa: E501
from ympa_python_flask_server import util


def delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request):  # noqa: E501
    """Удаление комментария к отзыву

    Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param delete_goods_feedback_comment_request: 
    :type delete_goods_feedback_comment_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_goods_feedback_comment_request = DeleteGoodsFeedbackCommentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, page_token=None, limit=None):  # noqa: E501
    """Получение комментариев к отзыву

    Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_goods_feedback_comments_request: 
    :type get_goods_feedback_comments_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetGoodsFeedbackCommentsResponse, Tuple[GetGoodsFeedbackCommentsResponse, int], Tuple[GetGoodsFeedbackCommentsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_goods_feedback_comments_request = GetGoodsFeedbackCommentsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_goods_feedbacks(business_id, page_token=None, limit=None, get_goods_feedback_request=None):  # noqa: E501
    """Получение отзывов о товарах продавца

    Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_goods_feedback_request: 
    :type get_goods_feedback_request: dict | bytes

    :rtype: Union[GetGoodsFeedbackResponse, Tuple[GetGoodsFeedbackResponse, int], Tuple[GetGoodsFeedbackResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_goods_feedback_request = GetGoodsFeedbackRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request):  # noqa: E501
    """Отказ от ответа на отзывы

    Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param skip_goods_feedback_reaction_request: 
    :type skip_goods_feedback_reaction_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        skip_goods_feedback_reaction_request = SkipGoodsFeedbackReactionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_goods_feedback_comment(business_id, update_goods_feedback_comment_request):  # noqa: E501
    """Добавление нового или изменение созданного комментария

    Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_goods_feedback_comment_request: 
    :type update_goods_feedback_comment_request: dict | bytes

    :rtype: Union[UpdateGoodsFeedbackCommentResponse, Tuple[UpdateGoodsFeedbackCommentResponse, int], Tuple[UpdateGoodsFeedbackCommentResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_goods_feedback_comment_request = UpdateGoodsFeedbackCommentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'