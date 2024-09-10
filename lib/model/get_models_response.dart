//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetModelsResponse {
  /// Returns a new [GetModelsResponse] instance.
  GetModelsResponse({
    this.models = const [],
    this.currency,
    this.regionId,
  });

  /// Список моделей товаров.
  List<ModelDTO> models;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CurrencyType? currency;

  /// Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? regionId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetModelsResponse &&
    _deepEquality.equals(other.models, models) &&
    other.currency == currency &&
    other.regionId == regionId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (models.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (regionId == null ? 0 : regionId!.hashCode);

  @override
  String toString() => 'GetModelsResponse[models=$models, currency=$currency, regionId=$regionId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'models'] = this.models;
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.regionId != null) {
      json[r'regionId'] = this.regionId;
    } else {
      json[r'regionId'] = null;
    }
    return json;
  }

  /// Returns a new [GetModelsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetModelsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetModelsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetModelsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetModelsResponse(
        models: ModelDTO.listFromJson(json[r'models']),
        currency: CurrencyType.fromJson(json[r'currency']),
        regionId: mapValueOfType<int>(json, r'regionId'),
      );
    }
    return null;
  }

  static List<GetModelsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetModelsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetModelsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetModelsResponse> mapFromJson(dynamic json) {
    final map = <String, GetModelsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetModelsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetModelsResponse-objects as value to a dart map
  static Map<String, List<GetModelsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetModelsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetModelsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'models',
  };
}

