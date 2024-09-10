//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetOfferCardsContentStatusRequest {
  /// Returns a new [GetOfferCardsContentStatusRequest] instance.
  GetOfferCardsContentStatusRequest({
    this.offerIds = const {},
    this.cardStatuses = const {},
    this.categoryIds = const {},
  });

  /// Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
  Set<String>? offerIds;

  /// Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  Set<OfferCardStatusType>? cardStatuses;

  /// Фильтр по категориям на Маркете.
  Set<int>? categoryIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetOfferCardsContentStatusRequest &&
    _deepEquality.equals(other.offerIds, offerIds) &&
    _deepEquality.equals(other.cardStatuses, cardStatuses) &&
    _deepEquality.equals(other.categoryIds, categoryIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds == null ? 0 : offerIds!.hashCode) +
    (cardStatuses == null ? 0 : cardStatuses!.hashCode) +
    (categoryIds == null ? 0 : categoryIds!.hashCode);

  @override
  String toString() => 'GetOfferCardsContentStatusRequest[offerIds=$offerIds, cardStatuses=$cardStatuses, categoryIds=$categoryIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offerIds != null) {
      json[r'offerIds'] = this.offerIds!.toList(growable: false);
    } else {
      json[r'offerIds'] = null;
    }
    if (this.cardStatuses != null) {
      json[r'cardStatuses'] = this.cardStatuses!.toList(growable: false);
    } else {
      json[r'cardStatuses'] = null;
    }
    if (this.categoryIds != null) {
      json[r'categoryIds'] = this.categoryIds!.toList(growable: false);
    } else {
      json[r'categoryIds'] = null;
    }
    return json;
  }

  /// Returns a new [GetOfferCardsContentStatusRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetOfferCardsContentStatusRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetOfferCardsContentStatusRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetOfferCardsContentStatusRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetOfferCardsContentStatusRequest(
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toSet()
            : const {},
        cardStatuses: OfferCardStatusType.listFromJson(json[r'cardStatuses']).toSet(),
        categoryIds: json[r'categoryIds'] is Iterable
            ? (json[r'categoryIds'] as Iterable).cast<int>().toSet()
            : const {},
      );
    }
    return null;
  }

  static List<GetOfferCardsContentStatusRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetOfferCardsContentStatusRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetOfferCardsContentStatusRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetOfferCardsContentStatusRequest> mapFromJson(dynamic json) {
    final map = <String, GetOfferCardsContentStatusRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetOfferCardsContentStatusRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetOfferCardsContentStatusRequest-objects as value to a dart map
  static Map<String, List<GetOfferCardsContentStatusRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetOfferCardsContentStatusRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetOfferCardsContentStatusRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

