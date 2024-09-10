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
    /// Значение характеристики.
    /// </summary>
    [DataContract]
    public partial class ParameterValueOptionDTO : IEquatable<ParameterValueOptionDTO>
    {
        /// <summary>
        /// Идентификатор значения.
        /// </summary>
        /// <value>Идентификатор значения.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// Значение.
        /// </summary>
        /// <value>Значение.</value>
        [Required]
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Описание значения.
        /// </summary>
        /// <value>Описание значения.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ParameterValueOptionDTO {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ParameterValueOptionDTO)obj);
        }

        /// <summary>
        /// Returns true if ParameterValueOptionDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of ParameterValueOptionDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ParameterValueOptionDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Value == other.Value ||
                    Value != null &&
                    Value.Equals(other.Value)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
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
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ParameterValueOptionDTO left, ParameterValueOptionDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ParameterValueOptionDTO left, ParameterValueOptionDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
