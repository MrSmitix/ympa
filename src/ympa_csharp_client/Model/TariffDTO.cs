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
    /// Информация о тарифах, по которым нужно заплатить за услуги Маркета.
    /// </summary>
    [DataContract(Name = "TariffDTO")]
    public partial class TariffDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TariffType Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="TariffDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TariffDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TariffDTO" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="percent">{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. .</param>
        /// <param name="amount">Значение тарифа в рублях. (required).</param>
        /// <param name="parameters">Параметры расчета тарифа. (required).</param>
        public TariffDTO(TariffType type = default(TariffType), decimal percent = default(decimal), decimal amount = default(decimal), List<TariffParameterDTO> parameters = default(List<TariffParameterDTO>))
        {
            this.Type = type;
            this.Amount = amount;
            // to ensure "parameters" is required (not null)
            if (parameters == null)
            {
                throw new ArgumentNullException("parameters is a required property for TariffDTO and cannot be null");
            }
            this.Parameters = parameters;
            this.Percent = percent;
        }

        /// <summary>
        /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
        /// </summary>
        /// <value>{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. </value>
        [DataMember(Name = "percent", EmitDefaultValue = false)]
        [Obsolete]
        public decimal Percent { get; set; }

        /// <summary>
        /// Значение тарифа в рублях.
        /// </summary>
        /// <value>Значение тарифа в рублях.</value>
        [DataMember(Name = "amount", IsRequired = true, EmitDefaultValue = true)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Параметры расчета тарифа.
        /// </summary>
        /// <value>Параметры расчета тарифа.</value>
        [DataMember(Name = "parameters", IsRequired = true, EmitDefaultValue = true)]
        public List<TariffParameterDTO> Parameters { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TariffDTO {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Percent: ").Append(Percent).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Parameters: ").Append(Parameters).Append("\n");
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
