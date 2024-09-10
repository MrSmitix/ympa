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
    /// Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
    /// </summary>
    [DataContract(Name = "CategoryDTO")]
    public partial class CategoryDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CategoryDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CategoryDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CategoryDTO" /> class.
        /// </summary>
        /// <param name="id">Идентификатор категории. (required).</param>
        /// <param name="name">Название категории. (required).</param>
        /// <param name="children">Дочерние категории..</param>
        public CategoryDTO(long id = default(long), string name = default(string), List<CategoryDTO> children = default(List<CategoryDTO>))
        {
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CategoryDTO and cannot be null");
            }
            this.Name = name;
            this.Children = children;
        }

        /// <summary>
        /// Идентификатор категории.
        /// </summary>
        /// <value>Идентификатор категории.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public long Id { get; set; }

        /// <summary>
        /// Название категории.
        /// </summary>
        /// <value>Название категории.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Дочерние категории.
        /// </summary>
        /// <value>Дочерние категории.</value>
        [DataMember(Name = "children", EmitDefaultValue = true)]
        public List<CategoryDTO> Children { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CategoryDTO {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Children: ").Append(Children).Append("\n");
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
