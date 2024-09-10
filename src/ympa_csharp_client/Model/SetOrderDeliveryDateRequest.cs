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
    /// SetOrderDeliveryDateRequest
    /// </summary>
    [DataContract(Name = "SetOrderDeliveryDateRequest")]
    public partial class SetOrderDeliveryDateRequest : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Reason
        /// </summary>
        [DataMember(Name = "reason", IsRequired = true, EmitDefaultValue = true)]
        public OrderDeliveryDateReasonType Reason { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SetOrderDeliveryDateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SetOrderDeliveryDateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SetOrderDeliveryDateRequest" /> class.
        /// </summary>
        /// <param name="dates">dates (required).</param>
        /// <param name="reason">reason (required).</param>
        public SetOrderDeliveryDateRequest(OrderDeliveryDateDTO dates = default(OrderDeliveryDateDTO), OrderDeliveryDateReasonType reason = default(OrderDeliveryDateReasonType))
        {
            // to ensure "dates" is required (not null)
            if (dates == null)
            {
                throw new ArgumentNullException("dates is a required property for SetOrderDeliveryDateRequest and cannot be null");
            }
            this.Dates = dates;
            this.Reason = reason;
        }

        /// <summary>
        /// Gets or Sets Dates
        /// </summary>
        [DataMember(Name = "dates", IsRequired = true, EmitDefaultValue = true)]
        public OrderDeliveryDateDTO Dates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SetOrderDeliveryDateRequest {\n");
            sb.Append("  Dates: ").Append(Dates).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
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
