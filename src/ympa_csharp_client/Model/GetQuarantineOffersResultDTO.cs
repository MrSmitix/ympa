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
    /// Список товаров в карантине.
    /// </summary>
    [DataContract(Name = "GetQuarantineOffersResultDTO")]
    public partial class GetQuarantineOffersResultDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetQuarantineOffersResultDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GetQuarantineOffersResultDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GetQuarantineOffersResultDTO" /> class.
        /// </summary>
        /// <param name="paging">paging.</param>
        /// <param name="offers">Страница списка товаров в карантине. (required).</param>
        public GetQuarantineOffersResultDTO(ScrollingPagerDTO paging = default(ScrollingPagerDTO), List<QuarantineOfferDTO> offers = default(List<QuarantineOfferDTO>))
        {
            // to ensure "offers" is required (not null)
            if (offers == null)
            {
                throw new ArgumentNullException("offers is a required property for GetQuarantineOffersResultDTO and cannot be null");
            }
            this.Offers = offers;
            this.Paging = paging;
        }

        /// <summary>
        /// Gets or Sets Paging
        /// </summary>
        [DataMember(Name = "paging", EmitDefaultValue = false)]
        public ScrollingPagerDTO Paging { get; set; }

        /// <summary>
        /// Страница списка товаров в карантине.
        /// </summary>
        /// <value>Страница списка товаров в карантине.</value>
        [DataMember(Name = "offers", IsRequired = true, EmitDefaultValue = true)]
        public List<QuarantineOfferDTO> Offers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetQuarantineOffersResultDTO {\n");
            sb.Append("  Paging: ").Append(Paging).Append("\n");
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
