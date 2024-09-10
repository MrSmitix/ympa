/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using ympa_aspnetcore_server.Converters;

namespace ympa_aspnetcore_server.Models
{ 
    /// <summary>
    /// Текст ошибки.
    /// </summary>
    [DataContract]
    public partial class OfferMappingErrorDTO : IEquatable<OfferMappingErrorDTO>
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public OfferMappingErrorType Type { get; set; }

        /// <summary>
        /// Идентификатор характеристики, с которой связана ошибка.
        /// </summary>
        /// <value>Идентификатор характеристики, с которой связана ошибка.</value>
        [DataMember(Name="parameterId", EmitDefaultValue=true)]
        public long ParameterId { get; set; }

        /// <summary>
        /// Текст ошибки.
        /// </summary>
        /// <value>Текст ошибки.</value>
        [Required]
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OfferMappingErrorDTO {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ParameterId: ").Append(ParameterId).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((OfferMappingErrorDTO)obj);
        }

        /// <summary>
        /// Returns true if OfferMappingErrorDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of OfferMappingErrorDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OfferMappingErrorDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    ParameterId == other.ParameterId ||
                    
                    ParameterId.Equals(other.ParameterId)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    
                    hashCode = hashCode * 59 + ParameterId.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OfferMappingErrorDTO left, OfferMappingErrorDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OfferMappingErrorDTO left, OfferMappingErrorDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
