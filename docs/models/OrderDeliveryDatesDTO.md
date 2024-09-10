

# OrderDeliveryDatesDTO

Диапазон дат доставки.

The class is defined in **[OrderDeliveryDatesDTO.java](../../src/main/java/org/openapitools/model/OrderDeliveryDatesDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | `String` | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional property]
**toDate** | `String` | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional property]
**fromTime** | `String` | Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;.  |  [optional property]
**toTime** | `String` | Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;.  |  [optional property]
**realDeliveryDate** | `String` | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional property]







