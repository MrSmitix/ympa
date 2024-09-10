package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация об акции «Бестселлеры Маркета».
 *
 * @param bestseller Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). for example: ''null''
 * @param entryDeadline До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  for example: ''null''
*/
final case class GetPromoBestsellerInfoDTO (
  bestseller: Boolean,
  entryDeadline: Option[OffsetDateTime] = None
)

