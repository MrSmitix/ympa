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
    /// Запрос на получение списка цен для продвижения.
    /// </summary>
    [DataContract(Name = "SuggestPricesRequest")]
    public partial class SuggestPricesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SuggestPricesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SuggestPricesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SuggestPricesRequest" /> class.
        /// </summary>
        /// <param name="offers">Список товаров. (required).</param>
        public SuggestPricesRequest(List<SuggestOfferPriceDTO> offers = default(List<SuggestOfferPriceDTO>))
        {
            // to ensure "offers" is required (not null)
            if (offers == null)
            {
                throw new ArgumentNullException("offers is a required property for SuggestPricesRequest and cannot be null");
            }
            this.Offers = offers;
        }

        /// <summary>
        /// Список товаров.
        /// </summary>
        /// <value>Список товаров.</value>
        [DataMember(Name = "offers", IsRequired = true, EmitDefaultValue = true)]
        public List<SuggestOfferPriceDTO> Offers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SuggestPricesRequest {\n");
            sb.Append("  Offers: ").Append(Offers).Append("\n");
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
