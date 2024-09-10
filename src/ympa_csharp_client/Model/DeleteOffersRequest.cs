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
    /// Фильтрации удаляемых товаров по offerIds. 
    /// </summary>
    [DataContract(Name = "DeleteOffersRequest")]
    public partial class DeleteOffersRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeleteOffersRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DeleteOffersRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DeleteOffersRequest" /> class.
        /// </summary>
        /// <param name="offerIds">Список SKU товаров, которые нужно удалить. (required).</param>
        public DeleteOffersRequest(List<string> offerIds = default(List<string>))
        {
            // to ensure "offerIds" is required (not null)
            if (offerIds == null)
            {
                throw new ArgumentNullException("offerIds is a required property for DeleteOffersRequest and cannot be null");
            }
            this.OfferIds = offerIds;
        }

        /// <summary>
        /// Список SKU товаров, которые нужно удалить.
        /// </summary>
        /// <value>Список SKU товаров, которые нужно удалить.</value>
        [DataMember(Name = "offerIds", IsRequired = true, EmitDefaultValue = true)]
        public List<string> OfferIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DeleteOffersRequest {\n");
            sb.Append("  OfferIds: ").Append(OfferIds).Append("\n");
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
