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
    /// Результат выполнения запроса отчета по индексации прайс-листа.
    /// </summary>
    [DataContract]
    public partial class FeedIndexLogsResultDTO : IEquatable<FeedIndexLogsResultDTO>
    {
        /// <summary>
        /// Gets or Sets Feed
        /// </summary>
        [DataMember(Name="feed", EmitDefaultValue=false)]
        public FeedIndexLogsFeedDTO Feed { get; set; }

        /// <summary>
        /// Список отчетов по индексации прайс-листа.
        /// </summary>
        /// <value>Список отчетов по индексации прайс-листа.</value>
        [Required]
        [DataMember(Name="indexLogRecords", EmitDefaultValue=false)]
        public List<FeedIndexLogsRecordDTO> IndexLogRecords { get; set; }

        /// <summary>
        /// Количество отчетов на всех страницах выходных данных.
        /// </summary>
        /// <value>Количество отчетов на всех страницах выходных данных.</value>
        [DataMember(Name="total", EmitDefaultValue=false)]
        public long Total { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FeedIndexLogsResultDTO {\n");
            sb.Append("  Feed: ").Append(Feed).Append("\n");
            sb.Append("  IndexLogRecords: ").Append(IndexLogRecords).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FeedIndexLogsResultDTO)obj);
        }

        /// <summary>
        /// Returns true if FeedIndexLogsResultDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of FeedIndexLogsResultDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FeedIndexLogsResultDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Feed == other.Feed ||
                    Feed != null &&
                    Feed.Equals(other.Feed)
                ) && 
                (
                    IndexLogRecords == other.IndexLogRecords ||
                    IndexLogRecords != null &&
                    other.IndexLogRecords != null &&
                    IndexLogRecords.SequenceEqual(other.IndexLogRecords)
                ) && 
                (
                    Total == other.Total ||
                    
                    Total.Equals(other.Total)
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
                    if (Feed != null)
                    hashCode = hashCode * 59 + Feed.GetHashCode();
                    if (IndexLogRecords != null)
                    hashCode = hashCode * 59 + IndexLogRecords.GetHashCode();
                    
                    hashCode = hashCode * 59 + Total.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FeedIndexLogsResultDTO left, FeedIndexLogsResultDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FeedIndexLogsResultDTO left, FeedIndexLogsResultDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
