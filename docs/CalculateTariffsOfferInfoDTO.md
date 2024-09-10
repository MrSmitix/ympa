
# Table `CalculateTariffsOfferInfoDTO`
(mapped from: CalculateTariffsOfferInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offer** | offer | long NOT NULL |  | [**CalculateTariffsOfferDTO**](CalculateTariffsOfferDTO.md) |  |  [foreignkey]
**tariffs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CalculatedTariffDTO&gt;**](CalculatedTariffDTO.md) | Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | 



# **Table `CalculateTariffsOfferInfoDTOCalculatedTariffDTO`**
(mapped from: CalculateTariffsOfferInfoDTOCalculatedTariffDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
calculateTariffsOfferInfoDTO | calculateTariffsOfferInfoDTO | long | | kotlin.Long | Primary Key | *one*
calculatedTariffDTO | calculatedTariffDTO | long | | kotlin.Long | Foreign Key | *many*



