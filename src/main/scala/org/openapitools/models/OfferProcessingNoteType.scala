package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип причины, по которой товар не прошел модерацию:  * `ASSORTMENT` — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр `offer-mapping-entry` запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * `CANCELLED` — товар отозван с модерации по вашей инициативе. * `CONFLICTING_INFORMATION` _(ранее ошибочно `CONFLICTING`)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре `payload`. * `DEPARTMENT_FROZEN` — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * `INCORRECT_INFORMATION` — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре `payload`. * `LEGAL_CONFLICT` — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * `NEED_CLASSIFICATION_INFORMATION` — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * `NEED_INFORMATION` — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * `NEED_PICTURES` — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * `NEED_VENDOR` — неверно указан производитель товара. * `NO_CATEGORY`, `NO_KNOWLEDGE` — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * `NO_PARAMETERS_IN_SHOP_TITLE` — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре `payload`. * `NO_SIZE_MEASURE` — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре `payload`. * `UNKNOWN` — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру. 
 */
case class OfferProcessingNoteType()

object OfferProcessingNoteType {
    /**
     * Creates the codec for converting OfferProcessingNoteType from and to JSON.
     */
    implicit val decoder: Decoder[OfferProcessingNoteType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferProcessingNoteType] = deriveEncoder
}