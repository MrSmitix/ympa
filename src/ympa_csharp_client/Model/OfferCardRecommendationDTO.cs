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
    /// Рекомендация по заполнению карточки товара.
    /// </summary>
    [DataContract(Name = "OfferCardRecommendationDTO")]
    public partial class OfferCardRecommendationDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public OfferCardRecommendationType Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OfferCardRecommendationDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OfferCardRecommendationDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OfferCardRecommendationDTO" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="percent">Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов..</param>
        public OfferCardRecommendationDTO(OfferCardRecommendationType type = default(OfferCardRecommendationType), int percent = default(int))
        {
            this.Type = type;
            this.Percent = percent;
        }

        /// <summary>
        /// Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
        /// </summary>
        /// <value>Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.</value>
        [DataMember(Name = "percent", EmitDefaultValue = false)]
        public long Percent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OfferCardRecommendationDTO {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Percent: ").Append(Percent).Append("\n");
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
            // Percent (long) maximum
            if (this.Percent <= (long)100)
            {
                yield return new ValidationResult("Invalid value for Percent, must be a value less than 100.", new [] { "Percent" });
            }

            // Percent (long) minimum
            if (this.Percent >= (long)0)
            {
                yield return new ValidationResult("Invalid value for Percent, must be a value greater than or equal to 0.", new [] { "Percent" });
            }

            yield break;
        }
    }

}
