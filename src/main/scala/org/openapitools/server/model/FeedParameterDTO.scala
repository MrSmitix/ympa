package org.openapitools.server.model


/**
 * Параметр прайс-листа.
 *
 * @param deleted Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`.  for example: ''null''
 * @param name Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  for example: ''null''
 * @param values Значения параметра.  Используется вместе с параметром `name`.  for example: ''null''
*/
final case class FeedParameterDTO (
  deleted: Option[Boolean] = None,
  name: String,
  values: Option[Seq[Int]] = None
)

