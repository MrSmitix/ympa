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
    /// Ответ на запрос информации о прайс-листе.
    /// </summary>
    [DataContract]
    public partial class GetFeedResponse : IEquatable<GetFeedResponse>
    {
        /// <summary>
        /// Gets or Sets Feed
        /// </summary>
        [DataMember(Name="feed", EmitDefaultValue=false)]
        public FeedDTO Feed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetFeedResponse {\n");
            sb.Append("  Feed: ").Append(Feed).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetFeedResponse)obj);
        }

        /// <summary>
        /// Returns true if GetFeedResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of GetFeedResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetFeedResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Feed == other.Feed ||
                    Feed != null &&
                    Feed.Equals(other.Feed)
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
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetFeedResponse left, GetFeedResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetFeedResponse left, GetFeedResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
