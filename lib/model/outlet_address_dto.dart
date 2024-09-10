//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OutletAddressDTO {
  /// Returns a new [OutletAddressDTO] instance.
  OutletAddressDTO({
    required this.regionId,
    this.street,
    this.number,
    this.building,
    this.estate,
    this.block,
    this.additional,
    this.km,
    this.city,
  });

  /// Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
  int regionId;

  /// Улица.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? street;

  /// Номер дома.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? number;

  /// Номер строения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? building;

  /// Номер владения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? estate;

  /// Номер корпуса.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? block;

  /// Дополнительная информация.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? additional;

  /// Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? km;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? city;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OutletAddressDTO &&
    other.regionId == regionId &&
    other.street == street &&
    other.number == number &&
    other.building == building &&
    other.estate == estate &&
    other.block == block &&
    other.additional == additional &&
    other.km == km &&
    other.city == city;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (regionId.hashCode) +
    (street == null ? 0 : street!.hashCode) +
    (number == null ? 0 : number!.hashCode) +
    (building == null ? 0 : building!.hashCode) +
    (estate == null ? 0 : estate!.hashCode) +
    (block == null ? 0 : block!.hashCode) +
    (additional == null ? 0 : additional!.hashCode) +
    (km == null ? 0 : km!.hashCode) +
    (city == null ? 0 : city!.hashCode);

  @override
  String toString() => 'OutletAddressDTO[regionId=$regionId, street=$street, number=$number, building=$building, estate=$estate, block=$block, additional=$additional, km=$km, city=$city]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'regionId'] = this.regionId;
    if (this.street != null) {
      json[r'street'] = this.street;
    } else {
      json[r'street'] = null;
    }
    if (this.number != null) {
      json[r'number'] = this.number;
    } else {
      json[r'number'] = null;
    }
    if (this.building != null) {
      json[r'building'] = this.building;
    } else {
      json[r'building'] = null;
    }
    if (this.estate != null) {
      json[r'estate'] = this.estate;
    } else {
      json[r'estate'] = null;
    }
    if (this.block != null) {
      json[r'block'] = this.block;
    } else {
      json[r'block'] = null;
    }
    if (this.additional != null) {
      json[r'additional'] = this.additional;
    } else {
      json[r'additional'] = null;
    }
    if (this.km != null) {
      json[r'km'] = this.km;
    } else {
      json[r'km'] = null;
    }
    if (this.city != null) {
      json[r'city'] = this.city;
    } else {
      json[r'city'] = null;
    }
    return json;
  }

  /// Returns a new [OutletAddressDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OutletAddressDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OutletAddressDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OutletAddressDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OutletAddressDTO(
        regionId: mapValueOfType<int>(json, r'regionId')!,
        street: mapValueOfType<String>(json, r'street'),
        number: mapValueOfType<String>(json, r'number'),
        building: mapValueOfType<String>(json, r'building'),
        estate: mapValueOfType<String>(json, r'estate'),
        block: mapValueOfType<String>(json, r'block'),
        additional: mapValueOfType<String>(json, r'additional'),
        km: mapValueOfType<int>(json, r'km'),
        city: mapValueOfType<String>(json, r'city'),
      );
    }
    return null;
  }

  static List<OutletAddressDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletAddressDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletAddressDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OutletAddressDTO> mapFromJson(dynamic json) {
    final map = <String, OutletAddressDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OutletAddressDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OutletAddressDTO-objects as value to a dart map
  static Map<String, List<OutletAddressDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OutletAddressDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OutletAddressDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'regionId',
  };
}

