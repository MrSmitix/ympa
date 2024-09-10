package org.openapitools.server.model


/**
 * Ответ на запрос списка логинов, связанных с магазином.
 *
 * @param logins Список логинов. for example: ''null''
*/
final case class GetCampaignLoginsResponse (
  logins: Seq[String]
)

