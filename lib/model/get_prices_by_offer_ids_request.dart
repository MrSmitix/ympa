//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPricesByOfferIdsRequest {
  /// Returns a new [GetPricesByOfferIdsRequest] instance.
  GetPricesByOfferIdsRequest({
    this.offerIds = const [],
  });

  /// Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  List<String>? offerIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPricesByOfferIdsRequest &&
    _deepEquality.equals(other.offerIds, offerIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds == null ? 0 : offerIds!.hashCode);

  @override
  String toString() => 'GetPricesByOfferIdsRequest[offerIds=$offerIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offerIds != null) {
      json[r'offerIds'] = this.offerIds;
    } else {
      json[r'offerIds'] = null;
    }
    return json;
  }

  /// Returns a new [GetPricesByOfferIdsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPricesByOfferIdsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPricesByOfferIdsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPricesByOfferIdsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPricesByOfferIdsRequest(
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<GetPricesByOfferIdsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPricesByOfferIdsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPricesByOfferIdsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPricesByOfferIdsRequest> mapFromJson(dynamic json) {
    final map = <String, GetPricesByOfferIdsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPricesByOfferIdsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPricesByOfferIdsRequest-objects as value to a dart map
  static Map<String, List<GetPricesByOfferIdsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPricesByOfferIdsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPricesByOfferIdsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

