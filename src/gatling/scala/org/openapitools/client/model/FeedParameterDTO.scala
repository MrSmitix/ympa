
package org.openapitools.client.model


case class FeedParameterDTO (
    /* Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`.  */
    _deleted: Option[Boolean],
    /* Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  */
    _name: String,
    /* Значения параметра.  Используется вместе с параметром `name`.  */
    _values: Option[List[Integer]]
)
object FeedParameterDTO {
    def toStringBody(var_deleted: Object, var_name: Object, var_values: Object) =
        s"""
        | {
        | "deleted":$var_deleted,"name":$var_name,"values":$var_values
        | }
        """.stripMargin
}
