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
    /// Ограничения на значения характеристик.
    /// </summary>
    [DataContract]
    public partial class ParameterValueConstraintsDTO : IEquatable<ParameterValueConstraintsDTO>
    {
        /// <summary>
        /// Минимальное число.
        /// </summary>
        /// <value>Минимальное число.</value>
        [DataMember(Name="minValue", EmitDefaultValue=true)]
        public double MinValue { get; set; }

        /// <summary>
        /// Максимальное число.
        /// </summary>
        /// <value>Максимальное число.</value>
        [DataMember(Name="maxValue", EmitDefaultValue=true)]
        public double MaxValue { get; set; }

        /// <summary>
        /// Максимальная длина текста.
        /// </summary>
        /// <value>Максимальная длина текста.</value>
        [DataMember(Name="maxLength", EmitDefaultValue=true)]
        public int MaxLength { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ParameterValueConstraintsDTO {\n");
            sb.Append("  MinValue: ").Append(MinValue).Append("\n");
            sb.Append("  MaxValue: ").Append(MaxValue).Append("\n");
            sb.Append("  MaxLength: ").Append(MaxLength).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ParameterValueConstraintsDTO)obj);
        }

        /// <summary>
        /// Returns true if ParameterValueConstraintsDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of ParameterValueConstraintsDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ParameterValueConstraintsDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MinValue == other.MinValue ||
                    
                    MinValue.Equals(other.MinValue)
                ) && 
                (
                    MaxValue == other.MaxValue ||
                    
                    MaxValue.Equals(other.MaxValue)
                ) && 
                (
                    MaxLength == other.MaxLength ||
                    
                    MaxLength.Equals(other.MaxLength)
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
                    
                    hashCode = hashCode * 59 + MinValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxLength.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ParameterValueConstraintsDTO left, ParameterValueConstraintsDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ParameterValueConstraintsDTO left, ParameterValueConstraintsDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
