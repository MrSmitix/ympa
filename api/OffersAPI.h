#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_locked_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/currency_type.h"
#include "../model/delete_campaign_offers_request.h"
#include "../model/delete_campaign_offers_response.h"
#include "../model/empty_api_response.h"
#include "../model/get_all_offers_response.h"
#include "../model/get_campaign_offers_request.h"
#include "../model/get_campaign_offers_response.h"
#include "../model/get_offer_recommendations_request.h"
#include "../model/get_offer_recommendations_response.h"
#include "../model/get_offers_response.h"
#include "../model/update_campaign_offers_request.h"

// Enum  for OffersAPI_getOffers
typedef enum  { _api__getOffers__NULL = 0, _api__getOffers__RUR, _api__getOffers__USD, _api__getOffers__EUR, _api__getOffers__UAH, _api__getOffers__AUD, _api__getOffers__GBP, _api__getOffers__BYR, _api__getOffers__BYN, _api__getOffers__DKK, _api__getOffers__ISK, _api__getOffers__KZT, _api__getOffers__CAD, _api__getOffers__CNY, _api__getOffers__NOK, _api__getOffers__XDR, _api__getOffers__SGD, _api__getOffers___TRY, _api__getOffers__SEK, _api__getOffers__CHF, _api__getOffers__JPY, _api__getOffers__AZN, _api__getOffers__ALL, _api__getOffers__DZD, _api__getOffers__AOA, _api__getOffers__ARS, _api__getOffers__AMD, _api__getOffers__AFN, _api__getOffers__BHD, _api__getOffers__BGN, _api__getOffers__BOB, _api__getOffers__BWP, _api__getOffers__BND, _api__getOffers__BRL, _api__getOffers__BIF, _api__getOffers__HUF, _api__getOffers__VEF, _api__getOffers__KPW, _api__getOffers__VND, _api__getOffers__GMD, _api__getOffers__GHS, _api__getOffers__GNF, _api__getOffers__HKD, _api__getOffers__GEL, _api__getOffers__AED, _api__getOffers__EGP, _api__getOffers__ZMK, _api__getOffers__ILS, _api__getOffers__INR, _api__getOffers__IDR, _api__getOffers__JOD, _api__getOffers__IQD, _api__getOffers__IRR, _api__getOffers__YER, _api__getOffers__QAR, _api__getOffers__KES, _api__getOffers__KGS, _api__getOffers__COP, _api__getOffers__CDF, _api__getOffers__CRC, _api__getOffers__KWD, _api__getOffers__CUP, _api__getOffers__LAK, _api__getOffers__LVL, _api__getOffers__SLL, _api__getOffers__LBP, _api__getOffers__LYD, _api__getOffers__SZL, _api__getOffers__LTL, _api__getOffers__MUR, _api__getOffers__MRO, _api__getOffers__MKD, _api__getOffers__MWK, _api__getOffers__MGA, _api__getOffers__MYR, _api__getOffers__MAD, _api__getOffers__MXN, _api__getOffers__MZN, _api__getOffers__MDL, _api__getOffers__MNT, _api__getOffers__NPR, _api__getOffers__NGN, _api__getOffers__NIO, _api__getOffers__NZD, _api__getOffers__OMR, _api__getOffers__PKR, _api__getOffers__PYG, _api__getOffers__PEN, _api__getOffers__PLN, _api__getOffers__KHR, _api__getOffers__SAR, _api__getOffers__RON, _api__getOffers__SCR, _api__getOffers__SYP, _api__getOffers__SKK, _api__getOffers__SOS, _api__getOffers__SDG, _api__getOffers__SRD, _api__getOffers__TJS, _api__getOffers__THB, _api__getOffers__TWD, _api__getOffers__BDT, _api__getOffers__TZS, _api__getOffers__TND, _api__getOffers__TMM, _api__getOffers__UGX, _api__getOffers__UZS, _api__getOffers__UYU, _api__getOffers__PHP, _api__getOffers__DJF, _api__getOffers__XAF, _api__getOffers__XOF, _api__getOffers__HRK, _api__getOffers__CZK, _api__getOffers__CLP, _api__getOffers__LKR, _api__getOffers__EEK, _api__getOffers__ETB, _api__getOffers__RSD, _api__getOffers__ZAR, _api__getOffers__KRW, _api__getOffers__NAD, _api__getOffers__TL, _api__getOffers__UE } _api__getOffers_currency_e;


// Удаление товаров из ассортимента магазина
//
// Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
delete_campaign_offers_response_t*
OffersAPI_deleteCampaignOffers(apiClient_t *apiClient, long campaignId, delete_campaign_offers_request_t *delete_campaign_offers_request);


// Все предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_all_offers_response_t*
OffersAPI_getAllOffers(apiClient_t *apiClient, long campaignId, long feedId, int *chunk);


// Информация о товарах, которые размещены в заданном магазине
//
// Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_campaign_offers_response_t*
OffersAPI_getCampaignOffers(apiClient_t *apiClient, long campaignId, get_campaign_offers_request_t *get_campaign_offers_request, char *page_token, int *limit);


// Рекомендации Маркета, касающиеся цен
//
// Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_offer_recommendations_response_t*
OffersAPI_getOfferRecommendations(apiClient_t *apiClient, long businessId, get_offer_recommendations_request_t *get_offer_recommendations_request, char *page_token, int *limit);


// Предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_offers_response_t*
OffersAPI_getOffers(apiClient_t *apiClient, long campaignId, char *query, long feedId, char *shopCategoryId, currency_type_e currency, int *matched, int *page, int *pageSize);


// Изменение условий продажи товаров в магазине
//
// Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
OffersAPI_updateCampaignOffers(apiClient_t *apiClient, long campaignId, update_campaign_offers_request_t *update_campaign_offers_request);


