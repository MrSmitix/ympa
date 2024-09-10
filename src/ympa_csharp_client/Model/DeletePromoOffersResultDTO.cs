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
    /// Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
    /// </summary>
    [DataContract(Name = "DeletePromoOffersResultDTO")]
    public partial class DeletePromoOffersResultDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeletePromoOffersResultDTO" /> class.
        /// </summary>
        /// <param name="rejectedOffers">Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. .</param>
        public DeletePromoOffersResultDTO(List<RejectedPromoOfferDeleteDTO> rejectedOffers = default(List<RejectedPromoOfferDeleteDTO>))
        {
            this.RejectedOffers = rejectedOffers;
        }

        /// <summary>
        /// Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
        /// </summary>
        /// <value>Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. </value>
        [DataMember(Name = "rejectedOffers", EmitDefaultValue = true)]
        public List<RejectedPromoOfferDeleteDTO> RejectedOffers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DeletePromoOffersResultDTO {\n");
            sb.Append("  RejectedOffers: ").Append(RejectedOffers).Append("\n");
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
