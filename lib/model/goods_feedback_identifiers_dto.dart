//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsFeedbackIdentifiersDTO {
  /// Returns a new [GoodsFeedbackIdentifiersDTO] instance.
  GoodsFeedbackIdentifiersDTO({
    required this.orderId,
    required this.modelId,
  });

  /// Идентификатор заказа на Маркете.
  int orderId;

  /// Идентификатор модели товара.
  int modelId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsFeedbackIdentifiersDTO &&
    other.orderId == orderId &&
    other.modelId == modelId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderId.hashCode) +
    (modelId.hashCode);

  @override
  String toString() => 'GoodsFeedbackIdentifiersDTO[orderId=$orderId, modelId=$modelId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'orderId'] = this.orderId;
      json[r'modelId'] = this.modelId;
    return json;
  }

  /// Returns a new [GoodsFeedbackIdentifiersDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsFeedbackIdentifiersDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsFeedbackIdentifiersDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsFeedbackIdentifiersDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsFeedbackIdentifiersDTO(
        orderId: mapValueOfType<int>(json, r'orderId')!,
        modelId: mapValueOfType<int>(json, r'modelId')!,
      );
    }
    return null;
  }

  static List<GoodsFeedbackIdentifiersDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsFeedbackIdentifiersDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsFeedbackIdentifiersDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsFeedbackIdentifiersDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsFeedbackIdentifiersDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsFeedbackIdentifiersDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsFeedbackIdentifiersDTO-objects as value to a dart map
  static Map<String, List<GoodsFeedbackIdentifiersDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsFeedbackIdentifiersDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsFeedbackIdentifiersDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderId',
    'modelId',
  };
}

