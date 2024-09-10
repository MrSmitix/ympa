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
    /// Список складов Маркета (FBY).
    /// </summary>
    [DataContract(Name = "FulfillmentWarehousesDTO")]
    public partial class FulfillmentWarehousesDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FulfillmentWarehousesDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FulfillmentWarehousesDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FulfillmentWarehousesDTO" /> class.
        /// </summary>
        /// <param name="warehouses">Список складов Маркета (FBY). (required).</param>
        public FulfillmentWarehousesDTO(List<FulfillmentWarehouseDTO> warehouses = default(List<FulfillmentWarehouseDTO>))
        {
            // to ensure "warehouses" is required (not null)
            if (warehouses == null)
            {
                throw new ArgumentNullException("warehouses is a required property for FulfillmentWarehousesDTO and cannot be null");
            }
            this.Warehouses = warehouses;
        }

        /// <summary>
        /// Список складов Маркета (FBY).
        /// </summary>
        /// <value>Список складов Маркета (FBY).</value>
        [DataMember(Name = "warehouses", IsRequired = true, EmitDefaultValue = true)]
        public List<FulfillmentWarehouseDTO> Warehouses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FulfillmentWarehousesDTO {\n");
            sb.Append("  Warehouses: ").Append(Warehouses).Append("\n");
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
