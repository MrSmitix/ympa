//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CalculatedTariffDTO {
  /// Returns a new [CalculatedTariffDTO] instance.
  CalculatedTariffDTO({
    required this.type,
    this.amount,
    this.parameters = const [],
  });

  CalculatedTariffType type;

  /// Стоимость услуги в рублях.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? amount;

  /// Параметры расчета тарифа.
  List<TariffParameterDTO> parameters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CalculatedTariffDTO &&
    other.type == type &&
    other.amount == amount &&
    _deepEquality.equals(other.parameters, parameters);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (amount == null ? 0 : amount!.hashCode) +
    (parameters.hashCode);

  @override
  String toString() => 'CalculatedTariffDTO[type=$type, amount=$amount, parameters=$parameters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.amount != null) {
      json[r'amount'] = this.amount;
    } else {
      json[r'amount'] = null;
    }
      json[r'parameters'] = this.parameters;
    return json;
  }

  /// Returns a new [CalculatedTariffDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CalculatedTariffDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CalculatedTariffDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CalculatedTariffDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CalculatedTariffDTO(
        type: CalculatedTariffType.fromJson(json[r'type'])!,
        amount: num.parse('${json[r'amount']}'),
        parameters: TariffParameterDTO.listFromJson(json[r'parameters']),
      );
    }
    return null;
  }

  static List<CalculatedTariffDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CalculatedTariffDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CalculatedTariffDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CalculatedTariffDTO> mapFromJson(dynamic json) {
    final map = <String, CalculatedTariffDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CalculatedTariffDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CalculatedTariffDTO-objects as value to a dart map
  static Map<String, List<CalculatedTariffDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CalculatedTariffDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CalculatedTariffDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'parameters',
  };
}

