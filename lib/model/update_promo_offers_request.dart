//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdatePromoOffersRequest {
  /// Returns a new [UpdatePromoOffersRequest] instance.
  UpdatePromoOffersRequest({
    required this.promoId,
    this.offers = const [],
  });

  /// Идентификатор акции.
  String promoId;

  /// Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
  List<UpdatePromoOfferDTO> offers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdatePromoOffersRequest &&
    other.promoId == promoId &&
    _deepEquality.equals(other.offers, offers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (promoId.hashCode) +
    (offers.hashCode);

  @override
  String toString() => 'UpdatePromoOffersRequest[promoId=$promoId, offers=$offers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'promoId'] = this.promoId;
      json[r'offers'] = this.offers;
    return json;
  }

  /// Returns a new [UpdatePromoOffersRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdatePromoOffersRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdatePromoOffersRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdatePromoOffersRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdatePromoOffersRequest(
        promoId: mapValueOfType<String>(json, r'promoId')!,
        offers: UpdatePromoOfferDTO.listFromJson(json[r'offers']),
      );
    }
    return null;
  }

  static List<UpdatePromoOffersRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdatePromoOffersRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdatePromoOffersRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdatePromoOffersRequest> mapFromJson(dynamic json) {
    final map = <String, UpdatePromoOffersRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdatePromoOffersRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdatePromoOffersRequest-objects as value to a dart map
  static Map<String, List<UpdatePromoOffersRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdatePromoOffersRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdatePromoOffersRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'promoId',
    'offers',
  };
}

