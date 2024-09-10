# BusinessesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBusinessSettings**](BusinessesApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |


## Creating BusinessesApi

To initiate an instance of `BusinessesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BusinessesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BusinessesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BusinessesApi businessesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getBusinessSettings"></a>
# **getBusinessSettings**
```java
Mono<GetBusinessSettingsResponse> BusinessesApi.getBusinessSettings(businessId)
```

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

