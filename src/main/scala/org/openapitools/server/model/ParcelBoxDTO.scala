package org.openapitools.server.model


/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 *
 * @param id {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  for example: ''null''
 * @param fulfilmentId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  for example: ''null''
*/
final case class ParcelBoxDTO (
  id: Option[Long] = None,
  fulfilmentId: Option[String] = None
)

