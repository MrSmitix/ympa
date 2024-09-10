package model

import play.api.libs.json._

/**
  * Параметр прайс-листа.
  * @param deleted Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
  * @param name Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
  * @param values Значения параметра.  Используется вместе с параметром `name`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedParameterDTO(
  deleted: Option[Boolean],
  name: String,
  values: Option[List[Int]]
)

object FeedParameterDTO {
  implicit lazy val feedParameterDTOJsonFormat: Format[FeedParameterDTO] = Json.format[FeedParameterDTO]
}

