//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetCampaignOffersRequest {
  /// Returns a new [GetCampaignOffersRequest] instance.
  GetCampaignOffersRequest({
    this.offerIds = const [],
    this.statuses = const [],
    this.categoryIds = const [],
    this.vendorNames = const [],
    this.tags = const [],
  });

  /// Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  List<String>? offerIds;

  /// Фильтр по статусам товаров. 
  List<OfferCampaignStatusType>? statuses;

  /// Фильтр по категориям на Маркете.
  List<int>? categoryIds;

  /// Фильтр по брендам.
  List<String>? vendorNames;

  /// Фильтр по тегам.
  List<String>? tags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetCampaignOffersRequest &&
    _deepEquality.equals(other.offerIds, offerIds) &&
    _deepEquality.equals(other.statuses, statuses) &&
    _deepEquality.equals(other.categoryIds, categoryIds) &&
    _deepEquality.equals(other.vendorNames, vendorNames) &&
    _deepEquality.equals(other.tags, tags);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds == null ? 0 : offerIds!.hashCode) +
    (statuses == null ? 0 : statuses!.hashCode) +
    (categoryIds == null ? 0 : categoryIds!.hashCode) +
    (vendorNames == null ? 0 : vendorNames!.hashCode) +
    (tags == null ? 0 : tags!.hashCode);

  @override
  String toString() => 'GetCampaignOffersRequest[offerIds=$offerIds, statuses=$statuses, categoryIds=$categoryIds, vendorNames=$vendorNames, tags=$tags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offerIds != null) {
      json[r'offerIds'] = this.offerIds;
    } else {
      json[r'offerIds'] = null;
    }
    if (this.statuses != null) {
      json[r'statuses'] = this.statuses;
    } else {
      json[r'statuses'] = null;
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

  /// Returns a new [GetCampaignOffersRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetCampaignOffersRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetCampaignOffersRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetCampaignOffersRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetCampaignOffersRequest(
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        statuses: OfferCampaignStatusType.listFromJson(json[r'statuses']),
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

  static List<GetCampaignOffersRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetCampaignOffersRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetCampaignOffersRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetCampaignOffersRequest> mapFromJson(dynamic json) {
    final map = <String, GetCampaignOffersRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetCampaignOffersRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetCampaignOffersRequest-objects as value to a dart map
  static Map<String, List<GetCampaignOffersRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetCampaignOffersRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetCampaignOffersRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

