# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest
from ympa_python_fastapi_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse
from ympa_python_fastapi_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest
from ympa_python_fastapi_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse
from ympa_python_fastapi_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest
from ympa_python_fastapi_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest
from ympa_python_fastapi_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseGoodsFeedbackApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGoodsFeedbackApi.subclasses = BaseGoodsFeedbackApi.subclasses + (cls,)
    async def delete_goods_feedback_comment(
        self,
        businessId: int,
        delete_goods_feedback_comment_request: DeleteGoodsFeedbackCommentRequest,
    ) -> EmptyApiResponse:
        """Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_goods_feedback_comments(
        self,
        businessId: int,
        get_goods_feedback_comments_request: GetGoodsFeedbackCommentsRequest,
        page_token: str,
        limit: int,
    ) -> GetGoodsFeedbackCommentsResponse:
        """Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_goods_feedbacks(
        self,
        businessId: int,
        page_token: str,
        limit: int,
        get_goods_feedback_request: GetGoodsFeedbackRequest,
    ) -> GetGoodsFeedbackResponse:
        """Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def skip_goods_feedbacks_reaction(
        self,
        businessId: int,
        skip_goods_feedback_reaction_request: SkipGoodsFeedbackReactionRequest,
    ) -> EmptyApiResponse:
        """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def update_goods_feedback_comment(
        self,
        businessId: int,
        update_goods_feedback_comment_request: UpdateGoodsFeedbackCommentRequest,
    ) -> UpdateGoodsFeedbackCommentResponse:
        """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...
