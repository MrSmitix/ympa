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
    /// Информация о грузовых местах в заказе.
    /// </summary>
    [DataContract]
    public partial class ParcelDTO : IEquatable<ParcelDTO>
    {
        /// <summary>
        /// Список грузовых мест. Маркет определяет количество мест по длине этого списка.
        /// </summary>
        /// <value>Список грузовых мест. Маркет определяет количество мест по длине этого списка.</value>
        [Required]
        [DataMember(Name="boxes", EmitDefaultValue=false)]
        public List<ParcelBoxDTO> Boxes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ParcelDTO {\n");
            sb.Append("  Boxes: ").Append(Boxes).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ParcelDTO)obj);
        }

        /// <summary>
        /// Returns true if ParcelDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of ParcelDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ParcelDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Boxes == other.Boxes ||
                    Boxes != null &&
                    other.Boxes != null &&
                    Boxes.SequenceEqual(other.Boxes)
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
                    if (Boxes != null)
                    hashCode = hashCode * 59 + Boxes.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ParcelDTO left, ParcelDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ParcelDTO left, ParcelDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
