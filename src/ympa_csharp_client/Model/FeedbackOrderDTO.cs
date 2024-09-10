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
    /// Информация о заказе, указанная в отзыве.
    /// </summary>
    [DataContract(Name = "FeedbackOrderDTO")]
    public partial class FeedbackOrderDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Delivery
        /// </summary>
        [DataMember(Name = "delivery", EmitDefaultValue = false)]
        public FeedbackDeliveryType? Delivery { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FeedbackOrderDTO" /> class.
        /// </summary>
        /// <param name="shopOrderId">Номер заказа, указанный в отзыве..</param>
        /// <param name="delivery">delivery.</param>
        public FeedbackOrderDTO(string shopOrderId = default(string), FeedbackDeliveryType? delivery = default(FeedbackDeliveryType?))
        {
            this.ShopOrderId = shopOrderId;
            this.Delivery = delivery;
        }

        /// <summary>
        /// Номер заказа, указанный в отзыве.
        /// </summary>
        /// <value>Номер заказа, указанный в отзыве.</value>
        [DataMember(Name = "shopOrderId", EmitDefaultValue = false)]
        public string ShopOrderId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FeedbackOrderDTO {\n");
            sb.Append("  ShopOrderId: ").Append(ShopOrderId).Append("\n");
            sb.Append("  Delivery: ").Append(Delivery).Append("\n");
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
