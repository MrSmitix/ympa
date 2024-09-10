//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferMappingErrorDTO {
  /// Returns a new [OfferMappingErrorDTO] instance.
  OfferMappingErrorDTO({
    required this.type,
    this.parameterId,
    required this.message,
  });

  OfferMappingErrorType type;

  /// Идентификатор характеристики, с которой связана ошибка.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? parameterId;

  /// Текст ошибки.
  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferMappingErrorDTO &&
    other.type == type &&
    other.parameterId == parameterId &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (parameterId == null ? 0 : parameterId!.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'OfferMappingErrorDTO[type=$type, parameterId=$parameterId, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.parameterId != null) {
      json[r'parameterId'] = this.parameterId;
    } else {
      json[r'parameterId'] = null;
    }
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [OfferMappingErrorDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferMappingErrorDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferMappingErrorDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferMappingErrorDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferMappingErrorDTO(
        type: OfferMappingErrorType.fromJson(json[r'type'])!,
        parameterId: mapValueOfType<int>(json, r'parameterId'),
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<OfferMappingErrorDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferMappingErrorDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferMappingErrorDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferMappingErrorDTO> mapFromJson(dynamic json) {
    final map = <String, OfferMappingErrorDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferMappingErrorDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferMappingErrorDTO-objects as value to a dart map
  static Map<String, List<OfferMappingErrorDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferMappingErrorDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferMappingErrorDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'message',
  };
}

