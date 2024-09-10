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
    /// Информация о точке продаж.
    /// </summary>
    [DataContract]
    public partial class FullOutletDTO : IEquatable<FullOutletDTO>
    {
        /// <summary>
        /// Название точки продаж. 
        /// </summary>
        /// <value>Название точки продаж. </value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public OutletType Type { get; set; }

        /// <summary>
        /// Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. 
        /// </summary>
        /// <value>Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. </value>
        [DataMember(Name="coords", EmitDefaultValue=false)]
        public string Coords { get; set; }

        /// <summary>
        /// Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. 
        /// </summary>
        /// <value>Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. </value>
        [DataMember(Name="isMain", EmitDefaultValue=true)]
        public bool IsMain { get; set; }

        /// <summary>
        /// Идентификатор точки продаж, присвоенный магазином.
        /// </summary>
        /// <value>Идентификатор точки продаж, присвоенный магазином.</value>
        [DataMember(Name="shopOutletCode", EmitDefaultValue=false)]
        public string ShopOutletCode { get; set; }

        /// <summary>
        /// Gets or Sets Visibility
        /// </summary>
        [DataMember(Name="visibility", EmitDefaultValue=true)]
        public OutletVisibilityType Visibility { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [Required]
        [DataMember(Name="address", EmitDefaultValue=false)]
        public OutletAddressDTO Address { get; set; }

        /// <summary>
        /// Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. 
        /// </summary>
        /// <value>Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. </value>
        [Required]
        [DataMember(Name="phones", EmitDefaultValue=false)]
        public List<string> Phones { get; set; }

        /// <summary>
        /// Gets or Sets WorkingSchedule
        /// </summary>
        [Required]
        [DataMember(Name="workingSchedule", EmitDefaultValue=false)]
        public OutletWorkingScheduleDTO WorkingSchedule { get; set; }

        /// <summary>
        /// Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. 
        /// </summary>
        /// <value>Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. </value>
        [DataMember(Name="deliveryRules", EmitDefaultValue=true)]
        public List<OutletDeliveryRuleDTO> DeliveryRules { get; set; }

        /// <summary>
        /// Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
        /// </summary>
        /// <value>Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.</value>
        [DataMember(Name="storagePeriod", EmitDefaultValue=true)]
        public long StoragePeriod { get; set; }

        /// <summary>
        /// Идентификатор точки продаж, присвоенный Маркетом.
        /// </summary>
        /// <value>Идентификатор точки продаж, присвоенный Маркетом.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=true)]
        public OutletStatusType Status { get; set; }

        /// <summary>
        /// Gets or Sets Region
        /// </summary>
        [DataMember(Name="region", EmitDefaultValue=false)]
        public RegionDTO Region { get; set; }

        /// <summary>
        /// Идентификатор точки продаж, заданный магазином.
        /// </summary>
        /// <value>Идентификатор точки продаж, заданный магазином.</value>
        [DataMember(Name="shopOutletId", EmitDefaultValue=false)]
        public string ShopOutletId { get; set; }

        /// <summary>
        /// Рабочее время.
        /// </summary>
        /// <value>Рабочее время.</value>
        [DataMember(Name="workingTime", EmitDefaultValue=false)]
        public string WorkingTime { get; set; }

        /// <summary>
        /// Статус модерации.
        /// </summary>
        /// <value>Статус модерации.</value>
        [DataMember(Name="moderationReason", EmitDefaultValue=false)]
        public string ModerationReason { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FullOutletDTO {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Coords: ").Append(Coords).Append("\n");
            sb.Append("  IsMain: ").Append(IsMain).Append("\n");
            sb.Append("  ShopOutletCode: ").Append(ShopOutletCode).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Phones: ").Append(Phones).Append("\n");
            sb.Append("  WorkingSchedule: ").Append(WorkingSchedule).Append("\n");
            sb.Append("  DeliveryRules: ").Append(DeliveryRules).Append("\n");
            sb.Append("  StoragePeriod: ").Append(StoragePeriod).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
            sb.Append("  ShopOutletId: ").Append(ShopOutletId).Append("\n");
            sb.Append("  WorkingTime: ").Append(WorkingTime).Append("\n");
            sb.Append("  ModerationReason: ").Append(ModerationReason).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FullOutletDTO)obj);
        }

        /// <summary>
        /// Returns true if FullOutletDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of FullOutletDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FullOutletDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Coords == other.Coords ||
                    Coords != null &&
                    Coords.Equals(other.Coords)
                ) && 
                (
                    IsMain == other.IsMain ||
                    
                    IsMain.Equals(other.IsMain)
                ) && 
                (
                    ShopOutletCode == other.ShopOutletCode ||
                    ShopOutletCode != null &&
                    ShopOutletCode.Equals(other.ShopOutletCode)
                ) && 
                (
                    Visibility == other.Visibility ||
                    
                    Visibility.Equals(other.Visibility)
                ) && 
                (
                    Address == other.Address ||
                    Address != null &&
                    Address.Equals(other.Address)
                ) && 
                (
                    Phones == other.Phones ||
                    Phones != null &&
                    other.Phones != null &&
                    Phones.SequenceEqual(other.Phones)
                ) && 
                (
                    WorkingSchedule == other.WorkingSchedule ||
                    WorkingSchedule != null &&
                    WorkingSchedule.Equals(other.WorkingSchedule)
                ) && 
                (
                    DeliveryRules == other.DeliveryRules ||
                    DeliveryRules != null &&
                    other.DeliveryRules != null &&
                    DeliveryRules.SequenceEqual(other.DeliveryRules)
                ) && 
                (
                    StoragePeriod == other.StoragePeriod ||
                    
                    StoragePeriod.Equals(other.StoragePeriod)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    Region == other.Region ||
                    Region != null &&
                    Region.Equals(other.Region)
                ) && 
                (
                    ShopOutletId == other.ShopOutletId ||
                    ShopOutletId != null &&
                    ShopOutletId.Equals(other.ShopOutletId)
                ) && 
                (
                    WorkingTime == other.WorkingTime ||
                    WorkingTime != null &&
                    WorkingTime.Equals(other.WorkingTime)
                ) && 
                (
                    ModerationReason == other.ModerationReason ||
                    ModerationReason != null &&
                    ModerationReason.Equals(other.ModerationReason)
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
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Coords != null)
                    hashCode = hashCode * 59 + Coords.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsMain.GetHashCode();
                    if (ShopOutletCode != null)
                    hashCode = hashCode * 59 + ShopOutletCode.GetHashCode();
                    
                    hashCode = hashCode * 59 + Visibility.GetHashCode();
                    if (Address != null)
                    hashCode = hashCode * 59 + Address.GetHashCode();
                    if (Phones != null)
                    hashCode = hashCode * 59 + Phones.GetHashCode();
                    if (WorkingSchedule != null)
                    hashCode = hashCode * 59 + WorkingSchedule.GetHashCode();
                    if (DeliveryRules != null)
                    hashCode = hashCode * 59 + DeliveryRules.GetHashCode();
                    
                    hashCode = hashCode * 59 + StoragePeriod.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (Region != null)
                    hashCode = hashCode * 59 + Region.GetHashCode();
                    if (ShopOutletId != null)
                    hashCode = hashCode * 59 + ShopOutletId.GetHashCode();
                    if (WorkingTime != null)
                    hashCode = hashCode * 59 + WorkingTime.GetHashCode();
                    if (ModerationReason != null)
                    hashCode = hashCode * 59 + ModerationReason.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FullOutletDTO left, FullOutletDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FullOutletDTO left, FullOutletDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
