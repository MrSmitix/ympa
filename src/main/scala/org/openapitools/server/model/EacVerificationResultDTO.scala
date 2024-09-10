package org.openapitools.server.model


/**
 * Результат выполнения запроса.
 *
 * @param verificationResult  for example: ''null''
 * @param attemptsLeft Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  for example: ''null''
*/
final case class EacVerificationResultDTO (
  verificationResult: Option[EacVerificationStatusType] = None,
  attemptsLeft: Option[Int] = None
)

