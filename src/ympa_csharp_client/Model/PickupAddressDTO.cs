/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ympa_csharp_client.Client.OpenAPIDateConverter;

namespace ympa_csharp_client.Model
{
    /// <summary>
    /// Адрес доставки.
    /// </summary>
    [DataContract(Name = "PickupAddressDTO")]
    public partial class PickupAddressDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PickupAddressDTO" /> class.
        /// </summary>
        /// <param name="country">Страна..</param>
        /// <param name="city">Город..</param>
        /// <param name="street">Улица..</param>
        /// <param name="house">Номер дома..</param>
        /// <param name="postcode">Почтовый индекс..</param>
        public PickupAddressDTO(string country = default(string), string city = default(string), string street = default(string), string house = default(string), string postcode = default(string))
        {
            this.Country = country;
            this.City = city;
            this.Street = street;
            this.House = house;
            this.Postcode = postcode;
        }

        /// <summary>
        /// Страна.
        /// </summary>
        /// <value>Страна.</value>
        /// <example>Россия</example>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Город.
        /// </summary>
        /// <value>Город.</value>
        /// <example>Москва</example>
        [DataMember(Name = "city", EmitDefaultValue = false)]
        public string City { get; set; }

        /// <summary>
        /// Улица.
        /// </summary>
        /// <value>Улица.</value>
        /// <example>Стрелецкая улица</example>
        [DataMember(Name = "street", EmitDefaultValue = false)]
        public string Street { get; set; }

        /// <summary>
        /// Номер дома.
        /// </summary>
        /// <value>Номер дома.</value>
        /// <example>9к2</example>
        [DataMember(Name = "house", EmitDefaultValue = false)]
        public string House { get; set; }

        /// <summary>
        /// Почтовый индекс.
        /// </summary>
        /// <value>Почтовый индекс.</value>
        /// <example>123518</example>
        [DataMember(Name = "postcode", EmitDefaultValue = false)]
        public string Postcode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PickupAddressDTO {\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  Street: ").Append(Street).Append("\n");
            sb.Append("  House: ").Append(House).Append("\n");
            sb.Append("  Postcode: ").Append(Postcode).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
