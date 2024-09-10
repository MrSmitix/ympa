# ympa_r_client::QualityRatingDTO

Информация об индексе качества.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rating** | **integer** | Значение индекса качества. | [Max: 100] [Min: 0] 
**calculationDate** | **character** | Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  | 
**components** | [**array[QualityRatingComponentDTO]**](QualityRatingComponentDTO.md) | Составляющие индекса качества. | 


