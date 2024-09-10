# CampaignsController

All URIs are relative to `""`

The controller class is defined in **[CampaignsController.java](../../src/main/java/org/openapitools/controller/CampaignsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaign**](#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
[**getCampaignLogins**](#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**getCampaignRegion**](#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
[**getCampaignSettings**](#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
[**getCampaigns**](#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
[**getCampaignsByLogin**](#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину

<a id="getCampaign"></a>
# **getCampaign**
```java
Mono<GetCampaignResponse> CampaignsController.getCampaign(campaignId)
```

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |

### Return type
[**GetCampaignResponse**](../../docs/models/GetCampaignResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getCampaignLogins"></a>
# **getCampaignLogins**
```java
Mono<GetCampaignLoginsResponse> CampaignsController.getCampaignLogins(campaignId)
```

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |

### Return type
[**GetCampaignLoginsResponse**](../../docs/models/GetCampaignLoginsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getCampaignRegion"></a>
# **getCampaignRegion**
```java
Mono<GetCampaignRegionResponse> CampaignsController.getCampaignRegion(campaignId)
```

Регион магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |

### Return type
[**GetCampaignRegionResponse**](../../docs/models/GetCampaignRegionResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getCampaignSettings"></a>
# **getCampaignSettings**
```java
Mono<GetCampaignSettingsResponse> CampaignsController.getCampaignSettings(campaignId)
```

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |

### Return type
[**GetCampaignSettingsResponse**](../../docs/models/GetCampaignSettingsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getCampaigns"></a>
# **getCampaigns**
```java
Mono<GetCampaignsResponse> CampaignsController.getCampaigns(pagepageSize)
```

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**page** | `Integer` | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`]
**pageSize** | `Integer` | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter]

### Return type
[**GetCampaignsResponse**](../../docs/models/GetCampaignsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getCampaignsByLogin"></a>
# **getCampaignsByLogin**
```java
Mono<GetCampaignsResponse> CampaignsController.getCampaignsByLogin(loginpagepageSize)
```

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**login** | `String` | Логин пользователя. |
**page** | `Integer` | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`]
**pageSize** | `Integer` | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter]

### Return type
[**GetCampaignsResponse**](../../docs/models/GetCampaignsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

