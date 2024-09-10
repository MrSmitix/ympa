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
    /// Идентификаторы отзывов.
    /// </summary>
    [DataContract(Name = "SkipGoodsFeedbackReactionRequest")]
    public partial class SkipGoodsFeedbackReactionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SkipGoodsFeedbackReactionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SkipGoodsFeedbackReactionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SkipGoodsFeedbackReactionRequest" /> class.
        /// </summary>
        /// <param name="feedbackIds">Список идентификаторов отзывов, на которые магазин не будет отвечать. (required).</param>
        public SkipGoodsFeedbackReactionRequest(List<long> feedbackIds = default(List<long>))
        {
            // to ensure "feedbackIds" is required (not null)
            if (feedbackIds == null)
            {
                throw new ArgumentNullException("feedbackIds is a required property for SkipGoodsFeedbackReactionRequest and cannot be null");
            }
            this.FeedbackIds = feedbackIds;
        }

        /// <summary>
        /// Список идентификаторов отзывов, на которые магазин не будет отвечать.
        /// </summary>
        /// <value>Список идентификаторов отзывов, на которые магазин не будет отвечать.</value>
        [DataMember(Name = "feedbackIds", IsRequired = true, EmitDefaultValue = true)]
        public List<long> FeedbackIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SkipGoodsFeedbackReactionRequest {\n");
            sb.Append("  FeedbackIds: ").Append(FeedbackIds).Append("\n");
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
