//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetOfferRecommendationsRequest {
  /// Returns a new [GetOfferRecommendationsRequest] instance.
  GetOfferRecommendationsRequest({
    this.offerIds = const [],
    this.cofinancePriceFilter,
    this.recommendedCofinancePriceFilter,
    this.competitivenessFilter,
  });

  /// Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
  List<String>? offerIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FieldStateType? cofinancePriceFilter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FieldStateType? recommendedCofinancePriceFilter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PriceCompetitivenessType? competitivenessFilter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetOfferRecommendationsRequest &&
    _deepEquality.equals(other.offerIds, offerIds) &&
    other.cofinancePriceFilter == cofinancePriceFilter &&
    other.recommendedCofinancePriceFilter == recommendedCofinancePriceFilter &&
    other.competitivenessFilter == competitivenessFilter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds == null ? 0 : offerIds!.hashCode) +
    (cofinancePriceFilter == null ? 0 : cofinancePriceFilter!.hashCode) +
    (recommendedCofinancePriceFilter == null ? 0 : recommendedCofinancePriceFilter!.hashCode) +
    (competitivenessFilter == null ? 0 : competitivenessFilter!.hashCode);

  @override
  String toString() => 'GetOfferRecommendationsRequest[offerIds=$offerIds, cofinancePriceFilter=$cofinancePriceFilter, recommendedCofinancePriceFilter=$recommendedCofinancePriceFilter, competitivenessFilter=$competitivenessFilter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offerIds != null) {
      json[r'offerIds'] = this.offerIds;
    } else {
      json[r'offerIds'] = null;
    }
    if (this.cofinancePriceFilter != null) {
      json[r'cofinancePriceFilter'] = this.cofinancePriceFilter;
    } else {
      json[r'cofinancePriceFilter'] = null;
    }
    if (this.recommendedCofinancePriceFilter != null) {
      json[r'recommendedCofinancePriceFilter'] = this.recommendedCofinancePriceFilter;
    } else {
      json[r'recommendedCofinancePriceFilter'] = null;
    }
    if (this.competitivenessFilter != null) {
      json[r'competitivenessFilter'] = this.competitivenessFilter;
    } else {
      json[r'competitivenessFilter'] = null;
    }
    return json;
  }

  /// Returns a new [GetOfferRecommendationsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetOfferRecommendationsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetOfferRecommendationsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetOfferRecommendationsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetOfferRecommendationsRequest(
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        cofinancePriceFilter: FieldStateType.fromJson(json[r'cofinancePriceFilter']),
        recommendedCofinancePriceFilter: FieldStateType.fromJson(json[r'recommendedCofinancePriceFilter']),
        competitivenessFilter: PriceCompetitivenessType.fromJson(json[r'competitivenessFilter']),
      );
    }
    return null;
  }

  static List<GetOfferRecommendationsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetOfferRecommendationsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetOfferRecommendationsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetOfferRecommendationsRequest> mapFromJson(dynamic json) {
    final map = <String, GetOfferRecommendationsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetOfferRecommendationsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetOfferRecommendationsRequest-objects as value to a dart map
  static Map<String, List<GetOfferRecommendationsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetOfferRecommendationsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetOfferRecommendationsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

