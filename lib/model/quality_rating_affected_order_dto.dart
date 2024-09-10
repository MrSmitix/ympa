//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QualityRatingAffectedOrderDTO {
  /// Returns a new [QualityRatingAffectedOrderDTO] instance.
  QualityRatingAffectedOrderDTO({
    required this.orderId,
    required this.description,
    required this.componentType,
  });

  /// Идентификатор заказа.
  ///
  /// Minimum value: 0
  int orderId;

  /// Описание проблемы.
  String description;

  AffectedOrderQualityRatingComponentType componentType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QualityRatingAffectedOrderDTO &&
    other.orderId == orderId &&
    other.description == description &&
    other.componentType == componentType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderId.hashCode) +
    (description.hashCode) +
    (componentType.hashCode);

  @override
  String toString() => 'QualityRatingAffectedOrderDTO[orderId=$orderId, description=$description, componentType=$componentType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'orderId'] = this.orderId;
      json[r'description'] = this.description;
      json[r'componentType'] = this.componentType;
    return json;
  }

  /// Returns a new [QualityRatingAffectedOrderDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QualityRatingAffectedOrderDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QualityRatingAffectedOrderDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QualityRatingAffectedOrderDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QualityRatingAffectedOrderDTO(
        orderId: mapValueOfType<int>(json, r'orderId')!,
        description: mapValueOfType<String>(json, r'description')!,
        componentType: AffectedOrderQualityRatingComponentType.fromJson(json[r'componentType'])!,
      );
    }
    return null;
  }

  static List<QualityRatingAffectedOrderDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QualityRatingAffectedOrderDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QualityRatingAffectedOrderDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QualityRatingAffectedOrderDTO> mapFromJson(dynamic json) {
    final map = <String, QualityRatingAffectedOrderDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QualityRatingAffectedOrderDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QualityRatingAffectedOrderDTO-objects as value to a dart map
  static Map<String, List<QualityRatingAffectedOrderDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QualityRatingAffectedOrderDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QualityRatingAffectedOrderDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderId',
    'description',
    'componentType',
  };
}

