//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderDeliveryAddressDTO {
  /// Returns a new [OrderDeliveryAddressDTO] instance.
  OrderDeliveryAddressDTO({
    this.country,
    this.postcode,
    this.city,
    this.district,
    this.subway,
    this.street,
    this.house,
    this.block,
    this.entrance,
    this.entryphone,
    this.floor,
    this.apartment,
    this.phone,
    this.recipient,
    this.gps,
  });

  /// Страна.  Обязательный параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? country;

  /// Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? postcode;

  /// Город или населенный пункт.  Обязательный параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? city;

  /// Район.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? district;

  /// Станция метро.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? subway;

  /// Улица.  Обязательный параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? street;

  /// Дом или владение.  Обязательный параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? house;

  /// Корпус или строение.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? block;

  /// Подъезд.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? entrance;

  /// Код домофона.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? entryphone;

  /// Этаж.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? floor;

  /// Квартира или офис.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? apartment;

  /// Телефон получателя заказа.  Обязательный параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? phone;

  /// Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? recipient;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GpsDTO? gps;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderDeliveryAddressDTO &&
    other.country == country &&
    other.postcode == postcode &&
    other.city == city &&
    other.district == district &&
    other.subway == subway &&
    other.street == street &&
    other.house == house &&
    other.block == block &&
    other.entrance == entrance &&
    other.entryphone == entryphone &&
    other.floor == floor &&
    other.apartment == apartment &&
    other.phone == phone &&
    other.recipient == recipient &&
    other.gps == gps;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country == null ? 0 : country!.hashCode) +
    (postcode == null ? 0 : postcode!.hashCode) +
    (city == null ? 0 : city!.hashCode) +
    (district == null ? 0 : district!.hashCode) +
    (subway == null ? 0 : subway!.hashCode) +
    (street == null ? 0 : street!.hashCode) +
    (house == null ? 0 : house!.hashCode) +
    (block == null ? 0 : block!.hashCode) +
    (entrance == null ? 0 : entrance!.hashCode) +
    (entryphone == null ? 0 : entryphone!.hashCode) +
    (floor == null ? 0 : floor!.hashCode) +
    (apartment == null ? 0 : apartment!.hashCode) +
    (phone == null ? 0 : phone!.hashCode) +
    (recipient == null ? 0 : recipient!.hashCode) +
    (gps == null ? 0 : gps!.hashCode);

  @override
  String toString() => 'OrderDeliveryAddressDTO[country=$country, postcode=$postcode, city=$city, district=$district, subway=$subway, street=$street, house=$house, block=$block, entrance=$entrance, entryphone=$entryphone, floor=$floor, apartment=$apartment, phone=$phone, recipient=$recipient, gps=$gps]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.postcode != null) {
      json[r'postcode'] = this.postcode;
    } else {
      json[r'postcode'] = null;
    }
    if (this.city != null) {
      json[r'city'] = this.city;
    } else {
      json[r'city'] = null;
    }
    if (this.district != null) {
      json[r'district'] = this.district;
    } else {
      json[r'district'] = null;
    }
    if (this.subway != null) {
      json[r'subway'] = this.subway;
    } else {
      json[r'subway'] = null;
    }
    if (this.street != null) {
      json[r'street'] = this.street;
    } else {
      json[r'street'] = null;
    }
    if (this.house != null) {
      json[r'house'] = this.house;
    } else {
      json[r'house'] = null;
    }
    if (this.block != null) {
      json[r'block'] = this.block;
    } else {
      json[r'block'] = null;
    }
    if (this.entrance != null) {
      json[r'entrance'] = this.entrance;
    } else {
      json[r'entrance'] = null;
    }
    if (this.entryphone != null) {
      json[r'entryphone'] = this.entryphone;
    } else {
      json[r'entryphone'] = null;
    }
    if (this.floor != null) {
      json[r'floor'] = this.floor;
    } else {
      json[r'floor'] = null;
    }
    if (this.apartment != null) {
      json[r'apartment'] = this.apartment;
    } else {
      json[r'apartment'] = null;
    }
    if (this.phone != null) {
      json[r'phone'] = this.phone;
    } else {
      json[r'phone'] = null;
    }
    if (this.recipient != null) {
      json[r'recipient'] = this.recipient;
    } else {
      json[r'recipient'] = null;
    }
    if (this.gps != null) {
      json[r'gps'] = this.gps;
    } else {
      json[r'gps'] = null;
    }
    return json;
  }

  /// Returns a new [OrderDeliveryAddressDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderDeliveryAddressDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderDeliveryAddressDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderDeliveryAddressDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderDeliveryAddressDTO(
        country: mapValueOfType<String>(json, r'country'),
        postcode: mapValueOfType<String>(json, r'postcode'),
        city: mapValueOfType<String>(json, r'city'),
        district: mapValueOfType<String>(json, r'district'),
        subway: mapValueOfType<String>(json, r'subway'),
        street: mapValueOfType<String>(json, r'street'),
        house: mapValueOfType<String>(json, r'house'),
        block: mapValueOfType<String>(json, r'block'),
        entrance: mapValueOfType<String>(json, r'entrance'),
        entryphone: mapValueOfType<String>(json, r'entryphone'),
        floor: mapValueOfType<String>(json, r'floor'),
        apartment: mapValueOfType<String>(json, r'apartment'),
        phone: mapValueOfType<String>(json, r'phone'),
        recipient: mapValueOfType<String>(json, r'recipient'),
        gps: GpsDTO.fromJson(json[r'gps']),
      );
    }
    return null;
  }

  static List<OrderDeliveryAddressDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryAddressDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryAddressDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderDeliveryAddressDTO> mapFromJson(dynamic json) {
    final map = <String, OrderDeliveryAddressDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderDeliveryAddressDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderDeliveryAddressDTO-objects as value to a dart map
  static Map<String, List<OrderDeliveryAddressDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderDeliveryAddressDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderDeliveryAddressDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

