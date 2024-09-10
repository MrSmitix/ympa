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
    /// Информация о магазине.
    /// </summary>
    [DataContract]
    public partial class CampaignDTO : IEquatable<CampaignDTO>
    {
        /// <summary>
        /// URL магазина.
        /// </summary>
        /// <value>URL магазина.</value>
        [DataMember(Name="domain", EmitDefaultValue=false)]
        public string Domain { get; set; }

        /// <summary>
        /// Идентификатор кампании.
        /// </summary>
        /// <value>Идентификатор кампании.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// Идентификатор плательщика в Яндекс Балансе.
        /// </summary>
        /// <value>Идентификатор плательщика в Яндекс Балансе.</value>
        [DataMember(Name="clientId", EmitDefaultValue=true)]
        public long ClientId { get; set; }

        /// <summary>
        /// Gets or Sets Business
        /// </summary>
        [DataMember(Name="business", EmitDefaultValue=false)]
        public BusinessDTO Business { get; set; }

        /// <summary>
        /// Gets or Sets PlacementType
        /// </summary>
        [DataMember(Name="placementType", EmitDefaultValue=true)]
        public PlacementType PlacementType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CampaignDTO {\n");
            sb.Append("  Domain: ").Append(Domain).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  Business: ").Append(Business).Append("\n");
            sb.Append("  PlacementType: ").Append(PlacementType).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CampaignDTO)obj);
        }

        /// <summary>
        /// Returns true if CampaignDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of CampaignDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CampaignDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Domain == other.Domain ||
                    Domain != null &&
                    Domain.Equals(other.Domain)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    ClientId == other.ClientId ||
                    
                    ClientId.Equals(other.ClientId)
                ) && 
                (
                    Business == other.Business ||
                    Business != null &&
                    Business.Equals(other.Business)
                ) && 
                (
                    PlacementType == other.PlacementType ||
                    
                    PlacementType.Equals(other.PlacementType)
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
                    if (Domain != null)
                    hashCode = hashCode * 59 + Domain.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + ClientId.GetHashCode();
                    if (Business != null)
                    hashCode = hashCode * 59 + Business.GetHashCode();
                    
                    hashCode = hashCode * 59 + PlacementType.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CampaignDTO left, CampaignDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CampaignDTO left, CampaignDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
