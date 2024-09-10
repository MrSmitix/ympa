//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeletePromoOffersRequest {
  /// Returns a new [DeletePromoOffersRequest] instance.
  DeletePromoOffersRequest({
    required this.promoId,
    this.deleteAllOffers,
    this.offerIds = const [],
  });

  /// Идентификатор акции.
  String promoId;

  /// Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? deleteAllOffers;

  /// Товары, которые нужно убрать из акции.
  List<String>? offerIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeletePromoOffersRequest &&
    other.promoId == promoId &&
    other.deleteAllOffers == deleteAllOffers &&
    _deepEquality.equals(other.offerIds, offerIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (promoId.hashCode) +
    (deleteAllOffers == null ? 0 : deleteAllOffers!.hashCode) +
    (offerIds == null ? 0 : offerIds!.hashCode);

  @override
  String toString() => 'DeletePromoOffersRequest[promoId=$promoId, deleteAllOffers=$deleteAllOffers, offerIds=$offerIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'promoId'] = this.promoId;
    if (this.deleteAllOffers != null) {
      json[r'deleteAllOffers'] = this.deleteAllOffers;
    } else {
      json[r'deleteAllOffers'] = null;
    }
    if (this.offerIds != null) {
      json[r'offerIds'] = this.offerIds;
    } else {
      json[r'offerIds'] = null;
    }
    return json;
  }

  /// Returns a new [DeletePromoOffersRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeletePromoOffersRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeletePromoOffersRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeletePromoOffersRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeletePromoOffersRequest(
        promoId: mapValueOfType<String>(json, r'promoId')!,
        deleteAllOffers: mapValueOfType<bool>(json, r'deleteAllOffers'),
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<DeletePromoOffersRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePromoOffersRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePromoOffersRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeletePromoOffersRequest> mapFromJson(dynamic json) {
    final map = <String, DeletePromoOffersRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeletePromoOffersRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeletePromoOffersRequest-objects as value to a dart map
  static Map<String, List<DeletePromoOffersRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeletePromoOffersRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeletePromoOffersRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'promoId',
  };
}

