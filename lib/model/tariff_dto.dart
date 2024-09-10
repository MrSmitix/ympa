//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TariffDTO {
  /// Returns a new [TariffDTO] instance.
  TariffDTO({
    required this.type,
    this.percent,
    required this.amount,
    this.parameters = const [],
  });

  TariffType type;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? percent;

  /// Значение тарифа в рублях.
  num amount;

  /// Параметры расчета тарифа.
  List<TariffParameterDTO> parameters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TariffDTO &&
    other.type == type &&
    other.percent == percent &&
    other.amount == amount &&
    _deepEquality.equals(other.parameters, parameters);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (percent == null ? 0 : percent!.hashCode) +
    (amount.hashCode) +
    (parameters.hashCode);

  @override
  String toString() => 'TariffDTO[type=$type, percent=$percent, amount=$amount, parameters=$parameters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.percent != null) {
      json[r'percent'] = this.percent;
    } else {
      json[r'percent'] = null;
    }
      json[r'amount'] = this.amount;
      json[r'parameters'] = this.parameters;
    return json;
  }

  /// Returns a new [TariffDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TariffDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TariffDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TariffDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TariffDTO(
        type: TariffType.fromJson(json[r'type'])!,
        percent: num.parse('${json[r'percent']}'),
        amount: num.parse('${json[r'amount']}'),
        parameters: TariffParameterDTO.listFromJson(json[r'parameters']),
      );
    }
    return null;
  }

  static List<TariffDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TariffDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TariffDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TariffDTO> mapFromJson(dynamic json) {
    final map = <String, TariffDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TariffDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TariffDTO-objects as value to a dart map
  static Map<String, List<TariffDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TariffDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TariffDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'amount',
    'parameters',
  };
}

