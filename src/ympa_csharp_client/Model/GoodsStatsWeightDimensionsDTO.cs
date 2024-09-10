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
    /// Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
    /// </summary>
    [DataContract(Name = "GoodsStatsWeightDimensionsDTO")]
    public partial class GoodsStatsWeightDimensionsDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GoodsStatsWeightDimensionsDTO" /> class.
        /// </summary>
        /// <param name="length">Длина товара в сантиметрах..</param>
        /// <param name="width">Ширина товара в сантиметрах..</param>
        /// <param name="height">Высота товара в сантиметрах..</param>
        /// <param name="weight">Вес товара в килограммах..</param>
        public GoodsStatsWeightDimensionsDTO(decimal length = default(decimal), decimal width = default(decimal), decimal height = default(decimal), decimal weight = default(decimal))
        {
            this.Length = length;
            this.Width = width;
            this.Height = height;
            this.Weight = weight;
        }

        /// <summary>
        /// Длина товара в сантиметрах.
        /// </summary>
        /// <value>Длина товара в сантиметрах.</value>
        [DataMember(Name = "length", EmitDefaultValue = false)]
        public decimal Length { get; set; }

        /// <summary>
        /// Ширина товара в сантиметрах.
        /// </summary>
        /// <value>Ширина товара в сантиметрах.</value>
        [DataMember(Name = "width", EmitDefaultValue = false)]
        public decimal Width { get; set; }

        /// <summary>
        /// Высота товара в сантиметрах.
        /// </summary>
        /// <value>Высота товара в сантиметрах.</value>
        [DataMember(Name = "height", EmitDefaultValue = false)]
        public decimal Height { get; set; }

        /// <summary>
        /// Вес товара в килограммах.
        /// </summary>
        /// <value>Вес товара в килограммах.</value>
        [DataMember(Name = "weight", EmitDefaultValue = false)]
        public decimal Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GoodsStatsWeightDimensionsDTO {\n");
            sb.Append("  Length: ").Append(Length).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
