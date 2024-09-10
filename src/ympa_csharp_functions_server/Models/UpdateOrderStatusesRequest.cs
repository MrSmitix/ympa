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
    /// Список заказов.
    /// </summary>
    [DataContract]
    public partial class UpdateOrderStatusesRequest : IEquatable<UpdateOrderStatusesRequest>
    {
        /// <summary>
        /// Список заказов.
        /// </summary>
        /// <value>Список заказов.</value>
        [Required]
        [DataMember(Name="orders", EmitDefaultValue=false)]
        public List<OrderStateDTO> Orders { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateOrderStatusesRequest {\n");
            sb.Append("  Orders: ").Append(Orders).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UpdateOrderStatusesRequest)obj);
        }

        /// <summary>
        /// Returns true if UpdateOrderStatusesRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of UpdateOrderStatusesRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateOrderStatusesRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Orders == other.Orders ||
                    Orders != null &&
                    other.Orders != null &&
                    Orders.SequenceEqual(other.Orders)
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
                    if (Orders != null)
                    hashCode = hashCode * 59 + Orders.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UpdateOrderStatusesRequest left, UpdateOrderStatusesRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UpdateOrderStatusesRequest left, UpdateOrderStatusesRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
