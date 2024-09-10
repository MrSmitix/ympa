goog.provide('API.Client.ReportSubStatusType');

/**
 * Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
 * @record
 */
API.Client.ReportSubStatusType = function() {}

