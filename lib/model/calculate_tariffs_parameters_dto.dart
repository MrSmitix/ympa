//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CalculateTariffsParametersDTO {
  /// Returns a new [CalculateTariffsParametersDTO] instance.
  CalculateTariffsParametersDTO({
    this.campaignId,
    this.sellingProgram,
    this.frequency,
  });

  /// Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? campaignId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  SellingProgramType? sellingProgram;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PaymentFrequencyType? frequency;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CalculateTariffsParametersDTO &&
    other.campaignId == campaignId &&
    other.sellingProgram == sellingProgram &&
    other.frequency == frequency;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignId == null ? 0 : campaignId!.hashCode) +
    (sellingProgram == null ? 0 : sellingProgram!.hashCode) +
    (frequency == null ? 0 : frequency!.hashCode);

  @override
  String toString() => 'CalculateTariffsParametersDTO[campaignId=$campaignId, sellingProgram=$sellingProgram, frequency=$frequency]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.campaignId != null) {
      json[r'campaignId'] = this.campaignId;
    } else {
      json[r'campaignId'] = null;
    }
    if (this.sellingProgram != null) {
      json[r'sellingProgram'] = this.sellingProgram;
    } else {
      json[r'sellingProgram'] = null;
    }
    if (this.frequency != null) {
      json[r'frequency'] = this.frequency;
    } else {
      json[r'frequency'] = null;
    }
    return json;
  }

  /// Returns a new [CalculateTariffsParametersDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CalculateTariffsParametersDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CalculateTariffsParametersDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CalculateTariffsParametersDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CalculateTariffsParametersDTO(
        campaignId: mapValueOfType<int>(json, r'campaignId'),
        sellingProgram: SellingProgramType.fromJson(json[r'sellingProgram']),
        frequency: PaymentFrequencyType.fromJson(json[r'frequency']),
      );
    }
    return null;
  }

  static List<CalculateTariffsParametersDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CalculateTariffsParametersDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CalculateTariffsParametersDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CalculateTariffsParametersDTO> mapFromJson(dynamic json) {
    final map = <String, CalculateTariffsParametersDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CalculateTariffsParametersDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CalculateTariffsParametersDTO-objects as value to a dart map
  static Map<String, List<CalculateTariffsParametersDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CalculateTariffsParametersDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CalculateTariffsParametersDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

