# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.currency_type import CurrencyType
from ympa_python_fastapi_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest
from ympa_python_fastapi_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_all_offers_response import GetAllOffersResponse
from ympa_python_fastapi_server.models.get_campaign_offers_request import GetCampaignOffersRequest
from ympa_python_fastapi_server.models.get_campaign_offers_response import GetCampaignOffersResponse
from ympa_python_fastapi_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest
from ympa_python_fastapi_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse
from ympa_python_fastapi_server.models.get_offers_response import GetOffersResponse
from ympa_python_fastapi_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseOffersApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseOffersApi.subclasses = BaseOffersApi.subclasses + (cls,)
    async def delete_campaign_offers(
        self,
        campaignId: int,
        delete_campaign_offers_request: DeleteCampaignOffersRequest,
    ) -> DeleteCampaignOffersResponse:
        """Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def get_all_offers(
        self,
        campaignId: int,
        feed_id: int,
        chunk: int,
    ) -> GetAllOffersResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) """
        ...


    async def get_campaign_offers(
        self,
        campaignId: int,
        get_campaign_offers_request: GetCampaignOffersRequest,
        page_token: str,
        limit: int,
    ) -> GetCampaignOffersResponse:
        """Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def get_offer_recommendations(
        self,
        businessId: int,
        get_offer_recommendations_request: GetOfferRecommendationsRequest,
        page_token: str,
        limit: int,
    ) -> GetOfferRecommendationsResponse:
        """Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
        ...


    async def get_offers(
        self,
        campaignId: int,
        query: str,
        feed_id: int,
        shop_category_id: str,
        currency: ,
        matched: bool,
        page: int,
        page_size: int,
    ) -> GetOffersResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) """
        ...


    async def update_campaign_offers(
        self,
        campaignId: int,
        update_campaign_offers_request: UpdateCampaignOffersRequest,
    ) -> EmptyApiResponse:
        """Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...
