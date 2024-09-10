//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetMappingDTO {
  /// Returns a new [GetMappingDTO] instance.
  GetMappingDTO({
    this.marketSku,
    this.marketSkuName,
    this.marketModelId,
    this.marketModelName,
    this.marketCategoryId,
    this.marketCategoryName,
  });

  /// SKU на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketSku;

  /// Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? marketSkuName;

  /// Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketModelId;

  /// Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? marketModelName;

  /// Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketCategoryId;

  /// Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? marketCategoryName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetMappingDTO &&
    other.marketSku == marketSku &&
    other.marketSkuName == marketSkuName &&
    other.marketModelId == marketModelId &&
    other.marketModelName == marketModelName &&
    other.marketCategoryId == marketCategoryId &&
    other.marketCategoryName == marketCategoryName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (marketSku == null ? 0 : marketSku!.hashCode) +
    (marketSkuName == null ? 0 : marketSkuName!.hashCode) +
    (marketModelId == null ? 0 : marketModelId!.hashCode) +
    (marketModelName == null ? 0 : marketModelName!.hashCode) +
    (marketCategoryId == null ? 0 : marketCategoryId!.hashCode) +
    (marketCategoryName == null ? 0 : marketCategoryName!.hashCode);

  @override
  String toString() => 'GetMappingDTO[marketSku=$marketSku, marketSkuName=$marketSkuName, marketModelId=$marketModelId, marketModelName=$marketModelName, marketCategoryId=$marketCategoryId, marketCategoryName=$marketCategoryName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.marketSku != null) {
      json[r'marketSku'] = this.marketSku;
    } else {
      json[r'marketSku'] = null;
    }
    if (this.marketSkuName != null) {
      json[r'marketSkuName'] = this.marketSkuName;
    } else {
      json[r'marketSkuName'] = null;
    }
    if (this.marketModelId != null) {
      json[r'marketModelId'] = this.marketModelId;
    } else {
      json[r'marketModelId'] = null;
    }
    if (this.marketModelName != null) {
      json[r'marketModelName'] = this.marketModelName;
    } else {
      json[r'marketModelName'] = null;
    }
    if (this.marketCategoryId != null) {
      json[r'marketCategoryId'] = this.marketCategoryId;
    } else {
      json[r'marketCategoryId'] = null;
    }
    if (this.marketCategoryName != null) {
      json[r'marketCategoryName'] = this.marketCategoryName;
    } else {
      json[r'marketCategoryName'] = null;
    }
    return json;
  }

  /// Returns a new [GetMappingDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetMappingDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetMappingDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetMappingDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetMappingDTO(
        marketSku: mapValueOfType<int>(json, r'marketSku'),
        marketSkuName: mapValueOfType<String>(json, r'marketSkuName'),
        marketModelId: mapValueOfType<int>(json, r'marketModelId'),
        marketModelName: mapValueOfType<String>(json, r'marketModelName'),
        marketCategoryId: mapValueOfType<int>(json, r'marketCategoryId'),
        marketCategoryName: mapValueOfType<String>(json, r'marketCategoryName'),
      );
    }
    return null;
  }

  static List<GetMappingDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetMappingDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetMappingDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetMappingDTO> mapFromJson(dynamic json) {
    final map = <String, GetMappingDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetMappingDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetMappingDTO-objects as value to a dart map
  static Map<String, List<GetMappingDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetMappingDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetMappingDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

