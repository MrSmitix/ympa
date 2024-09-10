//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedPlacementDTO {
  /// Returns a new [FeedPlacementDTO] instance.
  FeedPlacementDTO({
    this.status,
    this.totalOffersCount,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedStatusType? status;

  /// Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalOffersCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedPlacementDTO &&
    other.status == status &&
    other.totalOffersCount == totalOffersCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (totalOffersCount == null ? 0 : totalOffersCount!.hashCode);

  @override
  String toString() => 'FeedPlacementDTO[status=$status, totalOffersCount=$totalOffersCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.totalOffersCount != null) {
      json[r'totalOffersCount'] = this.totalOffersCount;
    } else {
      json[r'totalOffersCount'] = null;
    }
    return json;
  }

  /// Returns a new [FeedPlacementDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedPlacementDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedPlacementDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedPlacementDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedPlacementDTO(
        status: FeedStatusType.fromJson(json[r'status']),
        totalOffersCount: mapValueOfType<int>(json, r'totalOffersCount'),
      );
    }
    return null;
  }

  static List<FeedPlacementDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedPlacementDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedPlacementDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedPlacementDTO> mapFromJson(dynamic json) {
    final map = <String, FeedPlacementDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedPlacementDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedPlacementDTO-objects as value to a dart map
  static Map<String, List<FeedPlacementDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedPlacementDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedPlacementDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

