
package org.openapitools.client.model


case class EacVerificationResultDTO (
    _verificationResult: Option[EacVerificationStatusType],
    /* Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  */
    _attemptsLeft: Option[Integer]
)
object EacVerificationResultDTO {
    def toStringBody(var_verificationResult: Object, var_attemptsLeft: Object) =
        s"""
        | {
        | "verificationResult":$var_verificationResult,"attemptsLeft":$var_attemptsLeft
        | }
        """.stripMargin
}
