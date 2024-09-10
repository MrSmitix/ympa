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
    /// Информация о состоянии цен и рекомендации. 
    /// </summary>
    [DataContract(Name = "OfferRecommendationDTO")]
    public partial class OfferRecommendationDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OfferRecommendationDTO" /> class.
        /// </summary>
        /// <param name="offer">offer.</param>
        /// <param name="recommendation">recommendation.</param>
        public OfferRecommendationDTO(OfferForRecommendationDTO offer = default(OfferForRecommendationDTO), OfferRecommendationInfoDTO recommendation = default(OfferRecommendationInfoDTO))
        {
            this.Offer = offer;
            this.Recommendation = recommendation;
        }

        /// <summary>
        /// Gets or Sets Offer
        /// </summary>
        [DataMember(Name = "offer", EmitDefaultValue = false)]
        public OfferForRecommendationDTO Offer { get; set; }

        /// <summary>
        /// Gets or Sets Recommendation
        /// </summary>
        [DataMember(Name = "recommendation", EmitDefaultValue = false)]
        public OfferRecommendationInfoDTO Recommendation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OfferRecommendationDTO {\n");
            sb.Append("  Offer: ").Append(Offer).Append("\n");
            sb.Append("  Recommendation: ").Append(Recommendation).Append("\n");
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
