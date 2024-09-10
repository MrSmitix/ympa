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
    /// Расписание работы службы доставки в своем регионе.
    /// </summary>
    [DataContract]
    public partial class CampaignSettingsScheduleDTO : IEquatable<CampaignSettingsScheduleDTO>
    {
        /// <summary>
        /// Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. 
        /// </summary>
        /// <value>Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. </value>
        [DataMember(Name="availableOnHolidays", EmitDefaultValue=true)]
        public bool AvailableOnHolidays { get; set; }

        /// <summary>
        /// Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
        /// </summary>
        /// <value>Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.</value>
        [Required]
        [DataMember(Name="customHolidays", EmitDefaultValue=false)]
        public List<string> CustomHolidays { get; set; }

        /// <summary>
        /// Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
        /// </summary>
        /// <value>Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.</value>
        [Required]
        [DataMember(Name="customWorkingDays", EmitDefaultValue=false)]
        public List<string> CustomWorkingDays { get; set; }

        /// <summary>
        /// Gets or Sets Period
        /// </summary>
        [DataMember(Name="period", EmitDefaultValue=false)]
        public CampaignSettingsTimePeriodDTO Period { get; set; }

        /// <summary>
        /// Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
        /// </summary>
        /// <value>Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.</value>
        [Required]
        [DataMember(Name="totalHolidays", EmitDefaultValue=false)]
        public List<string> TotalHolidays { get; set; }

        /// <summary>
        /// Список выходных дней недели и государственных праздников.
        /// </summary>
        /// <value>Список выходных дней недели и государственных праздников.</value>
        [Required]
        [DataMember(Name="weeklyHolidays", EmitDefaultValue=false)]
        public List<int> WeeklyHolidays { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CampaignSettingsScheduleDTO {\n");
            sb.Append("  AvailableOnHolidays: ").Append(AvailableOnHolidays).Append("\n");
            sb.Append("  CustomHolidays: ").Append(CustomHolidays).Append("\n");
            sb.Append("  CustomWorkingDays: ").Append(CustomWorkingDays).Append("\n");
            sb.Append("  Period: ").Append(Period).Append("\n");
            sb.Append("  TotalHolidays: ").Append(TotalHolidays).Append("\n");
            sb.Append("  WeeklyHolidays: ").Append(WeeklyHolidays).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CampaignSettingsScheduleDTO)obj);
        }

        /// <summary>
        /// Returns true if CampaignSettingsScheduleDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of CampaignSettingsScheduleDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CampaignSettingsScheduleDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AvailableOnHolidays == other.AvailableOnHolidays ||
                    
                    AvailableOnHolidays.Equals(other.AvailableOnHolidays)
                ) && 
                (
                    CustomHolidays == other.CustomHolidays ||
                    CustomHolidays != null &&
                    other.CustomHolidays != null &&
                    CustomHolidays.SequenceEqual(other.CustomHolidays)
                ) && 
                (
                    CustomWorkingDays == other.CustomWorkingDays ||
                    CustomWorkingDays != null &&
                    other.CustomWorkingDays != null &&
                    CustomWorkingDays.SequenceEqual(other.CustomWorkingDays)
                ) && 
                (
                    Period == other.Period ||
                    Period != null &&
                    Period.Equals(other.Period)
                ) && 
                (
                    TotalHolidays == other.TotalHolidays ||
                    TotalHolidays != null &&
                    other.TotalHolidays != null &&
                    TotalHolidays.SequenceEqual(other.TotalHolidays)
                ) && 
                (
                    WeeklyHolidays == other.WeeklyHolidays ||
                    WeeklyHolidays != null &&
                    other.WeeklyHolidays != null &&
                    WeeklyHolidays.SequenceEqual(other.WeeklyHolidays)
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
                    
                    hashCode = hashCode * 59 + AvailableOnHolidays.GetHashCode();
                    if (CustomHolidays != null)
                    hashCode = hashCode * 59 + CustomHolidays.GetHashCode();
                    if (CustomWorkingDays != null)
                    hashCode = hashCode * 59 + CustomWorkingDays.GetHashCode();
                    if (Period != null)
                    hashCode = hashCode * 59 + Period.GetHashCode();
                    if (TotalHolidays != null)
                    hashCode = hashCode * 59 + TotalHolidays.GetHashCode();
                    if (WeeklyHolidays != null)
                    hashCode = hashCode * 59 + WeeklyHolidays.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CampaignSettingsScheduleDTO left, CampaignSettingsScheduleDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CampaignSettingsScheduleDTO left, CampaignSettingsScheduleDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
