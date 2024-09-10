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
using ympa_csharp_functions_server.Converters;

namespace ympa_csharp_functions_server.Models
{ 
    /// <summary>
    /// Тип цены.
    /// </summary>
    [DataContract]
    public partial class PriceSuggestDTO : IEquatable<PriceSuggestDTO>
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public PriceSuggestType Type { get; set; }

        /// <summary>
        /// Цена в рублях.
        /// </summary>
        /// <value>Цена в рублях.</value>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public decimal Price { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PriceSuggestDTO {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
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
            return obj.GetType() == GetType() && Equals((PriceSuggestDTO)obj);
        }

        /// <summary>
        /// Returns true if PriceSuggestDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of PriceSuggestDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PriceSuggestDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Price == other.Price ||
                    
                    Price.Equals(other.Price)
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
                    
                    hashCode = hashCode * 59 + Price.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PriceSuggestDTO left, PriceSuggestDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PriceSuggestDTO left, PriceSuggestDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
