# DeliveryServicesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDeliveryServices**](DeliveryServicesApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки |


## Creating DeliveryServicesApi

To initiate an instance of `DeliveryServicesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DeliveryServicesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DeliveryServicesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DeliveryServicesApi deliveryServicesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getDeliveryServices"></a>
# **getDeliveryServices**
```java
Mono<GetDeliveryServicesResponse> DeliveryServicesApi.getDeliveryServices()
```

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 



### Return type
[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

