goog.provide('API.Client.PromoParticipationType');

/**
 * Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 * @record
 */
API.Client.PromoParticipationType = function() {}

