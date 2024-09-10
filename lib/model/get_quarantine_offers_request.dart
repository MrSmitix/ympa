//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetQuarantineOffersRequest {
  /// Returns a new [GetQuarantineOffersRequest] instance.
  GetQuarantineOffersRequest({
    this.offerIds = const [],
    this.cardStatuses = const [],
    this.categoryIds = const [],
    this.vendorNames = const [],
    this.tags = const [],
  });

  /// Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
  List<String>? offerIds;

  /// Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  List<OfferCardStatusType>? cardStatuses;

  /// Фильтр по категориям на Маркете.
  List<int>? categoryIds;

  /// Фильтр по брендам.
  List<String>? vendorNames;

  /// Фильтр по тегам.
  List<String>? tags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetQuarantineOffersRequest &&
    _deepEquality.equals(other.offerIds, offerIds) &&
    _deepEquality.equals(other.cardStatuses, cardStatuses) &&
    _deepEquality.equals(other.categoryIds, categoryIds) &&
    _deepEquality.equals(other.vendorNames, vendorNames) &&
    _deepEquality.equals(other.tags, tags);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds == null ? 0 : offerIds!.hashCode) +
    (cardStatuses == null ? 0 : cardStatuses!.hashCode) +
    (categoryIds == null ? 0 : categoryIds!.hashCode) +
    (vendorNames == null ? 0 : vendorNames!.hashCode) +
    (tags == null ? 0 : tags!.hashCode);

  @override
  String toString() => 'GetQuarantineOffersRequest[offerIds=$offerIds, cardStatuses=$cardStatuses, categoryIds=$categoryIds, vendorNames=$vendorNames, tags=$tags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offerIds != null) {
      json[r'offerIds'] = this.offerIds;
    } else {
      json[r'offerIds'] = null;
    }
    if (this.cardStatuses != null) {
      json[r'cardStatuses'] = this.cardStatuses;
    } else {
      json[r'cardStatuses'] = null;
    }
    if (this.categoryIds != null) {
      json[r'categoryIds'] = this.categoryIds;
    } else {
      json[r'categoryIds'] = null;
    }
    if (this.vendorNames != null) {
      json[r'vendorNames'] = this.vendorNames;
    } else {
      json[r'vendorNames'] = null;
    }
    if (this.tags != null) {
      json[r'tags'] = this.tags;
    } else {
      json[r'tags'] = null;
    }
    return json;
  }

  /// Returns a new [GetQuarantineOffersRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetQuarantineOffersRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetQuarantineOffersRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetQuarantineOffersRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetQuarantineOffersRequest(
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        cardStatuses: OfferCardStatusType.listFromJson(json[r'cardStatuses']),
        categoryIds: json[r'categoryIds'] is Iterable
            ? (json[r'categoryIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        vendorNames: json[r'vendorNames'] is Iterable
            ? (json[r'vendorNames'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        tags: json[r'tags'] is Iterable
            ? (json[r'tags'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<GetQuarantineOffersRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetQuarantineOffersRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetQuarantineOffersRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetQuarantineOffersRequest> mapFromJson(dynamic json) {
    final map = <String, GetQuarantineOffersRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetQuarantineOffersRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetQuarantineOffersRequest-objects as value to a dart map
  static Map<String, List<GetQuarantineOffersRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetQuarantineOffersRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetQuarantineOffersRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

