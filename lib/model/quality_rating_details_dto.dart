//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QualityRatingDetailsDTO {
  /// Returns a new [QualityRatingDetailsDTO] instance.
  QualityRatingDetailsDTO({
    this.affectedOrders = const [],
  });

  /// Список заказов, которые повлияли на индекс качества.
  List<QualityRatingAffectedOrderDTO> affectedOrders;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QualityRatingDetailsDTO &&
    _deepEquality.equals(other.affectedOrders, affectedOrders);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (affectedOrders.hashCode);

  @override
  String toString() => 'QualityRatingDetailsDTO[affectedOrders=$affectedOrders]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'affectedOrders'] = this.affectedOrders;
    return json;
  }

  /// Returns a new [QualityRatingDetailsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QualityRatingDetailsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QualityRatingDetailsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QualityRatingDetailsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QualityRatingDetailsDTO(
        affectedOrders: QualityRatingAffectedOrderDTO.listFromJson(json[r'affectedOrders']),
      );
    }
    return null;
  }

  static List<QualityRatingDetailsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QualityRatingDetailsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QualityRatingDetailsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QualityRatingDetailsDTO> mapFromJson(dynamic json) {
    final map = <String, QualityRatingDetailsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QualityRatingDetailsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QualityRatingDetailsDTO-objects as value to a dart map
  static Map<String, List<QualityRatingDetailsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QualityRatingDetailsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QualityRatingDetailsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'affectedOrders',
  };
}

