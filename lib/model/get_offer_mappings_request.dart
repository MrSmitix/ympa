//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetOfferMappingsRequest {
  /// Returns a new [GetOfferMappingsRequest] instance.
  GetOfferMappingsRequest({
    this.offerIds = const [],
    this.cardStatuses = const [],
    this.categoryIds = const [],
    this.vendorNames = const [],
    this.tags = const [],
    this.archived,
  });

  /// Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
  List<String>? offerIds;

  /// Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  List<OfferCardStatusType>? cardStatuses;

  /// Фильтр по категориям на Маркете.
  List<int>? categoryIds;

  /// Фильтр по брендам.
  List<String>? vendorNames;

  /// Фильтр по тегам.
  List<String>? tags;

  /// Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? archived;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetOfferMappingsRequest &&
    _deepEquality.equals(other.offerIds, offerIds) &&
    _deepEquality.equals(other.cardStatuses, cardStatuses) &&
    _deepEquality.equals(other.categoryIds, categoryIds) &&
    _deepEquality.equals(other.vendorNames, vendorNames) &&
    _deepEquality.equals(other.tags, tags) &&
    other.archived == archived;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds == null ? 0 : offerIds!.hashCode) +
    (cardStatuses == null ? 0 : cardStatuses!.hashCode) +
    (categoryIds == null ? 0 : categoryIds!.hashCode) +
    (vendorNames == null ? 0 : vendorNames!.hashCode) +
    (tags == null ? 0 : tags!.hashCode) +
    (archived == null ? 0 : archived!.hashCode);

  @override
  String toString() => 'GetOfferMappingsRequest[offerIds=$offerIds, cardStatuses=$cardStatuses, categoryIds=$categoryIds, vendorNames=$vendorNames, tags=$tags, archived=$archived]';

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
    if (this.archived != null) {
      json[r'archived'] = this.archived;
    } else {
      json[r'archived'] = null;
    }
    return json;
  }

  /// Returns a new [GetOfferMappingsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetOfferMappingsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetOfferMappingsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetOfferMappingsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetOfferMappingsRequest(
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
        archived: mapValueOfType<bool>(json, r'archived'),
      );
    }
    return null;
  }

  static List<GetOfferMappingsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetOfferMappingsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetOfferMappingsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetOfferMappingsRequest> mapFromJson(dynamic json) {
    final map = <String, GetOfferMappingsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetOfferMappingsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetOfferMappingsRequest-objects as value to a dart map
  static Map<String, List<GetOfferMappingsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetOfferMappingsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetOfferMappingsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

