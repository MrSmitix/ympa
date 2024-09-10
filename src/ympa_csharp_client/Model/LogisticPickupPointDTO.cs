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
    /// Описание пункта вывоза для возврата.
    /// </summary>
    [DataContract(Name = "LogisticPickupPointDTO")]
    public partial class LogisticPickupPointDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public LogisticPointType? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="LogisticPickupPointDTO" /> class.
        /// </summary>
        /// <param name="id">Идентификатор пункта вывоза..</param>
        /// <param name="name">Название пункта вывоза..</param>
        /// <param name="address">address.</param>
        /// <param name="instruction">Дополнительные инструкции к вывозу..</param>
        /// <param name="type">type.</param>
        /// <param name="logisticPartnerId">Идентификатор логистического партнера, к которому относится логистическая точка..</param>
        public LogisticPickupPointDTO(long id = default(long), string name = default(string), PickupAddressDTO address = default(PickupAddressDTO), string instruction = default(string), LogisticPointType? type = default(LogisticPointType?), long logisticPartnerId = default(long))
        {
            this.Id = id;
            this.Name = name;
            this.Address = address;
            this.Instruction = instruction;
            this.Type = type;
            this.LogisticPartnerId = logisticPartnerId;
        }

        /// <summary>
        /// Идентификатор пункта вывоза.
        /// </summary>
        /// <value>Идентификатор пункта вывоза.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public long Id { get; set; }

        /// <summary>
        /// Название пункта вывоза.
        /// </summary>
        /// <value>Название пункта вывоза.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name = "address", EmitDefaultValue = false)]
        public PickupAddressDTO Address { get; set; }

        /// <summary>
        /// Дополнительные инструкции к вывозу.
        /// </summary>
        /// <value>Дополнительные инструкции к вывозу.</value>
        [DataMember(Name = "instruction", EmitDefaultValue = false)]
        public string Instruction { get; set; }

        /// <summary>
        /// Идентификатор логистического партнера, к которому относится логистическая точка.
        /// </summary>
        /// <value>Идентификатор логистического партнера, к которому относится логистическая точка.</value>
        [DataMember(Name = "logisticPartnerId", EmitDefaultValue = false)]
        public long LogisticPartnerId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LogisticPickupPointDTO {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Instruction: ").Append(Instruction).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  LogisticPartnerId: ").Append(LogisticPartnerId).Append("\n");
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
