//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LogisticPickupPointDTO {
  /// Returns a new [LogisticPickupPointDTO] instance.
  LogisticPickupPointDTO({
    this.id,
    this.name,
    this.address,
    this.instruction,
    this.type,
    this.logisticPartnerId,
  });

  /// Идентификатор пункта вывоза.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Название пункта вывоза.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PickupAddressDTO? address;

  /// Дополнительные инструкции к вывозу.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? instruction;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LogisticPointType? type;

  /// Идентификатор логистического партнера, к которому относится логистическая точка.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? logisticPartnerId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LogisticPickupPointDTO &&
    other.id == id &&
    other.name == name &&
    other.address == address &&
    other.instruction == instruction &&
    other.type == type &&
    other.logisticPartnerId == logisticPartnerId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (address == null ? 0 : address!.hashCode) +
    (instruction == null ? 0 : instruction!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (logisticPartnerId == null ? 0 : logisticPartnerId!.hashCode);

  @override
  String toString() => 'LogisticPickupPointDTO[id=$id, name=$name, address=$address, instruction=$instruction, type=$type, logisticPartnerId=$logisticPartnerId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.address != null) {
      json[r'address'] = this.address;
    } else {
      json[r'address'] = null;
    }
    if (this.instruction != null) {
      json[r'instruction'] = this.instruction;
    } else {
      json[r'instruction'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.logisticPartnerId != null) {
      json[r'logisticPartnerId'] = this.logisticPartnerId;
    } else {
      json[r'logisticPartnerId'] = null;
    }
    return json;
  }

  /// Returns a new [LogisticPickupPointDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LogisticPickupPointDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LogisticPickupPointDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LogisticPickupPointDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LogisticPickupPointDTO(
        id: mapValueOfType<int>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        address: PickupAddressDTO.fromJson(json[r'address']),
        instruction: mapValueOfType<String>(json, r'instruction'),
        type: LogisticPointType.fromJson(json[r'type']),
        logisticPartnerId: mapValueOfType<int>(json, r'logisticPartnerId'),
      );
    }
    return null;
  }

  static List<LogisticPickupPointDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LogisticPickupPointDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LogisticPickupPointDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LogisticPickupPointDTO> mapFromJson(dynamic json) {
    final map = <String, LogisticPickupPointDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LogisticPickupPointDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LogisticPickupPointDTO-objects as value to a dart map
  static Map<String, List<LogisticPickupPointDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LogisticPickupPointDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LogisticPickupPointDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

