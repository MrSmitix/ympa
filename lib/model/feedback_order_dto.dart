//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedbackOrderDTO {
  /// Returns a new [FeedbackOrderDTO] instance.
  FeedbackOrderDTO({
    this.shopOrderId,
    this.delivery,
  });

  /// Номер заказа, указанный в отзыве.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopOrderId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedbackDeliveryType? delivery;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedbackOrderDTO &&
    other.shopOrderId == shopOrderId &&
    other.delivery == delivery;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (shopOrderId == null ? 0 : shopOrderId!.hashCode) +
    (delivery == null ? 0 : delivery!.hashCode);

  @override
  String toString() => 'FeedbackOrderDTO[shopOrderId=$shopOrderId, delivery=$delivery]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.shopOrderId != null) {
      json[r'shopOrderId'] = this.shopOrderId;
    } else {
      json[r'shopOrderId'] = null;
    }
    if (this.delivery != null) {
      json[r'delivery'] = this.delivery;
    } else {
      json[r'delivery'] = null;
    }
    return json;
  }

  /// Returns a new [FeedbackOrderDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedbackOrderDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedbackOrderDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedbackOrderDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedbackOrderDTO(
        shopOrderId: mapValueOfType<String>(json, r'shopOrderId'),
        delivery: FeedbackDeliveryType.fromJson(json[r'delivery']),
      );
    }
    return null;
  }

  static List<FeedbackOrderDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedbackOrderDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedbackOrderDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedbackOrderDTO> mapFromJson(dynamic json) {
    final map = <String, FeedbackOrderDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedbackOrderDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedbackOrderDTO-objects as value to a dart map
  static Map<String, List<FeedbackOrderDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedbackOrderDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedbackOrderDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

