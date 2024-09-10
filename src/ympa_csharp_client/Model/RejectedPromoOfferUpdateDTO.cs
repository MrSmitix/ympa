/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ympa_csharp_client.Client.OpenAPIDateConverter;

namespace ympa_csharp_client.Model
{
    /// <summary>
    /// Описание отклоненного изменения.
    /// </summary>
    [DataContract(Name = "RejectedPromoOfferUpdateDTO")]
    public partial class RejectedPromoOfferUpdateDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Reason
        /// </summary>
        [DataMember(Name = "reason", IsRequired = true, EmitDefaultValue = true)]
        public RejectedPromoOfferUpdateReasonType Reason { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RejectedPromoOfferUpdateDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RejectedPromoOfferUpdateDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RejectedPromoOfferUpdateDTO" /> class.
        /// </summary>
        /// <param name="offerId">Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  (required).</param>
        /// <param name="reason">reason (required).</param>
        public RejectedPromoOfferUpdateDTO(string offerId = default(string), RejectedPromoOfferUpdateReasonType reason = default(RejectedPromoOfferUpdateReasonType))
        {
            // to ensure "offerId" is required (not null)
            if (offerId == null)
            {
                throw new ArgumentNullException("offerId is a required property for RejectedPromoOfferUpdateDTO and cannot be null");
            }
            this.OfferId = offerId;
            this.Reason = reason;
        }

        /// <summary>
        /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
        /// </summary>
        /// <value>Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) </value>
        [DataMember(Name = "offerId", IsRequired = true, EmitDefaultValue = true)]
        public string OfferId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RejectedPromoOfferUpdateDTO {\n");
            sb.Append("  OfferId: ").Append(OfferId).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // OfferId (string) maxLength
            if (this.OfferId != null && this.OfferId.Length > 255)
            {
                yield return new ValidationResult("Invalid value for OfferId, length must be less than 255.", new [] { "OfferId" });
            }

            // OfferId (string) minLength
            if (this.OfferId != null && this.OfferId.Length < 1)
            {
                yield return new ValidationResult("Invalid value for OfferId, length must be greater than 1.", new [] { "OfferId" });
            }

            if (this.OfferId != null) {
                // OfferId (string) pattern
                Regex regexOfferId = new Regex(@"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$", RegexOptions.CultureInvariant);
                if (!regexOfferId.Match(this.OfferId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for OfferId, must match a pattern of " + regexOfferId, new [] { "OfferId" });
                }
            }

            yield break;
        }
    }

}
