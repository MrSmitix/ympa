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
    /// Данные, необходимые для генерации отчета.
    /// </summary>
    [DataContract]
    public partial class GenerateShowsSalesReportRequest : IEquatable<GenerateShowsSalesReportRequest>
    {
        /// <summary>
        /// Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
        /// </summary>
        /// <value>Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. </value>
        [DataMember(Name="businessId", EmitDefaultValue=false)]
        public long BusinessId { get; set; }

        /// <summary>
        /// Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
        /// </summary>
        /// <value>Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. </value>
        [DataMember(Name="campaignId", EmitDefaultValue=false)]
        public long CampaignId { get; set; }

        /// <summary>
        /// Начало периода, включительно.
        /// </summary>
        /// <value>Начало периода, включительно.</value>
        [Required]
        [DataMember(Name="dateFrom", EmitDefaultValue=false)]
        public DateOnly DateFrom { get; set; }

        /// <summary>
        /// Конец периода, включительно.
        /// </summary>
        /// <value>Конец периода, включительно.</value>
        [Required]
        [DataMember(Name="dateTo", EmitDefaultValue=false)]
        public DateOnly DateTo { get; set; }

        /// <summary>
        /// Gets or Sets Grouping
        /// </summary>
        [Required]
        [DataMember(Name="grouping", EmitDefaultValue=false)]
        public ShowsSalesGroupingType Grouping { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GenerateShowsSalesReportRequest {\n");
            sb.Append("  BusinessId: ").Append(BusinessId).Append("\n");
            sb.Append("  CampaignId: ").Append(CampaignId).Append("\n");
            sb.Append("  DateFrom: ").Append(DateFrom).Append("\n");
            sb.Append("  DateTo: ").Append(DateTo).Append("\n");
            sb.Append("  Grouping: ").Append(Grouping).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GenerateShowsSalesReportRequest)obj);
        }

        /// <summary>
        /// Returns true if GenerateShowsSalesReportRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GenerateShowsSalesReportRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GenerateShowsSalesReportRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    BusinessId == other.BusinessId ||
                    
                    BusinessId.Equals(other.BusinessId)
                ) && 
                (
                    CampaignId == other.CampaignId ||
                    
                    CampaignId.Equals(other.CampaignId)
                ) && 
                (
                    DateFrom == other.DateFrom ||
                    DateFrom != null &&
                    DateFrom.Equals(other.DateFrom)
                ) && 
                (
                    DateTo == other.DateTo ||
                    DateTo != null &&
                    DateTo.Equals(other.DateTo)
                ) && 
                (
                    Grouping == other.Grouping ||
                    
                    Grouping.Equals(other.Grouping)
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
                    
                    hashCode = hashCode * 59 + BusinessId.GetHashCode();
                    
                    hashCode = hashCode * 59 + CampaignId.GetHashCode();
                    if (DateFrom != null)
                    hashCode = hashCode * 59 + DateFrom.GetHashCode();
                    if (DateTo != null)
                    hashCode = hashCode * 59 + DateTo.GetHashCode();
                    
                    hashCode = hashCode * 59 + Grouping.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GenerateShowsSalesReportRequest left, GenerateShowsSalesReportRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GenerateShowsSalesReportRequest left, GenerateShowsSalesReportRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
