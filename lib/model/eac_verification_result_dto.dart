//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EacVerificationResultDTO {
  /// Returns a new [EacVerificationResultDTO] instance.
  EacVerificationResultDTO({
    this.verificationResult,
    this.attemptsLeft,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EacVerificationStatusType? verificationResult;

  /// Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? attemptsLeft;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EacVerificationResultDTO &&
    other.verificationResult == verificationResult &&
    other.attemptsLeft == attemptsLeft;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (verificationResult == null ? 0 : verificationResult!.hashCode) +
    (attemptsLeft == null ? 0 : attemptsLeft!.hashCode);

  @override
  String toString() => 'EacVerificationResultDTO[verificationResult=$verificationResult, attemptsLeft=$attemptsLeft]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.verificationResult != null) {
      json[r'verificationResult'] = this.verificationResult;
    } else {
      json[r'verificationResult'] = null;
    }
    if (this.attemptsLeft != null) {
      json[r'attemptsLeft'] = this.attemptsLeft;
    } else {
      json[r'attemptsLeft'] = null;
    }
    return json;
  }

  /// Returns a new [EacVerificationResultDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EacVerificationResultDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EacVerificationResultDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EacVerificationResultDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EacVerificationResultDTO(
        verificationResult: EacVerificationStatusType.fromJson(json[r'verificationResult']),
        attemptsLeft: mapValueOfType<int>(json, r'attemptsLeft'),
      );
    }
    return null;
  }

  static List<EacVerificationResultDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EacVerificationResultDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EacVerificationResultDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EacVerificationResultDTO> mapFromJson(dynamic json) {
    final map = <String, EacVerificationResultDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EacVerificationResultDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EacVerificationResultDTO-objects as value to a dart map
  static Map<String, List<EacVerificationResultDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EacVerificationResultDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EacVerificationResultDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

