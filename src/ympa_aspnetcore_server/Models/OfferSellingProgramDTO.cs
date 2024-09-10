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
    /// Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
    /// </summary>
    [DataContract]
    public partial class OfferSellingProgramDTO : IEquatable<OfferSellingProgramDTO>
    {
        /// <summary>
        /// Gets or Sets SellingProgram
        /// </summary>
        [Required]
        [DataMember(Name="sellingProgram", EmitDefaultValue=true)]
        public SellingProgramType SellingProgram { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [Required]
        [DataMember(Name="status", EmitDefaultValue=true)]
        public OfferSellingProgramStatusType Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OfferSellingProgramDTO {\n");
            sb.Append("  SellingProgram: ").Append(SellingProgram).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OfferSellingProgramDTO)obj);
        }

        /// <summary>
        /// Returns true if OfferSellingProgramDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of OfferSellingProgramDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OfferSellingProgramDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    SellingProgram == other.SellingProgram ||
                    
                    SellingProgram.Equals(other.SellingProgram)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
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
                    
                    hashCode = hashCode * 59 + SellingProgram.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OfferSellingProgramDTO left, OfferSellingProgramDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OfferSellingProgramDTO left, OfferSellingProgramDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
