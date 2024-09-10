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
    /// Распределение товаров по коробкам.
    /// </summary>
    [DataContract(Name = "OrderBoxesLayoutDTO")]
    public partial class OrderBoxesLayoutDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderBoxesLayoutDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OrderBoxesLayoutDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderBoxesLayoutDTO" /> class.
        /// </summary>
        /// <param name="boxes">Список коробок. (required).</param>
        public OrderBoxesLayoutDTO(List<EnrichedOrderBoxLayoutDTO> boxes = default(List<EnrichedOrderBoxLayoutDTO>))
        {
            // to ensure "boxes" is required (not null)
            if (boxes == null)
            {
                throw new ArgumentNullException("boxes is a required property for OrderBoxesLayoutDTO and cannot be null");
            }
            this.Boxes = boxes;
        }

        /// <summary>
        /// Список коробок.
        /// </summary>
        /// <value>Список коробок.</value>
        [DataMember(Name = "boxes", IsRequired = true, EmitDefaultValue = true)]
        public List<EnrichedOrderBoxLayoutDTO> Boxes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrderBoxesLayoutDTO {\n");
            sb.Append("  Boxes: ").Append(Boxes).Append("\n");
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
