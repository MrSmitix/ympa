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
    /// Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
    /// </summary>
    [DataContract]
    public partial class OrderItemSubsidyDTO : IEquatable<OrderItemSubsidyDTO>
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=true)]
        public OrderItemSubsidyType Type { get; set; }

        /// <summary>
        /// Сумма субсидии.
        /// </summary>
        /// <value>Сумма субсидии.</value>
        [DataMember(Name="amount", EmitDefaultValue=true)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrderItemSubsidyDTO {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OrderItemSubsidyDTO)obj);
        }

        /// <summary>
        /// Returns true if OrderItemSubsidyDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of OrderItemSubsidyDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderItemSubsidyDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Amount == other.Amount ||
                    
                    Amount.Equals(other.Amount)
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
                    
                    hashCode = hashCode * 59 + Amount.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OrderItemSubsidyDTO left, OrderItemSubsidyDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OrderItemSubsidyDTO left, OrderItemSubsidyDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
