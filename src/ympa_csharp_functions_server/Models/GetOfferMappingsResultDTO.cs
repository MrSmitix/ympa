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
    /// Информация о товарах.
    /// </summary>
    [DataContract]
    public partial class GetOfferMappingsResultDTO : IEquatable<GetOfferMappingsResultDTO>
    {
        /// <summary>
        /// Gets or Sets Paging
        /// </summary>
        [DataMember(Name="paging", EmitDefaultValue=false)]
        public ScrollingPagerDTO Paging { get; set; }

        /// <summary>
        /// Информация о товарах.
        /// </summary>
        /// <value>Информация о товарах.</value>
        [Required]
        [DataMember(Name="offerMappings", EmitDefaultValue=false)]
        public List<GetOfferMappingDTO> OfferMappings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetOfferMappingsResultDTO {\n");
            sb.Append("  Paging: ").Append(Paging).Append("\n");
            sb.Append("  OfferMappings: ").Append(OfferMappings).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetOfferMappingsResultDTO)obj);
        }

        /// <summary>
        /// Returns true if GetOfferMappingsResultDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of GetOfferMappingsResultDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetOfferMappingsResultDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Paging == other.Paging ||
                    Paging != null &&
                    Paging.Equals(other.Paging)
                ) && 
                (
                    OfferMappings == other.OfferMappings ||
                    OfferMappings != null &&
                    other.OfferMappings != null &&
                    OfferMappings.SequenceEqual(other.OfferMappings)
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
                    if (Paging != null)
                    hashCode = hashCode * 59 + Paging.GetHashCode();
                    if (OfferMappings != null)
                    hashCode = hashCode * 59 + OfferMappings.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetOfferMappingsResultDTO left, GetOfferMappingsResultDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetOfferMappingsResultDTO left, GetOfferMappingsResultDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
