//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferMappingDTO {
  /// Returns a new [OfferMappingDTO] instance.
  OfferMappingDTO({
    this.marketSku,
    this.modelId,
    this.categoryId,
  });

  /// SKU на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketSku;

  /// Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? modelId;

  /// Идентификатор категории для текущей карточки товара на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? categoryId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferMappingDTO &&
    other.marketSku == marketSku &&
    other.modelId == modelId &&
    other.categoryId == categoryId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (marketSku == null ? 0 : marketSku!.hashCode) +
    (modelId == null ? 0 : modelId!.hashCode) +
    (categoryId == null ? 0 : categoryId!.hashCode);

  @override
  String toString() => 'OfferMappingDTO[marketSku=$marketSku, modelId=$modelId, categoryId=$categoryId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.marketSku != null) {
      json[r'marketSku'] = this.marketSku;
    } else {
      json[r'marketSku'] = null;
    }
    if (this.modelId != null) {
      json[r'modelId'] = this.modelId;
    } else {
      json[r'modelId'] = null;
    }
    if (this.categoryId != null) {
      json[r'categoryId'] = this.categoryId;
    } else {
      json[r'categoryId'] = null;
    }
    return json;
  }

  /// Returns a new [OfferMappingDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferMappingDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferMappingDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferMappingDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferMappingDTO(
        marketSku: mapValueOfType<int>(json, r'marketSku'),
        modelId: mapValueOfType<int>(json, r'modelId'),
        categoryId: mapValueOfType<int>(json, r'categoryId'),
      );
    }
    return null;
  }

  static List<OfferMappingDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferMappingDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferMappingDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferMappingDTO> mapFromJson(dynamic json) {
    final map = <String, OfferMappingDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferMappingDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferMappingDTO-objects as value to a dart map
  static Map<String, List<OfferMappingDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferMappingDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferMappingDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

