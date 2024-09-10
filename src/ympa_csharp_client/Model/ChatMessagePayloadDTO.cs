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
    /// Информация о приложенных к сообщению файлах.
    /// </summary>
    [DataContract(Name = "ChatMessagePayloadDTO")]
    public partial class ChatMessagePayloadDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatMessagePayloadDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatMessagePayloadDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatMessagePayloadDTO" /> class.
        /// </summary>
        /// <param name="name">Имя файла. (required).</param>
        /// <param name="url">Ссылка для скачивания файла. (required).</param>
        /// <param name="size">Размер файла в байтах. (required).</param>
        public ChatMessagePayloadDTO(string name = default(string), string url = default(string), int size = default(int))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ChatMessagePayloadDTO and cannot be null");
            }
            this.Name = name;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for ChatMessagePayloadDTO and cannot be null");
            }
            this.Url = url;
            this.Size = size;
        }

        /// <summary>
        /// Имя файла.
        /// </summary>
        /// <value>Имя файла.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Ссылка для скачивания файла.
        /// </summary>
        /// <value>Ссылка для скачивания файла.</value>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// Размер файла в байтах.
        /// </summary>
        /// <value>Размер файла в байтах.</value>
        [DataMember(Name = "size", IsRequired = true, EmitDefaultValue = true)]
        public int Size { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatMessagePayloadDTO {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
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
