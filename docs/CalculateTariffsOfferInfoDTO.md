
# CalculateTariffsOfferInfoDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **offer** | [**CalculateTariffsOfferDTO**](CalculateTariffsOfferDTO.md) |  |  |
| **tariffs** | [**kotlin.collections.List&lt;CalculatedTariffDTO&gt;**](CalculatedTariffDTO.md) | Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  |  |



