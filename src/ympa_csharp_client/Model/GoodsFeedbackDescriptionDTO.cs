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
    /// Текстовая часть отзыва.
    /// </summary>
    [DataContract(Name = "GoodsFeedbackDescriptionDTO")]
    public partial class GoodsFeedbackDescriptionDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GoodsFeedbackDescriptionDTO" /> class.
        /// </summary>
        /// <param name="advantages">Описание плюсов товара в отзыве..</param>
        /// <param name="disadvantages">Описание минусов товара в отзыве..</param>
        /// <param name="comment">Комментарий в отзыве..</param>
        public GoodsFeedbackDescriptionDTO(string advantages = default(string), string disadvantages = default(string), string comment = default(string))
        {
            this.Advantages = advantages;
            this.Disadvantages = disadvantages;
            this.Comment = comment;
        }

        /// <summary>
        /// Описание плюсов товара в отзыве.
        /// </summary>
        /// <value>Описание плюсов товара в отзыве.</value>
        [DataMember(Name = "advantages", EmitDefaultValue = false)]
        public string Advantages { get; set; }

        /// <summary>
        /// Описание минусов товара в отзыве.
        /// </summary>
        /// <value>Описание минусов товара в отзыве.</value>
        [DataMember(Name = "disadvantages", EmitDefaultValue = false)]
        public string Disadvantages { get; set; }

        /// <summary>
        /// Комментарий в отзыве.
        /// </summary>
        /// <value>Комментарий в отзыве.</value>
        [DataMember(Name = "comment", EmitDefaultValue = false)]
        public string Comment { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GoodsFeedbackDescriptionDTO {\n");
            sb.Append("  Advantages: ").Append(Advantages).Append("\n");
            sb.Append("  Disadvantages: ").Append(Disadvantages).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
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
            yield break;
        }
    }

}
