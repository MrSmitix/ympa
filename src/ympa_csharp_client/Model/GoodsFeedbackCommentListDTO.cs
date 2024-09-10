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
    /// Комментарии к отзыву.
    /// </summary>
    [DataContract(Name = "GoodsFeedbackCommentListDTO")]
    public partial class GoodsFeedbackCommentListDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GoodsFeedbackCommentListDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GoodsFeedbackCommentListDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GoodsFeedbackCommentListDTO" /> class.
        /// </summary>
        /// <param name="comments">Список комментариев. (required).</param>
        /// <param name="paging">paging.</param>
        public GoodsFeedbackCommentListDTO(List<GoodsFeedbackCommentDTO> comments = default(List<GoodsFeedbackCommentDTO>), ForwardScrollingPagerDTO paging = default(ForwardScrollingPagerDTO))
        {
            // to ensure "comments" is required (not null)
            if (comments == null)
            {
                throw new ArgumentNullException("comments is a required property for GoodsFeedbackCommentListDTO and cannot be null");
            }
            this.Comments = comments;
            this.Paging = paging;
        }

        /// <summary>
        /// Список комментариев.
        /// </summary>
        /// <value>Список комментариев.</value>
        [DataMember(Name = "comments", IsRequired = true, EmitDefaultValue = true)]
        public List<GoodsFeedbackCommentDTO> Comments { get; set; }

        /// <summary>
        /// Gets or Sets Paging
        /// </summary>
        [DataMember(Name = "paging", EmitDefaultValue = false)]
        public ForwardScrollingPagerDTO Paging { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GoodsFeedbackCommentListDTO {\n");
            sb.Append("  Comments: ").Append(Comments).Append("\n");
            sb.Append("  Paging: ").Append(Paging).Append("\n");
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
