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
    /// Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
    /// </summary>
    [DataContract(Name = "PromoOfferParamsDTO")]
    public partial class PromoOfferParamsDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PromoOfferParamsDTO" /> class.
        /// </summary>
        /// <param name="discountParams">discountParams.</param>
        /// <param name="promocodeParams">promocodeParams.</param>
        public PromoOfferParamsDTO(PromoOfferDiscountParamsDTO discountParams = default(PromoOfferDiscountParamsDTO), PromoOfferPromocodeParamsDTO promocodeParams = default(PromoOfferPromocodeParamsDTO))
        {
            this.DiscountParams = discountParams;
            this.PromocodeParams = promocodeParams;
        }

        /// <summary>
        /// Gets or Sets DiscountParams
        /// </summary>
        [DataMember(Name = "discountParams", EmitDefaultValue = false)]
        public PromoOfferDiscountParamsDTO DiscountParams { get; set; }

        /// <summary>
        /// Gets or Sets PromocodeParams
        /// </summary>
        [DataMember(Name = "promocodeParams", EmitDefaultValue = false)]
        public PromoOfferPromocodeParamsDTO PromocodeParams { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PromoOfferParamsDTO {\n");
            sb.Append("  DiscountParams: ").Append(DiscountParams).Append("\n");
            sb.Append("  PromocodeParams: ").Append(PromocodeParams).Append("\n");
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
