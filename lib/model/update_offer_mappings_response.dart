//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOfferMappingsResponse {
  /// Returns a new [UpdateOfferMappingsResponse] instance.
  UpdateOfferMappingsResponse({
    this.status,
    this.results = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ApiResponseStatusType? status;

  /// Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
  List<UpdateOfferMappingResultDTO>? results;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOfferMappingsResponse &&
    other.status == status &&
    _deepEquality.equals(other.results, results);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (results == null ? 0 : results!.hashCode);

  @override
  String toString() => 'UpdateOfferMappingsResponse[status=$status, results=$results]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.results != null) {
      json[r'results'] = this.results;
    } else {
      json[r'results'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateOfferMappingsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOfferMappingsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOfferMappingsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOfferMappingsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOfferMappingsResponse(
        status: ApiResponseStatusType.fromJson(json[r'status']),
        results: UpdateOfferMappingResultDTO.listFromJson(json[r'results']),
      );
    }
    return null;
  }

  static List<UpdateOfferMappingsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOfferMappingsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOfferMappingsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOfferMappingsResponse> mapFromJson(dynamic json) {
    final map = <String, UpdateOfferMappingsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOfferMappingsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOfferMappingsResponse-objects as value to a dart map
  static Map<String, List<UpdateOfferMappingsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOfferMappingsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOfferMappingsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

