//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsFeedbackDescriptionDTO {
  /// Returns a new [GoodsFeedbackDescriptionDTO] instance.
  GoodsFeedbackDescriptionDTO({
    this.advantages,
    this.disadvantages,
    this.comment,
  });

  /// Описание плюсов товара в отзыве.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? advantages;

  /// Описание минусов товара в отзыве.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? disadvantages;

  /// Комментарий в отзыве.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? comment;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsFeedbackDescriptionDTO &&
    other.advantages == advantages &&
    other.disadvantages == disadvantages &&
    other.comment == comment;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (advantages == null ? 0 : advantages!.hashCode) +
    (disadvantages == null ? 0 : disadvantages!.hashCode) +
    (comment == null ? 0 : comment!.hashCode);

  @override
  String toString() => 'GoodsFeedbackDescriptionDTO[advantages=$advantages, disadvantages=$disadvantages, comment=$comment]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.advantages != null) {
      json[r'advantages'] = this.advantages;
    } else {
      json[r'advantages'] = null;
    }
    if (this.disadvantages != null) {
      json[r'disadvantages'] = this.disadvantages;
    } else {
      json[r'disadvantages'] = null;
    }
    if (this.comment != null) {
      json[r'comment'] = this.comment;
    } else {
      json[r'comment'] = null;
    }
    return json;
  }

  /// Returns a new [GoodsFeedbackDescriptionDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsFeedbackDescriptionDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsFeedbackDescriptionDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsFeedbackDescriptionDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsFeedbackDescriptionDTO(
        advantages: mapValueOfType<String>(json, r'advantages'),
        disadvantages: mapValueOfType<String>(json, r'disadvantages'),
        comment: mapValueOfType<String>(json, r'comment'),
      );
    }
    return null;
  }

  static List<GoodsFeedbackDescriptionDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsFeedbackDescriptionDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsFeedbackDescriptionDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsFeedbackDescriptionDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsFeedbackDescriptionDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsFeedbackDescriptionDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsFeedbackDescriptionDTO-objects as value to a dart map
  static Map<String, List<GoodsFeedbackDescriptionDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsFeedbackDescriptionDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsFeedbackDescriptionDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

