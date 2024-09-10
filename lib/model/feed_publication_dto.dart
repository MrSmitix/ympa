//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedPublicationDTO {
  /// Returns a new [FeedPublicationDTO] instance.
  FeedPublicationDTO({
    this.status,
    this.full,
    this.priceAndStockUpdate,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedStatusType? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedPublicationFullDTO? full;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedPublicationPriceAndStockUpdateDTO? priceAndStockUpdate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedPublicationDTO &&
    other.status == status &&
    other.full == full &&
    other.priceAndStockUpdate == priceAndStockUpdate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (full == null ? 0 : full!.hashCode) +
    (priceAndStockUpdate == null ? 0 : priceAndStockUpdate!.hashCode);

  @override
  String toString() => 'FeedPublicationDTO[status=$status, full=$full, priceAndStockUpdate=$priceAndStockUpdate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.full != null) {
      json[r'full'] = this.full;
    } else {
      json[r'full'] = null;
    }
    if (this.priceAndStockUpdate != null) {
      json[r'priceAndStockUpdate'] = this.priceAndStockUpdate;
    } else {
      json[r'priceAndStockUpdate'] = null;
    }
    return json;
  }

  /// Returns a new [FeedPublicationDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedPublicationDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedPublicationDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedPublicationDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedPublicationDTO(
        status: FeedStatusType.fromJson(json[r'status']),
        full: FeedPublicationFullDTO.fromJson(json[r'full']),
        priceAndStockUpdate: FeedPublicationPriceAndStockUpdateDTO.fromJson(json[r'priceAndStockUpdate']),
      );
    }
    return null;
  }

  static List<FeedPublicationDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedPublicationDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedPublicationDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedPublicationDTO> mapFromJson(dynamic json) {
    final map = <String, FeedPublicationDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedPublicationDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedPublicationDTO-objects as value to a dart map
  static Map<String, List<FeedPublicationDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedPublicationDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedPublicationDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

