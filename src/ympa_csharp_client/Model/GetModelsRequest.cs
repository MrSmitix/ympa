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
    /// Запрос информации о моделях.
    /// </summary>
    [DataContract(Name = "GetModelsRequest")]
    public partial class GetModelsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetModelsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GetModelsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GetModelsRequest" /> class.
        /// </summary>
        /// <param name="models">Список моделей. (required).</param>
        public GetModelsRequest(List<long> models = default(List<long>))
        {
            // to ensure "models" is required (not null)
            if (models == null)
            {
                throw new ArgumentNullException("models is a required property for GetModelsRequest and cannot be null");
            }
            this.Models = models;
        }

        /// <summary>
        /// Список моделей.
        /// </summary>
        /// <value>Список моделей.</value>
        [DataMember(Name = "models", IsRequired = true, EmitDefaultValue = true)]
        public List<long> Models { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetModelsRequest {\n");
            sb.Append("  Models: ").Append(Models).Append("\n");
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
