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
    /// Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
    /// </summary>
    [DataContract(Name = "OptionValuesLimitedDTO")]
    public partial class OptionValuesLimitedDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptionValuesLimitedDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OptionValuesLimitedDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OptionValuesLimitedDTO" /> class.
        /// </summary>
        /// <param name="limitingOptionValueId">Идентификатор значения ограничивающей характеристики. (required).</param>
        /// <param name="optionValueIds">Идентификаторы допустимых значений ограничиваемой характеристики.  (required).</param>
        public OptionValuesLimitedDTO(long limitingOptionValueId = default(long), List<long> optionValueIds = default(List<long>))
        {
            this.LimitingOptionValueId = limitingOptionValueId;
            // to ensure "optionValueIds" is required (not null)
            if (optionValueIds == null)
            {
                throw new ArgumentNullException("optionValueIds is a required property for OptionValuesLimitedDTO and cannot be null");
            }
            this.OptionValueIds = optionValueIds;
        }

        /// <summary>
        /// Идентификатор значения ограничивающей характеристики.
        /// </summary>
        /// <value>Идентификатор значения ограничивающей характеристики.</value>
        [DataMember(Name = "limitingOptionValueId", IsRequired = true, EmitDefaultValue = true)]
        public long LimitingOptionValueId { get; set; }

        /// <summary>
        /// Идентификаторы допустимых значений ограничиваемой характеристики. 
        /// </summary>
        /// <value>Идентификаторы допустимых значений ограничиваемой характеристики. </value>
        [DataMember(Name = "optionValueIds", IsRequired = true, EmitDefaultValue = true)]
        public List<long> OptionValueIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptionValuesLimitedDTO {\n");
            sb.Append("  LimitingOptionValueId: ").Append(LimitingOptionValueId).Append("\n");
            sb.Append("  OptionValueIds: ").Append(OptionValueIds).Append("\n");
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
