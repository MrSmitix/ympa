
# Table `QualityRatingDTO`
(mapped from: QualityRatingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rating** | rating | long UNSIGNED NOT NULL |  | **kotlin.Long** | Значение индекса качества. | 
**calculationDate** | calculationDate | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  | 
**components** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QualityRatingComponentDTO&gt;**](QualityRatingComponentDTO.md) | Составляющие индекса качества. | 




# **Table `QualityRatingDTOQualityRatingComponentDTO`**
(mapped from: QualityRatingDTOQualityRatingComponentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
qualityRatingDTO | qualityRatingDTO | long | | kotlin.Long | Primary Key | *one*
qualityRatingComponentDTO | qualityRatingComponentDTO | long | | kotlin.Long | Foreign Key | *many*



