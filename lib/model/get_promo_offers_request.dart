//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromoOffersRequest {
  /// Returns a new [GetPromoOffersRequest] instance.
  GetPromoOffersRequest({
    required this.promoId,
    this.statusType,
  });

  /// Идентификатор акции.
  String promoId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PromoOfferParticipationStatusFilterType? statusType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromoOffersRequest &&
    other.promoId == promoId &&
    other.statusType == statusType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (promoId.hashCode) +
    (statusType == null ? 0 : statusType!.hashCode);

  @override
  String toString() => 'GetPromoOffersRequest[promoId=$promoId, statusType=$statusType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'promoId'] = this.promoId;
    if (this.statusType != null) {
      json[r'statusType'] = this.statusType;
    } else {
      json[r'statusType'] = null;
    }
    return json;
  }

  /// Returns a new [GetPromoOffersRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromoOffersRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromoOffersRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromoOffersRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromoOffersRequest(
        promoId: mapValueOfType<String>(json, r'promoId')!,
        statusType: PromoOfferParticipationStatusFilterType.fromJson(json[r'statusType']),
      );
    }
    return null;
  }

  static List<GetPromoOffersRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromoOffersRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromoOffersRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromoOffersRequest> mapFromJson(dynamic json) {
    final map = <String, GetPromoOffersRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromoOffersRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromoOffersRequest-objects as value to a dart map
  static Map<String, List<GetPromoOffersRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromoOffersRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromoOffersRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'promoId',
  };
}

