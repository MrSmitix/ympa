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
    /// Информация о чатах.
    /// </summary>
    [DataContract(Name = "GetChatInfoDTO")]
    public partial class GetChatInfoDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public ChatType Type { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public ChatStatusType Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="GetChatInfoDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GetChatInfoDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GetChatInfoDTO" /> class.
        /// </summary>
        /// <param name="chatId">Идентификатор чата. (required).</param>
        /// <param name="orderId">Идентификатор заказа. (required).</param>
        /// <param name="type">type (required).</param>
        /// <param name="status">status (required).</param>
        /// <param name="createdAt">Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  (required).</param>
        /// <param name="updatedAt">Дата и время последнего сообщения в чате. (required).</param>
        public GetChatInfoDTO(long chatId = default(long), long orderId = default(long), ChatType type = default(ChatType), ChatStatusType status = default(ChatStatusType), DateTime createdAt = default(DateTime), DateTime updatedAt = default(DateTime))
        {
            this.ChatId = chatId;
            this.OrderId = orderId;
            this.Type = type;
            this.Status = status;
            this.CreatedAt = createdAt;
            this.UpdatedAt = updatedAt;
        }

        /// <summary>
        /// Идентификатор чата.
        /// </summary>
        /// <value>Идентификатор чата.</value>
        [DataMember(Name = "chatId", IsRequired = true, EmitDefaultValue = true)]
        public long ChatId { get; set; }

        /// <summary>
        /// Идентификатор заказа.
        /// </summary>
        /// <value>Идентификатор заказа.</value>
        [DataMember(Name = "orderId", IsRequired = true, EmitDefaultValue = true)]
        public long OrderId { get; set; }

        /// <summary>
        /// Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
        /// </summary>
        /// <value>Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. </value>
        [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Дата и время последнего сообщения в чате.
        /// </summary>
        /// <value>Дата и время последнего сообщения в чате.</value>
        [DataMember(Name = "updatedAt", IsRequired = true, EmitDefaultValue = true)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetChatInfoDTO {\n");
            sb.Append("  ChatId: ").Append(ChatId).Append("\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
