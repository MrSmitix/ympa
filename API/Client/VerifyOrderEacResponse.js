goog.provide('API.Client.VerifyOrderEacResponse');

/**
 * @record
 */
API.Client.VerifyOrderEacResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.VerifyOrderEacResponse.prototype.status;

/**
 * @type {!API.Client.EacVerificationResultDTO}
 * @export
 */
API.Client.VerifyOrderEacResponse.prototype.result;

